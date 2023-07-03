// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MPLevelEntityInfo.proto

package emu.grasscutter.net.proto;

public final class MPLevelEntityInfoOuterClass {
  private MPLevelEntityInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MPLevelEntityInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MPLevelEntityInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AbilitySyncStateInfo ability_info = 11;</code>
     * @return Whether the abilityInfo field is set.
     */
    boolean hasAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo ability_info = 11;</code>
     * @return The abilityInfo.
     */
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo();
    /**
     * <code>.AbilitySyncStateInfo ability_info = 11;</code>
     */
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder();

    /**
     * <code>uint32 entity_id = 14;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 authority_peer_id = 8;</code>
     * @return The authorityPeerId.
     */
    int getAuthorityPeerId();
  }
  /**
   * <pre>
   * Obf: DBEDDNAPIOA
   * </pre>
   *
   * Protobuf type {@code MPLevelEntityInfo}
   */
  public static final class MPLevelEntityInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MPLevelEntityInfo)
      MPLevelEntityInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MPLevelEntityInfo.newBuilder() to construct.
    private MPLevelEntityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MPLevelEntityInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MPLevelEntityInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.class, emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.Builder.class);
    }

    public static final int ABILITY_INFO_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
    /**
     * <code>.AbilitySyncStateInfo ability_info = 11;</code>
     * @return Whether the abilityInfo field is set.
     */
    @java.lang.Override
    public boolean hasAbilityInfo() {
      return abilityInfo_ != null;
    }
    /**
     * <code>.AbilitySyncStateInfo ability_info = 11;</code>
     * @return The abilityInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
      return abilityInfo_ == null ? emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
    }
    /**
     * <code>.AbilitySyncStateInfo ability_info = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
      return abilityInfo_ == null ? emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
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

    public static final int AUTHORITY_PEER_ID_FIELD_NUMBER = 8;
    private int authorityPeerId_ = 0;
    /**
     * <code>uint32 authority_peer_id = 8;</code>
     * @return The authorityPeerId.
     */
    @java.lang.Override
    public int getAuthorityPeerId() {
      return authorityPeerId_;
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
      if (authorityPeerId_ != 0) {
        output.writeUInt32(8, authorityPeerId_);
      }
      if (abilityInfo_ != null) {
        output.writeMessage(11, getAbilityInfo());
      }
      if (entityId_ != 0) {
        output.writeUInt32(14, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (authorityPeerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, authorityPeerId_);
      }
      if (abilityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getAbilityInfo());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo other = (emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo) obj;

      if (hasAbilityInfo() != other.hasAbilityInfo()) return false;
      if (hasAbilityInfo()) {
        if (!getAbilityInfo()
            .equals(other.getAbilityInfo())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getAuthorityPeerId()
          != other.getAuthorityPeerId()) return false;
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
      if (hasAbilityInfo()) {
        hash = (37 * hash) + ABILITY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityInfo().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + AUTHORITY_PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorityPeerId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo prototype) {
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
     * Obf: DBEDDNAPIOA
     * </pre>
     *
     * Protobuf type {@code MPLevelEntityInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MPLevelEntityInfo)
        emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.class, emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.newBuilder()
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
        abilityInfo_ = null;
        if (abilityInfoBuilder_ != null) {
          abilityInfoBuilder_.dispose();
          abilityInfoBuilder_ = null;
        }
        entityId_ = 0;
        authorityPeerId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo build() {
        emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo buildPartial() {
        emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo result = new emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.abilityInfo_ = abilityInfoBuilder_ == null
              ? abilityInfo_
              : abilityInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.authorityPeerId_ = authorityPeerId_;
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
        if (other instanceof emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo) {
          return mergeFrom((emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo other) {
        if (other == emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo.getDefaultInstance()) return this;
        if (other.hasAbilityInfo()) {
          mergeAbilityInfo(other.getAbilityInfo());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getAuthorityPeerId() != 0) {
          setAuthorityPeerId(other.getAuthorityPeerId());
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
              case 64: {
                authorityPeerId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 90: {
                input.readMessage(
                    getAbilityInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 90
              case 112: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> abilityInfoBuilder_;
      /**
       * <code>.AbilitySyncStateInfo ability_info = 11;</code>
       * @return Whether the abilityInfo field is set.
       */
      public boolean hasAbilityInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 11;</code>
       * @return The abilityInfo.
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
        if (abilityInfoBuilder_ == null) {
          return abilityInfo_ == null ? emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
        } else {
          return abilityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 11;</code>
       */
      public Builder setAbilityInfo(emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (abilityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          abilityInfo_ = value;
        } else {
          abilityInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 11;</code>
       */
      public Builder setAbilityInfo(
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
        if (abilityInfoBuilder_ == null) {
          abilityInfo_ = builderForValue.build();
        } else {
          abilityInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 11;</code>
       */
      public Builder mergeAbilityInfo(emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
        if (abilityInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            abilityInfo_ != null &&
            abilityInfo_ != emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance()) {
            getAbilityInfoBuilder().mergeFrom(value);
          } else {
            abilityInfo_ = value;
          }
        } else {
          abilityInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 11;</code>
       */
      public Builder clearAbilityInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        abilityInfo_ = null;
        if (abilityInfoBuilder_ != null) {
          abilityInfoBuilder_.dispose();
          abilityInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 11;</code>
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getAbilityInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getAbilityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 11;</code>
       */
      public emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
        if (abilityInfoBuilder_ != null) {
          return abilityInfoBuilder_.getMessageOrBuilder();
        } else {
          return abilityInfo_ == null ?
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : abilityInfo_;
        }
      }
      /**
       * <code>.AbilitySyncStateInfo ability_info = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> 
          getAbilityInfoFieldBuilder() {
        if (abilityInfoBuilder_ == null) {
          abilityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(
                  getAbilityInfo(),
                  getParentForChildren(),
                  isClean());
          abilityInfo_ = null;
        }
        return abilityInfoBuilder_;
      }

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
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int authorityPeerId_ ;
      /**
       * <code>uint32 authority_peer_id = 8;</code>
       * @return The authorityPeerId.
       */
      @java.lang.Override
      public int getAuthorityPeerId() {
        return authorityPeerId_;
      }
      /**
       * <code>uint32 authority_peer_id = 8;</code>
       * @param value The authorityPeerId to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorityPeerId(int value) {

        authorityPeerId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 authority_peer_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthorityPeerId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        authorityPeerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MPLevelEntityInfo)
    }

    // @@protoc_insertion_point(class_scope:MPLevelEntityInfo)
    private static final emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo();
    }

    public static emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MPLevelEntityInfo>
        PARSER = new com.google.protobuf.AbstractParser<MPLevelEntityInfo>() {
      @java.lang.Override
      public MPLevelEntityInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<MPLevelEntityInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MPLevelEntityInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MPLevelEntityInfoOuterClass.MPLevelEntityInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MPLevelEntityInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MPLevelEntityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027MPLevelEntityInfo.proto\032\032AbilitySyncSt" +
      "ateInfo.proto\"n\n\021MPLevelEntityInfo\022+\n\014ab" +
      "ility_info\030\013 \001(\0132\025.AbilitySyncStateInfo\022" +
      "\021\n\tentity_id\030\016 \001(\r\022\031\n\021authority_peer_id\030" +
      "\010 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.getDescriptor(),
        });
    internal_static_MPLevelEntityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MPLevelEntityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MPLevelEntityInfo_descriptor,
        new java.lang.String[] { "AbilityInfo", "EntityId", "AuthorityPeerId", });
    emu.grasscutter.net.proto.AbilitySyncStateInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
