// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityScheduleInfo.proto

package emu.grasscutter.net.proto;

public final class ActivityScheduleInfoOuterClass {
  private ActivityScheduleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityScheduleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityScheduleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 begin_time = 2;</code>
     * @return The beginTime.
     */
    int getBeginTime();

    /**
     * <code>uint32 activity_id = 7;</code>
     * @return The activityId.
     */
    int getActivityId();

    /**
     * <code>uint32 end_time = 11;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>uint32 schedule_id = 4;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>bool is_open = 6;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * Name: GFDPEELJAFP
   * </pre>
   *
   * Protobuf type {@code ActivityScheduleInfo}
   */
  public static final class ActivityScheduleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityScheduleInfo)
      ActivityScheduleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityScheduleInfo.newBuilder() to construct.
    private ActivityScheduleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityScheduleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityScheduleInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.internal_static_ActivityScheduleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.internal_static_ActivityScheduleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.class, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder.class);
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 2;
    private int beginTime_ = 0;
    /**
     * <code>uint32 begin_time = 2;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 7;
    private int activityId_ = 0;
    /**
     * <code>uint32 activity_id = 7;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    public static final int END_TIME_FIELD_NUMBER = 11;
    private int endTime_ = 0;
    /**
     * <code>uint32 end_time = 11;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 4;
    private int scheduleId_ = 0;
    /**
     * <code>uint32 schedule_id = 4;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 6;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 6;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (beginTime_ != 0) {
        output.writeUInt32(2, beginTime_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(4, scheduleId_);
      }
      if (isOpen_ != false) {
        output.writeBool(6, isOpen_);
      }
      if (activityId_ != 0) {
        output.writeUInt32(7, activityId_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(11, endTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (beginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, beginTime_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, scheduleId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isOpen_);
      }
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, activityId_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, endTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo other = (emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo) obj;

      if (getBeginTime()
          != other.getBeginTime()) return false;
      if (getActivityId()
          != other.getActivityId()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBeginTime();
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo prototype) {
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
     * Name: GFDPEELJAFP
     * </pre>
     *
     * Protobuf type {@code ActivityScheduleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityScheduleInfo)
        emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.internal_static_ActivityScheduleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.internal_static_ActivityScheduleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.class, emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.newBuilder()
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
        beginTime_ = 0;
        activityId_ = 0;
        endTime_ = 0;
        scheduleId_ = 0;
        isOpen_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.internal_static_ActivityScheduleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo build() {
        emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo buildPartial() {
        emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo result = new emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.beginTime_ = beginTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.activityId_ = activityId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.endTime_ = endTime_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.scheduleId_ = scheduleId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo other) {
        if (other == emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo.getDefaultInstance()) return this;
        if (other.getBeginTime() != 0) {
          setBeginTime(other.getBeginTime());
        }
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
                beginTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 32: {
                scheduleId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 48: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 48
              case 56: {
                activityId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 88: {
                endTime_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private int beginTime_ ;
      /**
       * <code>uint32 begin_time = 2;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public int getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint32 begin_time = 2;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(int value) {

        beginTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        beginTime_ = 0;
        onChanged();
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 7;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 7;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {

        activityId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        activityId_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 11;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 11;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {

        endTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 4;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 4;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {

        scheduleId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 6;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 6;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {

        isOpen_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000010);
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:ActivityScheduleInfo)
    }

    // @@protoc_insertion_point(class_scope:ActivityScheduleInfo)
    private static final emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo();
    }

    public static emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityScheduleInfo>
        PARSER = new com.google.protobuf.AbstractParser<ActivityScheduleInfo>() {
      @java.lang.Override
      public ActivityScheduleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ActivityScheduleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityScheduleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityScheduleInfoOuterClass.ActivityScheduleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityScheduleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityScheduleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ActivityScheduleInfo.proto\"w\n\024Activity" +
      "ScheduleInfo\022\022\n\nbegin_time\030\002 \001(\r\022\023\n\013acti" +
      "vity_id\030\007 \001(\r\022\020\n\010end_time\030\013 \001(\r\022\023\n\013sched" +
      "ule_id\030\004 \001(\r\022\017\n\007is_open\030\006 \001(\010B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityScheduleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityScheduleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityScheduleInfo_descriptor,
        new java.lang.String[] { "BeginTime", "ActivityId", "EndTime", "ScheduleId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
