// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarTeamUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarTeamUpdateNotifyOuterClass {
  private AvatarTeamUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarTeamUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarTeamUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
     */
    int getAvatarTeamMapCount();
    /**
     * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
     */
    boolean containsAvatarTeamMap(
        int key);
    /**
     * Use {@link #getAvatarTeamMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam>
    getAvatarTeamMap();
    /**
     * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam>
    getAvatarTeamMapMap();
    /**
     * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
     */
    /* nullable */
emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrDefault(
        int key,
        /* nullable */
emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam defaultValue);
    /**
     * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
     */
    emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrThrow(
        int key);

    /**
     * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
     * @return A list containing the tempAvatarGuidList.
     */
    java.util.List<java.lang.Long> getTempAvatarGuidListList();
    /**
     * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
     * @return The count of tempAvatarGuidList.
     */
    int getTempAvatarGuidListCount();
    /**
     * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
     * @param index The index of the element to return.
     * @return The tempAvatarGuidList at the given index.
     */
    long getTempAvatarGuidList(int index);
  }
  /**
   * <pre>
   * CmdId: 1797
   * Name: HPAKJFDBBOJ
   * </pre>
   *
   * Protobuf type {@code AvatarTeamUpdateNotify}
   */
  public static final class AvatarTeamUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarTeamUpdateNotify)
      AvatarTeamUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarTeamUpdateNotify.newBuilder() to construct.
    private AvatarTeamUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarTeamUpdateNotify() {
      tempAvatarGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarTeamUpdateNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.internal_static_AvatarTeamUpdateNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 7:
          return internalGetAvatarTeamMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.internal_static_AvatarTeamUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify.class, emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify.Builder.class);
    }

    public static final int AVATAR_TEAM_MAP_FIELD_NUMBER = 7;
    private static final class AvatarTeamMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam>newDefaultInstance(
                  emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.internal_static_AvatarTeamUpdateNotify_AvatarTeamMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> avatarTeamMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam>
    internalGetAvatarTeamMap() {
      if (avatarTeamMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AvatarTeamMapDefaultEntryHolder.defaultEntry);
      }
      return avatarTeamMap_;
    }
    public int getAvatarTeamMapCount() {
      return internalGetAvatarTeamMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
     */
    @java.lang.Override
    public boolean containsAvatarTeamMap(
        int key) {

      return internalGetAvatarTeamMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAvatarTeamMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> getAvatarTeamMap() {
      return getAvatarTeamMapMap();
    }
    /**
     * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> getAvatarTeamMapMap() {
      return internalGetAvatarTeamMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrDefault(
        int key,
        /* nullable */
emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam defaultValue) {

      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> map =
          internalGetAvatarTeamMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> map =
          internalGetAvatarTeamMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int TEMP_AVATAR_GUID_LIST_FIELD_NUMBER = 9;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList tempAvatarGuidList_;
    /**
     * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
     * @return A list containing the tempAvatarGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getTempAvatarGuidListList() {
      return tempAvatarGuidList_;
    }
    /**
     * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
     * @return The count of tempAvatarGuidList.
     */
    public int getTempAvatarGuidListCount() {
      return tempAvatarGuidList_.size();
    }
    /**
     * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
     * @param index The index of the element to return.
     * @return The tempAvatarGuidList at the given index.
     */
    public long getTempAvatarGuidList(int index) {
      return tempAvatarGuidList_.getLong(index);
    }
    private int tempAvatarGuidListMemoizedSerializedSize = -1;

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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetAvatarTeamMap(),
          AvatarTeamMapDefaultEntryHolder.defaultEntry,
          7);
      if (getTempAvatarGuidListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(tempAvatarGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < tempAvatarGuidList_.size(); i++) {
        output.writeUInt64NoTag(tempAvatarGuidList_.getLong(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> entry
           : internalGetAvatarTeamMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam>
        avatarTeamMap__ = AvatarTeamMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(7, avatarTeamMap__);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < tempAvatarGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(tempAvatarGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getTempAvatarGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        tempAvatarGuidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify other = (emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify) obj;

      if (!internalGetAvatarTeamMap().equals(
          other.internalGetAvatarTeamMap())) return false;
      if (!getTempAvatarGuidListList()
          .equals(other.getTempAvatarGuidListList())) return false;
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
      if (!internalGetAvatarTeamMap().getMap().isEmpty()) {
        hash = (37 * hash) + AVATAR_TEAM_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAvatarTeamMap().hashCode();
      }
      if (getTempAvatarGuidListCount() > 0) {
        hash = (37 * hash) + TEMP_AVATAR_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTempAvatarGuidListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify prototype) {
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
     * CmdId: 1797
     * Name: HPAKJFDBBOJ
     * </pre>
     *
     * Protobuf type {@code AvatarTeamUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarTeamUpdateNotify)
        emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.internal_static_AvatarTeamUpdateNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 7:
            return internalGetAvatarTeamMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 7:
            return internalGetMutableAvatarTeamMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.internal_static_AvatarTeamUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify.class, emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify.newBuilder()
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
        internalGetMutableAvatarTeamMap().clear();
        tempAvatarGuidList_ = emptyLongList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.internal_static_AvatarTeamUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify build() {
        emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify result = new emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          tempAvatarGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.tempAvatarGuidList_ = tempAvatarGuidList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.avatarTeamMap_ = internalGetAvatarTeamMap();
          result.avatarTeamMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify.getDefaultInstance()) return this;
        internalGetMutableAvatarTeamMap().mergeFrom(
            other.internalGetAvatarTeamMap());
        bitField0_ |= 0x00000001;
        if (!other.tempAvatarGuidList_.isEmpty()) {
          if (tempAvatarGuidList_.isEmpty()) {
            tempAvatarGuidList_ = other.tempAvatarGuidList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTempAvatarGuidListIsMutable();
            tempAvatarGuidList_.addAll(other.tempAvatarGuidList_);
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
              case 58: {
                com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam>
                avatarTeamMap__ = input.readMessage(
                    AvatarTeamMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableAvatarTeamMap().getMutableMap().put(
                    avatarTeamMap__.getKey(), avatarTeamMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 58
              case 72: {
                long v = input.readUInt64();
                ensureTempAvatarGuidListIsMutable();
                tempAvatarGuidList_.addLong(v);
                break;
              } // case 72
              case 74: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureTempAvatarGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  tempAvatarGuidList_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 74
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

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> avatarTeamMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam>
          internalGetAvatarTeamMap() {
        if (avatarTeamMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AvatarTeamMapDefaultEntryHolder.defaultEntry);
        }
        return avatarTeamMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam>
          internalGetMutableAvatarTeamMap() {
        if (avatarTeamMap_ == null) {
          avatarTeamMap_ = com.google.protobuf.MapField.newMapField(
              AvatarTeamMapDefaultEntryHolder.defaultEntry);
        }
        if (!avatarTeamMap_.isMutable()) {
          avatarTeamMap_ = avatarTeamMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return avatarTeamMap_;
      }
      public int getAvatarTeamMapCount() {
        return internalGetAvatarTeamMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
       */
      @java.lang.Override
      public boolean containsAvatarTeamMap(
          int key) {

        return internalGetAvatarTeamMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAvatarTeamMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> getAvatarTeamMap() {
        return getAvatarTeamMapMap();
      }
      /**
       * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> getAvatarTeamMapMap() {
        return internalGetAvatarTeamMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrDefault(
          int key,
          /* nullable */
emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam defaultValue) {

        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> map =
            internalGetAvatarTeamMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam getAvatarTeamMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> map =
            internalGetAvatarTeamMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearAvatarTeamMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableAvatarTeamMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
       */
      public Builder removeAvatarTeamMap(
          int key) {

        internalGetMutableAvatarTeamMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam>
          getMutableAvatarTeamMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutableAvatarTeamMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
       */
      public Builder putAvatarTeamMap(
          int key,
          emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam value) {

        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableAvatarTeamMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, .AvatarTeam&gt; avatar_team_map = 7;</code>
       */
      public Builder putAllAvatarTeamMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam> values) {
        internalGetMutableAvatarTeamMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
        return this;
      }

      private com.google.protobuf.Internal.LongList tempAvatarGuidList_ = emptyLongList();
      private void ensureTempAvatarGuidListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          tempAvatarGuidList_ = mutableCopy(tempAvatarGuidList_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
       * @return A list containing the tempAvatarGuidList.
       */
      public java.util.List<java.lang.Long>
          getTempAvatarGuidListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(tempAvatarGuidList_) : tempAvatarGuidList_;
      }
      /**
       * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
       * @return The count of tempAvatarGuidList.
       */
      public int getTempAvatarGuidListCount() {
        return tempAvatarGuidList_.size();
      }
      /**
       * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
       * @param index The index of the element to return.
       * @return The tempAvatarGuidList at the given index.
       */
      public long getTempAvatarGuidList(int index) {
        return tempAvatarGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The tempAvatarGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setTempAvatarGuidList(
          int index, long value) {

        ensureTempAvatarGuidListIsMutable();
        tempAvatarGuidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
       * @param value The tempAvatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addTempAvatarGuidList(long value) {

        ensureTempAvatarGuidListIsMutable();
        tempAvatarGuidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
       * @param values The tempAvatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTempAvatarGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureTempAvatarGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tempAvatarGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 temp_avatar_guid_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTempAvatarGuidList() {
        tempAvatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:AvatarTeamUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarTeamUpdateNotify)
    private static final emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify();
    }

    public static emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarTeamUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarTeamUpdateNotify>() {
      @java.lang.Override
      public AvatarTeamUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarTeamUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarTeamUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarTeamUpdateNotifyOuterClass.AvatarTeamUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarTeamUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarTeamUpdateNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarTeamUpdateNotify_AvatarTeamMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarTeamUpdateNotify_AvatarTeamMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034AvatarTeamUpdateNotify.proto\032\020AvatarTe" +
      "am.proto\"\277\001\n\026AvatarTeamUpdateNotify\022C\n\017a" +
      "vatar_team_map\030\007 \003(\0132*.AvatarTeamUpdateN" +
      "otify.AvatarTeamMapEntry\022\035\n\025temp_avatar_" +
      "guid_list\030\t \003(\004\032A\n\022AvatarTeamMapEntry\022\013\n" +
      "\003key\030\001 \001(\r\022\032\n\005value\030\002 \001(\0132\013.AvatarTeam:\002" +
      "8\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarTeamOuterClass.getDescriptor(),
        });
    internal_static_AvatarTeamUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarTeamUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarTeamUpdateNotify_descriptor,
        new java.lang.String[] { "AvatarTeamMap", "TempAvatarGuidList", });
    internal_static_AvatarTeamUpdateNotify_AvatarTeamMapEntry_descriptor =
      internal_static_AvatarTeamUpdateNotify_descriptor.getNestedTypes().get(0);
    internal_static_AvatarTeamUpdateNotify_AvatarTeamMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarTeamUpdateNotify_AvatarTeamMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.AvatarTeamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
