package net.badata.protobuf.converter.inspection;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.google.protobuf.Timestamp;
import com.hubspot.jackson.datatype.protobuf.ProtobufModule;

/**
 * Implementation of {@link net.badata.protobuf.converter.inspection.NullValueInspector NullValueInspector} that is
 * applied by default.
 *
 * @author jsjem
 * @author Roman Gushel
 */
public final class DefaultNullValueInspectorImpl implements NullValueInspector {
	
	private static final ObjectMapper OBJECT_MAPPER = initializeObjectMapper();
	
	private static ObjectMapper initializeObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new ProtobufModule());
		return objectMapper;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isNull(final Object value) {
		if (value instanceof Byte) {
			return (Byte) value == 0;
		}
		if (value instanceof Short) {
			return (Short) value == 0;
		}
		if (value instanceof Integer) {
			return (Integer) value == 0;
		}
		if (value instanceof Long) {
			return (Long) value == 0L;
		}
		if (value instanceof Float) {
			return (Float) value == 0.0f;
		}
		if (value instanceof Double) {
			return (Double) value == 0.0;
		}
		if (value instanceof BigDecimal) {
			return ((BigDecimal) value).compareTo(BigDecimal.ZERO) == 0;
		}
		if (value instanceof String) {
			return ((String) value).isEmpty();
		}
		if (value instanceof Boolean) {
			//a boolean being false is not very conclusive to the field being not set, ignore for now
			return false;
		}
		if (value instanceof List) {
			return ((List) value).isEmpty();
		}
		if (value instanceof Enum) {
			return value.toString().equals("UNKNOWN");
		}
		if (value instanceof Timestamp) {
			return ((Timestamp) value).getSeconds() == 0 && ((Timestamp) value).getNanos() == 0;
		}
		return value == null || hasDefaultValues(value);
	}
	
	private boolean hasDefaultValues(Object object) {
		Map<String, Object> substitutionDataMap = OBJECT_MAPPER.convertValue(object, Map.class);
		Collection objects = substitutionDataMap.values();

		if (!objects.isEmpty()) {
			for (Object o: objects) {
				if (!isNull(o)) {
					return false;
				}
			}
		}
		return true;
	}
}
