// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerCompoundMaterialRsp.proto

package emu.grasscutter.net.proto;

public final class PlayerCompoundMaterialRspOuterClass {
  private PlayerCompoundMaterialRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerCompoundMaterialRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerCompoundMaterialRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CompoundQueueData compoundQueueData = 7;</code>
     * @return Whether the compoundQueueData field is set.
     */
    boolean hasCompoundQueueData();
    /**
     * <code>.CompoundQueueData compoundQueueData = 7;</code>
     * @return The compoundQueueData.
     */
    emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData getCompoundQueueData();
    /**
     * <code>.CompoundQueueData compoundQueueData = 7;</code>
     */
    emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder getCompoundQueueDataOrBuilder();

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 107
   * Obf: JJIKDLOONLH
   * </pre>
   *
   * Protobuf type {@code PlayerCompoundMaterialRsp}
   */
  public static final class PlayerCompoundMaterialRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerCompoundMaterialRsp)
      PlayerCompoundMaterialRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerCompoundMaterialRsp.newBuilder() to construct.
    private PlayerCompoundMaterialRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerCompoundMaterialRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerCompoundMaterialRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.internal_static_PlayerCompoundMaterialRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.internal_static_PlayerCompoundMaterialRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp.class, emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp.Builder.class);
    }

    public static final int COMPOUNDQUEUEDATA_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData compoundQueueData_;
    /**
     * <code>.CompoundQueueData compoundQueueData = 7;</code>
     * @return Whether the compoundQueueData field is set.
     */
    @java.lang.Override
    public boolean hasCompoundQueueData() {
      return compoundQueueData_ != null;
    }
    /**
     * <code>.CompoundQueueData compoundQueueData = 7;</code>
     * @return The compoundQueueData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData getCompoundQueueData() {
      return compoundQueueData_ == null ? emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance() : compoundQueueData_;
    }
    /**
     * <code>.CompoundQueueData compoundQueueData = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder getCompoundQueueDataOrBuilder() {
      return compoundQueueData_ == null ? emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance() : compoundQueueData_;
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (compoundQueueData_ != null) {
        output.writeMessage(7, getCompoundQueueData());
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (compoundQueueData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getCompoundQueueData());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp other = (emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp) obj;

      if (hasCompoundQueueData() != other.hasCompoundQueueData()) return false;
      if (hasCompoundQueueData()) {
        if (!getCompoundQueueData()
            .equals(other.getCompoundQueueData())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasCompoundQueueData()) {
        hash = (37 * hash) + COMPOUNDQUEUEDATA_FIELD_NUMBER;
        hash = (53 * hash) + getCompoundQueueData().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp prototype) {
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
     * CmdId: 107
     * Obf: JJIKDLOONLH
     * </pre>
     *
     * Protobuf type {@code PlayerCompoundMaterialRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerCompoundMaterialRsp)
        emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.internal_static_PlayerCompoundMaterialRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.internal_static_PlayerCompoundMaterialRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp.class, emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp.newBuilder()
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
        compoundQueueData_ = null;
        if (compoundQueueDataBuilder_ != null) {
          compoundQueueDataBuilder_.dispose();
          compoundQueueDataBuilder_ = null;
        }
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.internal_static_PlayerCompoundMaterialRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp build() {
        emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp buildPartial() {
        emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp result = new emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.compoundQueueData_ = compoundQueueDataBuilder_ == null
              ? compoundQueueData_
              : compoundQueueDataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp other) {
        if (other == emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp.getDefaultInstance()) return this;
        if (other.hasCompoundQueueData()) {
          mergeCompoundQueueData(other.getCompoundQueueData());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 58: {
                input.readMessage(
                    getCompoundQueueDataFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 58
              case 80: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
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

      private emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData compoundQueueData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData, emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.Builder, emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder> compoundQueueDataBuilder_;
      /**
       * <code>.CompoundQueueData compoundQueueData = 7;</code>
       * @return Whether the compoundQueueData field is set.
       */
      public boolean hasCompoundQueueData() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.CompoundQueueData compoundQueueData = 7;</code>
       * @return The compoundQueueData.
       */
      public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData getCompoundQueueData() {
        if (compoundQueueDataBuilder_ == null) {
          return compoundQueueData_ == null ? emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance() : compoundQueueData_;
        } else {
          return compoundQueueDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.CompoundQueueData compoundQueueData = 7;</code>
       */
      public Builder setCompoundQueueData(emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData value) {
        if (compoundQueueDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          compoundQueueData_ = value;
        } else {
          compoundQueueDataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.CompoundQueueData compoundQueueData = 7;</code>
       */
      public Builder setCompoundQueueData(
          emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.Builder builderForValue) {
        if (compoundQueueDataBuilder_ == null) {
          compoundQueueData_ = builderForValue.build();
        } else {
          compoundQueueDataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.CompoundQueueData compoundQueueData = 7;</code>
       */
      public Builder mergeCompoundQueueData(emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData value) {
        if (compoundQueueDataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            compoundQueueData_ != null &&
            compoundQueueData_ != emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance()) {
            getCompoundQueueDataBuilder().mergeFrom(value);
          } else {
            compoundQueueData_ = value;
          }
        } else {
          compoundQueueDataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.CompoundQueueData compoundQueueData = 7;</code>
       */
      public Builder clearCompoundQueueData() {
        bitField0_ = (bitField0_ & ~0x00000001);
        compoundQueueData_ = null;
        if (compoundQueueDataBuilder_ != null) {
          compoundQueueDataBuilder_.dispose();
          compoundQueueDataBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.CompoundQueueData compoundQueueData = 7;</code>
       */
      public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.Builder getCompoundQueueDataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCompoundQueueDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.CompoundQueueData compoundQueueData = 7;</code>
       */
      public emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder getCompoundQueueDataOrBuilder() {
        if (compoundQueueDataBuilder_ != null) {
          return compoundQueueDataBuilder_.getMessageOrBuilder();
        } else {
          return compoundQueueData_ == null ?
              emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.getDefaultInstance() : compoundQueueData_;
        }
      }
      /**
       * <code>.CompoundQueueData compoundQueueData = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData, emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.Builder, emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder> 
          getCompoundQueueDataFieldBuilder() {
        if (compoundQueueDataBuilder_ == null) {
          compoundQueueDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData, emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueData.Builder, emu.grasscutter.net.proto.CompoundQueueDataOuterClass.CompoundQueueDataOrBuilder>(
                  getCompoundQueueData(),
                  getParentForChildren(),
                  isClean());
          compoundQueueData_ = null;
        }
        return compoundQueueDataBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerCompoundMaterialRsp)
    }

    // @@protoc_insertion_point(class_scope:PlayerCompoundMaterialRsp)
    private static final emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp();
    }

    public static emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerCompoundMaterialRsp>
        PARSER = new com.google.protobuf.AbstractParser<PlayerCompoundMaterialRsp>() {
      @java.lang.Override
      public PlayerCompoundMaterialRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerCompoundMaterialRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerCompoundMaterialRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerCompoundMaterialRspOuterClass.PlayerCompoundMaterialRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerCompoundMaterialRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerCompoundMaterialRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037PlayerCompoundMaterialRsp.proto\032\027Compo" +
      "undQueueData.proto\"[\n\031PlayerCompoundMate" +
      "rialRsp\022-\n\021compoundQueueData\030\007 \001(\0132\022.Com" +
      "poundQueueData\022\017\n\007retcode\030\n \001(\005B\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CompoundQueueDataOuterClass.getDescriptor(),
        });
    internal_static_PlayerCompoundMaterialRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerCompoundMaterialRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerCompoundMaterialRsp_descriptor,
        new java.lang.String[] { "CompoundQueueData", "Retcode", });
    emu.grasscutter.net.proto.CompoundQueueDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
