// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InstableSprayDungeonSettleInfo.proto

package emu.grasscutter.net.proto;

public final class InstableSprayDungeonSettleInfoOuterClass {
  private InstableSprayDungeonSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InstableSprayDungeonSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InstableSprayDungeonSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 difficulty = 6;</code>
     * @return The difficulty.
     */
    int getDifficulty();

    /**
     * <code>uint32 stage_id = 1;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool is_new_record = 10;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 round = 4;</code>
     * @return The round.
     */
    int getRound();

    /**
     * <code>repeated uint32 score_list = 8;</code>
     * @return A list containing the scoreList.
     */
    java.util.List<java.lang.Integer> getScoreListList();
    /**
     * <code>repeated uint32 score_list = 8;</code>
     * @return The count of scoreList.
     */
    int getScoreListCount();
    /**
     * <code>repeated uint32 score_list = 8;</code>
     * @param index The index of the element to return.
     * @return The scoreList at the given index.
     */
    int getScoreList(int index);
  }
  /**
   * <pre>
   * Obf: CAMOHBCDHAL
   * </pre>
   *
   * Protobuf type {@code InstableSprayDungeonSettleInfo}
   */
  public static final class InstableSprayDungeonSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InstableSprayDungeonSettleInfo)
      InstableSprayDungeonSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InstableSprayDungeonSettleInfo.newBuilder() to construct.
    private InstableSprayDungeonSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InstableSprayDungeonSettleInfo() {
      scoreList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InstableSprayDungeonSettleInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.internal_static_InstableSprayDungeonSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.internal_static_InstableSprayDungeonSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo.class, emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 11;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 11;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 6;
    private int difficulty_ = 0;
    /**
     * <code>uint32 difficulty = 6;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 1;
    private int stageId_ = 0;
    /**
     * <code>uint32 stage_id = 1;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 10;
    private boolean isNewRecord_ = false;
    /**
     * <code>bool is_new_record = 10;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int ROUND_FIELD_NUMBER = 4;
    private int round_ = 0;
    /**
     * <code>uint32 round = 4;</code>
     * @return The round.
     */
    @java.lang.Override
    public int getRound() {
      return round_;
    }

    public static final int SCORE_LIST_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList scoreList_;
    /**
     * <code>repeated uint32 score_list = 8;</code>
     * @return A list containing the scoreList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getScoreListList() {
      return scoreList_;
    }
    /**
     * <code>repeated uint32 score_list = 8;</code>
     * @return The count of scoreList.
     */
    public int getScoreListCount() {
      return scoreList_.size();
    }
    /**
     * <code>repeated uint32 score_list = 8;</code>
     * @param index The index of the element to return.
     * @return The scoreList at the given index.
     */
    public int getScoreList(int index) {
      return scoreList_.getInt(index);
    }
    private int scoreListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (stageId_ != 0) {
        output.writeUInt32(1, stageId_);
      }
      if (round_ != 0) {
        output.writeUInt32(4, round_);
      }
      if (difficulty_ != 0) {
        output.writeUInt32(6, difficulty_);
      }
      if (getScoreListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(scoreListMemoizedSerializedSize);
      }
      for (int i = 0; i < scoreList_.size(); i++) {
        output.writeUInt32NoTag(scoreList_.getInt(i));
      }
      if (isNewRecord_ != false) {
        output.writeBool(10, isNewRecord_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(11, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, stageId_);
      }
      if (round_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, round_);
      }
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, difficulty_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < scoreList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(scoreList_.getInt(i));
        }
        size += dataSize;
        if (!getScoreListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        scoreListMemoizedSerializedSize = dataSize;
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isNewRecord_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo other = (emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getDifficulty()
          != other.getDifficulty()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getRound()
          != other.getRound()) return false;
      if (!getScoreListList()
          .equals(other.getScoreListList())) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getRound();
      if (getScoreListCount() > 0) {
        hash = (37 * hash) + SCORE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getScoreListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo prototype) {
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
     * Obf: CAMOHBCDHAL
     * </pre>
     *
     * Protobuf type {@code InstableSprayDungeonSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InstableSprayDungeonSettleInfo)
        emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.internal_static_InstableSprayDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.internal_static_InstableSprayDungeonSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo.class, emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo.newBuilder()
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
        levelId_ = 0;
        difficulty_ = 0;
        stageId_ = 0;
        isNewRecord_ = false;
        round_ = 0;
        scoreList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.internal_static_InstableSprayDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo build() {
        emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo buildPartial() {
        emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo result = new emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo result) {
        if (((bitField0_ & 0x00000020) != 0)) {
          scoreList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.scoreList_ = scoreList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.difficulty_ = difficulty_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.stageId_ = stageId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isNewRecord_ = isNewRecord_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.round_ = round_;
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
        if (other instanceof emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo other) {
        if (other == emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getRound() != 0) {
          setRound(other.getRound());
        }
        if (!other.scoreList_.isEmpty()) {
          if (scoreList_.isEmpty()) {
            scoreList_ = other.scoreList_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensureScoreListIsMutable();
            scoreList_.addAll(other.scoreList_);
          }
          onChanged();
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
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 32: {
                round_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 32
              case 48: {
                difficulty_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 64: {
                int v = input.readUInt32();
                ensureScoreListIsMutable();
                scoreList_.addInt(v);
                break;
              } // case 64
              case 66: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureScoreListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  scoreList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 66
              case 80: {
                isNewRecord_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
              case 88: {
                levelId_ = input.readUInt32();
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

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 11;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 11;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 6;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 6;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {

        difficulty_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        bitField0_ = (bitField0_ & ~0x00000002);
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 1;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 1;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {

        stageId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 10;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 10;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {

        isNewRecord_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int round_ ;
      /**
       * <code>uint32 round = 4;</code>
       * @return The round.
       */
      @java.lang.Override
      public int getRound() {
        return round_;
      }
      /**
       * <code>uint32 round = 4;</code>
       * @param value The round to set.
       * @return This builder for chaining.
       */
      public Builder setRound(int value) {

        round_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 round = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRound() {
        bitField0_ = (bitField0_ & ~0x00000010);
        round_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList scoreList_ = emptyIntList();
      private void ensureScoreListIsMutable() {
        if (!((bitField0_ & 0x00000020) != 0)) {
          scoreList_ = mutableCopy(scoreList_);
          bitField0_ |= 0x00000020;
        }
      }
      /**
       * <code>repeated uint32 score_list = 8;</code>
       * @return A list containing the scoreList.
       */
      public java.util.List<java.lang.Integer>
          getScoreListList() {
        return ((bitField0_ & 0x00000020) != 0) ?
                 java.util.Collections.unmodifiableList(scoreList_) : scoreList_;
      }
      /**
       * <code>repeated uint32 score_list = 8;</code>
       * @return The count of scoreList.
       */
      public int getScoreListCount() {
        return scoreList_.size();
      }
      /**
       * <code>repeated uint32 score_list = 8;</code>
       * @param index The index of the element to return.
       * @return The scoreList at the given index.
       */
      public int getScoreList(int index) {
        return scoreList_.getInt(index);
      }
      /**
       * <code>repeated uint32 score_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The scoreList to set.
       * @return This builder for chaining.
       */
      public Builder setScoreList(
          int index, int value) {

        ensureScoreListIsMutable();
        scoreList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 score_list = 8;</code>
       * @param value The scoreList to add.
       * @return This builder for chaining.
       */
      public Builder addScoreList(int value) {

        ensureScoreListIsMutable();
        scoreList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 score_list = 8;</code>
       * @param values The scoreList to add.
       * @return This builder for chaining.
       */
      public Builder addAllScoreList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureScoreListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, scoreList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 score_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearScoreList() {
        scoreList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000020);
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


      // @@protoc_insertion_point(builder_scope:InstableSprayDungeonSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:InstableSprayDungeonSettleInfo)
    private static final emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo();
    }

    public static emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InstableSprayDungeonSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<InstableSprayDungeonSettleInfo>() {
      @java.lang.Override
      public InstableSprayDungeonSettleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<InstableSprayDungeonSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InstableSprayDungeonSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InstableSprayDungeonSettleInfoOuterClass.InstableSprayDungeonSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InstableSprayDungeonSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InstableSprayDungeonSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$InstableSprayDungeonSettleInfo.proto\"\222" +
      "\001\n\036InstableSprayDungeonSettleInfo\022\020\n\010lev" +
      "el_id\030\013 \001(\r\022\022\n\ndifficulty\030\006 \001(\r\022\020\n\010stage" +
      "_id\030\001 \001(\r\022\025\n\ris_new_record\030\n \001(\010\022\r\n\005roun" +
      "d\030\004 \001(\r\022\022\n\nscore_list\030\010 \003(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InstableSprayDungeonSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InstableSprayDungeonSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InstableSprayDungeonSettleInfo_descriptor,
        new java.lang.String[] { "LevelId", "Difficulty", "StageId", "IsNewRecord", "Round", "ScoreList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
