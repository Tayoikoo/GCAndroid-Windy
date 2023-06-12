// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SyncTeamEntityNotify.proto

package emu.grasscutter.net.proto;

public final class SyncTeamEntityNotifyOuterClass {
  private SyncTeamEntityNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SyncTeamEntityNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SyncTeamEntityNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo> 
        getTeamEntityInfoListList();
    /**
     * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
     */
    emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo getTeamEntityInfoList(int index);
    /**
     * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
     */
    int getTeamEntityInfoListCount();
    /**
     * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder> 
        getTeamEntityInfoListOrBuilderList();
    /**
     * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
     */
    emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder getTeamEntityInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 scene_id = 5;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * CmdId: 326
   * Name: GDCDGDCNMLB
   * </pre>
   *
   * Protobuf type {@code SyncTeamEntityNotify}
   */
  public static final class SyncTeamEntityNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SyncTeamEntityNotify)
      SyncTeamEntityNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SyncTeamEntityNotify.newBuilder() to construct.
    private SyncTeamEntityNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SyncTeamEntityNotify() {
      teamEntityInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SyncTeamEntityNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.internal_static_SyncTeamEntityNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.internal_static_SyncTeamEntityNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify.class, emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify.Builder.class);
    }

    public static final int TEAM_ENTITY_INFO_LIST_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo> teamEntityInfoList_;
    /**
     * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo> getTeamEntityInfoListList() {
      return teamEntityInfoList_;
    }
    /**
     * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder> 
        getTeamEntityInfoListOrBuilderList() {
      return teamEntityInfoList_;
    }
    /**
     * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
     */
    @java.lang.Override
    public int getTeamEntityInfoListCount() {
      return teamEntityInfoList_.size();
    }
    /**
     * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo getTeamEntityInfoList(int index) {
      return teamEntityInfoList_.get(index);
    }
    /**
     * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder getTeamEntityInfoListOrBuilder(
        int index) {
      return teamEntityInfoList_.get(index);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 5;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 5;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      for (int i = 0; i < teamEntityInfoList_.size(); i++) {
        output.writeMessage(2, teamEntityInfoList_.get(i));
      }
      if (sceneId_ != 0) {
        output.writeUInt32(5, sceneId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < teamEntityInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, teamEntityInfoList_.get(i));
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify other = (emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify) obj;

      if (!getTeamEntityInfoListList()
          .equals(other.getTeamEntityInfoListList())) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      if (getTeamEntityInfoListCount() > 0) {
        hash = (37 * hash) + TEAM_ENTITY_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTeamEntityInfoListList().hashCode();
      }
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify prototype) {
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
     * CmdId: 326
     * Name: GDCDGDCNMLB
     * </pre>
     *
     * Protobuf type {@code SyncTeamEntityNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SyncTeamEntityNotify)
        emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.internal_static_SyncTeamEntityNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.internal_static_SyncTeamEntityNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify.class, emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify.newBuilder()
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
        if (teamEntityInfoListBuilder_ == null) {
          teamEntityInfoList_ = java.util.Collections.emptyList();
        } else {
          teamEntityInfoList_ = null;
          teamEntityInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        sceneId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.internal_static_SyncTeamEntityNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify build() {
        emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify buildPartial() {
        emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify result = new emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify result) {
        if (teamEntityInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            teamEntityInfoList_ = java.util.Collections.unmodifiableList(teamEntityInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.teamEntityInfoList_ = teamEntityInfoList_;
        } else {
          result.teamEntityInfoList_ = teamEntityInfoListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.sceneId_ = sceneId_;
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
        if (other instanceof emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify other) {
        if (other == emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify.getDefaultInstance()) return this;
        if (teamEntityInfoListBuilder_ == null) {
          if (!other.teamEntityInfoList_.isEmpty()) {
            if (teamEntityInfoList_.isEmpty()) {
              teamEntityInfoList_ = other.teamEntityInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTeamEntityInfoListIsMutable();
              teamEntityInfoList_.addAll(other.teamEntityInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.teamEntityInfoList_.isEmpty()) {
            if (teamEntityInfoListBuilder_.isEmpty()) {
              teamEntityInfoListBuilder_.dispose();
              teamEntityInfoListBuilder_ = null;
              teamEntityInfoList_ = other.teamEntityInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              teamEntityInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTeamEntityInfoListFieldBuilder() : null;
            } else {
              teamEntityInfoListBuilder_.addAllMessages(other.teamEntityInfoList_);
            }
          }
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
              case 18: {
                emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.parser(),
                        extensionRegistry);
                if (teamEntityInfoListBuilder_ == null) {
                  ensureTeamEntityInfoListIsMutable();
                  teamEntityInfoList_.add(m);
                } else {
                  teamEntityInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 18
              case 40: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
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

      private java.util.List<emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo> teamEntityInfoList_ =
        java.util.Collections.emptyList();
      private void ensureTeamEntityInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          teamEntityInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo>(teamEntityInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo, emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder, emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder> teamEntityInfoListBuilder_;

      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo> getTeamEntityInfoListList() {
        if (teamEntityInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(teamEntityInfoList_);
        } else {
          return teamEntityInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public int getTeamEntityInfoListCount() {
        if (teamEntityInfoListBuilder_ == null) {
          return teamEntityInfoList_.size();
        } else {
          return teamEntityInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo getTeamEntityInfoList(int index) {
        if (teamEntityInfoListBuilder_ == null) {
          return teamEntityInfoList_.get(index);
        } else {
          return teamEntityInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public Builder setTeamEntityInfoList(
          int index, emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo value) {
        if (teamEntityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamEntityInfoListIsMutable();
          teamEntityInfoList_.set(index, value);
          onChanged();
        } else {
          teamEntityInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public Builder setTeamEntityInfoList(
          int index, emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder builderForValue) {
        if (teamEntityInfoListBuilder_ == null) {
          ensureTeamEntityInfoListIsMutable();
          teamEntityInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          teamEntityInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public Builder addTeamEntityInfoList(emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo value) {
        if (teamEntityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamEntityInfoListIsMutable();
          teamEntityInfoList_.add(value);
          onChanged();
        } else {
          teamEntityInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public Builder addTeamEntityInfoList(
          int index, emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo value) {
        if (teamEntityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamEntityInfoListIsMutable();
          teamEntityInfoList_.add(index, value);
          onChanged();
        } else {
          teamEntityInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public Builder addTeamEntityInfoList(
          emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder builderForValue) {
        if (teamEntityInfoListBuilder_ == null) {
          ensureTeamEntityInfoListIsMutable();
          teamEntityInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          teamEntityInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public Builder addTeamEntityInfoList(
          int index, emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder builderForValue) {
        if (teamEntityInfoListBuilder_ == null) {
          ensureTeamEntityInfoListIsMutable();
          teamEntityInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          teamEntityInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public Builder addAllTeamEntityInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo> values) {
        if (teamEntityInfoListBuilder_ == null) {
          ensureTeamEntityInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, teamEntityInfoList_);
          onChanged();
        } else {
          teamEntityInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public Builder clearTeamEntityInfoList() {
        if (teamEntityInfoListBuilder_ == null) {
          teamEntityInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          teamEntityInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public Builder removeTeamEntityInfoList(int index) {
        if (teamEntityInfoListBuilder_ == null) {
          ensureTeamEntityInfoListIsMutable();
          teamEntityInfoList_.remove(index);
          onChanged();
        } else {
          teamEntityInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder getTeamEntityInfoListBuilder(
          int index) {
        return getTeamEntityInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder getTeamEntityInfoListOrBuilder(
          int index) {
        if (teamEntityInfoListBuilder_ == null) {
          return teamEntityInfoList_.get(index);  } else {
          return teamEntityInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder> 
           getTeamEntityInfoListOrBuilderList() {
        if (teamEntityInfoListBuilder_ != null) {
          return teamEntityInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(teamEntityInfoList_);
        }
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder addTeamEntityInfoListBuilder() {
        return getTeamEntityInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder addTeamEntityInfoListBuilder(
          int index) {
        return getTeamEntityInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .TeamEntityInfo team_entity_info_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder> 
           getTeamEntityInfoListBuilderList() {
        return getTeamEntityInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo, emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder, emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder> 
          getTeamEntityInfoListFieldBuilder() {
        if (teamEntityInfoListBuilder_ == null) {
          teamEntityInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo, emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfo.Builder, emu.grasscutter.net.proto.TeamEntityInfoOuterClass.TeamEntityInfoOrBuilder>(
                  teamEntityInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          teamEntityInfoList_ = null;
        }
        return teamEntityInfoListBuilder_;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 5;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 5;</code>
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
       * <code>uint32 scene_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SyncTeamEntityNotify)
    }

    // @@protoc_insertion_point(class_scope:SyncTeamEntityNotify)
    private static final emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify();
    }

    public static emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SyncTeamEntityNotify>
        PARSER = new com.google.protobuf.AbstractParser<SyncTeamEntityNotify>() {
      @java.lang.Override
      public SyncTeamEntityNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SyncTeamEntityNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SyncTeamEntityNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SyncTeamEntityNotifyOuterClass.SyncTeamEntityNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SyncTeamEntityNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SyncTeamEntityNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SyncTeamEntityNotify.proto\032\024TeamEntity" +
      "Info.proto\"X\n\024SyncTeamEntityNotify\022.\n\025te" +
      "am_entity_info_list\030\002 \003(\0132\017.TeamEntityIn" +
      "fo\022\020\n\010scene_id\030\005 \001(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TeamEntityInfoOuterClass.getDescriptor(),
        });
    internal_static_SyncTeamEntityNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SyncTeamEntityNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SyncTeamEntityNotify_descriptor,
        new java.lang.String[] { "TeamEntityInfoList", "SceneId", });
    emu.grasscutter.net.proto.TeamEntityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
