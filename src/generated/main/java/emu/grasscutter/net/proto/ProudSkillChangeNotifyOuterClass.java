// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProudSkillChangeNotify.proto

package emu.grasscutter.net.proto;

public final class ProudSkillChangeNotifyOuterClass {
  private ProudSkillChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ProudSkillChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ProudSkillChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 14;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint64 avatar_guid = 10;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 skill_depot_id = 15;</code>
     * @return The skillDepotId.
     */
    int getSkillDepotId();

    /**
     * <code>repeated uint32 proud_skill_list = 6;</code>
     * @return A list containing the proudSkillList.
     */
    java.util.List<java.lang.Integer> getProudSkillListList();
    /**
     * <code>repeated uint32 proud_skill_list = 6;</code>
     * @return The count of proudSkillList.
     */
    int getProudSkillListCount();
    /**
     * <code>repeated uint32 proud_skill_list = 6;</code>
     * @param index The index of the element to return.
     * @return The proudSkillList at the given index.
     */
    int getProudSkillList(int index);
  }
  /**
   * <pre>
   * CmdId: 1059
   * Name: KNHEBFKCDHB
   * </pre>
   *
   * Protobuf type {@code ProudSkillChangeNotify}
   */
  public static final class ProudSkillChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ProudSkillChangeNotify)
      ProudSkillChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ProudSkillChangeNotify.newBuilder() to construct.
    private ProudSkillChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ProudSkillChangeNotify() {
      proudSkillList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ProudSkillChangeNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.internal_static_ProudSkillChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.internal_static_ProudSkillChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify.class, emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 14;
    private int entityId_ = 0;
    /**
     * <code>uint32 entity_id = 14;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 10;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatar_guid = 10;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int SKILL_DEPOT_ID_FIELD_NUMBER = 15;
    private int skillDepotId_ = 0;
    /**
     * <code>uint32 skill_depot_id = 15;</code>
     * @return The skillDepotId.
     */
    @java.lang.Override
    public int getSkillDepotId() {
      return skillDepotId_;
    }

    public static final int PROUD_SKILL_LIST_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList proudSkillList_;
    /**
     * <code>repeated uint32 proud_skill_list = 6;</code>
     * @return A list containing the proudSkillList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getProudSkillListList() {
      return proudSkillList_;
    }
    /**
     * <code>repeated uint32 proud_skill_list = 6;</code>
     * @return The count of proudSkillList.
     */
    public int getProudSkillListCount() {
      return proudSkillList_.size();
    }
    /**
     * <code>repeated uint32 proud_skill_list = 6;</code>
     * @param index The index of the element to return.
     * @return The proudSkillList at the given index.
     */
    public int getProudSkillList(int index) {
      return proudSkillList_.getInt(index);
    }
    private int proudSkillListMemoizedSerializedSize = -1;

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
      if (getProudSkillListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(proudSkillListMemoizedSerializedSize);
      }
      for (int i = 0; i < proudSkillList_.size(); i++) {
        output.writeUInt32NoTag(proudSkillList_.getInt(i));
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(10, avatarGuid_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(14, entityId_);
      }
      if (skillDepotId_ != 0) {
        output.writeUInt32(15, skillDepotId_);
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
        for (int i = 0; i < proudSkillList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(proudSkillList_.getInt(i));
        }
        size += dataSize;
        if (!getProudSkillListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        proudSkillListMemoizedSerializedSize = dataSize;
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, avatarGuid_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, entityId_);
      }
      if (skillDepotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, skillDepotId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify other = (emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getSkillDepotId()
          != other.getSkillDepotId()) return false;
      if (!getProudSkillListList()
          .equals(other.getProudSkillListList())) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + SKILL_DEPOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillDepotId();
      if (getProudSkillListCount() > 0) {
        hash = (37 * hash) + PROUD_SKILL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getProudSkillListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify prototype) {
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
     * CmdId: 1059
     * Name: KNHEBFKCDHB
     * </pre>
     *
     * Protobuf type {@code ProudSkillChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ProudSkillChangeNotify)
        emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.internal_static_ProudSkillChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.internal_static_ProudSkillChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify.class, emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify.newBuilder()
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
        entityId_ = 0;
        avatarGuid_ = 0L;
        skillDepotId_ = 0;
        proudSkillList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.internal_static_ProudSkillChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify build() {
        emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify buildPartial() {
        emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify result = new emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify result) {
        if (((bitField0_ & 0x00000008) != 0)) {
          proudSkillList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.proudSkillList_ = proudSkillList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.avatarGuid_ = avatarGuid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.skillDepotId_ = skillDepotId_;
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
        if (other instanceof emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify other) {
        if (other == emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getSkillDepotId() != 0) {
          setSkillDepotId(other.getSkillDepotId());
        }
        if (!other.proudSkillList_.isEmpty()) {
          if (proudSkillList_.isEmpty()) {
            proudSkillList_ = other.proudSkillList_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureProudSkillListIsMutable();
            proudSkillList_.addAll(other.proudSkillList_);
          }
          onChanged();
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
              case 48: {
                int v = input.readUInt32();
                ensureProudSkillListIsMutable();
                proudSkillList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureProudSkillListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  proudSkillList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
              case 80: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 112: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
              case 120: {
                skillDepotId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 14;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 14;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {

        entityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        entityId_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 10;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 10;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {

        avatarGuid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int skillDepotId_ ;
      /**
       * <code>uint32 skill_depot_id = 15;</code>
       * @return The skillDepotId.
       */
      @java.lang.Override
      public int getSkillDepotId() {
        return skillDepotId_;
      }
      /**
       * <code>uint32 skill_depot_id = 15;</code>
       * @param value The skillDepotId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillDepotId(int value) {

        skillDepotId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_depot_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillDepotId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        skillDepotId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList proudSkillList_ = emptyIntList();
      private void ensureProudSkillListIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          proudSkillList_ = mutableCopy(proudSkillList_);
          bitField0_ |= 0x00000008;
        }
      }
      /**
       * <code>repeated uint32 proud_skill_list = 6;</code>
       * @return A list containing the proudSkillList.
       */
      public java.util.List<java.lang.Integer>
          getProudSkillListList() {
        return ((bitField0_ & 0x00000008) != 0) ?
                 java.util.Collections.unmodifiableList(proudSkillList_) : proudSkillList_;
      }
      /**
       * <code>repeated uint32 proud_skill_list = 6;</code>
       * @return The count of proudSkillList.
       */
      public int getProudSkillListCount() {
        return proudSkillList_.size();
      }
      /**
       * <code>repeated uint32 proud_skill_list = 6;</code>
       * @param index The index of the element to return.
       * @return The proudSkillList at the given index.
       */
      public int getProudSkillList(int index) {
        return proudSkillList_.getInt(index);
      }
      /**
       * <code>repeated uint32 proud_skill_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The proudSkillList to set.
       * @return This builder for chaining.
       */
      public Builder setProudSkillList(
          int index, int value) {

        ensureProudSkillListIsMutable();
        proudSkillList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 proud_skill_list = 6;</code>
       * @param value The proudSkillList to add.
       * @return This builder for chaining.
       */
      public Builder addProudSkillList(int value) {

        ensureProudSkillListIsMutable();
        proudSkillList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 proud_skill_list = 6;</code>
       * @param values The proudSkillList to add.
       * @return This builder for chaining.
       */
      public Builder addAllProudSkillList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureProudSkillListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, proudSkillList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 proud_skill_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearProudSkillList() {
        proudSkillList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000008);
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


      // @@protoc_insertion_point(builder_scope:ProudSkillChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:ProudSkillChangeNotify)
    private static final emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify();
    }

    public static emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ProudSkillChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<ProudSkillChangeNotify>() {
      @java.lang.Override
      public ProudSkillChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ProudSkillChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ProudSkillChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ProudSkillChangeNotifyOuterClass.ProudSkillChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProudSkillChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProudSkillChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ProudSkillChangeNotify.proto\"r\n\026ProudS" +
      "killChangeNotify\022\021\n\tentity_id\030\016 \001(\r\022\023\n\013a" +
      "vatar_guid\030\n \001(\004\022\026\n\016skill_depot_id\030\017 \001(\r" +
      "\022\030\n\020proud_skill_list\030\006 \003(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ProudSkillChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ProudSkillChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProudSkillChangeNotify_descriptor,
        new java.lang.String[] { "EntityId", "AvatarGuid", "SkillDepotId", "ProudSkillList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
