// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domain_inheritance_test.proto

package net.badata.protobuf.converter.proto;

public final class DomainInheritanceProto {
  private DomainInheritanceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:net.badata.protobuf.converter.proto.Test)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 inheritedInt = 1;</code>
     */
    int getInheritedInt();

    /**
     * <code>float inheritedFloat = 2;</code>
     */
    float getInheritedFloat();

    /**
     * <code>int64 ownLong = 3;</code>
     */
    long getOwnLong();

    /**
     * <code>double ownDouble = 4;</code>
     */
    double getOwnDouble();
  }
  /**
   * Protobuf type {@code net.badata.protobuf.converter.proto.Test}
   */
  public  static final class Test extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:net.badata.protobuf.converter.proto.Test)
      TestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Test.newBuilder() to construct.
    private Test(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Test() {
      inheritedInt_ = 0;
      inheritedFloat_ = 0F;
      ownLong_ = 0L;
      ownDouble_ = 0D;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Test(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              inheritedInt_ = input.readInt32();
              break;
            }
            case 21: {

              inheritedFloat_ = input.readFloat();
              break;
            }
            case 24: {

              ownLong_ = input.readInt64();
              break;
            }
            case 33: {

              ownDouble_ = input.readDouble();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.badata.protobuf.converter.proto.DomainInheritanceProto.internal_static_net_badata_protobuf_converter_proto_Test_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.badata.protobuf.converter.proto.DomainInheritanceProto.internal_static_net_badata_protobuf_converter_proto_Test_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.badata.protobuf.converter.proto.DomainInheritanceProto.Test.class, net.badata.protobuf.converter.proto.DomainInheritanceProto.Test.Builder.class);
    }

    public static final int INHERITEDINT_FIELD_NUMBER = 1;
    private int inheritedInt_;
    /**
     * <code>int32 inheritedInt = 1;</code>
     */
    public int getInheritedInt() {
      return inheritedInt_;
    }

    public static final int INHERITEDFLOAT_FIELD_NUMBER = 2;
    private float inheritedFloat_;
    /**
     * <code>float inheritedFloat = 2;</code>
     */
    public float getInheritedFloat() {
      return inheritedFloat_;
    }

    public static final int OWNLONG_FIELD_NUMBER = 3;
    private long ownLong_;
    /**
     * <code>int64 ownLong = 3;</code>
     */
    public long getOwnLong() {
      return ownLong_;
    }

    public static final int OWNDOUBLE_FIELD_NUMBER = 4;
    private double ownDouble_;
    /**
     * <code>double ownDouble = 4;</code>
     */
    public double getOwnDouble() {
      return ownDouble_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (inheritedInt_ != 0) {
        output.writeInt32(1, inheritedInt_);
      }
      if (inheritedFloat_ != 0F) {
        output.writeFloat(2, inheritedFloat_);
      }
      if (ownLong_ != 0L) {
        output.writeInt64(3, ownLong_);
      }
      if (ownDouble_ != 0D) {
        output.writeDouble(4, ownDouble_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (inheritedInt_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, inheritedInt_);
      }
      if (inheritedFloat_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, inheritedFloat_);
      }
      if (ownLong_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, ownLong_);
      }
      if (ownDouble_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, ownDouble_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof net.badata.protobuf.converter.proto.DomainInheritanceProto.Test)) {
        return super.equals(obj);
      }
      net.badata.protobuf.converter.proto.DomainInheritanceProto.Test other = (net.badata.protobuf.converter.proto.DomainInheritanceProto.Test) obj;

      boolean result = true;
      result = result && (getInheritedInt()
          == other.getInheritedInt());
      result = result && (
          java.lang.Float.floatToIntBits(getInheritedFloat())
          == java.lang.Float.floatToIntBits(
              other.getInheritedFloat()));
      result = result && (getOwnLong()
          == other.getOwnLong());
      result = result && (
          java.lang.Double.doubleToLongBits(getOwnDouble())
          == java.lang.Double.doubleToLongBits(
              other.getOwnDouble()));
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + INHERITEDINT_FIELD_NUMBER;
      hash = (53 * hash) + getInheritedInt();
      hash = (37 * hash) + INHERITEDFLOAT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getInheritedFloat());
      hash = (37 * hash) + OWNLONG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOwnLong());
      hash = (37 * hash) + OWNDOUBLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getOwnDouble()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.badata.protobuf.converter.proto.DomainInheritanceProto.Test prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code net.badata.protobuf.converter.proto.Test}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:net.badata.protobuf.converter.proto.Test)
        net.badata.protobuf.converter.proto.DomainInheritanceProto.TestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.badata.protobuf.converter.proto.DomainInheritanceProto.internal_static_net_badata_protobuf_converter_proto_Test_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.badata.protobuf.converter.proto.DomainInheritanceProto.internal_static_net_badata_protobuf_converter_proto_Test_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.badata.protobuf.converter.proto.DomainInheritanceProto.Test.class, net.badata.protobuf.converter.proto.DomainInheritanceProto.Test.Builder.class);
      }

      // Construct using net.badata.protobuf.converter.proto.DomainInheritanceProto.Test.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        inheritedInt_ = 0;

        inheritedFloat_ = 0F;

        ownLong_ = 0L;

        ownDouble_ = 0D;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.badata.protobuf.converter.proto.DomainInheritanceProto.internal_static_net_badata_protobuf_converter_proto_Test_descriptor;
      }

      public net.badata.protobuf.converter.proto.DomainInheritanceProto.Test getDefaultInstanceForType() {
        return net.badata.protobuf.converter.proto.DomainInheritanceProto.Test.getDefaultInstance();
      }

      public net.badata.protobuf.converter.proto.DomainInheritanceProto.Test build() {
        net.badata.protobuf.converter.proto.DomainInheritanceProto.Test result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public net.badata.protobuf.converter.proto.DomainInheritanceProto.Test buildPartial() {
        net.badata.protobuf.converter.proto.DomainInheritanceProto.Test result = new net.badata.protobuf.converter.proto.DomainInheritanceProto.Test(this);
        result.inheritedInt_ = inheritedInt_;
        result.inheritedFloat_ = inheritedFloat_;
        result.ownLong_ = ownLong_;
        result.ownDouble_ = ownDouble_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.badata.protobuf.converter.proto.DomainInheritanceProto.Test) {
          return mergeFrom((net.badata.protobuf.converter.proto.DomainInheritanceProto.Test)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.badata.protobuf.converter.proto.DomainInheritanceProto.Test other) {
        if (other == net.badata.protobuf.converter.proto.DomainInheritanceProto.Test.getDefaultInstance()) return this;
        if (other.getInheritedInt() != 0) {
          setInheritedInt(other.getInheritedInt());
        }
        if (other.getInheritedFloat() != 0F) {
          setInheritedFloat(other.getInheritedFloat());
        }
        if (other.getOwnLong() != 0L) {
          setOwnLong(other.getOwnLong());
        }
        if (other.getOwnDouble() != 0D) {
          setOwnDouble(other.getOwnDouble());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        net.badata.protobuf.converter.proto.DomainInheritanceProto.Test parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.badata.protobuf.converter.proto.DomainInheritanceProto.Test) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int inheritedInt_ ;
      /**
       * <code>int32 inheritedInt = 1;</code>
       */
      public int getInheritedInt() {
        return inheritedInt_;
      }
      /**
       * <code>int32 inheritedInt = 1;</code>
       */
      public Builder setInheritedInt(int value) {
        
        inheritedInt_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 inheritedInt = 1;</code>
       */
      public Builder clearInheritedInt() {
        
        inheritedInt_ = 0;
        onChanged();
        return this;
      }

      private float inheritedFloat_ ;
      /**
       * <code>float inheritedFloat = 2;</code>
       */
      public float getInheritedFloat() {
        return inheritedFloat_;
      }
      /**
       * <code>float inheritedFloat = 2;</code>
       */
      public Builder setInheritedFloat(float value) {
        
        inheritedFloat_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float inheritedFloat = 2;</code>
       */
      public Builder clearInheritedFloat() {
        
        inheritedFloat_ = 0F;
        onChanged();
        return this;
      }

      private long ownLong_ ;
      /**
       * <code>int64 ownLong = 3;</code>
       */
      public long getOwnLong() {
        return ownLong_;
      }
      /**
       * <code>int64 ownLong = 3;</code>
       */
      public Builder setOwnLong(long value) {
        
        ownLong_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 ownLong = 3;</code>
       */
      public Builder clearOwnLong() {
        
        ownLong_ = 0L;
        onChanged();
        return this;
      }

      private double ownDouble_ ;
      /**
       * <code>double ownDouble = 4;</code>
       */
      public double getOwnDouble() {
        return ownDouble_;
      }
      /**
       * <code>double ownDouble = 4;</code>
       */
      public Builder setOwnDouble(double value) {
        
        ownDouble_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double ownDouble = 4;</code>
       */
      public Builder clearOwnDouble() {
        
        ownDouble_ = 0D;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:net.badata.protobuf.converter.proto.Test)
    }

    // @@protoc_insertion_point(class_scope:net.badata.protobuf.converter.proto.Test)
    private static final net.badata.protobuf.converter.proto.DomainInheritanceProto.Test DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.badata.protobuf.converter.proto.DomainInheritanceProto.Test();
    }

    public static net.badata.protobuf.converter.proto.DomainInheritanceProto.Test getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Test>
        PARSER = new com.google.protobuf.AbstractParser<Test>() {
      public Test parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Test(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Test> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Test> getParserForType() {
      return PARSER;
    }

    public net.badata.protobuf.converter.proto.DomainInheritanceProto.Test getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_badata_protobuf_converter_proto_Test_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_badata_protobuf_converter_proto_Test_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035domain_inheritance_test.proto\022#net.bad" +
      "ata.protobuf.converter.proto\"X\n\004Test\022\024\n\014" +
      "inheritedInt\030\001 \001(\005\022\026\n\016inheritedFloat\030\002 \001" +
      "(\002\022\017\n\007ownLong\030\003 \001(\003\022\021\n\townDouble\030\004 \001(\001B=" +
      "\n#net.badata.protobuf.converter.protoB\026D" +
      "omainInheritanceProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_net_badata_protobuf_converter_proto_Test_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_net_badata_protobuf_converter_proto_Test_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_badata_protobuf_converter_proto_Test_descriptor,
        new java.lang.String[] { "InheritedInt", "InheritedFloat", "OwnLong", "OwnDouble", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}