// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VehicleStaminaNotify.proto

package emu.grasscutter.net.proto;

public final class VehicleStaminaNotifyOuterClass {
  private VehicleStaminaNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VehicleStaminaNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VehicleStaminaNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>float cur_stamina = 10;</code>
     * @return The curStamina.
     */
    float getCurStamina();
  }
  /**
   * <pre>
   * CmdId: 835
   * Name: PPKCBCCKLMC
   * </pre>
   *
   * Protobuf type {@code VehicleStaminaNotify}
   */
  public static final class VehicleStaminaNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VehicleStaminaNotify)
      VehicleStaminaNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VehicleStaminaNotify.newBuilder() to construct.
    private VehicleStaminaNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VehicleStaminaNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VehicleStaminaNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.internal_static_VehicleStaminaNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.internal_static_VehicleStaminaNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify.class, emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 11;
    private int entityId_ = 0;
    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int CUR_STAMINA_FIELD_NUMBER = 10;
    private float curStamina_ = 0F;
    /**
     * <code>float cur_stamina = 10;</code>
     * @return The curStamina.
     */
    @java.lang.Override
    public float getCurStamina() {
      return curStamina_;
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
      if (java.lang.Float.floatToRawIntBits(curStamina_) != 0) {
        output.writeFloat(10, curStamina_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(11, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(curStamina_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(10, curStamina_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify other = (emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (java.lang.Float.floatToIntBits(getCurStamina())
          != java.lang.Float.floatToIntBits(
              other.getCurStamina())) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + CUR_STAMINA_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCurStamina());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify prototype) {
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
     * CmdId: 835
     * Name: PPKCBCCKLMC
     * </pre>
     *
     * Protobuf type {@code VehicleStaminaNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VehicleStaminaNotify)
        emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.internal_static_VehicleStaminaNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.internal_static_VehicleStaminaNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify.class, emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify.newBuilder()
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
        entityId_ = 0;
        curStamina_ = 0F;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.internal_static_VehicleStaminaNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify build() {
        emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify buildPartial() {
        emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify result = new emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.curStamina_ = curStamina_;
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
        if (other instanceof emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify) {
          return mergeFrom((emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify other) {
        if (other == emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getCurStamina() != 0F) {
          setCurStamina(other.getCurStamina());
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
              case 85: {
                curStamina_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 85
              case 88: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
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

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {

        entityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        entityId_ = 0;
        onChanged();
        return this;
      }

      private float curStamina_ ;
      /**
       * <code>float cur_stamina = 10;</code>
       * @return The curStamina.
       */
      @java.lang.Override
      public float getCurStamina() {
        return curStamina_;
      }
      /**
       * <code>float cur_stamina = 10;</code>
       * @param value The curStamina to set.
       * @return This builder for chaining.
       */
      public Builder setCurStamina(float value) {

        curStamina_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>float cur_stamina = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurStamina() {
        bitField0_ = (bitField0_ & ~0x00000002);
        curStamina_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:VehicleStaminaNotify)
    }

    // @@protoc_insertion_point(class_scope:VehicleStaminaNotify)
    private static final emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify();
    }

    public static emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VehicleStaminaNotify>
        PARSER = new com.google.protobuf.AbstractParser<VehicleStaminaNotify>() {
      @java.lang.Override
      public VehicleStaminaNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<VehicleStaminaNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VehicleStaminaNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VehicleStaminaNotifyOuterClass.VehicleStaminaNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VehicleStaminaNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VehicleStaminaNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032VehicleStaminaNotify.proto\">\n\024VehicleS" +
      "taminaNotify\022\021\n\tentity_id\030\013 \001(\r\022\023\n\013cur_s" +
      "tamina\030\n \001(\002B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VehicleStaminaNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VehicleStaminaNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VehicleStaminaNotify_descriptor,
        new java.lang.String[] { "EntityId", "CurStamina", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
