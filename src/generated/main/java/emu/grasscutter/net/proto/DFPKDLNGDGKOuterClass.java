// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DFPKDLNGDGK.proto

package emu.grasscutter.net.proto;

public final class DFPKDLNGDGKOuterClass {
  private DFPKDLNGDGKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DFPKDLNGDGKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DFPKDLNGDGK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_level_open = 5;</code>
     * @return The isLevelOpen.
     */
    boolean getIsLevelOpen();

    /**
     * <code>uint64 MCAPHJOEKDB = 8;</code>
     * @return The mCAPHJOEKDB.
     */
    long getMCAPHJOEKDB();

    /**
     * <code>uint32 level_id = 3;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 best_score = 6;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>bool is_finished = 11;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();
  }
  /**
   * Protobuf type {@code DFPKDLNGDGK}
   */
  public static final class DFPKDLNGDGK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DFPKDLNGDGK)
      DFPKDLNGDGKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DFPKDLNGDGK.newBuilder() to construct.
    private DFPKDLNGDGK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DFPKDLNGDGK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DFPKDLNGDGK();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.internal_static_DFPKDLNGDGK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.internal_static_DFPKDLNGDGK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK.class, emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK.Builder.class);
    }

    public static final int IS_LEVEL_OPEN_FIELD_NUMBER = 5;
    private boolean isLevelOpen_ = false;
    /**
     * <code>bool is_level_open = 5;</code>
     * @return The isLevelOpen.
     */
    @java.lang.Override
    public boolean getIsLevelOpen() {
      return isLevelOpen_;
    }

    public static final int MCAPHJOEKDB_FIELD_NUMBER = 8;
    private long mCAPHJOEKDB_ = 0L;
    /**
     * <code>uint64 MCAPHJOEKDB = 8;</code>
     * @return The mCAPHJOEKDB.
     */
    @java.lang.Override
    public long getMCAPHJOEKDB() {
      return mCAPHJOEKDB_;
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

    public static final int BEST_SCORE_FIELD_NUMBER = 6;
    private int bestScore_ = 0;
    /**
     * <code>uint32 best_score = 6;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 11;
    private boolean isFinished_ = false;
    /**
     * <code>bool is_finished = 11;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
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
      if (levelId_ != 0) {
        output.writeUInt32(3, levelId_);
      }
      if (isLevelOpen_ != false) {
        output.writeBool(5, isLevelOpen_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(6, bestScore_);
      }
      if (mCAPHJOEKDB_ != 0L) {
        output.writeUInt64(8, mCAPHJOEKDB_);
      }
      if (isFinished_ != false) {
        output.writeBool(11, isFinished_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, levelId_);
      }
      if (isLevelOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isLevelOpen_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, bestScore_);
      }
      if (mCAPHJOEKDB_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, mCAPHJOEKDB_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isFinished_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK other = (emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK) obj;

      if (getIsLevelOpen()
          != other.getIsLevelOpen()) return false;
      if (getMCAPHJOEKDB()
          != other.getMCAPHJOEKDB()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
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
      hash = (37 * hash) + IS_LEVEL_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLevelOpen());
      hash = (37 * hash) + MCAPHJOEKDB_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMCAPHJOEKDB());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK prototype) {
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
     * Protobuf type {@code DFPKDLNGDGK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DFPKDLNGDGK)
        emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.internal_static_DFPKDLNGDGK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.internal_static_DFPKDLNGDGK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK.class, emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK.newBuilder()
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
        isLevelOpen_ = false;
        mCAPHJOEKDB_ = 0L;
        levelId_ = 0;
        bestScore_ = 0;
        isFinished_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.internal_static_DFPKDLNGDGK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK build() {
        emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK buildPartial() {
        emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK result = new emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isLevelOpen_ = isLevelOpen_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.mCAPHJOEKDB_ = mCAPHJOEKDB_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.bestScore_ = bestScore_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.isFinished_ = isFinished_;
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
        if (other instanceof emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK) {
          return mergeFrom((emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK other) {
        if (other == emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK.getDefaultInstance()) return this;
        if (other.getIsLevelOpen() != false) {
          setIsLevelOpen(other.getIsLevelOpen());
        }
        if (other.getMCAPHJOEKDB() != 0L) {
          setMCAPHJOEKDB(other.getMCAPHJOEKDB());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
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
              case 24: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 40: {
                isLevelOpen_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 48: {
                bestScore_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 48
              case 64: {
                mCAPHJOEKDB_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
              case 88: {
                isFinished_ = input.readBool();
                bitField0_ |= 0x00000010;
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

      private boolean isLevelOpen_ ;
      /**
       * <code>bool is_level_open = 5;</code>
       * @return The isLevelOpen.
       */
      @java.lang.Override
      public boolean getIsLevelOpen() {
        return isLevelOpen_;
      }
      /**
       * <code>bool is_level_open = 5;</code>
       * @param value The isLevelOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsLevelOpen(boolean value) {

        isLevelOpen_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_level_open = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLevelOpen() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isLevelOpen_ = false;
        onChanged();
        return this;
      }

      private long mCAPHJOEKDB_ ;
      /**
       * <code>uint64 MCAPHJOEKDB = 8;</code>
       * @return The mCAPHJOEKDB.
       */
      @java.lang.Override
      public long getMCAPHJOEKDB() {
        return mCAPHJOEKDB_;
      }
      /**
       * <code>uint64 MCAPHJOEKDB = 8;</code>
       * @param value The mCAPHJOEKDB to set.
       * @return This builder for chaining.
       */
      public Builder setMCAPHJOEKDB(long value) {

        mCAPHJOEKDB_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 MCAPHJOEKDB = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMCAPHJOEKDB() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mCAPHJOEKDB_ = 0L;
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
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 6;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 6;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {

        bestScore_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        bitField0_ = (bitField0_ & ~0x00000008);
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 11;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 11;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {

        isFinished_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        bitField0_ = (bitField0_ & ~0x00000010);
        isFinished_ = false;
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


      // @@protoc_insertion_point(builder_scope:DFPKDLNGDGK)
    }

    // @@protoc_insertion_point(class_scope:DFPKDLNGDGK)
    private static final emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK();
    }

    public static emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DFPKDLNGDGK>
        PARSER = new com.google.protobuf.AbstractParser<DFPKDLNGDGK>() {
      @java.lang.Override
      public DFPKDLNGDGK parsePartialFrom(
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

    public static com.google.protobuf.Parser<DFPKDLNGDGK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DFPKDLNGDGK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DFPKDLNGDGKOuterClass.DFPKDLNGDGK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DFPKDLNGDGK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DFPKDLNGDGK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DFPKDLNGDGK.proto\"t\n\013DFPKDLNGDGK\022\025\n\ris" +
      "_level_open\030\005 \001(\010\022\023\n\013MCAPHJOEKDB\030\010 \001(\004\022\020" +
      "\n\010level_id\030\003 \001(\r\022\022\n\nbest_score\030\006 \001(\r\022\023\n\013" +
      "is_finished\030\013 \001(\010B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DFPKDLNGDGK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DFPKDLNGDGK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DFPKDLNGDGK_descriptor,
        new java.lang.String[] { "IsLevelOpen", "MCAPHJOEKDB", "LevelId", "BestScore", "IsFinished", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
