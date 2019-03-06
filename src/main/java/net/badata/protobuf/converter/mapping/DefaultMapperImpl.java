package net.badata.protobuf.converter.mapping;

import com.google.protobuf.Message;
import net.badata.protobuf.converter.exception.MappingException;
import net.badata.protobuf.converter.resolver.FieldResolver;
import net.badata.protobuf.converter.utils.FieldUtils;

import java.lang.reflect.InvocationTargetException;
import org.apache.commons.lang3.StringUtils;

/**
 * Implementation of {@link net.badata.protobuf.converter.mapping.Mapper Mapper}
 * that is applied by default. This implementation maps fields values directly
 * from domain instance to related protobuf instance and vice versa.
 *
 * @author jsjem
 * @author Roman Gushel
 */
public class DefaultMapperImpl implements Mapper {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends Message> MappingResult mapToDomainField(final FieldResolver fieldResolver, final T protobuf,
			final Object domain) throws MappingException {
		String mappedGetterName = StringUtils.EMPTY;
		Object protobufFieldValue;
		if (StringUtils.isNotBlank(fieldResolver.getMappedTo())) {
			protobufFieldValue = getFieldValue(FieldUtils.createProtobufGetterName(fieldResolver),
					getNestedFieldValue(protobuf, fieldResolver));
		} else {
			protobufFieldValue = getFieldValue(FieldUtils.createProtobufGetterName(fieldResolver), protobuf);
		}
		if (FieldUtils.isComplexType(fieldResolver.getField())) {
			boolean hasFieldValue = true;
			try {
				String hasserName = FieldUtils.createProtobufHasserName(fieldResolver);
				if (hasserName != null) {
					hasFieldValue = hasFieldValue(hasserName, protobuf, mappedGetterName);
				}
			} catch (MappingException ignored) {
			} // not `has` method, continue
			if (hasFieldValue) {
				return new MappingResult(MappingResult.Result.NESTED_MAPPING, protobufFieldValue, domain);
			}
			return new MappingResult(MappingResult.Result.MAPPED, null, domain);
		}
		if (FieldUtils.isCollectionType(fieldResolver.getField())) {
			return new MappingResult(MappingResult.Result.COLLECTION_MAPPING, protobufFieldValue, domain);
		}
		return new MappingResult(MappingResult.Result.MAPPED, protobufFieldValue, domain);
	}

	private boolean hasFieldValue(final String hasserName, Object source, final String mappedGetterName)
			throws MappingException {
		Class<?> sourceClass = source.getClass();
		try {
			if (StringUtils.isNotBlank(mappedGetterName)) {
				source = source.getClass().getMethod(mappedGetterName).invoke(source);
			}
			return (boolean) sourceClass.getMethod(hasserName).invoke(source);
		} catch (IllegalAccessException e) {
			throw new MappingException(String.format("Access denied. '%s.%s()'", sourceClass.getName(), hasserName));
		} catch (InvocationTargetException e) {
			throw new MappingException(String.format("Can't decide if field has value through '%s.%s()'",
					sourceClass.getName(), hasserName));
		} catch (NoSuchMethodException e) {
			throw new MappingException(String.format("Hasser not found. '%s.%s()'", sourceClass.getName(), hasserName));
		}
	}

	private Object getFieldValue(final String getterName, final Object source) throws MappingException {
		Class<?> sourceClass = source.getClass();
		try {
			return sourceClass.getMethod(getterName).invoke(source);
		} catch (IllegalAccessException e) {
			throw new MappingException(String.format("Access denied. '%s.%s()'", sourceClass.getName(), getterName));
		} catch (InvocationTargetException e) {
			throw new MappingException(
					String.format("Can't set field value through '%s.%s()'", sourceClass.getName(), getterName));
		} catch (NoSuchMethodException e) {
			throw new MappingException(String.format("Getter not found. '%s.%s()'", sourceClass.getName(), getterName));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T extends Message.Builder> MappingResult mapToProtobufField(final FieldResolver fieldResolver,
			final Object domain, final T protobufBuilder) throws MappingException {
		Object domainFieldValue = getFieldValue(FieldUtils.createDomainGetterName(fieldResolver), domain);
		MappingResult.Result mappingResult = MappingResult.Result.MAPPED;
		if (FieldUtils.isComplexType(fieldResolver.getField())) {
			mappingResult = MappingResult.Result.NESTED_MAPPING;
		}
		if (FieldUtils.isCollectionType(fieldResolver.getField())) {
			mappingResult = MappingResult.Result.COLLECTION_MAPPING;
		}
		if (StringUtils.isNotBlank(fieldResolver.getMappedTo())) {
			return new MappingResult(mappingResult, domainFieldValue,
					getProtobufBuilderForMappedField(fieldResolver, protobufBuilder));
		}
		return new MappingResult(mappingResult, domainFieldValue, protobufBuilder);
	}

	private Object getNestedFieldValue(Object source, FieldResolver fieldResolver) throws MappingException {
		Class<?> sourceClass = source.getClass();
		String mappedGetterName = StringUtils.EMPTY;
		try {
			for (String field : fieldResolver.getMappedTo().split("\\.")) {
				if (StringUtils.isNotBlank(field)) {
					mappedGetterName = FieldUtils.createDomainGetterNameMappedField(field,
							fieldResolver.getProtobufType());
					source = source.getClass().getMethod(mappedGetterName).invoke(source);
				}
			}
			return source;
		} catch (IllegalAccessException e) {
			throw new MappingException(
					String.format("Access denied. '%s.%s()'", sourceClass.getName(), mappedGetterName));
		} catch (InvocationTargetException e) {
			throw new MappingException(String.format("Can't decide if field has value through '%s.%s()'",
					sourceClass.getName(), mappedGetterName));
		} catch (NoSuchMethodException e) {
			throw new MappingException(
					String.format("Hasser not found. '%s.%s()'", sourceClass.getName(), mappedGetterName));
		}
	}
	
	 private <T extends Message.Builder> Object getProtobufBuilderForMappedField(
		      final FieldResolver fieldResolver, T protobufBuilder) throws MappingException {
		    Class<?> sourceClass = protobufBuilder.getClass();
		    String protoGetterName = StringUtils.EMPTY;
		    try {
		      Object builder = protobufBuilder;
		      for (String str : fieldResolver.getMappedTo().split("\\.")) {
		        if (StringUtils.isNotBlank(str)) {
		          protoGetterName =
		              FieldUtils.createProtobufGetterNameMappedField(str, fieldResolver.getProtobufType());
		          builder = builder.getClass().getMethod(protoGetterName).invoke(builder);
		        }
		      }
		      return builder;
		    } catch (IllegalAccessException e) {
		      throw new MappingException(
		          String.format("Access denied. '%s.%s()'", sourceClass.getName(), protoGetterName));
		    } catch (InvocationTargetException e) {
		      throw new MappingException(String.format("Can't set field value through '%s.%s()'",
		          sourceClass.getName(), protoGetterName));
		    } catch (NoSuchMethodException e) {
		      throw new MappingException(
		          String.format("Getter not found. '%s.%s()'", sourceClass.getName(), protoGetterName));
		    }
		  }

}
