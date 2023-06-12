// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlatformStopRouteNotify.proto

package emu.grasscutter.net.proto;

public final class PlatformStopRouteNotifyOuterClass {
  private PlatformStopRouteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlatformStopRouteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlatformStopRouteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_time = 6;</code>
     * @return The sceneTime.
     */
    int getSceneTime();

    /**
     * <code>uint32 entity_id = 5;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.PlatformInfo platform = 14;</code>
     * @return Whether the platform field is set.
     */
    boolean hasPlatform();
    /**
     * <code>.PlatformInfo platform = 14;</code>
     * @return The platform.
     */
    emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo getPlatform();
    /**
     * <code>.PlatformInfo platform = 14;</code>
     */
    emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 232
   * Name: COHGDKEIGAM
   * </pre>
   *
   * Protobuf type {@code PlatformStopRouteNotify}
   */
  public static final class PlatformStopRouteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlatformStopRouteNotify)
      PlatformStopRouteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlatformStopRouteNotify.newBuilder() to construct.
    private PlatformStopRouteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlatformStopRouteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlatformStopRouteNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.internal_static_PlatformStopRouteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.internal_static_PlatformStopRouteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify.class, emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify.Builder.class);
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 6;
    private int sceneTime_ = 0;
    /**
     * <code>uint32 scene_time = 6;</code>
     * @return The sceneTime.
     */
    @java.lang.Override
    public int getSceneTime() {
      return sceneTime_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 5;
    private int entityId_ = 0;
    /**
     * <code>uint32 entity_id = 5;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int PLATFORM_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo platform_;
    /**
     * <code>.PlatformInfo platform = 14;</code>
     * @return Whether the platform field is set.
     */
    @java.lang.Override
    public boolean hasPlatform() {
      return platform_ != null;
    }
    /**
     * <code>.PlatformInfo platform = 14;</code>
     * @return The platform.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo getPlatform() {
      return platform_ == null ? emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : platform_;
    }
    /**
     * <code>.PlatformInfo platform = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder() {
      return platform_ == null ? emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : platform_;
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
      if (entityId_ != 0) {
        output.writeUInt32(5, entityId_);
      }
      if (sceneTime_ != 0) {
        output.writeUInt32(6, sceneTime_);
      }
      if (platform_ != null) {
        output.writeMessage(14, getPlatform());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, entityId_);
      }
      if (sceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, sceneTime_);
      }
      if (platform_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getPlatform());
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify other = (emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify) obj;

      if (getSceneTime()
          != other.getSceneTime()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasPlatform() != other.hasPlatform()) return false;
      if (hasPlatform()) {
        if (!getPlatform()
            .equals(other.getPlatform())) return false;
      }
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
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSceneTime();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasPlatform()) {
        hash = (37 * hash) + PLATFORM_FIELD_NUMBER;
        hash = (53 * hash) + getPlatform().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify prototype) {
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
     * CmdId: 232
     * Name: COHGDKEIGAM
     * </pre>
     *
     * Protobuf type {@code PlatformStopRouteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlatformStopRouteNotify)
        emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.internal_static_PlatformStopRouteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.internal_static_PlatformStopRouteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify.class, emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify.newBuilder()
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
        sceneTime_ = 0;
        entityId_ = 0;
        platform_ = null;
        if (platformBuilder_ != null) {
          platformBuilder_.dispose();
          platformBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.internal_static_PlatformStopRouteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify build() {
        emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify buildPartial() {
        emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify result = new emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.sceneTime_ = sceneTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.platform_ = platformBuilder_ == null
              ? platform_
              : platformBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify other) {
        if (other == emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify.getDefaultInstance()) return this;
        if (other.getSceneTime() != 0) {
          setSceneTime(other.getSceneTime());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasPlatform()) {
          mergePlatform(other.getPlatform());
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
              case 40: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 48: {
                sceneTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 114: {
                input.readMessage(
                    getPlatformFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
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

      private int sceneTime_ ;
      /**
       * <code>uint32 scene_time = 6;</code>
       * @return The sceneTime.
       */
      @java.lang.Override
      public int getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint32 scene_time = 6;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(int value) {

        sceneTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sceneTime_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 5;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 5;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {

        entityId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo platform_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo, emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo.Builder, emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfoOrBuilder> platformBuilder_;
      /**
       * <code>.PlatformInfo platform = 14;</code>
       * @return Whether the platform field is set.
       */
      public boolean hasPlatform() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.PlatformInfo platform = 14;</code>
       * @return The platform.
       */
      public emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo getPlatform() {
        if (platformBuilder_ == null) {
          return platform_ == null ? emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : platform_;
        } else {
          return platformBuilder_.getMessage();
        }
      }
      /**
       * <code>.PlatformInfo platform = 14;</code>
       */
      public Builder setPlatform(emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo value) {
        if (platformBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          platform_ = value;
        } else {
          platformBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.PlatformInfo platform = 14;</code>
       */
      public Builder setPlatform(
          emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo.Builder builderForValue) {
        if (platformBuilder_ == null) {
          platform_ = builderForValue.build();
        } else {
          platformBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.PlatformInfo platform = 14;</code>
       */
      public Builder mergePlatform(emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo value) {
        if (platformBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            platform_ != null &&
            platform_ != emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo.getDefaultInstance()) {
            getPlatformBuilder().mergeFrom(value);
          } else {
            platform_ = value;
          }
        } else {
          platformBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.PlatformInfo platform = 14;</code>
       */
      public Builder clearPlatform() {
        bitField0_ = (bitField0_ & ~0x00000004);
        platform_ = null;
        if (platformBuilder_ != null) {
          platformBuilder_.dispose();
          platformBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.PlatformInfo platform = 14;</code>
       */
      public emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo.Builder getPlatformBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getPlatformFieldBuilder().getBuilder();
      }
      /**
       * <code>.PlatformInfo platform = 14;</code>
       */
      public emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder() {
        if (platformBuilder_ != null) {
          return platformBuilder_.getMessageOrBuilder();
        } else {
          return platform_ == null ?
              emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : platform_;
        }
      }
      /**
       * <code>.PlatformInfo platform = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo, emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo.Builder, emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfoOrBuilder> 
          getPlatformFieldBuilder() {
        if (platformBuilder_ == null) {
          platformBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo, emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfo.Builder, emu.grasscutter.net.proto.PlatformInfoOuterClass.PlatformInfoOrBuilder>(
                  getPlatform(),
                  getParentForChildren(),
                  isClean());
          platform_ = null;
        }
        return platformBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlatformStopRouteNotify)
    }

    // @@protoc_insertion_point(class_scope:PlatformStopRouteNotify)
    private static final emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify();
    }

    public static emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlatformStopRouteNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlatformStopRouteNotify>() {
      @java.lang.Override
      public PlatformStopRouteNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlatformStopRouteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlatformStopRouteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlatformStopRouteNotifyOuterClass.PlatformStopRouteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlatformStopRouteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlatformStopRouteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035PlatformStopRouteNotify.proto\032\022Platfor" +
      "mInfo.proto\"a\n\027PlatformStopRouteNotify\022\022" +
      "\n\nscene_time\030\006 \001(\r\022\021\n\tentity_id\030\005 \001(\r\022\037\n" +
      "\010platform\030\016 \001(\0132\r.PlatformInfoB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlatformInfoOuterClass.getDescriptor(),
        });
    internal_static_PlatformStopRouteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlatformStopRouteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlatformStopRouteNotify_descriptor,
        new java.lang.String[] { "SceneTime", "EntityId", "Platform", });
    emu.grasscutter.net.proto.PlatformInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
