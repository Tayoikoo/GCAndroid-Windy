// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueDiaryDungeonRecord.proto

package emu.grasscutter.net.proto;

public final class RogueDiaryDungeonRecordOuterClass {
  private RogueDiaryDungeonRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueDiaryDungeonRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueDiaryDungeonRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 finish_time = 4;</code>
     * @return The finishTime.
     */
    int getFinishTime();

    /**
     * <code>uint32 difficulty = 14;</code>
     * @return The difficulty.
     */
    int getDifficulty();

    /**
     * <code>uint32 max_round = 3;</code>
     * @return The maxRound.
     */
    int getMaxRound();

    /**
     * <code>bool is_finish = 12;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();
  }
  /**
   * <pre>
   * Name: NNAODHDGKBH
   * </pre>
   *
   * Protobuf type {@code RogueDiaryDungeonRecord}
   */
  public static final class RogueDiaryDungeonRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueDiaryDungeonRecord)
      RogueDiaryDungeonRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueDiaryDungeonRecord.newBuilder() to construct.
    private RogueDiaryDungeonRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueDiaryDungeonRecord() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueDiaryDungeonRecord();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.internal_static_RogueDiaryDungeonRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.internal_static_RogueDiaryDungeonRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.class, emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.Builder.class);
    }

    public static final int FINISH_TIME_FIELD_NUMBER = 4;
    private int finishTime_ = 0;
    /**
     * <code>uint32 finish_time = 4;</code>
     * @return The finishTime.
     */
    @java.lang.Override
    public int getFinishTime() {
      return finishTime_;
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 14;
    private int difficulty_ = 0;
    /**
     * <code>uint32 difficulty = 14;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
    }

    public static final int MAX_ROUND_FIELD_NUMBER = 3;
    private int maxRound_ = 0;
    /**
     * <code>uint32 max_round = 3;</code>
     * @return The maxRound.
     */
    @java.lang.Override
    public int getMaxRound() {
      return maxRound_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 12;
    private boolean isFinish_ = false;
    /**
     * <code>bool is_finish = 12;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
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
      if (maxRound_ != 0) {
        output.writeUInt32(3, maxRound_);
      }
      if (finishTime_ != 0) {
        output.writeUInt32(4, finishTime_);
      }
      if (isFinish_ != false) {
        output.writeBool(12, isFinish_);
      }
      if (difficulty_ != 0) {
        output.writeUInt32(14, difficulty_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxRound_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, maxRound_);
      }
      if (finishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, finishTime_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isFinish_);
      }
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, difficulty_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord other = (emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord) obj;

      if (getFinishTime()
          != other.getFinishTime()) return false;
      if (getDifficulty()
          != other.getDifficulty()) return false;
      if (getMaxRound()
          != other.getMaxRound()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
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
      hash = (37 * hash) + FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getFinishTime();
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (37 * hash) + MAX_ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getMaxRound();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord prototype) {
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
     * Name: NNAODHDGKBH
     * </pre>
     *
     * Protobuf type {@code RogueDiaryDungeonRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueDiaryDungeonRecord)
        emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.internal_static_RogueDiaryDungeonRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.internal_static_RogueDiaryDungeonRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.class, emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.newBuilder()
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
        finishTime_ = 0;
        difficulty_ = 0;
        maxRound_ = 0;
        isFinish_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.internal_static_RogueDiaryDungeonRecord_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord build() {
        emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord buildPartial() {
        emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord result = new emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.finishTime_ = finishTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.difficulty_ = difficulty_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.maxRound_ = maxRound_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isFinish_ = isFinish_;
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
        if (other instanceof emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord) {
          return mergeFrom((emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord other) {
        if (other == emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.getDefaultInstance()) return this;
        if (other.getFinishTime() != 0) {
          setFinishTime(other.getFinishTime());
        }
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
        }
        if (other.getMaxRound() != 0) {
          setMaxRound(other.getMaxRound());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
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
                maxRound_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                finishTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 96: {
                isFinish_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 96
              case 112: {
                difficulty_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private int finishTime_ ;
      /**
       * <code>uint32 finish_time = 4;</code>
       * @return The finishTime.
       */
      @java.lang.Override
      public int getFinishTime() {
        return finishTime_;
      }
      /**
       * <code>uint32 finish_time = 4;</code>
       * @param value The finishTime to set.
       * @return This builder for chaining.
       */
      public Builder setFinishTime(int value) {

        finishTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        finishTime_ = 0;
        onChanged();
        return this;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 14;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 14;</code>
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
       * <code>uint32 difficulty = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        bitField0_ = (bitField0_ & ~0x00000002);
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private int maxRound_ ;
      /**
       * <code>uint32 max_round = 3;</code>
       * @return The maxRound.
       */
      @java.lang.Override
      public int getMaxRound() {
        return maxRound_;
      }
      /**
       * <code>uint32 max_round = 3;</code>
       * @param value The maxRound to set.
       * @return This builder for chaining.
       */
      public Builder setMaxRound(int value) {

        maxRound_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_round = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxRound() {
        bitField0_ = (bitField0_ & ~0x00000004);
        maxRound_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 12;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 12;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {

        isFinish_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isFinish_ = false;
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


      // @@protoc_insertion_point(builder_scope:RogueDiaryDungeonRecord)
    }

    // @@protoc_insertion_point(class_scope:RogueDiaryDungeonRecord)
    private static final emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord();
    }

    public static emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueDiaryDungeonRecord>
        PARSER = new com.google.protobuf.AbstractParser<RogueDiaryDungeonRecord>() {
      @java.lang.Override
      public RogueDiaryDungeonRecord parsePartialFrom(
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

    public static com.google.protobuf.Parser<RogueDiaryDungeonRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueDiaryDungeonRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueDiaryDungeonRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueDiaryDungeonRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035RogueDiaryDungeonRecord.proto\"h\n\027Rogue" +
      "DiaryDungeonRecord\022\023\n\013finish_time\030\004 \001(\r\022" +
      "\022\n\ndifficulty\030\016 \001(\r\022\021\n\tmax_round\030\003 \001(\r\022\021" +
      "\n\tis_finish\030\014 \001(\010B\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RogueDiaryDungeonRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueDiaryDungeonRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueDiaryDungeonRecord_descriptor,
        new java.lang.String[] { "FinishTime", "Difficulty", "MaxRound", "IsFinish", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
