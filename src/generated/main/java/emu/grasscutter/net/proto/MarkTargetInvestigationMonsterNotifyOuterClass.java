// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MarkTargetInvestigationMonsterNotify.proto

package emu.grasscutter.net.proto;

public final class MarkTargetInvestigationMonsterNotifyOuterClass {
  private MarkTargetInvestigationMonsterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MarkTargetInvestigationMonsterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MarkTargetInvestigationMonsterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 group_id = 13;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 scene_id = 15;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>uint32 investigation_monster_id = 4;</code>
     * @return The investigationMonsterId.
     */
    int getInvestigationMonsterId();

    /**
     * <code>uint32 monster_id = 8;</code>
     * @return The monsterId.
     */
    int getMonsterId();
  }
  /**
   * <pre>
   * CmdId: 1924
   * Name: OHBGMLPFMDD
   * </pre>
   *
   * Protobuf type {@code MarkTargetInvestigationMonsterNotify}
   */
  public static final class MarkTargetInvestigationMonsterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MarkTargetInvestigationMonsterNotify)
      MarkTargetInvestigationMonsterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MarkTargetInvestigationMonsterNotify.newBuilder() to construct.
    private MarkTargetInvestigationMonsterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MarkTargetInvestigationMonsterNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MarkTargetInvestigationMonsterNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.internal_static_MarkTargetInvestigationMonsterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.internal_static_MarkTargetInvestigationMonsterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify.class, emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify.Builder.class);
    }

    public static final int GROUP_ID_FIELD_NUMBER = 13;
    private int groupId_ = 0;
    /**
     * <code>uint32 group_id = 13;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 15;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 15;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int INVESTIGATION_MONSTER_ID_FIELD_NUMBER = 4;
    private int investigationMonsterId_ = 0;
    /**
     * <code>uint32 investigation_monster_id = 4;</code>
     * @return The investigationMonsterId.
     */
    @java.lang.Override
    public int getInvestigationMonsterId() {
      return investigationMonsterId_;
    }

    public static final int MONSTER_ID_FIELD_NUMBER = 8;
    private int monsterId_ = 0;
    /**
     * <code>uint32 monster_id = 8;</code>
     * @return The monsterId.
     */
    @java.lang.Override
    public int getMonsterId() {
      return monsterId_;
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
      if (investigationMonsterId_ != 0) {
        output.writeUInt32(4, investigationMonsterId_);
      }
      if (monsterId_ != 0) {
        output.writeUInt32(8, monsterId_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(13, groupId_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(15, sceneId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (investigationMonsterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, investigationMonsterId_);
      }
      if (monsterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, monsterId_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, groupId_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify other = (emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getInvestigationMonsterId()
          != other.getInvestigationMonsterId()) return false;
      if (getMonsterId()
          != other.getMonsterId()) return false;
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
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + INVESTIGATION_MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInvestigationMonsterId();
      hash = (37 * hash) + MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify prototype) {
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
     * CmdId: 1924
     * Name: OHBGMLPFMDD
     * </pre>
     *
     * Protobuf type {@code MarkTargetInvestigationMonsterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MarkTargetInvestigationMonsterNotify)
        emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.internal_static_MarkTargetInvestigationMonsterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.internal_static_MarkTargetInvestigationMonsterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify.class, emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify.newBuilder()
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
        groupId_ = 0;
        sceneId_ = 0;
        investigationMonsterId_ = 0;
        monsterId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.internal_static_MarkTargetInvestigationMonsterNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify build() {
        emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify buildPartial() {
        emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify result = new emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.groupId_ = groupId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.sceneId_ = sceneId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.investigationMonsterId_ = investigationMonsterId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.monsterId_ = monsterId_;
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
        if (other instanceof emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify other) {
        if (other == emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getInvestigationMonsterId() != 0) {
          setInvestigationMonsterId(other.getInvestigationMonsterId());
        }
        if (other.getMonsterId() != 0) {
          setMonsterId(other.getMonsterId());
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
              case 32: {
                investigationMonsterId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
              case 64: {
                monsterId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 64
              case 104: {
                groupId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
              case 120: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 13;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 13;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {

        groupId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 15;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 15;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {

        sceneId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int investigationMonsterId_ ;
      /**
       * <code>uint32 investigation_monster_id = 4;</code>
       * @return The investigationMonsterId.
       */
      @java.lang.Override
      public int getInvestigationMonsterId() {
        return investigationMonsterId_;
      }
      /**
       * <code>uint32 investigation_monster_id = 4;</code>
       * @param value The investigationMonsterId to set.
       * @return This builder for chaining.
       */
      public Builder setInvestigationMonsterId(int value) {

        investigationMonsterId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 investigation_monster_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearInvestigationMonsterId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        investigationMonsterId_ = 0;
        onChanged();
        return this;
      }

      private int monsterId_ ;
      /**
       * <code>uint32 monster_id = 8;</code>
       * @return The monsterId.
       */
      @java.lang.Override
      public int getMonsterId() {
        return monsterId_;
      }
      /**
       * <code>uint32 monster_id = 8;</code>
       * @param value The monsterId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterId(int value) {

        monsterId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        monsterId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MarkTargetInvestigationMonsterNotify)
    }

    // @@protoc_insertion_point(class_scope:MarkTargetInvestigationMonsterNotify)
    private static final emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify();
    }

    public static emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MarkTargetInvestigationMonsterNotify>
        PARSER = new com.google.protobuf.AbstractParser<MarkTargetInvestigationMonsterNotify>() {
      @java.lang.Override
      public MarkTargetInvestigationMonsterNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<MarkTargetInvestigationMonsterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MarkTargetInvestigationMonsterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MarkTargetInvestigationMonsterNotifyOuterClass.MarkTargetInvestigationMonsterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MarkTargetInvestigationMonsterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MarkTargetInvestigationMonsterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*MarkTargetInvestigationMonsterNotify.p" +
      "roto\"\200\001\n$MarkTargetInvestigationMonsterN" +
      "otify\022\020\n\010group_id\030\r \001(\r\022\020\n\010scene_id\030\017 \001(" +
      "\r\022 \n\030investigation_monster_id\030\004 \001(\r\022\022\n\nm" +
      "onster_id\030\010 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MarkTargetInvestigationMonsterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MarkTargetInvestigationMonsterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MarkTargetInvestigationMonsterNotify_descriptor,
        new java.lang.String[] { "GroupId", "SceneId", "InvestigationMonsterId", "MonsterId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
