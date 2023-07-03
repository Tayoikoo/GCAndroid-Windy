// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarExpeditionStartRsp.proto

package emu.grasscutter.net.proto;

public final class AvatarExpeditionStartRspOuterClass {
  private AvatarExpeditionStartRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarExpeditionStartRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarExpeditionStartRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
     */
    int getExpeditionInfoMapCount();
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
     */
    boolean containsExpeditionInfoMap(
        long key);
    /**
     * Use {@link #getExpeditionInfoMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
    getExpeditionInfoMap();
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
     */
    java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
    getExpeditionInfoMapMap();
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
     */
    /* nullable */
emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(
        long key,
        /* nullable */
emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue);
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
     */
    emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(
        long key);
  }
  /**
   * <pre>
   * CmdId: 1620
   * Obf: NAIJPHNIAIE
   * </pre>
   *
   * Protobuf type {@code AvatarExpeditionStartRsp}
   */
  public static final class AvatarExpeditionStartRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarExpeditionStartRsp)
      AvatarExpeditionStartRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarExpeditionStartRsp.newBuilder() to construct.
    private AvatarExpeditionStartRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarExpeditionStartRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarExpeditionStartRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.internal_static_AvatarExpeditionStartRsp_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 15:
          return internalGetExpeditionInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.internal_static_AvatarExpeditionStartRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp.class, emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int EXPEDITION_INFO_MAP_FIELD_NUMBER = 15;
    private static final class ExpeditionInfoMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>newDefaultInstance(
                  emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.internal_static_AvatarExpeditionStartRsp_ExpeditionInfoMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT64,
                  0L,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
    private com.google.protobuf.MapField<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
    internalGetExpeditionInfoMap() {
      if (expeditionInfoMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
      }
      return expeditionInfoMap_;
    }
    public int getExpeditionInfoMapCount() {
      return internalGetExpeditionInfoMap().getMap().size();
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
     */
    @java.lang.Override
    public boolean containsExpeditionInfoMap(
        long key) {

      return internalGetExpeditionInfoMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getExpeditionInfoMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
      return getExpeditionInfoMapMap();
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
      return internalGetExpeditionInfoMap().getMap();
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(
        long key,
        /* nullable */
emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {

      java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
          internalGetExpeditionInfoMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(
        long key) {

      java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
          internalGetExpeditionInfoMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
        output.writeInt32(12, retcode_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeLongMapTo(
          output,
          internalGetExpeditionInfoMap(),
          ExpeditionInfoMapDefaultEntryHolder.defaultEntry,
          15);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      for (java.util.Map.Entry<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> entry
           : internalGetExpeditionInfoMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
        expeditionInfoMap__ = ExpeditionInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(15, expeditionInfoMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp other = (emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!internalGetExpeditionInfoMap().equals(
          other.internalGetExpeditionInfoMap())) return false;
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
      if (!internalGetExpeditionInfoMap().getMap().isEmpty()) {
        hash = (37 * hash) + EXPEDITION_INFO_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetExpeditionInfoMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp prototype) {
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
     * CmdId: 1620
     * Obf: NAIJPHNIAIE
     * </pre>
     *
     * Protobuf type {@code AvatarExpeditionStartRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarExpeditionStartRsp)
        emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.internal_static_AvatarExpeditionStartRsp_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 15:
            return internalGetExpeditionInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 15:
            return internalGetMutableExpeditionInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.internal_static_AvatarExpeditionStartRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp.class, emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp.newBuilder()
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
        internalGetMutableExpeditionInfoMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.internal_static_AvatarExpeditionStartRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp build() {
        emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp buildPartial() {
        emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp result = new emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.expeditionInfoMap_ = internalGetExpeditionInfoMap();
          result.expeditionInfoMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp other) {
        if (other == emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        internalGetMutableExpeditionInfoMap().mergeFrom(
            other.internalGetExpeditionInfoMap());
        bitField0_ |= 0x00000002;
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
              case 96: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
              case 122: {
                com.google.protobuf.MapEntry<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
                expeditionInfoMap__ = input.readMessage(
                    ExpeditionInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableExpeditionInfoMap().getMutableMap().put(
                    expeditionInfoMap__.getKey(), expeditionInfoMap__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 122
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
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
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
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
      private com.google.protobuf.MapField<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
          internalGetExpeditionInfoMap() {
        if (expeditionInfoMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
        }
        return expeditionInfoMap_;
      }
      private com.google.protobuf.MapField<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
          internalGetMutableExpeditionInfoMap() {
        if (expeditionInfoMap_ == null) {
          expeditionInfoMap_ = com.google.protobuf.MapField.newMapField(
              ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
        }
        if (!expeditionInfoMap_.isMutable()) {
          expeditionInfoMap_ = expeditionInfoMap_.copy();
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return expeditionInfoMap_;
      }
      public int getExpeditionInfoMapCount() {
        return internalGetExpeditionInfoMap().getMap().size();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
       */
      @java.lang.Override
      public boolean containsExpeditionInfoMap(
          long key) {

        return internalGetExpeditionInfoMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getExpeditionInfoMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
        return getExpeditionInfoMapMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
        return internalGetExpeditionInfoMap().getMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(
          long key,
          /* nullable */
emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {

        java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
            internalGetExpeditionInfoMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(
          long key) {

        java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map =
            internalGetExpeditionInfoMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearExpeditionInfoMap() {
        bitField0_ = (bitField0_ & ~0x00000002);
        internalGetMutableExpeditionInfoMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
       */
      public Builder removeExpeditionInfoMap(
          long key) {

        internalGetMutableExpeditionInfoMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo>
          getMutableExpeditionInfoMap() {
        bitField0_ |= 0x00000002;
        return internalGetMutableExpeditionInfoMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
       */
      public Builder putExpeditionInfoMap(
          long key,
          emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo value) {

        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableExpeditionInfoMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>map&lt;uint64, .AvatarExpeditionInfo&gt; expedition_info_map = 15;</code>
       */
      public Builder putAllExpeditionInfoMap(
          java.util.Map<java.lang.Long, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> values) {
        internalGetMutableExpeditionInfoMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:AvatarExpeditionStartRsp)
    }

    // @@protoc_insertion_point(class_scope:AvatarExpeditionStartRsp)
    private static final emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp();
    }

    public static emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarExpeditionStartRsp>
        PARSER = new com.google.protobuf.AbstractParser<AvatarExpeditionStartRsp>() {
      @java.lang.Override
      public AvatarExpeditionStartRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarExpeditionStartRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarExpeditionStartRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarExpeditionStartRspOuterClass.AvatarExpeditionStartRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarExpeditionStartRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarExpeditionStartRsp_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarExpeditionStartRsp_ExpeditionInfoMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarExpeditionStartRsp_ExpeditionInfoMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036AvatarExpeditionStartRsp.proto\032\032Avatar" +
      "ExpeditionInfo.proto\"\313\001\n\030AvatarExpeditio" +
      "nStartRsp\022\017\n\007retcode\030\014 \001(\005\022M\n\023expedition" +
      "_info_map\030\017 \003(\01320.AvatarExpeditionStartR" +
      "sp.ExpeditionInfoMapEntry\032O\n\026ExpeditionI" +
      "nfoMapEntry\022\013\n\003key\030\001 \001(\004\022$\n\005value\030\002 \001(\0132" +
      "\025.AvatarExpeditionInfo:\0028\001B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarExpeditionStartRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarExpeditionStartRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarExpeditionStartRsp_descriptor,
        new java.lang.String[] { "Retcode", "ExpeditionInfoMap", });
    internal_static_AvatarExpeditionStartRsp_ExpeditionInfoMapEntry_descriptor =
      internal_static_AvatarExpeditionStartRsp_descriptor.getNestedTypes().get(0);
    internal_static_AvatarExpeditionStartRsp_ExpeditionInfoMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarExpeditionStartRsp_ExpeditionInfoMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
