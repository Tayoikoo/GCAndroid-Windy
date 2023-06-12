// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnlockedFurnitureFormulaDataNotify.proto

package emu.grasscutter.net.proto;

public final class UnlockedFurnitureFormulaDataNotifyOuterClass {
  private UnlockedFurnitureFormulaDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnlockedFurnitureFormulaDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnlockedFurnitureFormulaDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 furniture_id_list = 1;</code>
     * @return A list containing the furnitureIdList.
     */
    java.util.List<java.lang.Integer> getFurnitureIdListList();
    /**
     * <code>repeated uint32 furniture_id_list = 1;</code>
     * @return The count of furnitureIdList.
     */
    int getFurnitureIdListCount();
    /**
     * <code>repeated uint32 furniture_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The furnitureIdList at the given index.
     */
    int getFurnitureIdList(int index);

    /**
     * <code>bool is_all = 13;</code>
     * @return The isAll.
     */
    boolean getIsAll();
  }
  /**
   * <pre>
   * CmdId: 4562
   * Name: BFMLANHPHHK
   * </pre>
   *
   * Protobuf type {@code UnlockedFurnitureFormulaDataNotify}
   */
  public static final class UnlockedFurnitureFormulaDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnlockedFurnitureFormulaDataNotify)
      UnlockedFurnitureFormulaDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnlockedFurnitureFormulaDataNotify.newBuilder() to construct.
    private UnlockedFurnitureFormulaDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnlockedFurnitureFormulaDataNotify() {
      furnitureIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnlockedFurnitureFormulaDataNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.class, emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.Builder.class);
    }

    public static final int FURNITURE_ID_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList furnitureIdList_;
    /**
     * <code>repeated uint32 furniture_id_list = 1;</code>
     * @return A list containing the furnitureIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFurnitureIdListList() {
      return furnitureIdList_;
    }
    /**
     * <code>repeated uint32 furniture_id_list = 1;</code>
     * @return The count of furnitureIdList.
     */
    public int getFurnitureIdListCount() {
      return furnitureIdList_.size();
    }
    /**
     * <code>repeated uint32 furniture_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The furnitureIdList at the given index.
     */
    public int getFurnitureIdList(int index) {
      return furnitureIdList_.getInt(index);
    }
    private int furnitureIdListMemoizedSerializedSize = -1;

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
      if (getFurnitureIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(furnitureIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < furnitureIdList_.size(); i++) {
        output.writeUInt32NoTag(furnitureIdList_.getInt(i));
      }
      if (isAll_ != false) {
        output.writeBool(13, isAll_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < furnitureIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(furnitureIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFurnitureIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        furnitureIdListMemoizedSerializedSize = dataSize;
      }
      if (isAll_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isAll_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify other = (emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify) obj;

      if (!getFurnitureIdListList()
          .equals(other.getFurnitureIdListList())) return false;
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
      if (getFurnitureIdListCount() > 0) {
        hash = (37 * hash) + FURNITURE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFurnitureIdListList().hashCode();
      }
      hash = (37 * hash) + IS_ALL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAll());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify prototype) {
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
     * CmdId: 4562
     * Name: BFMLANHPHHK
     * </pre>
     *
     * Protobuf type {@code UnlockedFurnitureFormulaDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnlockedFurnitureFormulaDataNotify)
        emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.class, emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.newBuilder()
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
        furnitureIdList_ = emptyIntList();
        isAll_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify build() {
        emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify buildPartial() {
        emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify result = new emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          furnitureIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.furnitureIdList_ = furnitureIdList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify result) {
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
        if (other instanceof emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify other) {
        if (other == emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.getDefaultInstance()) return this;
        if (!other.furnitureIdList_.isEmpty()) {
          if (furnitureIdList_.isEmpty()) {
            furnitureIdList_ = other.furnitureIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFurnitureIdListIsMutable();
            furnitureIdList_.addAll(other.furnitureIdList_);
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
              case 8: {
                int v = input.readUInt32();
                ensureFurnitureIdListIsMutable();
                furnitureIdList_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFurnitureIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  furnitureIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
              case 104: {
                isAll_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
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

      private com.google.protobuf.Internal.IntList furnitureIdList_ = emptyIntList();
      private void ensureFurnitureIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          furnitureIdList_ = mutableCopy(furnitureIdList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 furniture_id_list = 1;</code>
       * @return A list containing the furnitureIdList.
       */
      public java.util.List<java.lang.Integer>
          getFurnitureIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(furnitureIdList_) : furnitureIdList_;
      }
      /**
       * <code>repeated uint32 furniture_id_list = 1;</code>
       * @return The count of furnitureIdList.
       */
      public int getFurnitureIdListCount() {
        return furnitureIdList_.size();
      }
      /**
       * <code>repeated uint32 furniture_id_list = 1;</code>
       * @param index The index of the element to return.
       * @return The furnitureIdList at the given index.
       */
      public int getFurnitureIdList(int index) {
        return furnitureIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 furniture_id_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The furnitureIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFurnitureIdList(
          int index, int value) {

        ensureFurnitureIdListIsMutable();
        furnitureIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furniture_id_list = 1;</code>
       * @param value The furnitureIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFurnitureIdList(int value) {

        ensureFurnitureIdListIsMutable();
        furnitureIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furniture_id_list = 1;</code>
       * @param values The furnitureIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFurnitureIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFurnitureIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, furnitureIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furniture_id_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFurnitureIdList() {
        furnitureIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:UnlockedFurnitureFormulaDataNotify)
    }

    // @@protoc_insertion_point(class_scope:UnlockedFurnitureFormulaDataNotify)
    private static final emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify();
    }

    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnlockedFurnitureFormulaDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<UnlockedFurnitureFormulaDataNotify>() {
      @java.lang.Override
      public UnlockedFurnitureFormulaDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<UnlockedFurnitureFormulaDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnlockedFurnitureFormulaDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(UnlockedFurnitureFormulaDataNotify.pro" +
      "to\"O\n\"UnlockedFurnitureFormulaDataNotify" +
      "\022\031\n\021furniture_id_list\030\001 \003(\r\022\016\n\006is_all\030\r " +
      "\001(\010B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnlockedFurnitureFormulaDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnlockedFurnitureFormulaDataNotify_descriptor,
        new java.lang.String[] { "FurnitureIdList", "IsAll", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
