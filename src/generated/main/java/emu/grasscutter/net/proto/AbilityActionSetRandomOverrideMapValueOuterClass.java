// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityActionSetRandomOverrideMapValue.proto

package emu.grasscutter.net.proto;

public final class AbilityActionSetRandomOverrideMapValueOuterClass {
  private AbilityActionSetRandomOverrideMapValueOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityActionSetRandomOverrideMapValueOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityActionSetRandomOverrideMapValue)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float random_value = 1;</code>
     * @return The randomValue.
     */
    float getRandomValue();
  }
  /**
   * Protobuf type {@code AbilityActionSetRandomOverrideMapValue}
   */
  public static final class AbilityActionSetRandomOverrideMapValue extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityActionSetRandomOverrideMapValue)
      AbilityActionSetRandomOverrideMapValueOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityActionSetRandomOverrideMapValue.newBuilder() to construct.
    private AbilityActionSetRandomOverrideMapValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityActionSetRandomOverrideMapValue() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityActionSetRandomOverrideMapValue();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.internal_static_AbilityActionSetRandomOverrideMapValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.internal_static_AbilityActionSetRandomOverrideMapValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue.class, emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue.Builder.class);
    }

    public static final int RANDOM_VALUE_FIELD_NUMBER = 1;
    private float randomValue_ = 0F;
    /**
     * <code>float random_value = 1;</code>
     * @return The randomValue.
     */
    @java.lang.Override
    public float getRandomValue() {
      return randomValue_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Float.floatToRawIntBits(randomValue_) != 0) {
        output.writeFloat(1, randomValue_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(randomValue_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, randomValue_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue other = (emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue) obj;

      if (java.lang.Float.floatToIntBits(getRandomValue())
          != java.lang.Float.floatToIntBits(
              other.getRandomValue())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RANDOM_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getRandomValue());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code AbilityActionSetRandomOverrideMapValue}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityActionSetRandomOverrideMapValue)
        emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.internal_static_AbilityActionSetRandomOverrideMapValue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.internal_static_AbilityActionSetRandomOverrideMapValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue.class, emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        randomValue_ = 0F;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.internal_static_AbilityActionSetRandomOverrideMapValue_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue build() {
        emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue buildPartial() {
        emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue result = new emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.randomValue_ = randomValue_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue other) {
        if (other == emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue.getDefaultInstance()) return this;
        if (other.getRandomValue() != 0F) {
          setRandomValue(other.getRandomValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 13: {
                randomValue_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private float randomValue_ ;
      /**
       * <code>float random_value = 1;</code>
       * @return The randomValue.
       */
      @java.lang.Override
      public float getRandomValue() {
        return randomValue_;
      }
      /**
       * <code>float random_value = 1;</code>
       * @param value The randomValue to set.
       * @return This builder for chaining.
       */
      public Builder setRandomValue(float value) {

        randomValue_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>float random_value = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRandomValue() {
        bitField0_ = (bitField0_ & ~0x00000001);
        randomValue_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:AbilityActionSetRandomOverrideMapValue)
    }

    // @@protoc_insertion_point(class_scope:AbilityActionSetRandomOverrideMapValue)
    private static final emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue();
    }

    public static emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityActionSetRandomOverrideMapValue>
        PARSER = new com.google.protobuf.AbstractParser<AbilityActionSetRandomOverrideMapValue>() {
      @java.lang.Override
      public AbilityActionSetRandomOverrideMapValue parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<AbilityActionSetRandomOverrideMapValue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityActionSetRandomOverrideMapValue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityActionSetRandomOverrideMapValueOuterClass.AbilityActionSetRandomOverrideMapValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityActionSetRandomOverrideMapValue_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityActionSetRandomOverrideMapValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,AbilityActionSetRandomOverrideMapValue" +
      ".proto\">\n&AbilityActionSetRandomOverride" +
      "MapValue\022\024\n\014random_value\030\001 \001(\002B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityActionSetRandomOverrideMapValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityActionSetRandomOverrideMapValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityActionSetRandomOverrideMapValue_descriptor,
        new java.lang.String[] { "RandomValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
