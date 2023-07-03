// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetPlayerHeadImageRsp.proto

package emu.grasscutter.net.proto;

public final class SetPlayerHeadImageRspOuterClass {
  private SetPlayerHeadImageRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetPlayerHeadImageRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetPlayerHeadImageRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     * @return Whether the profilePicture field is set.
     */
    boolean hasProfilePicture();
    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     * @return The profilePicture.
     */
    emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture getProfilePicture();
    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     */
    emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder();

    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    int getAvatarId();
  }
  /**
   * <pre>
   * CmdId: 4038
   * Obf: FFBCPLJOOKJ
   * </pre>
   *
   * Protobuf type {@code SetPlayerHeadImageRsp}
   */
  public static final class SetPlayerHeadImageRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetPlayerHeadImageRsp)
      SetPlayerHeadImageRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetPlayerHeadImageRsp.newBuilder() to construct.
    private SetPlayerHeadImageRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetPlayerHeadImageRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetPlayerHeadImageRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.class, emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PROFILE_PICTURE_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture profilePicture_;
    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     * @return Whether the profilePicture field is set.
     */
    @java.lang.Override
    public boolean hasProfilePicture() {
      return profilePicture_ != null;
    }
    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     * @return The profilePicture.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
      return profilePicture_ == null ? emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
    }
    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
      return profilePicture_ == null ? emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 5;
    private int avatarId_ = 0;
    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
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
      if (avatarId_ != 0) {
        output.writeUInt32(5, avatarId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (profilePicture_ != null) {
        output.writeMessage(11, getProfilePicture());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, avatarId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (profilePicture_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getProfilePicture());
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
      if (!(obj instanceof emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp other = (emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasProfilePicture() != other.hasProfilePicture()) return false;
      if (hasProfilePicture()) {
        if (!getProfilePicture()
            .equals(other.getProfilePicture())) return false;
      }
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      if (hasProfilePicture()) {
        hash = (37 * hash) + PROFILE_PICTURE_FIELD_NUMBER;
        hash = (53 * hash) + getProfilePicture().hashCode();
      }
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp prototype) {
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
     * CmdId: 4038
     * Obf: FFBCPLJOOKJ
     * </pre>
     *
     * Protobuf type {@code SetPlayerHeadImageRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetPlayerHeadImageRsp)
        emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.class, emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.newBuilder()
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
        profilePicture_ = null;
        if (profilePictureBuilder_ != null) {
          profilePictureBuilder_.dispose();
          profilePictureBuilder_ = null;
        }
        avatarId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.internal_static_SetPlayerHeadImageRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp build() {
        emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp buildPartial() {
        emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp result = new emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.profilePicture_ = profilePictureBuilder_ == null
              ? profilePicture_
              : profilePictureBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.avatarId_ = avatarId_;
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
        if (other instanceof emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp other) {
        if (other == emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasProfilePicture()) {
          mergeProfilePicture(other.getProfilePicture());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
                avatarId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 64: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
              case 90: {
                input.readMessage(
                    getProfilePictureFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 90
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
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
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
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture profilePicture_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder> profilePictureBuilder_;
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       * @return Whether the profilePicture field is set.
       */
      public boolean hasProfilePicture() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       * @return The profilePicture.
       */
      public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
        if (profilePictureBuilder_ == null) {
          return profilePicture_ == null ? emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
        } else {
          return profilePictureBuilder_.getMessage();
        }
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public Builder setProfilePicture(emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          profilePicture_ = value;
        } else {
          profilePictureBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public Builder setProfilePicture(
          emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder builderForValue) {
        if (profilePictureBuilder_ == null) {
          profilePicture_ = builderForValue.build();
        } else {
          profilePictureBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public Builder mergeProfilePicture(emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            profilePicture_ != null &&
            profilePicture_ != emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance()) {
            getProfilePictureBuilder().mergeFrom(value);
          } else {
            profilePicture_ = value;
          }
        } else {
          profilePictureBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public Builder clearProfilePicture() {
        bitField0_ = (bitField0_ & ~0x00000002);
        profilePicture_ = null;
        if (profilePictureBuilder_ != null) {
          profilePictureBuilder_.dispose();
          profilePictureBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder getProfilePictureBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getProfilePictureFieldBuilder().getBuilder();
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
        if (profilePictureBuilder_ != null) {
          return profilePictureBuilder_.getMessageOrBuilder();
        } else {
          return profilePicture_ == null ?
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
        }
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder> 
          getProfilePictureFieldBuilder() {
        if (profilePictureBuilder_ == null) {
          profilePictureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.proto.ProfilePictureOuterClass.ProfilePictureOrBuilder>(
                  getProfilePicture(),
                  getParentForChildren(),
                  isClean());
          profilePicture_ = null;
        }
        return profilePictureBuilder_;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {

        avatarId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        avatarId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SetPlayerHeadImageRsp)
    }

    // @@protoc_insertion_point(class_scope:SetPlayerHeadImageRsp)
    private static final emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp();
    }

    public static emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetPlayerHeadImageRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetPlayerHeadImageRsp>() {
      @java.lang.Override
      public SetPlayerHeadImageRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SetPlayerHeadImageRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetPlayerHeadImageRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetPlayerHeadImageRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetPlayerHeadImageRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SetPlayerHeadImageRsp.proto\032\024ProfilePi" +
      "cture.proto\"e\n\025SetPlayerHeadImageRsp\022\017\n\007" +
      "retcode\030\010 \001(\005\022(\n\017profile_picture\030\013 \001(\0132\017" +
      ".ProfilePicture\022\021\n\tavatar_id\030\005 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ProfilePictureOuterClass.getDescriptor(),
        });
    internal_static_SetPlayerHeadImageRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetPlayerHeadImageRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetPlayerHeadImageRsp_descriptor,
        new java.lang.String[] { "Retcode", "ProfilePicture", "AvatarId", });
    emu.grasscutter.net.proto.ProfilePictureOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
