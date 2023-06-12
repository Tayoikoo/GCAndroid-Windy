// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TriggerCreateGadgetToEquipPartNotify.proto

package emu.grasscutter.net.proto;

public final class TriggerCreateGadgetToEquipPartNotifyOuterClass {
  private TriggerCreateGadgetToEquipPartNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TriggerCreateGadgetToEquipPartNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TriggerCreateGadgetToEquipPartNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string equip_part = 8;</code>
     * @return The equipPart.
     */
    java.lang.String getEquipPart();
    /**
     * <code>string equip_part = 8;</code>
     * @return The bytes for equipPart.
     */
    com.google.protobuf.ByteString
        getEquipPartBytes();

    /**
     * <code>uint32 entity_id = 5;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 gadget_id = 15;</code>
     * @return The gadgetId.
     */
    int getGadgetId();

    /**
     * <code>uint32 gadget_entity_id = 10;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();
  }
  /**
   * <pre>
   * CmdId: 333
   * Name: JDCLEDBBEAH
   * </pre>
   *
   * Protobuf type {@code TriggerCreateGadgetToEquipPartNotify}
   */
  public static final class TriggerCreateGadgetToEquipPartNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TriggerCreateGadgetToEquipPartNotify)
      TriggerCreateGadgetToEquipPartNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TriggerCreateGadgetToEquipPartNotify.newBuilder() to construct.
    private TriggerCreateGadgetToEquipPartNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TriggerCreateGadgetToEquipPartNotify() {
      equipPart_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TriggerCreateGadgetToEquipPartNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.internal_static_TriggerCreateGadgetToEquipPartNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.internal_static_TriggerCreateGadgetToEquipPartNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify.class, emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify.Builder.class);
    }

    public static final int EQUIP_PART_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private volatile java.lang.Object equipPart_ = "";
    /**
     * <code>string equip_part = 8;</code>
     * @return The equipPart.
     */
    @java.lang.Override
    public java.lang.String getEquipPart() {
      java.lang.Object ref = equipPart_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        equipPart_ = s;
        return s;
      }
    }
    /**
     * <code>string equip_part = 8;</code>
     * @return The bytes for equipPart.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEquipPartBytes() {
      java.lang.Object ref = equipPart_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        equipPart_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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

    public static final int GADGET_ID_FIELD_NUMBER = 15;
    private int gadgetId_ = 0;
    /**
     * <code>uint32 gadget_id = 15;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      return gadgetId_;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 10;
    private int gadgetEntityId_ = 0;
    /**
     * <code>uint32 gadget_entity_id = 10;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(equipPart_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, equipPart_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(10, gadgetEntityId_);
      }
      if (gadgetId_ != 0) {
        output.writeUInt32(15, gadgetId_);
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(equipPart_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, equipPart_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, gadgetEntityId_);
      }
      if (gadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, gadgetId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify other = (emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify) obj;

      if (!getEquipPart()
          .equals(other.getEquipPart())) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getGadgetId()
          != other.getGadgetId()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
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
      hash = (37 * hash) + EQUIP_PART_FIELD_NUMBER;
      hash = (53 * hash) + getEquipPart().hashCode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + GADGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetId();
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify prototype) {
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
     * CmdId: 333
     * Name: JDCLEDBBEAH
     * </pre>
     *
     * Protobuf type {@code TriggerCreateGadgetToEquipPartNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TriggerCreateGadgetToEquipPartNotify)
        emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.internal_static_TriggerCreateGadgetToEquipPartNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.internal_static_TriggerCreateGadgetToEquipPartNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify.class, emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify.newBuilder()
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
        equipPart_ = "";
        entityId_ = 0;
        gadgetId_ = 0;
        gadgetEntityId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.internal_static_TriggerCreateGadgetToEquipPartNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify build() {
        emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify buildPartial() {
        emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify result = new emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.equipPart_ = equipPart_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.gadgetId_ = gadgetId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.gadgetEntityId_ = gadgetEntityId_;
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
        if (other instanceof emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify) {
          return mergeFrom((emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify other) {
        if (other == emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify.getDefaultInstance()) return this;
        if (!other.getEquipPart().isEmpty()) {
          equipPart_ = other.equipPart_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getGadgetId() != 0) {
          setGadgetId(other.getGadgetId());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
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
              case 66: {
                equipPart_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 66
              case 80: {
                gadgetEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
              case 120: {
                gadgetId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private java.lang.Object equipPart_ = "";
      /**
       * <code>string equip_part = 8;</code>
       * @return The equipPart.
       */
      public java.lang.String getEquipPart() {
        java.lang.Object ref = equipPart_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          equipPart_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string equip_part = 8;</code>
       * @return The bytes for equipPart.
       */
      public com.google.protobuf.ByteString
          getEquipPartBytes() {
        java.lang.Object ref = equipPart_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          equipPart_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string equip_part = 8;</code>
       * @param value The equipPart to set.
       * @return This builder for chaining.
       */
      public Builder setEquipPart(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        equipPart_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string equip_part = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEquipPart() {
        equipPart_ = getDefaultInstance().getEquipPart();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string equip_part = 8;</code>
       * @param value The bytes for equipPart to set.
       * @return This builder for chaining.
       */
      public Builder setEquipPartBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        equipPart_ = value;
        bitField0_ |= 0x00000001;
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

      private int gadgetId_ ;
      /**
       * <code>uint32 gadget_id = 15;</code>
       * @return The gadgetId.
       */
      @java.lang.Override
      public int getGadgetId() {
        return gadgetId_;
      }
      /**
       * <code>uint32 gadget_id = 15;</code>
       * @param value The gadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetId(int value) {

        gadgetId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        gadgetId_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 10;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 10;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {

        gadgetEntityId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        gadgetEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TriggerCreateGadgetToEquipPartNotify)
    }

    // @@protoc_insertion_point(class_scope:TriggerCreateGadgetToEquipPartNotify)
    private static final emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify();
    }

    public static emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TriggerCreateGadgetToEquipPartNotify>
        PARSER = new com.google.protobuf.AbstractParser<TriggerCreateGadgetToEquipPartNotify>() {
      @java.lang.Override
      public TriggerCreateGadgetToEquipPartNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<TriggerCreateGadgetToEquipPartNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TriggerCreateGadgetToEquipPartNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TriggerCreateGadgetToEquipPartNotifyOuterClass.TriggerCreateGadgetToEquipPartNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TriggerCreateGadgetToEquipPartNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TriggerCreateGadgetToEquipPartNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*TriggerCreateGadgetToEquipPartNotify.p" +
      "roto\"z\n$TriggerCreateGadgetToEquipPartNo" +
      "tify\022\022\n\nequip_part\030\010 \001(\t\022\021\n\tentity_id\030\005 " +
      "\001(\r\022\021\n\tgadget_id\030\017 \001(\r\022\030\n\020gadget_entity_" +
      "id\030\n \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TriggerCreateGadgetToEquipPartNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TriggerCreateGadgetToEquipPartNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TriggerCreateGadgetToEquipPartNotify_descriptor,
        new java.lang.String[] { "EquipPart", "EntityId", "GadgetId", "GadgetEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
