// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeV2LevelData.proto

package emu.grasscutter.net.proto;

public final class EffigyChallengeV2LevelDataOuterClass {
  private EffigyChallengeV2LevelDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeV2LevelDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeV2LevelData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ONCDLGPLMIB = 9;</code>
     * @return The oNCDLGPLMIB.
     */
    int getONCDLGPLMIB();

    /**
     * <code>uint32 level_id = 3;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 ENDDPMODPCG = 14;</code>
     * @return The eNDDPMODPCG.
     */
    int getENDDPMODPCG();

    /**
     * <code>uint32 PHEIGICNDCJ = 8;</code>
     * @return The pHEIGICNDCJ.
     */
    int getPHEIGICNDCJ();

    /**
     * <code>uint32 NNJLOECKLOM = 2;</code>
     * @return The nNJLOECKLOM.
     */
    int getNNJLOECKLOM();

    /**
     * <code>bool is_level_open = 4;</code>
     * @return The isLevelOpen.
     */
    boolean getIsLevelOpen();
  }
  /**
   * <pre>
   * Name: CMPOJMGFCFM
   * </pre>
   *
   * Protobuf type {@code EffigyChallengeV2LevelData}
   */
  public static final class EffigyChallengeV2LevelData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeV2LevelData)
      EffigyChallengeV2LevelDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeV2LevelData.newBuilder() to construct.
    private EffigyChallengeV2LevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeV2LevelData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeV2LevelData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.internal_static_EffigyChallengeV2LevelData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.internal_static_EffigyChallengeV2LevelData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData.class, emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData.Builder.class);
    }

    public static final int ONCDLGPLMIB_FIELD_NUMBER = 9;
    private int oNCDLGPLMIB_ = 0;
    /**
     * <code>uint32 ONCDLGPLMIB = 9;</code>
     * @return The oNCDLGPLMIB.
     */
    @java.lang.Override
    public int getONCDLGPLMIB() {
      return oNCDLGPLMIB_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 3;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 3;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int ENDDPMODPCG_FIELD_NUMBER = 14;
    private int eNDDPMODPCG_ = 0;
    /**
     * <code>uint32 ENDDPMODPCG = 14;</code>
     * @return The eNDDPMODPCG.
     */
    @java.lang.Override
    public int getENDDPMODPCG() {
      return eNDDPMODPCG_;
    }

    public static final int PHEIGICNDCJ_FIELD_NUMBER = 8;
    private int pHEIGICNDCJ_ = 0;
    /**
     * <code>uint32 PHEIGICNDCJ = 8;</code>
     * @return The pHEIGICNDCJ.
     */
    @java.lang.Override
    public int getPHEIGICNDCJ() {
      return pHEIGICNDCJ_;
    }

    public static final int NNJLOECKLOM_FIELD_NUMBER = 2;
    private int nNJLOECKLOM_ = 0;
    /**
     * <code>uint32 NNJLOECKLOM = 2;</code>
     * @return The nNJLOECKLOM.
     */
    @java.lang.Override
    public int getNNJLOECKLOM() {
      return nNJLOECKLOM_;
    }

    public static final int IS_LEVEL_OPEN_FIELD_NUMBER = 4;
    private boolean isLevelOpen_ = false;
    /**
     * <code>bool is_level_open = 4;</code>
     * @return The isLevelOpen.
     */
    @java.lang.Override
    public boolean getIsLevelOpen() {
      return isLevelOpen_;
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
      if (nNJLOECKLOM_ != 0) {
        output.writeUInt32(2, nNJLOECKLOM_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(3, levelId_);
      }
      if (isLevelOpen_ != false) {
        output.writeBool(4, isLevelOpen_);
      }
      if (pHEIGICNDCJ_ != 0) {
        output.writeUInt32(8, pHEIGICNDCJ_);
      }
      if (oNCDLGPLMIB_ != 0) {
        output.writeUInt32(9, oNCDLGPLMIB_);
      }
      if (eNDDPMODPCG_ != 0) {
        output.writeUInt32(14, eNDDPMODPCG_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nNJLOECKLOM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, nNJLOECKLOM_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, levelId_);
      }
      if (isLevelOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isLevelOpen_);
      }
      if (pHEIGICNDCJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, pHEIGICNDCJ_);
      }
      if (oNCDLGPLMIB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, oNCDLGPLMIB_);
      }
      if (eNDDPMODPCG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, eNDDPMODPCG_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData other = (emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData) obj;

      if (getONCDLGPLMIB()
          != other.getONCDLGPLMIB()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getENDDPMODPCG()
          != other.getENDDPMODPCG()) return false;
      if (getPHEIGICNDCJ()
          != other.getPHEIGICNDCJ()) return false;
      if (getNNJLOECKLOM()
          != other.getNNJLOECKLOM()) return false;
      if (getIsLevelOpen()
          != other.getIsLevelOpen()) return false;
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
      hash = (37 * hash) + ONCDLGPLMIB_FIELD_NUMBER;
      hash = (53 * hash) + getONCDLGPLMIB();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + ENDDPMODPCG_FIELD_NUMBER;
      hash = (53 * hash) + getENDDPMODPCG();
      hash = (37 * hash) + PHEIGICNDCJ_FIELD_NUMBER;
      hash = (53 * hash) + getPHEIGICNDCJ();
      hash = (37 * hash) + NNJLOECKLOM_FIELD_NUMBER;
      hash = (53 * hash) + getNNJLOECKLOM();
      hash = (37 * hash) + IS_LEVEL_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLevelOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData prototype) {
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
     * Name: CMPOJMGFCFM
     * </pre>
     *
     * Protobuf type {@code EffigyChallengeV2LevelData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeV2LevelData)
        emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.internal_static_EffigyChallengeV2LevelData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.internal_static_EffigyChallengeV2LevelData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData.class, emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData.newBuilder()
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
        oNCDLGPLMIB_ = 0;
        levelId_ = 0;
        eNDDPMODPCG_ = 0;
        pHEIGICNDCJ_ = 0;
        nNJLOECKLOM_ = 0;
        isLevelOpen_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.internal_static_EffigyChallengeV2LevelData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData build() {
        emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData buildPartial() {
        emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData result = new emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.oNCDLGPLMIB_ = oNCDLGPLMIB_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.eNDDPMODPCG_ = eNDDPMODPCG_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.pHEIGICNDCJ_ = pHEIGICNDCJ_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.nNJLOECKLOM_ = nNJLOECKLOM_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.isLevelOpen_ = isLevelOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData) {
          return mergeFrom((emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData other) {
        if (other == emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData.getDefaultInstance()) return this;
        if (other.getONCDLGPLMIB() != 0) {
          setONCDLGPLMIB(other.getONCDLGPLMIB());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getENDDPMODPCG() != 0) {
          setENDDPMODPCG(other.getENDDPMODPCG());
        }
        if (other.getPHEIGICNDCJ() != 0) {
          setPHEIGICNDCJ(other.getPHEIGICNDCJ());
        }
        if (other.getNNJLOECKLOM() != 0) {
          setNNJLOECKLOM(other.getNNJLOECKLOM());
        }
        if (other.getIsLevelOpen() != false) {
          setIsLevelOpen(other.getIsLevelOpen());
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
              case 16: {
                nNJLOECKLOM_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 16
              case 24: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
              case 32: {
                isLevelOpen_ = input.readBool();
                bitField0_ |= 0x00000020;
                break;
              } // case 32
              case 64: {
                pHEIGICNDCJ_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 64
              case 72: {
                oNCDLGPLMIB_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 112: {
                eNDDPMODPCG_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private int oNCDLGPLMIB_ ;
      /**
       * <code>uint32 ONCDLGPLMIB = 9;</code>
       * @return The oNCDLGPLMIB.
       */
      @java.lang.Override
      public int getONCDLGPLMIB() {
        return oNCDLGPLMIB_;
      }
      /**
       * <code>uint32 ONCDLGPLMIB = 9;</code>
       * @param value The oNCDLGPLMIB to set.
       * @return This builder for chaining.
       */
      public Builder setONCDLGPLMIB(int value) {

        oNCDLGPLMIB_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ONCDLGPLMIB = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearONCDLGPLMIB() {
        bitField0_ = (bitField0_ & ~0x00000001);
        oNCDLGPLMIB_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 3;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 3;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int eNDDPMODPCG_ ;
      /**
       * <code>uint32 ENDDPMODPCG = 14;</code>
       * @return The eNDDPMODPCG.
       */
      @java.lang.Override
      public int getENDDPMODPCG() {
        return eNDDPMODPCG_;
      }
      /**
       * <code>uint32 ENDDPMODPCG = 14;</code>
       * @param value The eNDDPMODPCG to set.
       * @return This builder for chaining.
       */
      public Builder setENDDPMODPCG(int value) {

        eNDDPMODPCG_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ENDDPMODPCG = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearENDDPMODPCG() {
        bitField0_ = (bitField0_ & ~0x00000004);
        eNDDPMODPCG_ = 0;
        onChanged();
        return this;
      }

      private int pHEIGICNDCJ_ ;
      /**
       * <code>uint32 PHEIGICNDCJ = 8;</code>
       * @return The pHEIGICNDCJ.
       */
      @java.lang.Override
      public int getPHEIGICNDCJ() {
        return pHEIGICNDCJ_;
      }
      /**
       * <code>uint32 PHEIGICNDCJ = 8;</code>
       * @param value The pHEIGICNDCJ to set.
       * @return This builder for chaining.
       */
      public Builder setPHEIGICNDCJ(int value) {

        pHEIGICNDCJ_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PHEIGICNDCJ = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPHEIGICNDCJ() {
        bitField0_ = (bitField0_ & ~0x00000008);
        pHEIGICNDCJ_ = 0;
        onChanged();
        return this;
      }

      private int nNJLOECKLOM_ ;
      /**
       * <code>uint32 NNJLOECKLOM = 2;</code>
       * @return The nNJLOECKLOM.
       */
      @java.lang.Override
      public int getNNJLOECKLOM() {
        return nNJLOECKLOM_;
      }
      /**
       * <code>uint32 NNJLOECKLOM = 2;</code>
       * @param value The nNJLOECKLOM to set.
       * @return This builder for chaining.
       */
      public Builder setNNJLOECKLOM(int value) {

        nNJLOECKLOM_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NNJLOECKLOM = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNNJLOECKLOM() {
        bitField0_ = (bitField0_ & ~0x00000010);
        nNJLOECKLOM_ = 0;
        onChanged();
        return this;
      }

      private boolean isLevelOpen_ ;
      /**
       * <code>bool is_level_open = 4;</code>
       * @return The isLevelOpen.
       */
      @java.lang.Override
      public boolean getIsLevelOpen() {
        return isLevelOpen_;
      }
      /**
       * <code>bool is_level_open = 4;</code>
       * @param value The isLevelOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsLevelOpen(boolean value) {

        isLevelOpen_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_level_open = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLevelOpen() {
        bitField0_ = (bitField0_ & ~0x00000020);
        isLevelOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:EffigyChallengeV2LevelData)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeV2LevelData)
    private static final emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData();
    }

    public static emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeV2LevelData>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeV2LevelData>() {
      @java.lang.Override
      public EffigyChallengeV2LevelData parsePartialFrom(
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

    public static com.google.protobuf.Parser<EffigyChallengeV2LevelData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeV2LevelData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EffigyChallengeV2LevelDataOuterClass.EffigyChallengeV2LevelData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeV2LevelData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeV2LevelData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n EffigyChallengeV2LevelData.proto\"\231\001\n\032E" +
      "ffigyChallengeV2LevelData\022\023\n\013ONCDLGPLMIB" +
      "\030\t \001(\r\022\020\n\010level_id\030\003 \001(\r\022\023\n\013ENDDPMODPCG\030" +
      "\016 \001(\r\022\023\n\013PHEIGICNDCJ\030\010 \001(\r\022\023\n\013NNJLOECKLO" +
      "M\030\002 \001(\r\022\025\n\ris_level_open\030\004 \001(\010B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeV2LevelData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeV2LevelData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeV2LevelData_descriptor,
        new java.lang.String[] { "ONCDLGPLMIB", "LevelId", "ENDDPMODPCG", "PHEIGICNDCJ", "NNJLOECKLOM", "IsLevelOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
