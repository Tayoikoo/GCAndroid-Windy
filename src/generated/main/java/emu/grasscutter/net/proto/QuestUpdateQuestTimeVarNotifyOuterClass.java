// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestUpdateQuestTimeVarNotify.proto

package emu.grasscutter.net.proto;

public final class QuestUpdateQuestTimeVarNotifyOuterClass {
  private QuestUpdateQuestTimeVarNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestUpdateQuestTimeVarNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestUpdateQuestTimeVarNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 parent_quest_id = 8;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
     */
    int getTimeVarMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
     */
    boolean containsTimeVarMap(
        int key);
    /**
     * Use {@link #getTimeVarMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getTimeVarMap();
    /**
     * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getTimeVarMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
     */
    int getTimeVarMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
     */
    int getTimeVarMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 473
   * Name: NAONNMAPDMD
   * </pre>
   *
   * Protobuf type {@code QuestUpdateQuestTimeVarNotify}
   */
  public static final class QuestUpdateQuestTimeVarNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestUpdateQuestTimeVarNotify)
      QuestUpdateQuestTimeVarNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestUpdateQuestTimeVarNotify.newBuilder() to construct.
    private QuestUpdateQuestTimeVarNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestUpdateQuestTimeVarNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestUpdateQuestTimeVarNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.internal_static_QuestUpdateQuestTimeVarNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetTimeVarMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.internal_static_QuestUpdateQuestTimeVarNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify.class, emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify.Builder.class);
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 8;
    private int parentQuestId_ = 0;
    /**
     * <code>uint32 parent_quest_id = 8;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int TIME_VAR_MAP_FIELD_NUMBER = 2;
    private static final class TimeVarMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.internal_static_QuestUpdateQuestTimeVarNotify_TimeVarMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> timeVarMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetTimeVarMap() {
      if (timeVarMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TimeVarMapDefaultEntryHolder.defaultEntry);
      }
      return timeVarMap_;
    }
    public int getTimeVarMapCount() {
      return internalGetTimeVarMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
     */
    @java.lang.Override
    public boolean containsTimeVarMap(
        int key) {

      return internalGetTimeVarMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getTimeVarMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getTimeVarMap() {
      return getTimeVarMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getTimeVarMapMap() {
      return internalGetTimeVarMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
     */
    @java.lang.Override
    public int getTimeVarMapOrDefault(
        int key,
        int defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetTimeVarMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
     */
    @java.lang.Override
    public int getTimeVarMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetTimeVarMap().getMap();
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetTimeVarMap(),
          TimeVarMapDefaultEntryHolder.defaultEntry,
          2);
      if (parentQuestId_ != 0) {
        output.writeUInt32(8, parentQuestId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetTimeVarMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        timeVarMap__ = TimeVarMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, timeVarMap__);
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, parentQuestId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify other = (emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify) obj;

      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (!internalGetTimeVarMap().equals(
          other.internalGetTimeVarMap())) return false;
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
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      if (!internalGetTimeVarMap().getMap().isEmpty()) {
        hash = (37 * hash) + TIME_VAR_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetTimeVarMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify prototype) {
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
     * CmdId: 473
     * Name: NAONNMAPDMD
     * </pre>
     *
     * Protobuf type {@code QuestUpdateQuestTimeVarNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestUpdateQuestTimeVarNotify)
        emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.internal_static_QuestUpdateQuestTimeVarNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetTimeVarMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetMutableTimeVarMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.internal_static_QuestUpdateQuestTimeVarNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify.class, emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify.newBuilder()
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
        parentQuestId_ = 0;
        internalGetMutableTimeVarMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.internal_static_QuestUpdateQuestTimeVarNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify build() {
        emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify buildPartial() {
        emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify result = new emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.parentQuestId_ = parentQuestId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.timeVarMap_ = internalGetTimeVarMap();
          result.timeVarMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify) {
          return mergeFrom((emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify other) {
        if (other == emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify.getDefaultInstance()) return this;
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        internalGetMutableTimeVarMap().mergeFrom(
            other.internalGetTimeVarMap());
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
              case 18: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                timeVarMap__ = input.readMessage(
                    TimeVarMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableTimeVarMap().getMutableMap().put(
                    timeVarMap__.getKey(), timeVarMap__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 64: {
                parentQuestId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
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

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 8;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 8;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {

        parentQuestId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> timeVarMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetTimeVarMap() {
        if (timeVarMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              TimeVarMapDefaultEntryHolder.defaultEntry);
        }
        return timeVarMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetMutableTimeVarMap() {
        if (timeVarMap_ == null) {
          timeVarMap_ = com.google.protobuf.MapField.newMapField(
              TimeVarMapDefaultEntryHolder.defaultEntry);
        }
        if (!timeVarMap_.isMutable()) {
          timeVarMap_ = timeVarMap_.copy();
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return timeVarMap_;
      }
      public int getTimeVarMapCount() {
        return internalGetTimeVarMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
       */
      @java.lang.Override
      public boolean containsTimeVarMap(
          int key) {

        return internalGetTimeVarMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getTimeVarMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getTimeVarMap() {
        return getTimeVarMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, java.lang.Integer> getTimeVarMapMap() {
        return internalGetTimeVarMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
       */
      @java.lang.Override
      public int getTimeVarMapOrDefault(
          int key,
          int defaultValue) {

        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetTimeVarMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
       */
      @java.lang.Override
      public int getTimeVarMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetTimeVarMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearTimeVarMap() {
        bitField0_ = (bitField0_ & ~0x00000002);
        internalGetMutableTimeVarMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
       */
      public Builder removeTimeVarMap(
          int key) {

        internalGetMutableTimeVarMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
          getMutableTimeVarMap() {
        bitField0_ |= 0x00000002;
        return internalGetMutableTimeVarMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
       */
      public Builder putTimeVarMap(
          int key,
          int value) {


        internalGetMutableTimeVarMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; time_var_map = 2;</code>
       */
      public Builder putAllTimeVarMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableTimeVarMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:QuestUpdateQuestTimeVarNotify)
    }

    // @@protoc_insertion_point(class_scope:QuestUpdateQuestTimeVarNotify)
    private static final emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify();
    }

    public static emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestUpdateQuestTimeVarNotify>
        PARSER = new com.google.protobuf.AbstractParser<QuestUpdateQuestTimeVarNotify>() {
      @java.lang.Override
      public QuestUpdateQuestTimeVarNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestUpdateQuestTimeVarNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestUpdateQuestTimeVarNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestUpdateQuestTimeVarNotifyOuterClass.QuestUpdateQuestTimeVarNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestUpdateQuestTimeVarNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestUpdateQuestTimeVarNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestUpdateQuestTimeVarNotify_TimeVarMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestUpdateQuestTimeVarNotify_TimeVarMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#QuestUpdateQuestTimeVarNotify.proto\"\261\001" +
      "\n\035QuestUpdateQuestTimeVarNotify\022\027\n\017paren" +
      "t_quest_id\030\010 \001(\r\022D\n\014time_var_map\030\002 \003(\0132." +
      ".QuestUpdateQuestTimeVarNotify.TimeVarMa" +
      "pEntry\0321\n\017TimeVarMapEntry\022\013\n\003key\030\001 \001(\r\022\r" +
      "\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestUpdateQuestTimeVarNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestUpdateQuestTimeVarNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestUpdateQuestTimeVarNotify_descriptor,
        new java.lang.String[] { "ParentQuestId", "TimeVarMap", });
    internal_static_QuestUpdateQuestTimeVarNotify_TimeVarMapEntry_descriptor =
      internal_static_QuestUpdateQuestTimeVarNotify_descriptor.getNestedTypes().get(0);
    internal_static_QuestUpdateQuestTimeVarNotify_TimeVarMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestUpdateQuestTimeVarNotify_TimeVarMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
