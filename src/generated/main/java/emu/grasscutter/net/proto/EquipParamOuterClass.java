// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EquipParam.proto

package emu.grasscutter.net.proto;

public final class EquipParamOuterClass {
  private EquipParamOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EquipParamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EquipParam)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>uint32 item_num = 2;</code>
     * @return The itemNum.
     */
    int getItemNum();

    /**
     * <code>uint32 item_level = 3;</code>
     * @return The itemLevel.
     */
    int getItemLevel();

    /**
     * <code>uint32 promote_level = 4;</code>
     * @return The promoteLevel.
     */
    int getPromoteLevel();
  }
  /**
   * <pre>
   * Name: KCAIJMFIGIA
   * </pre>
   *
   * Protobuf type {@code EquipParam}
   */
  public static final class EquipParam extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EquipParam)
      EquipParamOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EquipParam.newBuilder() to construct.
    private EquipParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EquipParam() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EquipParam();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EquipParamOuterClass.internal_static_EquipParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EquipParamOuterClass.internal_static_EquipParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.class, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder.class);
    }

    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private int itemId_ = 0;
    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int ITEM_NUM_FIELD_NUMBER = 2;
    private int itemNum_ = 0;
    /**
     * <code>uint32 item_num = 2;</code>
     * @return The itemNum.
     */
    @java.lang.Override
    public int getItemNum() {
      return itemNum_;
    }

    public static final int ITEM_LEVEL_FIELD_NUMBER = 3;
    private int itemLevel_ = 0;
    /**
     * <code>uint32 item_level = 3;</code>
     * @return The itemLevel.
     */
    @java.lang.Override
    public int getItemLevel() {
      return itemLevel_;
    }

    public static final int PROMOTE_LEVEL_FIELD_NUMBER = 4;
    private int promoteLevel_ = 0;
    /**
     * <code>uint32 promote_level = 4;</code>
     * @return The promoteLevel.
     */
    @java.lang.Override
    public int getPromoteLevel() {
      return promoteLevel_;
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
      if (itemId_ != 0) {
        output.writeUInt32(1, itemId_);
      }
      if (itemNum_ != 0) {
        output.writeUInt32(2, itemNum_);
      }
      if (itemLevel_ != 0) {
        output.writeUInt32(3, itemLevel_);
      }
      if (promoteLevel_ != 0) {
        output.writeUInt32(4, promoteLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, itemId_);
      }
      if (itemNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, itemNum_);
      }
      if (itemLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, itemLevel_);
      }
      if (promoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, promoteLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam other = (emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam) obj;

      if (getItemId()
          != other.getItemId()) return false;
      if (getItemNum()
          != other.getItemNum()) return false;
      if (getItemLevel()
          != other.getItemLevel()) return false;
      if (getPromoteLevel()
          != other.getPromoteLevel()) return false;
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
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + ITEM_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getItemNum();
      hash = (37 * hash) + ITEM_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getItemLevel();
      hash = (37 * hash) + PROMOTE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getPromoteLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam prototype) {
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
     * Name: KCAIJMFIGIA
     * </pre>
     *
     * Protobuf type {@code EquipParam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EquipParam)
        emu.grasscutter.net.proto.EquipParamOuterClass.EquipParamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EquipParamOuterClass.internal_static_EquipParam_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EquipParamOuterClass.internal_static_EquipParam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.class, emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.newBuilder()
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
        itemId_ = 0;
        itemNum_ = 0;
        itemLevel_ = 0;
        promoteLevel_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EquipParamOuterClass.internal_static_EquipParam_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam build() {
        emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam buildPartial() {
        emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam result = new emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.itemId_ = itemId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.itemNum_ = itemNum_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.itemLevel_ = itemLevel_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.promoteLevel_ = promoteLevel_;
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
        if (other instanceof emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam) {
          return mergeFrom((emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam other) {
        if (other == emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam.getDefaultInstance()) return this;
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getItemNum() != 0) {
          setItemNum(other.getItemNum());
        }
        if (other.getItemLevel() != 0) {
          setItemLevel(other.getItemLevel());
        }
        if (other.getPromoteLevel() != 0) {
          setPromoteLevel(other.getPromoteLevel());
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
              case 8: {
                itemId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                itemNum_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                itemLevel_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                promoteLevel_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 1;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {

        itemId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        itemId_ = 0;
        onChanged();
        return this;
      }

      private int itemNum_ ;
      /**
       * <code>uint32 item_num = 2;</code>
       * @return The itemNum.
       */
      @java.lang.Override
      public int getItemNum() {
        return itemNum_;
      }
      /**
       * <code>uint32 item_num = 2;</code>
       * @param value The itemNum to set.
       * @return This builder for chaining.
       */
      public Builder setItemNum(int value) {

        itemNum_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_num = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemNum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        itemNum_ = 0;
        onChanged();
        return this;
      }

      private int itemLevel_ ;
      /**
       * <code>uint32 item_level = 3;</code>
       * @return The itemLevel.
       */
      @java.lang.Override
      public int getItemLevel() {
        return itemLevel_;
      }
      /**
       * <code>uint32 item_level = 3;</code>
       * @param value The itemLevel to set.
       * @return This builder for chaining.
       */
      public Builder setItemLevel(int value) {

        itemLevel_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        itemLevel_ = 0;
        onChanged();
        return this;
      }

      private int promoteLevel_ ;
      /**
       * <code>uint32 promote_level = 4;</code>
       * @return The promoteLevel.
       */
      @java.lang.Override
      public int getPromoteLevel() {
        return promoteLevel_;
      }
      /**
       * <code>uint32 promote_level = 4;</code>
       * @param value The promoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setPromoteLevel(int value) {

        promoteLevel_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 promote_level = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPromoteLevel() {
        bitField0_ = (bitField0_ & ~0x00000008);
        promoteLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EquipParam)
    }

    // @@protoc_insertion_point(class_scope:EquipParam)
    private static final emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam();
    }

    public static emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EquipParam>
        PARSER = new com.google.protobuf.AbstractParser<EquipParam>() {
      @java.lang.Override
      public EquipParam parsePartialFrom(
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

    public static com.google.protobuf.Parser<EquipParam> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EquipParam> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EquipParamOuterClass.EquipParam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EquipParam_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EquipParam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020EquipParam.proto\"Z\n\nEquipParam\022\017\n\007item" +
      "_id\030\001 \001(\r\022\020\n\010item_num\030\002 \001(\r\022\022\n\nitem_leve" +
      "l\030\003 \001(\r\022\025\n\rpromote_level\030\004 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EquipParam_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EquipParam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EquipParam_descriptor,
        new java.lang.String[] { "ItemId", "ItemNum", "ItemLevel", "PromoteLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
