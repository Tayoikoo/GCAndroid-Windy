// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CrystalLinkDungeonSettleInfo.proto

package emu.grasscutter.net.proto;

public final class CrystalLinkDungeonSettleInfoOuterClass {
  private CrystalLinkDungeonSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CrystalLinkDungeonSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CrystalLinkDungeonSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 difficulty_id = 4;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();

    /**
     * <code>bool MFGGJPMOMHL = 11;</code>
     * @return The mFGGJPMOMHL.
     */
    boolean getMFGGJPMOMHL();

    /**
     * <code>uint32 DNKNMEGHIIJ = 1;</code>
     * @return The dNKNMEGHIIJ.
     */
    int getDNKNMEGHIIJ();

    /**
     * <code>uint32 level_id = 2;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 GNJHGMHMBDK = 14;</code>
     * @return The gNJHGMHMBDK.
     */
    int getGNJHGMHMBDK();

    /**
     * <code>bool is_new_record = 12;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 final_score = 7;</code>
     * @return The finalScore.
     */
    int getFinalScore();
  }
  /**
   * <pre>
   * Obf: KOGBOGMJFFA
   * </pre>
   *
   * Protobuf type {@code CrystalLinkDungeonSettleInfo}
   */
  public static final class CrystalLinkDungeonSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CrystalLinkDungeonSettleInfo)
      CrystalLinkDungeonSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CrystalLinkDungeonSettleInfo.newBuilder() to construct.
    private CrystalLinkDungeonSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CrystalLinkDungeonSettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CrystalLinkDungeonSettleInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.internal_static_CrystalLinkDungeonSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.internal_static_CrystalLinkDungeonSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.class, emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.Builder.class);
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 4;
    private int difficultyId_ = 0;
    /**
     * <code>uint32 difficulty_id = 4;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
    }

    public static final int MFGGJPMOMHL_FIELD_NUMBER = 11;
    private boolean mFGGJPMOMHL_ = false;
    /**
     * <code>bool MFGGJPMOMHL = 11;</code>
     * @return The mFGGJPMOMHL.
     */
    @java.lang.Override
    public boolean getMFGGJPMOMHL() {
      return mFGGJPMOMHL_;
    }

    public static final int DNKNMEGHIIJ_FIELD_NUMBER = 1;
    private int dNKNMEGHIIJ_ = 0;
    /**
     * <code>uint32 DNKNMEGHIIJ = 1;</code>
     * @return The dNKNMEGHIIJ.
     */
    @java.lang.Override
    public int getDNKNMEGHIIJ() {
      return dNKNMEGHIIJ_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 2;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 2;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int GNJHGMHMBDK_FIELD_NUMBER = 14;
    private int gNJHGMHMBDK_ = 0;
    /**
     * <code>uint32 GNJHGMHMBDK = 14;</code>
     * @return The gNJHGMHMBDK.
     */
    @java.lang.Override
    public int getGNJHGMHMBDK() {
      return gNJHGMHMBDK_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 12;
    private boolean isNewRecord_ = false;
    /**
     * <code>bool is_new_record = 12;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 7;
    private int finalScore_ = 0;
    /**
     * <code>uint32 final_score = 7;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
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
      if (dNKNMEGHIIJ_ != 0) {
        output.writeUInt32(1, dNKNMEGHIIJ_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(2, levelId_);
      }
      if (difficultyId_ != 0) {
        output.writeUInt32(4, difficultyId_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(7, finalScore_);
      }
      if (mFGGJPMOMHL_ != false) {
        output.writeBool(11, mFGGJPMOMHL_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(12, isNewRecord_);
      }
      if (gNJHGMHMBDK_ != 0) {
        output.writeUInt32(14, gNJHGMHMBDK_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dNKNMEGHIIJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, dNKNMEGHIIJ_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, levelId_);
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, difficultyId_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, finalScore_);
      }
      if (mFGGJPMOMHL_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, mFGGJPMOMHL_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isNewRecord_);
      }
      if (gNJHGMHMBDK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, gNJHGMHMBDK_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo other = (emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo) obj;

      if (getDifficultyId()
          != other.getDifficultyId()) return false;
      if (getMFGGJPMOMHL()
          != other.getMFGGJPMOMHL()) return false;
      if (getDNKNMEGHIIJ()
          != other.getDNKNMEGHIIJ()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getGNJHGMHMBDK()
          != other.getGNJHGMHMBDK()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
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
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (37 * hash) + MFGGJPMOMHL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMFGGJPMOMHL());
      hash = (37 * hash) + DNKNMEGHIIJ_FIELD_NUMBER;
      hash = (53 * hash) + getDNKNMEGHIIJ();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + GNJHGMHMBDK_FIELD_NUMBER;
      hash = (53 * hash) + getGNJHGMHMBDK();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo prototype) {
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
     * Obf: KOGBOGMJFFA
     * </pre>
     *
     * Protobuf type {@code CrystalLinkDungeonSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CrystalLinkDungeonSettleInfo)
        emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.internal_static_CrystalLinkDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.internal_static_CrystalLinkDungeonSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.class, emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.newBuilder()
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
        difficultyId_ = 0;
        mFGGJPMOMHL_ = false;
        dNKNMEGHIIJ_ = 0;
        levelId_ = 0;
        gNJHGMHMBDK_ = 0;
        isNewRecord_ = false;
        finalScore_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.internal_static_CrystalLinkDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo build() {
        emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo buildPartial() {
        emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo result = new emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.difficultyId_ = difficultyId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.mFGGJPMOMHL_ = mFGGJPMOMHL_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.dNKNMEGHIIJ_ = dNKNMEGHIIJ_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.gNJHGMHMBDK_ = gNJHGMHMBDK_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.isNewRecord_ = isNewRecord_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.finalScore_ = finalScore_;
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
        if (other instanceof emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo other) {
        if (other == emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo.getDefaultInstance()) return this;
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
        }
        if (other.getMFGGJPMOMHL() != false) {
          setMFGGJPMOMHL(other.getMFGGJPMOMHL());
        }
        if (other.getDNKNMEGHIIJ() != 0) {
          setDNKNMEGHIIJ(other.getDNKNMEGHIIJ());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getGNJHGMHMBDK() != 0) {
          setGNJHGMHMBDK(other.getGNJHGMHMBDK());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
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
                dNKNMEGHIIJ_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 16: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 16
              case 32: {
                difficultyId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 56: {
                finalScore_ = input.readUInt32();
                bitField0_ |= 0x00000040;
                break;
              } // case 56
              case 88: {
                mFGGJPMOMHL_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 96: {
                isNewRecord_ = input.readBool();
                bitField0_ |= 0x00000020;
                break;
              } // case 96
              case 112: {
                gNJHGMHMBDK_ = input.readUInt32();
                bitField0_ |= 0x00000010;
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

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 4;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 4;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {

        difficultyId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        difficultyId_ = 0;
        onChanged();
        return this;
      }

      private boolean mFGGJPMOMHL_ ;
      /**
       * <code>bool MFGGJPMOMHL = 11;</code>
       * @return The mFGGJPMOMHL.
       */
      @java.lang.Override
      public boolean getMFGGJPMOMHL() {
        return mFGGJPMOMHL_;
      }
      /**
       * <code>bool MFGGJPMOMHL = 11;</code>
       * @param value The mFGGJPMOMHL to set.
       * @return This builder for chaining.
       */
      public Builder setMFGGJPMOMHL(boolean value) {

        mFGGJPMOMHL_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool MFGGJPMOMHL = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMFGGJPMOMHL() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mFGGJPMOMHL_ = false;
        onChanged();
        return this;
      }

      private int dNKNMEGHIIJ_ ;
      /**
       * <code>uint32 DNKNMEGHIIJ = 1;</code>
       * @return The dNKNMEGHIIJ.
       */
      @java.lang.Override
      public int getDNKNMEGHIIJ() {
        return dNKNMEGHIIJ_;
      }
      /**
       * <code>uint32 DNKNMEGHIIJ = 1;</code>
       * @param value The dNKNMEGHIIJ to set.
       * @return This builder for chaining.
       */
      public Builder setDNKNMEGHIIJ(int value) {

        dNKNMEGHIIJ_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DNKNMEGHIIJ = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDNKNMEGHIIJ() {
        bitField0_ = (bitField0_ & ~0x00000004);
        dNKNMEGHIIJ_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 2;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 2;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int gNJHGMHMBDK_ ;
      /**
       * <code>uint32 GNJHGMHMBDK = 14;</code>
       * @return The gNJHGMHMBDK.
       */
      @java.lang.Override
      public int getGNJHGMHMBDK() {
        return gNJHGMHMBDK_;
      }
      /**
       * <code>uint32 GNJHGMHMBDK = 14;</code>
       * @param value The gNJHGMHMBDK to set.
       * @return This builder for chaining.
       */
      public Builder setGNJHGMHMBDK(int value) {

        gNJHGMHMBDK_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GNJHGMHMBDK = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGNJHGMHMBDK() {
        bitField0_ = (bitField0_ & ~0x00000010);
        gNJHGMHMBDK_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 12;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 12;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {

        isNewRecord_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        bitField0_ = (bitField0_ & ~0x00000020);
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 7;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 7;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {

        finalScore_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        bitField0_ = (bitField0_ & ~0x00000040);
        finalScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CrystalLinkDungeonSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:CrystalLinkDungeonSettleInfo)
    private static final emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo();
    }

    public static emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CrystalLinkDungeonSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<CrystalLinkDungeonSettleInfo>() {
      @java.lang.Override
      public CrystalLinkDungeonSettleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CrystalLinkDungeonSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CrystalLinkDungeonSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CrystalLinkDungeonSettleInfoOuterClass.CrystalLinkDungeonSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CrystalLinkDungeonSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CrystalLinkDungeonSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"CrystalLinkDungeonSettleInfo.proto\"\262\001\n" +
      "\034CrystalLinkDungeonSettleInfo\022\025\n\rdifficu" +
      "lty_id\030\004 \001(\r\022\023\n\013MFGGJPMOMHL\030\013 \001(\010\022\023\n\013DNK" +
      "NMEGHIIJ\030\001 \001(\r\022\020\n\010level_id\030\002 \001(\r\022\023\n\013GNJH" +
      "GMHMBDK\030\016 \001(\r\022\025\n\ris_new_record\030\014 \001(\010\022\023\n\013" +
      "final_score\030\007 \001(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CrystalLinkDungeonSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CrystalLinkDungeonSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CrystalLinkDungeonSettleInfo_descriptor,
        new java.lang.String[] { "DifficultyId", "MFGGJPMOMHL", "DNKNMEGHIIJ", "LevelId", "GNJHGMHMBDK", "IsNewRecord", "FinalScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
