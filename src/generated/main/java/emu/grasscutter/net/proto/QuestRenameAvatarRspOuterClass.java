// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestRenameAvatarRsp.proto

package emu.grasscutter.net.proto;

public final class QuestRenameAvatarRspOuterClass {
  private QuestRenameAvatarRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestRenameAvatarRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestRenameAvatarRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_check = 15;</code>
     * @return The isCheck.
     */
    boolean getIsCheck();

    /**
     * <code>uint32 rename_id = 4;</code>
     * @return The renameId.
     */
    int getRenameId();

    /**
     * <code>string avatar_name = 10;</code>
     * @return The avatarName.
     */
    java.lang.String getAvatarName();
    /**
     * <code>string avatar_name = 10;</code>
     * @return The bytes for avatarName.
     */
    com.google.protobuf.ByteString
        getAvatarNameBytes();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 497
   * Obf: GEONAMCBPDO
   * </pre>
   *
   * Protobuf type {@code QuestRenameAvatarRsp}
   */
  public static final class QuestRenameAvatarRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestRenameAvatarRsp)
      QuestRenameAvatarRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestRenameAvatarRsp.newBuilder() to construct.
    private QuestRenameAvatarRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestRenameAvatarRsp() {
      avatarName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestRenameAvatarRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.internal_static_QuestRenameAvatarRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.internal_static_QuestRenameAvatarRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp.class, emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp.Builder.class);
    }

    public static final int IS_CHECK_FIELD_NUMBER = 15;
    private boolean isCheck_ = false;
    /**
     * <code>bool is_check = 15;</code>
     * @return The isCheck.
     */
    @java.lang.Override
    public boolean getIsCheck() {
      return isCheck_;
    }

    public static final int RENAME_ID_FIELD_NUMBER = 4;
    private int renameId_ = 0;
    /**
     * <code>uint32 rename_id = 4;</code>
     * @return The renameId.
     */
    @java.lang.Override
    public int getRenameId() {
      return renameId_;
    }

    public static final int AVATAR_NAME_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private volatile java.lang.Object avatarName_ = "";
    /**
     * <code>string avatar_name = 10;</code>
     * @return The avatarName.
     */
    @java.lang.Override
    public java.lang.String getAvatarName() {
      java.lang.Object ref = avatarName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        avatarName_ = s;
        return s;
      }
    }
    /**
     * <code>string avatar_name = 10;</code>
     * @return The bytes for avatarName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAvatarNameBytes() {
      java.lang.Object ref = avatarName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        avatarName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (renameId_ != 0) {
        output.writeUInt32(4, renameId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(avatarName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, avatarName_);
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      if (isCheck_ != false) {
        output.writeBool(15, isCheck_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (renameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, renameId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(avatarName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, avatarName_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
      }
      if (isCheck_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isCheck_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp other = (emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp) obj;

      if (getIsCheck()
          != other.getIsCheck()) return false;
      if (getRenameId()
          != other.getRenameId()) return false;
      if (!getAvatarName()
          .equals(other.getAvatarName())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + IS_CHECK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCheck());
      hash = (37 * hash) + RENAME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRenameId();
      hash = (37 * hash) + AVATAR_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarName().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp prototype) {
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
     * CmdId: 497
     * Obf: GEONAMCBPDO
     * </pre>
     *
     * Protobuf type {@code QuestRenameAvatarRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestRenameAvatarRsp)
        emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.internal_static_QuestRenameAvatarRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.internal_static_QuestRenameAvatarRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp.class, emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp.newBuilder()
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
        isCheck_ = false;
        renameId_ = 0;
        avatarName_ = "";
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.internal_static_QuestRenameAvatarRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp build() {
        emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp buildPartial() {
        emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp result = new emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isCheck_ = isCheck_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.renameId_ = renameId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.avatarName_ = avatarName_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp) {
          return mergeFrom((emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp other) {
        if (other == emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp.getDefaultInstance()) return this;
        if (other.getIsCheck() != false) {
          setIsCheck(other.getIsCheck());
        }
        if (other.getRenameId() != 0) {
          setRenameId(other.getRenameId());
        }
        if (!other.getAvatarName().isEmpty()) {
          avatarName_ = other.avatarName_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
                renameId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 82: {
                avatarName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 82
              case 104: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 104
              case 120: {
                isCheck_ = input.readBool();
                bitField0_ |= 0x00000001;
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

      private boolean isCheck_ ;
      /**
       * <code>bool is_check = 15;</code>
       * @return The isCheck.
       */
      @java.lang.Override
      public boolean getIsCheck() {
        return isCheck_;
      }
      /**
       * <code>bool is_check = 15;</code>
       * @param value The isCheck to set.
       * @return This builder for chaining.
       */
      public Builder setIsCheck(boolean value) {

        isCheck_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_check = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCheck() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isCheck_ = false;
        onChanged();
        return this;
      }

      private int renameId_ ;
      /**
       * <code>uint32 rename_id = 4;</code>
       * @return The renameId.
       */
      @java.lang.Override
      public int getRenameId() {
        return renameId_;
      }
      /**
       * <code>uint32 rename_id = 4;</code>
       * @param value The renameId to set.
       * @return This builder for chaining.
       */
      public Builder setRenameId(int value) {

        renameId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rename_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRenameId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        renameId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object avatarName_ = "";
      /**
       * <code>string avatar_name = 10;</code>
       * @return The avatarName.
       */
      public java.lang.String getAvatarName() {
        java.lang.Object ref = avatarName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          avatarName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string avatar_name = 10;</code>
       * @return The bytes for avatarName.
       */
      public com.google.protobuf.ByteString
          getAvatarNameBytes() {
        java.lang.Object ref = avatarName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          avatarName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string avatar_name = 10;</code>
       * @param value The avatarName to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        avatarName_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string avatar_name = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarName() {
        avatarName_ = getDefaultInstance().getAvatarName();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string avatar_name = 10;</code>
       * @param value The bytes for avatarName to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        avatarName_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
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
       * <code>int32 retcode = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000008);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:QuestRenameAvatarRsp)
    }

    // @@protoc_insertion_point(class_scope:QuestRenameAvatarRsp)
    private static final emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp();
    }

    public static emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestRenameAvatarRsp>
        PARSER = new com.google.protobuf.AbstractParser<QuestRenameAvatarRsp>() {
      @java.lang.Override
      public QuestRenameAvatarRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestRenameAvatarRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestRenameAvatarRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestRenameAvatarRspOuterClass.QuestRenameAvatarRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestRenameAvatarRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestRenameAvatarRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032QuestRenameAvatarRsp.proto\"a\n\024QuestRen" +
      "ameAvatarRsp\022\020\n\010is_check\030\017 \001(\010\022\021\n\trename" +
      "_id\030\004 \001(\r\022\023\n\013avatar_name\030\n \001(\t\022\017\n\007retcod" +
      "e\030\r \001(\005B\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestRenameAvatarRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestRenameAvatarRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestRenameAvatarRsp_descriptor,
        new java.lang.String[] { "IsCheck", "RenameId", "AvatarName", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
