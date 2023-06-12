// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FurnitureMakeCancelRsp.proto

package emu.grasscutter.net.proto;

public final class FurnitureMakeCancelRspOuterClass {
  private FurnitureMakeCancelRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FurnitureMakeCancelRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FurnitureMakeCancelRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 make_id = 5;</code>
     * @return The makeId.
     */
    int getMakeId();

    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
     * @return Whether the furnitureMakeSlot field is set.
     */
    boolean hasFurnitureMakeSlot();
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
     * @return The furnitureMakeSlot.
     */
    emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot();
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
     */
    emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4853
   * Name: BEJNPDHEGDO
   * </pre>
   *
   * Protobuf type {@code FurnitureMakeCancelRsp}
   */
  public static final class FurnitureMakeCancelRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FurnitureMakeCancelRsp)
      FurnitureMakeCancelRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FurnitureMakeCancelRsp.newBuilder() to construct.
    private FurnitureMakeCancelRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FurnitureMakeCancelRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FurnitureMakeCancelRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.internal_static_FurnitureMakeCancelRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.internal_static_FurnitureMakeCancelRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp.class, emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MAKE_ID_FIELD_NUMBER = 5;
    private int makeId_ = 0;
    /**
     * <code>uint32 make_id = 5;</code>
     * @return The makeId.
     */
    @java.lang.Override
    public int getMakeId() {
      return makeId_;
    }

    public static final int FURNITURE_MAKE_SLOT_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
     * @return Whether the furnitureMakeSlot field is set.
     */
    @java.lang.Override
    public boolean hasFurnitureMakeSlot() {
      return furnitureMakeSlot_ != null;
    }
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
     * @return The furnitureMakeSlot.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
      return furnitureMakeSlot_ == null ? emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : furnitureMakeSlot_;
    }
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
      return furnitureMakeSlot_ == null ? emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : furnitureMakeSlot_;
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
      if (furnitureMakeSlot_ != null) {
        output.writeMessage(1, getFurnitureMakeSlot());
      }
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (makeId_ != 0) {
        output.writeUInt32(5, makeId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (furnitureMakeSlot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getFurnitureMakeSlot());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (makeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, makeId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp other = (emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getMakeId()
          != other.getMakeId()) return false;
      if (hasFurnitureMakeSlot() != other.hasFurnitureMakeSlot()) return false;
      if (hasFurnitureMakeSlot()) {
        if (!getFurnitureMakeSlot()
            .equals(other.getFurnitureMakeSlot())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + MAKE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMakeId();
      if (hasFurnitureMakeSlot()) {
        hash = (37 * hash) + FURNITURE_MAKE_SLOT_FIELD_NUMBER;
        hash = (53 * hash) + getFurnitureMakeSlot().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp prototype) {
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
     * CmdId: 4853
     * Name: BEJNPDHEGDO
     * </pre>
     *
     * Protobuf type {@code FurnitureMakeCancelRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FurnitureMakeCancelRsp)
        emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.internal_static_FurnitureMakeCancelRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.internal_static_FurnitureMakeCancelRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp.class, emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp.newBuilder()
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
        makeId_ = 0;
        furnitureMakeSlot_ = null;
        if (furnitureMakeSlotBuilder_ != null) {
          furnitureMakeSlotBuilder_.dispose();
          furnitureMakeSlotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.internal_static_FurnitureMakeCancelRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp build() {
        emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp buildPartial() {
        emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp result = new emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.makeId_ = makeId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.furnitureMakeSlot_ = furnitureMakeSlotBuilder_ == null
              ? furnitureMakeSlot_
              : furnitureMakeSlotBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp) {
          return mergeFrom((emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp other) {
        if (other == emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getMakeId() != 0) {
          setMakeId(other.getMakeId());
        }
        if (other.hasFurnitureMakeSlot()) {
          mergeFurnitureMakeSlot(other.getFurnitureMakeSlot());
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
              case 10: {
                input.readMessage(
                    getFurnitureMakeSlotFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 10
              case 24: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 40: {
                makeId_ = input.readUInt32();
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
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
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int makeId_ ;
      /**
       * <code>uint32 make_id = 5;</code>
       * @return The makeId.
       */
      @java.lang.Override
      public int getMakeId() {
        return makeId_;
      }
      /**
       * <code>uint32 make_id = 5;</code>
       * @param value The makeId to set.
       * @return This builder for chaining.
       */
      public Builder setMakeId(int value) {

        makeId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 make_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearMakeId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        makeId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder> furnitureMakeSlotBuilder_;
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
       * @return Whether the furnitureMakeSlot field is set.
       */
      public boolean hasFurnitureMakeSlot() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
       * @return The furnitureMakeSlot.
       */
      public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
        if (furnitureMakeSlotBuilder_ == null) {
          return furnitureMakeSlot_ == null ? emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : furnitureMakeSlot_;
        } else {
          return furnitureMakeSlotBuilder_.getMessage();
        }
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
       */
      public Builder setFurnitureMakeSlot(emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
        if (furnitureMakeSlotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          furnitureMakeSlot_ = value;
        } else {
          furnitureMakeSlotBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
       */
      public Builder setFurnitureMakeSlot(
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder builderForValue) {
        if (furnitureMakeSlotBuilder_ == null) {
          furnitureMakeSlot_ = builderForValue.build();
        } else {
          furnitureMakeSlotBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
       */
      public Builder mergeFurnitureMakeSlot(emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
        if (furnitureMakeSlotBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            furnitureMakeSlot_ != null &&
            furnitureMakeSlot_ != emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance()) {
            getFurnitureMakeSlotBuilder().mergeFrom(value);
          } else {
            furnitureMakeSlot_ = value;
          }
        } else {
          furnitureMakeSlotBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
       */
      public Builder clearFurnitureMakeSlot() {
        bitField0_ = (bitField0_ & ~0x00000004);
        furnitureMakeSlot_ = null;
        if (furnitureMakeSlotBuilder_ != null) {
          furnitureMakeSlotBuilder_.dispose();
          furnitureMakeSlotBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder getFurnitureMakeSlotBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getFurnitureMakeSlotFieldBuilder().getBuilder();
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
        if (furnitureMakeSlotBuilder_ != null) {
          return furnitureMakeSlotBuilder_.getMessageOrBuilder();
        } else {
          return furnitureMakeSlot_ == null ?
              emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : furnitureMakeSlot_;
        }
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder> 
          getFurnitureMakeSlotFieldBuilder() {
        if (furnitureMakeSlotBuilder_ == null) {
          furnitureMakeSlotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder>(
                  getFurnitureMakeSlot(),
                  getParentForChildren(),
                  isClean());
          furnitureMakeSlot_ = null;
        }
        return furnitureMakeSlotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FurnitureMakeCancelRsp)
    }

    // @@protoc_insertion_point(class_scope:FurnitureMakeCancelRsp)
    private static final emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp();
    }

    public static emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FurnitureMakeCancelRsp>
        PARSER = new com.google.protobuf.AbstractParser<FurnitureMakeCancelRsp>() {
      @java.lang.Override
      public FurnitureMakeCancelRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<FurnitureMakeCancelRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FurnitureMakeCancelRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeCancelRspOuterClass.FurnitureMakeCancelRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FurnitureMakeCancelRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FurnitureMakeCancelRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034FurnitureMakeCancelRsp.proto\032\027Furnitur" +
      "eMakeSlot.proto\"k\n\026FurnitureMakeCancelRs" +
      "p\022\017\n\007retcode\030\003 \001(\005\022\017\n\007make_id\030\005 \001(\r\022/\n\023f" +
      "urniture_make_slot\030\001 \001(\0132\022.FurnitureMake" +
      "SlotB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.getDescriptor(),
        });
    internal_static_FurnitureMakeCancelRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FurnitureMakeCancelRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FurnitureMakeCancelRsp_descriptor,
        new java.lang.String[] { "Retcode", "MakeId", "FurnitureMakeSlot", });
    emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
