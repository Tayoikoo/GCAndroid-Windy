// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetFriendShowNameCardInfoRsp.proto

package emu.grasscutter.net.proto;

public final class GetFriendShowNameCardInfoRspOuterClass {
  private GetFriendShowNameCardInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetFriendShowNameCardInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetFriendShowNameCardInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 show_name_card_id_list = 12;</code>
     * @return A list containing the showNameCardIdList.
     */
    java.util.List<java.lang.Integer> getShowNameCardIdListList();
    /**
     * <code>repeated uint32 show_name_card_id_list = 12;</code>
     * @return The count of showNameCardIdList.
     */
    int getShowNameCardIdListCount();
    /**
     * <code>repeated uint32 show_name_card_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The showNameCardIdList at the given index.
     */
    int getShowNameCardIdList(int index);

    /**
     * <code>uint32 uid = 3;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 4077
   * Obf: FPGCDLCLIGF
   * </pre>
   *
   * Protobuf type {@code GetFriendShowNameCardInfoRsp}
   */
  public static final class GetFriendShowNameCardInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetFriendShowNameCardInfoRsp)
      GetFriendShowNameCardInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetFriendShowNameCardInfoRsp.newBuilder() to construct.
    private GetFriendShowNameCardInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetFriendShowNameCardInfoRsp() {
      showNameCardIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetFriendShowNameCardInfoRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.internal_static_GetFriendShowNameCardInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.internal_static_GetFriendShowNameCardInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.class, emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.Builder.class);
    }

    public static final int SHOW_NAME_CARD_ID_LIST_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList showNameCardIdList_;
    /**
     * <code>repeated uint32 show_name_card_id_list = 12;</code>
     * @return A list containing the showNameCardIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getShowNameCardIdListList() {
      return showNameCardIdList_;
    }
    /**
     * <code>repeated uint32 show_name_card_id_list = 12;</code>
     * @return The count of showNameCardIdList.
     */
    public int getShowNameCardIdListCount() {
      return showNameCardIdList_.size();
    }
    /**
     * <code>repeated uint32 show_name_card_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The showNameCardIdList at the given index.
     */
    public int getShowNameCardIdList(int index) {
      return showNameCardIdList_.getInt(index);
    }
    private int showNameCardIdListMemoizedSerializedSize = -1;

    public static final int UID_FIELD_NUMBER = 3;
    private int uid_ = 0;
    /**
     * <code>uint32 uid = 3;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 2;</code>
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
      getSerializedSize();
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (uid_ != 0) {
        output.writeUInt32(3, uid_);
      }
      if (getShowNameCardIdListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(showNameCardIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < showNameCardIdList_.size(); i++) {
        output.writeUInt32NoTag(showNameCardIdList_.getInt(i));
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
          .computeInt32Size(2, retcode_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, uid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < showNameCardIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(showNameCardIdList_.getInt(i));
        }
        size += dataSize;
        if (!getShowNameCardIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        showNameCardIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp other = (emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp) obj;

      if (!getShowNameCardIdListList()
          .equals(other.getShowNameCardIdListList())) return false;
      if (getUid()
          != other.getUid()) return false;
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
      if (getShowNameCardIdListCount() > 0) {
        hash = (37 * hash) + SHOW_NAME_CARD_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getShowNameCardIdListList().hashCode();
      }
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp prototype) {
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
     * CmdId: 4077
     * Obf: FPGCDLCLIGF
     * </pre>
     *
     * Protobuf type {@code GetFriendShowNameCardInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetFriendShowNameCardInfoRsp)
        emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.internal_static_GetFriendShowNameCardInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.internal_static_GetFriendShowNameCardInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.class, emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.newBuilder()
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
        showNameCardIdList_ = emptyIntList();
        uid_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.internal_static_GetFriendShowNameCardInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp build() {
        emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp buildPartial() {
        emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp result = new emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.showNameCardIdList_ = showNameCardIdList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.uid_ = uid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
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
        if (other instanceof emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp other) {
        if (other == emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.getDefaultInstance()) return this;
        if (!other.showNameCardIdList_.isEmpty()) {
          if (showNameCardIdList_.isEmpty()) {
            showNameCardIdList_ = other.showNameCardIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShowNameCardIdListIsMutable();
            showNameCardIdList_.addAll(other.showNameCardIdList_);
          }
          onChanged();
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
              case 16: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 16
              case 24: {
                uid_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
              case 96: {
                int v = input.readUInt32();
                ensureShowNameCardIdListIsMutable();
                showNameCardIdList_.addInt(v);
                break;
              } // case 96
              case 98: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureShowNameCardIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  showNameCardIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 98
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

      private com.google.protobuf.Internal.IntList showNameCardIdList_ = emptyIntList();
      private void ensureShowNameCardIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_ = mutableCopy(showNameCardIdList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @return A list containing the showNameCardIdList.
       */
      public java.util.List<java.lang.Integer>
          getShowNameCardIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(showNameCardIdList_) : showNameCardIdList_;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @return The count of showNameCardIdList.
       */
      public int getShowNameCardIdListCount() {
        return showNameCardIdList_.size();
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @param index The index of the element to return.
       * @return The showNameCardIdList at the given index.
       */
      public int getShowNameCardIdList(int index) {
        return showNameCardIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The showNameCardIdList to set.
       * @return This builder for chaining.
       */
      public Builder setShowNameCardIdList(
          int index, int value) {

        ensureShowNameCardIdListIsMutable();
        showNameCardIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @param value The showNameCardIdList to add.
       * @return This builder for chaining.
       */
      public Builder addShowNameCardIdList(int value) {

        ensureShowNameCardIdListIsMutable();
        showNameCardIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @param values The showNameCardIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllShowNameCardIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureShowNameCardIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, showNameCardIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearShowNameCardIdList() {
        showNameCardIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 3;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 3;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {

        uid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        uid_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:GetFriendShowNameCardInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetFriendShowNameCardInfoRsp)
    private static final emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp();
    }

    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetFriendShowNameCardInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetFriendShowNameCardInfoRsp>() {
      @java.lang.Override
      public GetFriendShowNameCardInfoRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetFriendShowNameCardInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetFriendShowNameCardInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetFriendShowNameCardInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetFriendShowNameCardInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GetFriendShowNameCardInfoRsp.proto\"\\\n\034" +
      "GetFriendShowNameCardInfoRsp\022\036\n\026show_nam" +
      "e_card_id_list\030\014 \003(\r\022\013\n\003uid\030\003 \001(\r\022\017\n\007ret" +
      "code\030\002 \001(\005B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetFriendShowNameCardInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetFriendShowNameCardInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetFriendShowNameCardInfoRsp_descriptor,
        new java.lang.String[] { "ShowNameCardIdList", "Uid", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
