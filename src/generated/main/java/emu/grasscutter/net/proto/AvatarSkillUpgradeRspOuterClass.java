// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarSkillUpgradeRsp.proto

package emu.grasscutter.net.proto;

public final class AvatarSkillUpgradeRspOuterClass {
  private AvatarSkillUpgradeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarSkillUpgradeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarSkillUpgradeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatar_skill_id = 7;</code>
     * @return The avatarSkillId.
     */
    int getAvatarSkillId();

    /**
     * <code>uint64 avatar_guid = 13;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 old_level = 1;</code>
     * @return The oldLevel.
     */
    int getOldLevel();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 cur_level = 11;</code>
     * @return The curLevel.
     */
    int getCurLevel();
  }
  /**
   * <pre>
   * CmdId: 1012
   * Name: NFAINKJCGNM
   * </pre>
   *
   * Protobuf type {@code AvatarSkillUpgradeRsp}
   */
  public static final class AvatarSkillUpgradeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarSkillUpgradeRsp)
      AvatarSkillUpgradeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarSkillUpgradeRsp.newBuilder() to construct.
    private AvatarSkillUpgradeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarSkillUpgradeRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarSkillUpgradeRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.internal_static_AvatarSkillUpgradeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.internal_static_AvatarSkillUpgradeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.class, emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.Builder.class);
    }

    public static final int AVATAR_SKILL_ID_FIELD_NUMBER = 7;
    private int avatarSkillId_ = 0;
    /**
     * <code>uint32 avatar_skill_id = 7;</code>
     * @return The avatarSkillId.
     */
    @java.lang.Override
    public int getAvatarSkillId() {
      return avatarSkillId_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 13;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatar_guid = 13;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int OLD_LEVEL_FIELD_NUMBER = 1;
    private int oldLevel_ = 0;
    /**
     * <code>uint32 old_level = 1;</code>
     * @return The oldLevel.
     */
    @java.lang.Override
    public int getOldLevel() {
      return oldLevel_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CUR_LEVEL_FIELD_NUMBER = 11;
    private int curLevel_ = 0;
    /**
     * <code>uint32 cur_level = 11;</code>
     * @return The curLevel.
     */
    @java.lang.Override
    public int getCurLevel() {
      return curLevel_;
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
      if (oldLevel_ != 0) {
        output.writeUInt32(1, oldLevel_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (avatarSkillId_ != 0) {
        output.writeUInt32(7, avatarSkillId_);
      }
      if (curLevel_ != 0) {
        output.writeUInt32(11, curLevel_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(13, avatarGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oldLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, oldLevel_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (avatarSkillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, avatarSkillId_);
      }
      if (curLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, curLevel_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(13, avatarGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp other = (emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp) obj;

      if (getAvatarSkillId()
          != other.getAvatarSkillId()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getOldLevel()
          != other.getOldLevel()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCurLevel()
          != other.getCurLevel()) return false;
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
      hash = (37 * hash) + AVATAR_SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarSkillId();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + OLD_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getOldLevel();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + CUR_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getCurLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp prototype) {
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
     * CmdId: 1012
     * Name: NFAINKJCGNM
     * </pre>
     *
     * Protobuf type {@code AvatarSkillUpgradeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarSkillUpgradeRsp)
        emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.internal_static_AvatarSkillUpgradeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.internal_static_AvatarSkillUpgradeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.class, emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.newBuilder()
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
        avatarSkillId_ = 0;
        avatarGuid_ = 0L;
        oldLevel_ = 0;
        retcode_ = 0;
        curLevel_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.internal_static_AvatarSkillUpgradeRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp build() {
        emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp buildPartial() {
        emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp result = new emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.avatarSkillId_ = avatarSkillId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.avatarGuid_ = avatarGuid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.oldLevel_ = oldLevel_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.curLevel_ = curLevel_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp other) {
        if (other == emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp.getDefaultInstance()) return this;
        if (other.getAvatarSkillId() != 0) {
          setAvatarSkillId(other.getAvatarSkillId());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getOldLevel() != 0) {
          setOldLevel(other.getOldLevel());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCurLevel() != 0) {
          setCurLevel(other.getCurLevel());
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
                oldLevel_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 48: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 48
              case 56: {
                avatarSkillId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 88: {
                curLevel_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 88
              case 104: {
                avatarGuid_ = input.readUInt64();
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

      private int avatarSkillId_ ;
      /**
       * <code>uint32 avatar_skill_id = 7;</code>
       * @return The avatarSkillId.
       */
      @java.lang.Override
      public int getAvatarSkillId() {
        return avatarSkillId_;
      }
      /**
       * <code>uint32 avatar_skill_id = 7;</code>
       * @param value The avatarSkillId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarSkillId(int value) {

        avatarSkillId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_skill_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarSkillId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarSkillId_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 13;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 13;</code>
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
       * <code>uint64 avatar_guid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int oldLevel_ ;
      /**
       * <code>uint32 old_level = 1;</code>
       * @return The oldLevel.
       */
      @java.lang.Override
      public int getOldLevel() {
        return oldLevel_;
      }
      /**
       * <code>uint32 old_level = 1;</code>
       * @param value The oldLevel to set.
       * @return This builder for chaining.
       */
      public Builder setOldLevel(int value) {

        oldLevel_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 old_level = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOldLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        oldLevel_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000008);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int curLevel_ ;
      /**
       * <code>uint32 cur_level = 11;</code>
       * @return The curLevel.
       */
      @java.lang.Override
      public int getCurLevel() {
        return curLevel_;
      }
      /**
       * <code>uint32 cur_level = 11;</code>
       * @param value The curLevel to set.
       * @return This builder for chaining.
       */
      public Builder setCurLevel(int value) {

        curLevel_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_level = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurLevel() {
        bitField0_ = (bitField0_ & ~0x00000010);
        curLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarSkillUpgradeRsp)
    }

    // @@protoc_insertion_point(class_scope:AvatarSkillUpgradeRsp)
    private static final emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp();
    }

    public static emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarSkillUpgradeRsp>
        PARSER = new com.google.protobuf.AbstractParser<AvatarSkillUpgradeRsp>() {
      @java.lang.Override
      public AvatarSkillUpgradeRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarSkillUpgradeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarSkillUpgradeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarSkillUpgradeRspOuterClass.AvatarSkillUpgradeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarSkillUpgradeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarSkillUpgradeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AvatarSkillUpgradeRsp.proto\"|\n\025AvatarS" +
      "killUpgradeRsp\022\027\n\017avatar_skill_id\030\007 \001(\r\022" +
      "\023\n\013avatar_guid\030\r \001(\004\022\021\n\told_level\030\001 \001(\r\022" +
      "\017\n\007retcode\030\006 \001(\005\022\021\n\tcur_level\030\013 \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarSkillUpgradeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarSkillUpgradeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarSkillUpgradeRsp_descriptor,
        new java.lang.String[] { "AvatarSkillId", "AvatarGuid", "OldLevel", "Retcode", "CurLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
