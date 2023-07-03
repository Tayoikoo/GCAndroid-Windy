// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarChangeCostumeRsp.proto

package emu.grasscutter.net.proto;

public final class AvatarChangeCostumeRspOuterClass {
  private AvatarChangeCostumeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarChangeCostumeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarChangeCostumeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 9;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 costume_id = 4;</code>
     * @return The costumeId.
     */
    int getCostumeId();
  }
  /**
   * <pre>
   * CmdId: 1625
   * Obf: LECIDBKINPN
   * </pre>
   *
   * Protobuf type {@code AvatarChangeCostumeRsp}
   */
  public static final class AvatarChangeCostumeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarChangeCostumeRsp)
      AvatarChangeCostumeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarChangeCostumeRsp.newBuilder() to construct.
    private AvatarChangeCostumeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarChangeCostumeRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarChangeCostumeRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.internal_static_AvatarChangeCostumeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.internal_static_AvatarChangeCostumeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp.class, emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 9;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatar_guid = 9;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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

    public static final int COSTUME_ID_FIELD_NUMBER = 4;
    private int costumeId_ = 0;
    /**
     * <code>uint32 costume_id = 4;</code>
     * @return The costumeId.
     */
    @java.lang.Override
    public int getCostumeId() {
      return costumeId_;
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
      if (costumeId_ != 0) {
        output.writeUInt32(4, costumeId_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(9, avatarGuid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, costumeId_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, avatarGuid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp other = (emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCostumeId()
          != other.getCostumeId()) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp prototype) {
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
     * CmdId: 1625
     * Obf: LECIDBKINPN
     * </pre>
     *
     * Protobuf type {@code AvatarChangeCostumeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarChangeCostumeRsp)
        emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.internal_static_AvatarChangeCostumeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.internal_static_AvatarChangeCostumeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp.class, emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp.newBuilder()
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
        avatarGuid_ = 0L;
        retcode_ = 0;
        costumeId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.internal_static_AvatarChangeCostumeRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp build() {
        emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp buildPartial() {
        emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp result = new emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.avatarGuid_ = avatarGuid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.costumeId_ = costumeId_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp other) {
        if (other == emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCostumeId() != 0) {
          setCostumeId(other.getCostumeId());
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
                costumeId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
              case 72: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 96: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
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

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 9;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 9;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {

        avatarGuid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

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
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int costumeId_ ;
      /**
       * <code>uint32 costume_id = 4;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costume_id = 4;</code>
       * @param value The costumeId to set.
       * @return This builder for chaining.
       */
      public Builder setCostumeId(int value) {

        costumeId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costume_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostumeId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        costumeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarChangeCostumeRsp)
    }

    // @@protoc_insertion_point(class_scope:AvatarChangeCostumeRsp)
    private static final emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp();
    }

    public static emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarChangeCostumeRsp>
        PARSER = new com.google.protobuf.AbstractParser<AvatarChangeCostumeRsp>() {
      @java.lang.Override
      public AvatarChangeCostumeRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarChangeCostumeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarChangeCostumeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarChangeCostumeRspOuterClass.AvatarChangeCostumeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarChangeCostumeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarChangeCostumeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034AvatarChangeCostumeRsp.proto\"R\n\026Avatar" +
      "ChangeCostumeRsp\022\023\n\013avatar_guid\030\t \001(\004\022\017\n" +
      "\007retcode\030\014 \001(\005\022\022\n\ncostume_id\030\004 \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarChangeCostumeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarChangeCostumeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarChangeCostumeRsp_descriptor,
        new java.lang.String[] { "AvatarGuid", "Retcode", "CostumeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
