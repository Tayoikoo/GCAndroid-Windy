// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetCoolDownData.proto

package emu.grasscutter.net.proto;

public final class WidgetCoolDownDataOuterClass {
  private WidgetCoolDownDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetCoolDownDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetCoolDownData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_success = 15;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 id = 10;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint64 cool_down_time = 5;</code>
     * @return The coolDownTime.
     */
    long getCoolDownTime();
  }
  /**
   * <pre>
   * Obf: OFHAPFBPCJN
   * </pre>
   *
   * Protobuf type {@code WidgetCoolDownData}
   */
  public static final class WidgetCoolDownData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetCoolDownData)
      WidgetCoolDownDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetCoolDownData.newBuilder() to construct.
    private WidgetCoolDownData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetCoolDownData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetCoolDownData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.class, emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 15;
    private boolean isSuccess_ = false;
    /**
     * <code>bool is_success = 15;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int ID_FIELD_NUMBER = 10;
    private int id_ = 0;
    /**
     * <code>uint32 id = 10;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int COOL_DOWN_TIME_FIELD_NUMBER = 5;
    private long coolDownTime_ = 0L;
    /**
     * <code>uint64 cool_down_time = 5;</code>
     * @return The coolDownTime.
     */
    @java.lang.Override
    public long getCoolDownTime() {
      return coolDownTime_;
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
      if (coolDownTime_ != 0L) {
        output.writeUInt64(5, coolDownTime_);
      }
      if (id_ != 0) {
        output.writeUInt32(10, id_);
      }
      if (isSuccess_ != false) {
        output.writeBool(15, isSuccess_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (coolDownTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, coolDownTime_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, id_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isSuccess_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData other = (emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData) obj;

      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getId()
          != other.getId()) return false;
      if (getCoolDownTime()
          != other.getCoolDownTime()) return false;
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
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + COOL_DOWN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCoolDownTime());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData prototype) {
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
     * <pre>
     * Obf: OFHAPFBPCJN
     * </pre>
     *
     * Protobuf type {@code WidgetCoolDownData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetCoolDownData)
        emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.class, emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.newBuilder()
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
        isSuccess_ = false;
        id_ = 0;
        coolDownTime_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData build() {
        emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData buildPartial() {
        emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData result = new emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isSuccess_ = isSuccess_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.id_ = id_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.coolDownTime_ = coolDownTime_;
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
        if (other instanceof emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData) {
          return mergeFrom((emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData other) {
        if (other == emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance()) return this;
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getCoolDownTime() != 0L) {
          setCoolDownTime(other.getCoolDownTime());
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
              case 40: {
                coolDownTime_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 80: {
                id_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 120: {
                isSuccess_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 120
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

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 15;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 15;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {

        isSuccess_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 10;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 10;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }

      private long coolDownTime_ ;
      /**
       * <code>uint64 cool_down_time = 5;</code>
       * @return The coolDownTime.
       */
      @java.lang.Override
      public long getCoolDownTime() {
        return coolDownTime_;
      }
      /**
       * <code>uint64 cool_down_time = 5;</code>
       * @param value The coolDownTime to set.
       * @return This builder for chaining.
       */
      public Builder setCoolDownTime(long value) {

        coolDownTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 cool_down_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoolDownTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        coolDownTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:WidgetCoolDownData)
    }

    // @@protoc_insertion_point(class_scope:WidgetCoolDownData)
    private static final emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData();
    }

    public static emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetCoolDownData>
        PARSER = new com.google.protobuf.AbstractParser<WidgetCoolDownData>() {
      @java.lang.Override
      public WidgetCoolDownData parsePartialFrom(
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

    public static com.google.protobuf.Parser<WidgetCoolDownData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetCoolDownData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetCoolDownData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetCoolDownData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030WidgetCoolDownData.proto\"L\n\022WidgetCool" +
      "DownData\022\022\n\nis_success\030\017 \001(\010\022\n\n\002id\030\n \001(\r" +
      "\022\026\n\016cool_down_time\030\005 \001(\004B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WidgetCoolDownData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetCoolDownData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetCoolDownData_descriptor,
        new java.lang.String[] { "IsSuccess", "Id", "CoolDownTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
