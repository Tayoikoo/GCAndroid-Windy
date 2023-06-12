// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnlockedFurnitureSuiteDataNotify.proto

package emu.grasscutter.net.proto;

public final class UnlockedFurnitureSuiteDataNotifyOuterClass {
  private UnlockedFurnitureSuiteDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnlockedFurnitureSuiteDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnlockedFurnitureSuiteDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 furniture_suite_id_list = 14;</code>
     * @return A list containing the furnitureSuiteIdList.
     */
    java.util.List<java.lang.Integer> getFurnitureSuiteIdListList();
    /**
     * <code>repeated uint32 furniture_suite_id_list = 14;</code>
     * @return The count of furnitureSuiteIdList.
     */
    int getFurnitureSuiteIdListCount();
    /**
     * <code>repeated uint32 furniture_suite_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The furnitureSuiteIdList at the given index.
     */
    int getFurnitureSuiteIdList(int index);

    /**
     * <code>bool is_all = 13;</code>
     * @return The isAll.
     */
    boolean getIsAll();
  }
  /**
   * <pre>
   * CmdId: 4857
   * Name: ECPIDCALIPC
   * </pre>
   *
   * Protobuf type {@code UnlockedFurnitureSuiteDataNotify}
   */
  public static final class UnlockedFurnitureSuiteDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnlockedFurnitureSuiteDataNotify)
      UnlockedFurnitureSuiteDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnlockedFurnitureSuiteDataNotify.newBuilder() to construct.
    private UnlockedFurnitureSuiteDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnlockedFurnitureSuiteDataNotify() {
      furnitureSuiteIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnlockedFurnitureSuiteDataNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.internal_static_UnlockedFurnitureSuiteDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.internal_static_UnlockedFurnitureSuiteDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.class, emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.Builder.class);
    }

    public static final int FURNITURE_SUITE_ID_LIST_FIELD_NUMBER = 14;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList furnitureSuiteIdList_;
    /**
     * <code>repeated uint32 furniture_suite_id_list = 14;</code>
     * @return A list containing the furnitureSuiteIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFurnitureSuiteIdListList() {
      return furnitureSuiteIdList_;
    }
    /**
     * <code>repeated uint32 furniture_suite_id_list = 14;</code>
     * @return The count of furnitureSuiteIdList.
     */
    public int getFurnitureSuiteIdListCount() {
      return furnitureSuiteIdList_.size();
    }
    /**
     * <code>repeated uint32 furniture_suite_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The furnitureSuiteIdList at the given index.
     */
    public int getFurnitureSuiteIdList(int index) {
      return furnitureSuiteIdList_.getInt(index);
    }
    private int furnitureSuiteIdListMemoizedSerializedSize = -1;

    public static final int IS_ALL_FIELD_NUMBER = 13;
    private boolean isAll_ = false;
    /**
     * <code>bool is_all = 13;</code>
     * @return The isAll.
     */
    @java.lang.Override
    public boolean getIsAll() {
      return isAll_;
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
      if (isAll_ != false) {
        output.writeBool(13, isAll_);
      }
      if (getFurnitureSuiteIdListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(furnitureSuiteIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < furnitureSuiteIdList_.size(); i++) {
        output.writeUInt32NoTag(furnitureSuiteIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAll_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isAll_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < furnitureSuiteIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(furnitureSuiteIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFurnitureSuiteIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        furnitureSuiteIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify other = (emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify) obj;

      if (!getFurnitureSuiteIdListList()
          .equals(other.getFurnitureSuiteIdListList())) return false;
      if (getIsAll()
          != other.getIsAll()) return false;
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
      if (getFurnitureSuiteIdListCount() > 0) {
        hash = (37 * hash) + FURNITURE_SUITE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFurnitureSuiteIdListList().hashCode();
      }
      hash = (37 * hash) + IS_ALL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAll());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify prototype) {
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
     * CmdId: 4857
     * Name: ECPIDCALIPC
     * </pre>
     *
     * Protobuf type {@code UnlockedFurnitureSuiteDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnlockedFurnitureSuiteDataNotify)
        emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.internal_static_UnlockedFurnitureSuiteDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.internal_static_UnlockedFurnitureSuiteDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.class, emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.newBuilder()
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
        furnitureSuiteIdList_ = emptyIntList();
        isAll_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.internal_static_UnlockedFurnitureSuiteDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify build() {
        emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify buildPartial() {
        emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify result = new emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          furnitureSuiteIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.furnitureSuiteIdList_ = furnitureSuiteIdList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isAll_ = isAll_;
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
        if (other instanceof emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify other) {
        if (other == emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify.getDefaultInstance()) return this;
        if (!other.furnitureSuiteIdList_.isEmpty()) {
          if (furnitureSuiteIdList_.isEmpty()) {
            furnitureSuiteIdList_ = other.furnitureSuiteIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFurnitureSuiteIdListIsMutable();
            furnitureSuiteIdList_.addAll(other.furnitureSuiteIdList_);
          }
          onChanged();
        }
        if (other.getIsAll() != false) {
          setIsAll(other.getIsAll());
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
              case 104: {
                isAll_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
              case 112: {
                int v = input.readUInt32();
                ensureFurnitureSuiteIdListIsMutable();
                furnitureSuiteIdList_.addInt(v);
                break;
              } // case 112
              case 114: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFurnitureSuiteIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  furnitureSuiteIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 114
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

      private com.google.protobuf.Internal.IntList furnitureSuiteIdList_ = emptyIntList();
      private void ensureFurnitureSuiteIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          furnitureSuiteIdList_ = mutableCopy(furnitureSuiteIdList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 furniture_suite_id_list = 14;</code>
       * @return A list containing the furnitureSuiteIdList.
       */
      public java.util.List<java.lang.Integer>
          getFurnitureSuiteIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(furnitureSuiteIdList_) : furnitureSuiteIdList_;
      }
      /**
       * <code>repeated uint32 furniture_suite_id_list = 14;</code>
       * @return The count of furnitureSuiteIdList.
       */
      public int getFurnitureSuiteIdListCount() {
        return furnitureSuiteIdList_.size();
      }
      /**
       * <code>repeated uint32 furniture_suite_id_list = 14;</code>
       * @param index The index of the element to return.
       * @return The furnitureSuiteIdList at the given index.
       */
      public int getFurnitureSuiteIdList(int index) {
        return furnitureSuiteIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 furniture_suite_id_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The furnitureSuiteIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFurnitureSuiteIdList(
          int index, int value) {

        ensureFurnitureSuiteIdListIsMutable();
        furnitureSuiteIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furniture_suite_id_list = 14;</code>
       * @param value The furnitureSuiteIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFurnitureSuiteIdList(int value) {

        ensureFurnitureSuiteIdListIsMutable();
        furnitureSuiteIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furniture_suite_id_list = 14;</code>
       * @param values The furnitureSuiteIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFurnitureSuiteIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFurnitureSuiteIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, furnitureSuiteIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furniture_suite_id_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFurnitureSuiteIdList() {
        furnitureSuiteIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isAll_ ;
      /**
       * <code>bool is_all = 13;</code>
       * @return The isAll.
       */
      @java.lang.Override
      public boolean getIsAll() {
        return isAll_;
      }
      /**
       * <code>bool is_all = 13;</code>
       * @param value The isAll to set.
       * @return This builder for chaining.
       */
      public Builder setIsAll(boolean value) {

        isAll_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_all = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAll() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isAll_ = false;
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


      // @@protoc_insertion_point(builder_scope:UnlockedFurnitureSuiteDataNotify)
    }

    // @@protoc_insertion_point(class_scope:UnlockedFurnitureSuiteDataNotify)
    private static final emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify();
    }

    public static emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnlockedFurnitureSuiteDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<UnlockedFurnitureSuiteDataNotify>() {
      @java.lang.Override
      public UnlockedFurnitureSuiteDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<UnlockedFurnitureSuiteDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnlockedFurnitureSuiteDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UnlockedFurnitureSuiteDataNotifyOuterClass.UnlockedFurnitureSuiteDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnlockedFurnitureSuiteDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnlockedFurnitureSuiteDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&UnlockedFurnitureSuiteDataNotify.proto" +
      "\"S\n UnlockedFurnitureSuiteDataNotify\022\037\n\027" +
      "furniture_suite_id_list\030\016 \003(\r\022\016\n\006is_all\030" +
      "\r \001(\010B\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnlockedFurnitureSuiteDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnlockedFurnitureSuiteDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnlockedFurnitureSuiteDataNotify_descriptor,
        new java.lang.String[] { "FurnitureSuiteIdList", "IsAll", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
