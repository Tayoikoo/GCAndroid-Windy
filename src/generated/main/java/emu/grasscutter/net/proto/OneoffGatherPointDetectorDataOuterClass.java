// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OneoffGatherPointDetectorData.proto

package emu.grasscutter.net.proto;

public final class OneoffGatherPointDetectorDataOuterClass {
  private OneoffGatherPointDetectorDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OneoffGatherPointDetectorDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OneoffGatherPointDetectorData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 config_id = 11;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>bool is_all_collected = 9;</code>
     * @return The isAllCollected.
     */
    boolean getIsAllCollected();

    /**
     * <code>uint32 group_id = 10;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>bool is_hint_valid = 4;</code>
     * @return The isHintValid.
     */
    boolean getIsHintValid();

    /**
     * <code>.Vector hint_center_pos = 3;</code>
     * @return Whether the hintCenterPos field is set.
     */
    boolean hasHintCenterPos();
    /**
     * <code>.Vector hint_center_pos = 3;</code>
     * @return The hintCenterPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getHintCenterPos();
    /**
     * <code>.Vector hint_center_pos = 3;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder();

    /**
     * <code>uint32 hint_radius = 8;</code>
     * @return The hintRadius.
     */
    int getHintRadius();

    /**
     * <code>uint32 material_id = 13;</code>
     * @return The materialId.
     */
    int getMaterialId();
  }
  /**
   * <pre>
   * Obf: LPLOENMNIOC
   * </pre>
   *
   * Protobuf type {@code OneoffGatherPointDetectorData}
   */
  public static final class OneoffGatherPointDetectorData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OneoffGatherPointDetectorData)
      OneoffGatherPointDetectorDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OneoffGatherPointDetectorData.newBuilder() to construct.
    private OneoffGatherPointDetectorData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OneoffGatherPointDetectorData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OneoffGatherPointDetectorData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.internal_static_OneoffGatherPointDetectorData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.internal_static_OneoffGatherPointDetectorData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.class, emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder.class);
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 11;
    private int configId_ = 0;
    /**
     * <code>uint32 config_id = 11;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int IS_ALL_COLLECTED_FIELD_NUMBER = 9;
    private boolean isAllCollected_ = false;
    /**
     * <code>bool is_all_collected = 9;</code>
     * @return The isAllCollected.
     */
    @java.lang.Override
    public boolean getIsAllCollected() {
      return isAllCollected_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 10;
    private int groupId_ = 0;
    /**
     * <code>uint32 group_id = 10;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int IS_HINT_VALID_FIELD_NUMBER = 4;
    private boolean isHintValid_ = false;
    /**
     * <code>bool is_hint_valid = 4;</code>
     * @return The isHintValid.
     */
    @java.lang.Override
    public boolean getIsHintValid() {
      return isHintValid_;
    }

    public static final int HINT_CENTER_POS_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector hintCenterPos_;
    /**
     * <code>.Vector hint_center_pos = 3;</code>
     * @return Whether the hintCenterPos field is set.
     */
    @java.lang.Override
    public boolean hasHintCenterPos() {
      return hintCenterPos_ != null;
    }
    /**
     * <code>.Vector hint_center_pos = 3;</code>
     * @return The hintCenterPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getHintCenterPos() {
      return hintCenterPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
    }
    /**
     * <code>.Vector hint_center_pos = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
      return hintCenterPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
    }

    public static final int HINT_RADIUS_FIELD_NUMBER = 8;
    private int hintRadius_ = 0;
    /**
     * <code>uint32 hint_radius = 8;</code>
     * @return The hintRadius.
     */
    @java.lang.Override
    public int getHintRadius() {
      return hintRadius_;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 13;
    private int materialId_ = 0;
    /**
     * <code>uint32 material_id = 13;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
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
      if (hintCenterPos_ != null) {
        output.writeMessage(3, getHintCenterPos());
      }
      if (isHintValid_ != false) {
        output.writeBool(4, isHintValid_);
      }
      if (hintRadius_ != 0) {
        output.writeUInt32(8, hintRadius_);
      }
      if (isAllCollected_ != false) {
        output.writeBool(9, isAllCollected_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(10, groupId_);
      }
      if (configId_ != 0) {
        output.writeUInt32(11, configId_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(13, materialId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hintCenterPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getHintCenterPos());
      }
      if (isHintValid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isHintValid_);
      }
      if (hintRadius_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, hintRadius_);
      }
      if (isAllCollected_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isAllCollected_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, groupId_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, configId_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, materialId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData other = (emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData) obj;

      if (getConfigId()
          != other.getConfigId()) return false;
      if (getIsAllCollected()
          != other.getIsAllCollected()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getIsHintValid()
          != other.getIsHintValid()) return false;
      if (hasHintCenterPos() != other.hasHintCenterPos()) return false;
      if (hasHintCenterPos()) {
        if (!getHintCenterPos()
            .equals(other.getHintCenterPos())) return false;
      }
      if (getHintRadius()
          != other.getHintRadius()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
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
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + IS_ALL_COLLECTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllCollected());
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + IS_HINT_VALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHintValid());
      if (hasHintCenterPos()) {
        hash = (37 * hash) + HINT_CENTER_POS_FIELD_NUMBER;
        hash = (53 * hash) + getHintCenterPos().hashCode();
      }
      hash = (37 * hash) + HINT_RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + getHintRadius();
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData prototype) {
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
     * Obf: LPLOENMNIOC
     * </pre>
     *
     * Protobuf type {@code OneoffGatherPointDetectorData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OneoffGatherPointDetectorData)
        emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.internal_static_OneoffGatherPointDetectorData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.internal_static_OneoffGatherPointDetectorData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.class, emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.newBuilder()
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
        configId_ = 0;
        isAllCollected_ = false;
        groupId_ = 0;
        isHintValid_ = false;
        hintCenterPos_ = null;
        if (hintCenterPosBuilder_ != null) {
          hintCenterPosBuilder_.dispose();
          hintCenterPosBuilder_ = null;
        }
        hintRadius_ = 0;
        materialId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.internal_static_OneoffGatherPointDetectorData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData build() {
        emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData buildPartial() {
        emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData result = new emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.configId_ = configId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isAllCollected_ = isAllCollected_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.groupId_ = groupId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isHintValid_ = isHintValid_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.hintCenterPos_ = hintCenterPosBuilder_ == null
              ? hintCenterPos_
              : hintCenterPosBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.hintRadius_ = hintRadius_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.materialId_ = materialId_;
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
        if (other instanceof emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData) {
          return mergeFrom((emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData other) {
        if (other == emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.getDefaultInstance()) return this;
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getIsAllCollected() != false) {
          setIsAllCollected(other.getIsAllCollected());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getIsHintValid() != false) {
          setIsHintValid(other.getIsHintValid());
        }
        if (other.hasHintCenterPos()) {
          mergeHintCenterPos(other.getHintCenterPos());
        }
        if (other.getHintRadius() != 0) {
          setHintRadius(other.getHintRadius());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
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
              case 26: {
                input.readMessage(
                    getHintCenterPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000010;
                break;
              } // case 26
              case 32: {
                isHintValid_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 64: {
                hintRadius_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 64
              case 72: {
                isAllCollected_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 80: {
                groupId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 80
              case 88: {
                configId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
              case 104: {
                materialId_ = input.readUInt32();
                bitField0_ |= 0x00000040;
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

      private int configId_ ;
      /**
       * <code>uint32 config_id = 11;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 11;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {

        configId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        configId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAllCollected_ ;
      /**
       * <code>bool is_all_collected = 9;</code>
       * @return The isAllCollected.
       */
      @java.lang.Override
      public boolean getIsAllCollected() {
        return isAllCollected_;
      }
      /**
       * <code>bool is_all_collected = 9;</code>
       * @param value The isAllCollected to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllCollected(boolean value) {

        isAllCollected_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_all_collected = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllCollected() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isAllCollected_ = false;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 10;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 10;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {

        groupId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        groupId_ = 0;
        onChanged();
        return this;
      }

      private boolean isHintValid_ ;
      /**
       * <code>bool is_hint_valid = 4;</code>
       * @return The isHintValid.
       */
      @java.lang.Override
      public boolean getIsHintValid() {
        return isHintValid_;
      }
      /**
       * <code>bool is_hint_valid = 4;</code>
       * @param value The isHintValid to set.
       * @return This builder for chaining.
       */
      public Builder setIsHintValid(boolean value) {

        isHintValid_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_hint_valid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHintValid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isHintValid_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector hintCenterPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> hintCenterPosBuilder_;
      /**
       * <code>.Vector hint_center_pos = 3;</code>
       * @return Whether the hintCenterPos field is set.
       */
      public boolean hasHintCenterPos() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>.Vector hint_center_pos = 3;</code>
       * @return The hintCenterPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getHintCenterPos() {
        if (hintCenterPosBuilder_ == null) {
          return hintCenterPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        } else {
          return hintCenterPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector hint_center_pos = 3;</code>
       */
      public Builder setHintCenterPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hintCenterPos_ = value;
        } else {
          hintCenterPosBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 3;</code>
       */
      public Builder setHintCenterPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = builderForValue.build();
        } else {
          hintCenterPosBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 3;</code>
       */
      public Builder mergeHintCenterPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0) &&
            hintCenterPos_ != null &&
            hintCenterPos_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getHintCenterPosBuilder().mergeFrom(value);
          } else {
            hintCenterPos_ = value;
          }
        } else {
          hintCenterPosBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 3;</code>
       */
      public Builder clearHintCenterPos() {
        bitField0_ = (bitField0_ & ~0x00000010);
        hintCenterPos_ = null;
        if (hintCenterPosBuilder_ != null) {
          hintCenterPosBuilder_.dispose();
          hintCenterPosBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getHintCenterPosBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getHintCenterPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector hint_center_pos = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
        if (hintCenterPosBuilder_ != null) {
          return hintCenterPosBuilder_.getMessageOrBuilder();
        } else {
          return hintCenterPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        }
      }
      /**
       * <code>.Vector hint_center_pos = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getHintCenterPosFieldBuilder() {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getHintCenterPos(),
                  getParentForChildren(),
                  isClean());
          hintCenterPos_ = null;
        }
        return hintCenterPosBuilder_;
      }

      private int hintRadius_ ;
      /**
       * <code>uint32 hint_radius = 8;</code>
       * @return The hintRadius.
       */
      @java.lang.Override
      public int getHintRadius() {
        return hintRadius_;
      }
      /**
       * <code>uint32 hint_radius = 8;</code>
       * @param value The hintRadius to set.
       * @return This builder for chaining.
       */
      public Builder setHintRadius(int value) {

        hintRadius_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hint_radius = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearHintRadius() {
        bitField0_ = (bitField0_ & ~0x00000020);
        hintRadius_ = 0;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 13;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 13;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {

        materialId_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        bitField0_ = (bitField0_ & ~0x00000040);
        materialId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OneoffGatherPointDetectorData)
    }

    // @@protoc_insertion_point(class_scope:OneoffGatherPointDetectorData)
    private static final emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData();
    }

    public static emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OneoffGatherPointDetectorData>
        PARSER = new com.google.protobuf.AbstractParser<OneoffGatherPointDetectorData>() {
      @java.lang.Override
      public OneoffGatherPointDetectorData parsePartialFrom(
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

    public static com.google.protobuf.Parser<OneoffGatherPointDetectorData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OneoffGatherPointDetectorData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OneoffGatherPointDetectorData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OneoffGatherPointDetectorData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#OneoffGatherPointDetectorData.proto\032\014V" +
      "ector.proto\"\301\001\n\035OneoffGatherPointDetecto" +
      "rData\022\021\n\tconfig_id\030\013 \001(\r\022\030\n\020is_all_colle" +
      "cted\030\t \001(\010\022\020\n\010group_id\030\n \001(\r\022\025\n\ris_hint_" +
      "valid\030\004 \001(\010\022 \n\017hint_center_pos\030\003 \001(\0132\007.V" +
      "ector\022\023\n\013hint_radius\030\010 \001(\r\022\023\n\013material_i" +
      "d\030\r \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_OneoffGatherPointDetectorData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OneoffGatherPointDetectorData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OneoffGatherPointDetectorData_descriptor,
        new java.lang.String[] { "ConfigId", "IsAllCollected", "GroupId", "IsHintValid", "HintCenterPos", "HintRadius", "MaterialId", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
