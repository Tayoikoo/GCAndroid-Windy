// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampGetRecvItemListRsp.proto

package emu.grasscutter.net.proto;

public final class WinterCampGetRecvItemListRspOuterClass {
  private WinterCampGetRecvItemListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampGetRecvItemListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampGetRecvItemListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData> 
        getRecvItemDataListList();
    /**
     * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
     */
    emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData getRecvItemDataList(int index);
    /**
     * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
     */
    int getRecvItemDataListCount();
    /**
     * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder> 
        getRecvItemDataListOrBuilderList();
    /**
     * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
     */
    emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder getRecvItemDataListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 8882
   * Obf: OEAPHJPCFHA
   * </pre>
   *
   * Protobuf type {@code WinterCampGetRecvItemListRsp}
   */
  public static final class WinterCampGetRecvItemListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampGetRecvItemListRsp)
      WinterCampGetRecvItemListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampGetRecvItemListRsp.newBuilder() to construct.
    private WinterCampGetRecvItemListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampGetRecvItemListRsp() {
      recvItemDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampGetRecvItemListRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.internal_static_WinterCampGetRecvItemListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.internal_static_WinterCampGetRecvItemListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp.class, emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp.Builder.class);
    }

    public static final int RECV_ITEM_DATA_LIST_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData> recvItemDataList_;
    /**
     * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData> getRecvItemDataListList() {
      return recvItemDataList_;
    }
    /**
     * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder> 
        getRecvItemDataListOrBuilderList() {
      return recvItemDataList_;
    }
    /**
     * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
     */
    @java.lang.Override
    public int getRecvItemDataListCount() {
      return recvItemDataList_.size();
    }
    /**
     * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData getRecvItemDataList(int index) {
      return recvItemDataList_.get(index);
    }
    /**
     * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder getRecvItemDataListOrBuilder(
        int index) {
      return recvItemDataList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 11;</code>
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
      for (int i = 0; i < recvItemDataList_.size(); i++) {
        output.writeMessage(4, recvItemDataList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < recvItemDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, recvItemDataList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp other = (emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp) obj;

      if (!getRecvItemDataListList()
          .equals(other.getRecvItemDataListList())) return false;
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
      if (getRecvItemDataListCount() > 0) {
        hash = (37 * hash) + RECV_ITEM_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRecvItemDataListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp prototype) {
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
     * CmdId: 8882
     * Obf: OEAPHJPCFHA
     * </pre>
     *
     * Protobuf type {@code WinterCampGetRecvItemListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampGetRecvItemListRsp)
        emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.internal_static_WinterCampGetRecvItemListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.internal_static_WinterCampGetRecvItemListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp.class, emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp.newBuilder()
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
        if (recvItemDataListBuilder_ == null) {
          recvItemDataList_ = java.util.Collections.emptyList();
        } else {
          recvItemDataList_ = null;
          recvItemDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.internal_static_WinterCampGetRecvItemListRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp build() {
        emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp buildPartial() {
        emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp result = new emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp result) {
        if (recvItemDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            recvItemDataList_ = java.util.Collections.unmodifiableList(recvItemDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.recvItemDataList_ = recvItemDataList_;
        } else {
          result.recvItemDataList_ = recvItemDataListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp) {
          return mergeFrom((emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp other) {
        if (other == emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp.getDefaultInstance()) return this;
        if (recvItemDataListBuilder_ == null) {
          if (!other.recvItemDataList_.isEmpty()) {
            if (recvItemDataList_.isEmpty()) {
              recvItemDataList_ = other.recvItemDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRecvItemDataListIsMutable();
              recvItemDataList_.addAll(other.recvItemDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.recvItemDataList_.isEmpty()) {
            if (recvItemDataListBuilder_.isEmpty()) {
              recvItemDataListBuilder_.dispose();
              recvItemDataListBuilder_ = null;
              recvItemDataList_ = other.recvItemDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              recvItemDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRecvItemDataListFieldBuilder() : null;
            } else {
              recvItemDataListBuilder_.addAllMessages(other.recvItemDataList_);
            }
          }
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
              case 34: {
                emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData m =
                    input.readMessage(
                        emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.parser(),
                        extensionRegistry);
                if (recvItemDataListBuilder_ == null) {
                  ensureRecvItemDataListIsMutable();
                  recvItemDataList_.add(m);
                } else {
                  recvItemDataListBuilder_.addMessage(m);
                }
                break;
              } // case 34
              case 88: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
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

      private java.util.List<emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData> recvItemDataList_ =
        java.util.Collections.emptyList();
      private void ensureRecvItemDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          recvItemDataList_ = new java.util.ArrayList<emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData>(recvItemDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder> recvItemDataListBuilder_;

      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData> getRecvItemDataListList() {
        if (recvItemDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(recvItemDataList_);
        } else {
          return recvItemDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public int getRecvItemDataListCount() {
        if (recvItemDataListBuilder_ == null) {
          return recvItemDataList_.size();
        } else {
          return recvItemDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData getRecvItemDataList(int index) {
        if (recvItemDataListBuilder_ == null) {
          return recvItemDataList_.get(index);
        } else {
          return recvItemDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public Builder setRecvItemDataList(
          int index, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData value) {
        if (recvItemDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecvItemDataListIsMutable();
          recvItemDataList_.set(index, value);
          onChanged();
        } else {
          recvItemDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public Builder setRecvItemDataList(
          int index, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder builderForValue) {
        if (recvItemDataListBuilder_ == null) {
          ensureRecvItemDataListIsMutable();
          recvItemDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          recvItemDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public Builder addRecvItemDataList(emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData value) {
        if (recvItemDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecvItemDataListIsMutable();
          recvItemDataList_.add(value);
          onChanged();
        } else {
          recvItemDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public Builder addRecvItemDataList(
          int index, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData value) {
        if (recvItemDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecvItemDataListIsMutable();
          recvItemDataList_.add(index, value);
          onChanged();
        } else {
          recvItemDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public Builder addRecvItemDataList(
          emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder builderForValue) {
        if (recvItemDataListBuilder_ == null) {
          ensureRecvItemDataListIsMutable();
          recvItemDataList_.add(builderForValue.build());
          onChanged();
        } else {
          recvItemDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public Builder addRecvItemDataList(
          int index, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder builderForValue) {
        if (recvItemDataListBuilder_ == null) {
          ensureRecvItemDataListIsMutable();
          recvItemDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          recvItemDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public Builder addAllRecvItemDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData> values) {
        if (recvItemDataListBuilder_ == null) {
          ensureRecvItemDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, recvItemDataList_);
          onChanged();
        } else {
          recvItemDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public Builder clearRecvItemDataList() {
        if (recvItemDataListBuilder_ == null) {
          recvItemDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          recvItemDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public Builder removeRecvItemDataList(int index) {
        if (recvItemDataListBuilder_ == null) {
          ensureRecvItemDataListIsMutable();
          recvItemDataList_.remove(index);
          onChanged();
        } else {
          recvItemDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder getRecvItemDataListBuilder(
          int index) {
        return getRecvItemDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder getRecvItemDataListOrBuilder(
          int index) {
        if (recvItemDataListBuilder_ == null) {
          return recvItemDataList_.get(index);  } else {
          return recvItemDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder> 
           getRecvItemDataListOrBuilderList() {
        if (recvItemDataListBuilder_ != null) {
          return recvItemDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(recvItemDataList_);
        }
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder addRecvItemDataListBuilder() {
        return getRecvItemDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.getDefaultInstance());
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder addRecvItemDataListBuilder(
          int index) {
        return getRecvItemDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.getDefaultInstance());
      }
      /**
       * <code>repeated .WinterCampRecvItemData recv_item_data_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder> 
           getRecvItemDataListBuilderList() {
        return getRecvItemDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder> 
          getRecvItemDataListFieldBuilder() {
        if (recvItemDataListBuilder_ == null) {
          recvItemDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemData.Builder, emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.WinterCampRecvItemDataOrBuilder>(
                  recvItemDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          recvItemDataList_ = null;
        }
        return recvItemDataListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
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
       * <code>int32 retcode = 11;</code>
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


      // @@protoc_insertion_point(builder_scope:WinterCampGetRecvItemListRsp)
    }

    // @@protoc_insertion_point(class_scope:WinterCampGetRecvItemListRsp)
    private static final emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp();
    }

    public static emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampGetRecvItemListRsp>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampGetRecvItemListRsp>() {
      @java.lang.Override
      public WinterCampGetRecvItemListRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<WinterCampGetRecvItemListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampGetRecvItemListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampGetRecvItemListRspOuterClass.WinterCampGetRecvItemListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampGetRecvItemListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampGetRecvItemListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"WinterCampGetRecvItemListRsp.proto\032\034Wi" +
      "nterCampRecvItemData.proto\"e\n\034WinterCamp" +
      "GetRecvItemListRsp\0224\n\023recv_item_data_lis" +
      "t\030\004 \003(\0132\027.WinterCampRecvItemData\022\017\n\007retc" +
      "ode\030\013 \001(\005B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.getDescriptor(),
        });
    internal_static_WinterCampGetRecvItemListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampGetRecvItemListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampGetRecvItemListRsp_descriptor,
        new java.lang.String[] { "RecvItemDataList", "Retcode", });
    emu.grasscutter.net.proto.WinterCampRecvItemDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
