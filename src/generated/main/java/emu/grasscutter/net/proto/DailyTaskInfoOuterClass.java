// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DailyTaskInfo.proto

package emu.grasscutter.net.proto;

public final class DailyTaskInfoOuterClass {
  private DailyTaskInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DailyTaskInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DailyTaskInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 daily_task_id = 9;</code>
     * @return The dailyTaskId.
     */
    int getDailyTaskId();

    /**
     * <code>uint32 progress = 11;</code>
     * @return The progress.
     */
    int getProgress();

    /**
     * <code>uint32 finish_progress = 6;</code>
     * @return The finishProgress.
     */
    int getFinishProgress();

    /**
     * <code>bool is_finished = 1;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 reward_id = 12;</code>
     * @return The rewardId.
     */
    int getRewardId();
  }
  /**
   * <pre>
   * Obf: DCPMGKODFKH
   * </pre>
   *
   * Protobuf type {@code DailyTaskInfo}
   */
  public static final class DailyTaskInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DailyTaskInfo)
      DailyTaskInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DailyTaskInfo.newBuilder() to construct.
    private DailyTaskInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DailyTaskInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DailyTaskInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.internal_static_DailyTaskInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.internal_static_DailyTaskInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.class, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder.class);
    }

    public static final int DAILY_TASK_ID_FIELD_NUMBER = 9;
    private int dailyTaskId_ = 0;
    /**
     * <code>uint32 daily_task_id = 9;</code>
     * @return The dailyTaskId.
     */
    @java.lang.Override
    public int getDailyTaskId() {
      return dailyTaskId_;
    }

    public static final int PROGRESS_FIELD_NUMBER = 11;
    private int progress_ = 0;
    /**
     * <code>uint32 progress = 11;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }

    public static final int FINISH_PROGRESS_FIELD_NUMBER = 6;
    private int finishProgress_ = 0;
    /**
     * <code>uint32 finish_progress = 6;</code>
     * @return The finishProgress.
     */
    @java.lang.Override
    public int getFinishProgress() {
      return finishProgress_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 1;
    private boolean isFinished_ = false;
    /**
     * <code>bool is_finished = 1;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int REWARD_ID_FIELD_NUMBER = 12;
    private int rewardId_ = 0;
    /**
     * <code>uint32 reward_id = 12;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
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
      if (isFinished_ != false) {
        output.writeBool(1, isFinished_);
      }
      if (finishProgress_ != 0) {
        output.writeUInt32(6, finishProgress_);
      }
      if (dailyTaskId_ != 0) {
        output.writeUInt32(9, dailyTaskId_);
      }
      if (progress_ != 0) {
        output.writeUInt32(11, progress_);
      }
      if (rewardId_ != 0) {
        output.writeUInt32(12, rewardId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isFinished_);
      }
      if (finishProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, finishProgress_);
      }
      if (dailyTaskId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, dailyTaskId_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, progress_);
      }
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, rewardId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo other = (emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo) obj;

      if (getDailyTaskId()
          != other.getDailyTaskId()) return false;
      if (getProgress()
          != other.getProgress()) return false;
      if (getFinishProgress()
          != other.getFinishProgress()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getRewardId()
          != other.getRewardId()) return false;
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
      hash = (37 * hash) + DAILY_TASK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDailyTaskId();
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (37 * hash) + FINISH_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getFinishProgress();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo prototype) {
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
     * Obf: DCPMGKODFKH
     * </pre>
     *
     * Protobuf type {@code DailyTaskInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DailyTaskInfo)
        emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.internal_static_DailyTaskInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.internal_static_DailyTaskInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.class, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.newBuilder()
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
        dailyTaskId_ = 0;
        progress_ = 0;
        finishProgress_ = 0;
        isFinished_ = false;
        rewardId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.internal_static_DailyTaskInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo build() {
        emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo buildPartial() {
        emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo result = new emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dailyTaskId_ = dailyTaskId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.progress_ = progress_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.finishProgress_ = finishProgress_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isFinished_ = isFinished_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.rewardId_ = rewardId_;
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
        if (other instanceof emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo) {
          return mergeFrom((emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo other) {
        if (other == emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.getDefaultInstance()) return this;
        if (other.getDailyTaskId() != 0) {
          setDailyTaskId(other.getDailyTaskId());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
        }
        if (other.getFinishProgress() != 0) {
          setFinishProgress(other.getFinishProgress());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getRewardId() != 0) {
          setRewardId(other.getRewardId());
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
                isFinished_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 8
              case 48: {
                finishProgress_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 48
              case 72: {
                dailyTaskId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 88: {
                progress_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 96: {
                rewardId_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 96
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

      private int dailyTaskId_ ;
      /**
       * <code>uint32 daily_task_id = 9;</code>
       * @return The dailyTaskId.
       */
      @java.lang.Override
      public int getDailyTaskId() {
        return dailyTaskId_;
      }
      /**
       * <code>uint32 daily_task_id = 9;</code>
       * @param value The dailyTaskId to set.
       * @return This builder for chaining.
       */
      public Builder setDailyTaskId(int value) {

        dailyTaskId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 daily_task_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDailyTaskId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dailyTaskId_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 11;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 11;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {

        progress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        bitField0_ = (bitField0_ & ~0x00000002);
        progress_ = 0;
        onChanged();
        return this;
      }

      private int finishProgress_ ;
      /**
       * <code>uint32 finish_progress = 6;</code>
       * @return The finishProgress.
       */
      @java.lang.Override
      public int getFinishProgress() {
        return finishProgress_;
      }
      /**
       * <code>uint32 finish_progress = 6;</code>
       * @param value The finishProgress to set.
       * @return This builder for chaining.
       */
      public Builder setFinishProgress(int value) {

        finishProgress_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_progress = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishProgress() {
        bitField0_ = (bitField0_ & ~0x00000004);
        finishProgress_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 1;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 1;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {

        isFinished_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 12;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 12;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {

        rewardId_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        rewardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DailyTaskInfo)
    }

    // @@protoc_insertion_point(class_scope:DailyTaskInfo)
    private static final emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo();
    }

    public static emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DailyTaskInfo>
        PARSER = new com.google.protobuf.AbstractParser<DailyTaskInfo>() {
      @java.lang.Override
      public DailyTaskInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<DailyTaskInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DailyTaskInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DailyTaskInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DailyTaskInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023DailyTaskInfo.proto\"y\n\rDailyTaskInfo\022\025" +
      "\n\rdaily_task_id\030\t \001(\r\022\020\n\010progress\030\013 \001(\r\022" +
      "\027\n\017finish_progress\030\006 \001(\r\022\023\n\013is_finished\030" +
      "\001 \001(\010\022\021\n\treward_id\030\014 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DailyTaskInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DailyTaskInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DailyTaskInfo_descriptor,
        new java.lang.String[] { "DailyTaskId", "Progress", "FinishProgress", "IsFinished", "RewardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
