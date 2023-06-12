// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarEquipAffixStartNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarEquipAffixStartNotifyOuterClass {
  private AvatarEquipAffixStartNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarEquipAffixStartNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarEquipAffixStartNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
     * @return Whether the equipAffixInfo field is set.
     */
    boolean hasEquipAffixInfo();
    /**
     * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
     * @return The equipAffixInfo.
     */
    emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getEquipAffixInfo();
    /**
     * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
     */
    emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder getEquipAffixInfoOrBuilder();

    /**
     * <code>uint64 avatar_guid = 7;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * <pre>
   * CmdId: 1645
   * Name: ICFBBMJLJLA
   * </pre>
   *
   * Protobuf type {@code AvatarEquipAffixStartNotify}
   */
  public static final class AvatarEquipAffixStartNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarEquipAffixStartNotify)
      AvatarEquipAffixStartNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarEquipAffixStartNotify.newBuilder() to construct.
    private AvatarEquipAffixStartNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarEquipAffixStartNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarEquipAffixStartNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.internal_static_AvatarEquipAffixStartNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.internal_static_AvatarEquipAffixStartNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.class, emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.Builder.class);
    }

    public static final int EQUIP_AFFIX_INFO_FIELD_NUMBER = 6;
    private emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo equipAffixInfo_;
    /**
     * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
     * @return Whether the equipAffixInfo field is set.
     */
    @java.lang.Override
    public boolean hasEquipAffixInfo() {
      return equipAffixInfo_ != null;
    }
    /**
     * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
     * @return The equipAffixInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getEquipAffixInfo() {
      return equipAffixInfo_ == null ? emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance() : equipAffixInfo_;
    }
    /**
     * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder getEquipAffixInfoOrBuilder() {
      return equipAffixInfo_ == null ? emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance() : equipAffixInfo_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 7;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatar_guid = 7;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (equipAffixInfo_ != null) {
        output.writeMessage(6, getEquipAffixInfo());
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(7, avatarGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (equipAffixInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getEquipAffixInfo());
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, avatarGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify other = (emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify) obj;

      if (hasEquipAffixInfo() != other.hasEquipAffixInfo()) return false;
      if (hasEquipAffixInfo()) {
        if (!getEquipAffixInfo()
            .equals(other.getEquipAffixInfo())) return false;
      }
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      if (hasEquipAffixInfo()) {
        hash = (37 * hash) + EQUIP_AFFIX_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEquipAffixInfo().hashCode();
      }
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify prototype) {
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
     * CmdId: 1645
     * Name: ICFBBMJLJLA
     * </pre>
     *
     * Protobuf type {@code AvatarEquipAffixStartNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarEquipAffixStartNotify)
        emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.internal_static_AvatarEquipAffixStartNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.internal_static_AvatarEquipAffixStartNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.class, emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.newBuilder()
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
        equipAffixInfo_ = null;
        if (equipAffixInfoBuilder_ != null) {
          equipAffixInfoBuilder_.dispose();
          equipAffixInfoBuilder_ = null;
        }
        avatarGuid_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.internal_static_AvatarEquipAffixStartNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify build() {
        emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify result = new emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.equipAffixInfo_ = equipAffixInfoBuilder_ == null
              ? equipAffixInfo_
              : equipAffixInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify.getDefaultInstance()) return this;
        if (other.hasEquipAffixInfo()) {
          mergeEquipAffixInfo(other.getEquipAffixInfo());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
              case 50: {
                input.readMessage(
                    getEquipAffixInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 50
              case 56: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
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

      private emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo equipAffixInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder> equipAffixInfoBuilder_;
      /**
       * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
       * @return Whether the equipAffixInfo field is set.
       */
      public boolean hasEquipAffixInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
       * @return The equipAffixInfo.
       */
      public emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo getEquipAffixInfo() {
        if (equipAffixInfoBuilder_ == null) {
          return equipAffixInfo_ == null ? emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance() : equipAffixInfo_;
        } else {
          return equipAffixInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
       */
      public Builder setEquipAffixInfo(emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo value) {
        if (equipAffixInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          equipAffixInfo_ = value;
        } else {
          equipAffixInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
       */
      public Builder setEquipAffixInfo(
          emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder builderForValue) {
        if (equipAffixInfoBuilder_ == null) {
          equipAffixInfo_ = builderForValue.build();
        } else {
          equipAffixInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
       */
      public Builder mergeEquipAffixInfo(emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo value) {
        if (equipAffixInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            equipAffixInfo_ != null &&
            equipAffixInfo_ != emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance()) {
            getEquipAffixInfoBuilder().mergeFrom(value);
          } else {
            equipAffixInfo_ = value;
          }
        } else {
          equipAffixInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
       */
      public Builder clearEquipAffixInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        equipAffixInfo_ = null;
        if (equipAffixInfoBuilder_ != null) {
          equipAffixInfoBuilder_.dispose();
          equipAffixInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
       */
      public emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder getEquipAffixInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getEquipAffixInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
       */
      public emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder getEquipAffixInfoOrBuilder() {
        if (equipAffixInfoBuilder_ != null) {
          return equipAffixInfoBuilder_.getMessageOrBuilder();
        } else {
          return equipAffixInfo_ == null ?
              emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.getDefaultInstance() : equipAffixInfo_;
        }
      }
      /**
       * <code>.AvatarEquipAffixInfo equip_affix_info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder> 
          getEquipAffixInfoFieldBuilder() {
        if (equipAffixInfoBuilder_ == null) {
          equipAffixInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfo.Builder, emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.AvatarEquipAffixInfoOrBuilder>(
                  getEquipAffixInfo(),
                  getParentForChildren(),
                  isClean());
          equipAffixInfo_ = null;
        }
        return equipAffixInfoBuilder_;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 7;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 7;</code>
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
       * <code>uint64 avatar_guid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:AvatarEquipAffixStartNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarEquipAffixStartNotify)
    private static final emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify();
    }

    public static emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarEquipAffixStartNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarEquipAffixStartNotify>() {
      @java.lang.Override
      public AvatarEquipAffixStartNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarEquipAffixStartNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarEquipAffixStartNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarEquipAffixStartNotifyOuterClass.AvatarEquipAffixStartNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarEquipAffixStartNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarEquipAffixStartNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!AvatarEquipAffixStartNotify.proto\032\032Ava" +
      "tarEquipAffixInfo.proto\"c\n\033AvatarEquipAf" +
      "fixStartNotify\022/\n\020equip_affix_info\030\006 \001(\013" +
      "2\025.AvatarEquipAffixInfo\022\023\n\013avatar_guid\030\007" +
      " \001(\004B\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarEquipAffixStartNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarEquipAffixStartNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarEquipAffixStartNotify_descriptor,
        new java.lang.String[] { "EquipAffixInfo", "AvatarGuid", });
    emu.grasscutter.net.proto.AvatarEquipAffixInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
