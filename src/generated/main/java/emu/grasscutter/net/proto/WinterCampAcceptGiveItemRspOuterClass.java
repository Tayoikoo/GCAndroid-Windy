// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampAcceptGiveItemRsp.proto

package emu.grasscutter.net.proto;

public final class WinterCampAcceptGiveItemRspOuterClass {
  private WinterCampAcceptGiveItemRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampAcceptGiveItemRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampAcceptGiveItemRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
     * @return Whether the acceptItemResultInfo field is set.
     */
    boolean hasAcceptItemResultInfo();
    /**
     * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
     * @return The acceptItemResultInfo.
     */
    emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo getAcceptItemResultInfo();
    /**
     * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
     */
    emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder getAcceptItemResultInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 8018
   * Name: JPIOJPILOCF
   * </pre>
   *
   * Protobuf type {@code WinterCampAcceptGiveItemRsp}
   */
  public static final class WinterCampAcceptGiveItemRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampAcceptGiveItemRsp)
      WinterCampAcceptGiveItemRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampAcceptGiveItemRsp.newBuilder() to construct.
    private WinterCampAcceptGiveItemRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampAcceptGiveItemRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampAcceptGiveItemRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.internal_static_WinterCampAcceptGiveItemRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.internal_static_WinterCampAcceptGiveItemRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp.class, emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ACCEPT_ITEM_RESULT_INFO_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo acceptItemResultInfo_;
    /**
     * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
     * @return Whether the acceptItemResultInfo field is set.
     */
    @java.lang.Override
    public boolean hasAcceptItemResultInfo() {
      return acceptItemResultInfo_ != null;
    }
    /**
     * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
     * @return The acceptItemResultInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo getAcceptItemResultInfo() {
      return acceptItemResultInfo_ == null ? emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.getDefaultInstance() : acceptItemResultInfo_;
    }
    /**
     * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder getAcceptItemResultInfoOrBuilder() {
      return acceptItemResultInfo_ == null ? emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.getDefaultInstance() : acceptItemResultInfo_;
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
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (acceptItemResultInfo_ != null) {
        output.writeMessage(11, getAcceptItemResultInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (acceptItemResultInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getAcceptItemResultInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp other = (emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasAcceptItemResultInfo() != other.hasAcceptItemResultInfo()) return false;
      if (hasAcceptItemResultInfo()) {
        if (!getAcceptItemResultInfo()
            .equals(other.getAcceptItemResultInfo())) return false;
      }
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasAcceptItemResultInfo()) {
        hash = (37 * hash) + ACCEPT_ITEM_RESULT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAcceptItemResultInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp prototype) {
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
     * CmdId: 8018
     * Name: JPIOJPILOCF
     * </pre>
     *
     * Protobuf type {@code WinterCampAcceptGiveItemRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampAcceptGiveItemRsp)
        emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.internal_static_WinterCampAcceptGiveItemRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.internal_static_WinterCampAcceptGiveItemRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp.class, emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp.newBuilder()
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
        retcode_ = 0;
        acceptItemResultInfo_ = null;
        if (acceptItemResultInfoBuilder_ != null) {
          acceptItemResultInfoBuilder_.dispose();
          acceptItemResultInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.internal_static_WinterCampAcceptGiveItemRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp build() {
        emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp buildPartial() {
        emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp result = new emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.acceptItemResultInfo_ = acceptItemResultInfoBuilder_ == null
              ? acceptItemResultInfo_
              : acceptItemResultInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp) {
          return mergeFrom((emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp other) {
        if (other == emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasAcceptItemResultInfo()) {
          mergeAcceptItemResultInfo(other.getAcceptItemResultInfo());
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
              case 24: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 90: {
                input.readMessage(
                    getAcceptItemResultInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 90
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo acceptItemResultInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder> acceptItemResultInfoBuilder_;
      /**
       * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
       * @return Whether the acceptItemResultInfo field is set.
       */
      public boolean hasAcceptItemResultInfo() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
       * @return The acceptItemResultInfo.
       */
      public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo getAcceptItemResultInfo() {
        if (acceptItemResultInfoBuilder_ == null) {
          return acceptItemResultInfo_ == null ? emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.getDefaultInstance() : acceptItemResultInfo_;
        } else {
          return acceptItemResultInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
       */
      public Builder setAcceptItemResultInfo(emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo value) {
        if (acceptItemResultInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          acceptItemResultInfo_ = value;
        } else {
          acceptItemResultInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
       */
      public Builder setAcceptItemResultInfo(
          emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder builderForValue) {
        if (acceptItemResultInfoBuilder_ == null) {
          acceptItemResultInfo_ = builderForValue.build();
        } else {
          acceptItemResultInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
       */
      public Builder mergeAcceptItemResultInfo(emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo value) {
        if (acceptItemResultInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            acceptItemResultInfo_ != null &&
            acceptItemResultInfo_ != emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.getDefaultInstance()) {
            getAcceptItemResultInfoBuilder().mergeFrom(value);
          } else {
            acceptItemResultInfo_ = value;
          }
        } else {
          acceptItemResultInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
       */
      public Builder clearAcceptItemResultInfo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        acceptItemResultInfo_ = null;
        if (acceptItemResultInfoBuilder_ != null) {
          acceptItemResultInfoBuilder_.dispose();
          acceptItemResultInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
       */
      public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder getAcceptItemResultInfoBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getAcceptItemResultInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
       */
      public emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder getAcceptItemResultInfoOrBuilder() {
        if (acceptItemResultInfoBuilder_ != null) {
          return acceptItemResultInfoBuilder_.getMessageOrBuilder();
        } else {
          return acceptItemResultInfo_ == null ?
              emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.getDefaultInstance() : acceptItemResultInfo_;
        }
      }
      /**
       * <code>.WinterCampAcceptItemResultInfo accept_item_result_info = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder> 
          getAcceptItemResultInfoFieldBuilder() {
        if (acceptItemResultInfoBuilder_ == null) {
          acceptItemResultInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfo.Builder, emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.WinterCampAcceptItemResultInfoOrBuilder>(
                  getAcceptItemResultInfo(),
                  getParentForChildren(),
                  isClean());
          acceptItemResultInfo_ = null;
        }
        return acceptItemResultInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WinterCampAcceptGiveItemRsp)
    }

    // @@protoc_insertion_point(class_scope:WinterCampAcceptGiveItemRsp)
    private static final emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp();
    }

    public static emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampAcceptGiveItemRsp>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampAcceptGiveItemRsp>() {
      @java.lang.Override
      public WinterCampAcceptGiveItemRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<WinterCampAcceptGiveItemRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampAcceptGiveItemRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampAcceptGiveItemRspOuterClass.WinterCampAcceptGiveItemRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampAcceptGiveItemRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampAcceptGiveItemRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!WinterCampAcceptGiveItemRsp.proto\032$Win" +
      "terCampAcceptItemResultInfo.proto\"p\n\033Win" +
      "terCampAcceptGiveItemRsp\022\017\n\007retcode\030\003 \001(" +
      "\005\022@\n\027accept_item_result_info\030\013 \001(\0132\037.Win" +
      "terCampAcceptItemResultInfoB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.getDescriptor(),
        });
    internal_static_WinterCampAcceptGiveItemRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampAcceptGiveItemRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampAcceptGiveItemRsp_descriptor,
        new java.lang.String[] { "Retcode", "AcceptItemResultInfo", });
    emu.grasscutter.net.proto.WinterCampAcceptItemResultInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
