// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoutePointChangeInfo.proto

package emu.grasscutter.net.proto;

public final class RoutePointChangeInfoOuterClass {
  private RoutePointChangeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoutePointChangeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoutePointChangeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float target_velocity = 5;</code>
     * @return The targetVelocity.
     */
    float getTargetVelocity();

    /**
     * <code>uint32 point_index = 7;</code>
     * @return The pointIndex.
     */
    int getPointIndex();

    /**
     * <code>float wait_time = 15;</code>
     * @return The waitTime.
     */
    float getWaitTime();
  }
  /**
   * <pre>
   * Name: GAPHHKJNLCG
   * </pre>
   *
   * Protobuf type {@code RoutePointChangeInfo}
   */
  public static final class RoutePointChangeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoutePointChangeInfo)
      RoutePointChangeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoutePointChangeInfo.newBuilder() to construct.
    private RoutePointChangeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoutePointChangeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoutePointChangeInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.class, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder.class);
    }

    public static final int TARGET_VELOCITY_FIELD_NUMBER = 5;
    private float targetVelocity_ = 0F;
    /**
     * <code>float target_velocity = 5;</code>
     * @return The targetVelocity.
     */
    @java.lang.Override
    public float getTargetVelocity() {
      return targetVelocity_;
    }

    public static final int POINT_INDEX_FIELD_NUMBER = 7;
    private int pointIndex_ = 0;
    /**
     * <code>uint32 point_index = 7;</code>
     * @return The pointIndex.
     */
    @java.lang.Override
    public int getPointIndex() {
      return pointIndex_;
    }

    public static final int WAIT_TIME_FIELD_NUMBER = 15;
    private float waitTime_ = 0F;
    /**
     * <code>float wait_time = 15;</code>
     * @return The waitTime.
     */
    @java.lang.Override
    public float getWaitTime() {
      return waitTime_;
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
      if (java.lang.Float.floatToRawIntBits(targetVelocity_) != 0) {
        output.writeFloat(5, targetVelocity_);
      }
      if (pointIndex_ != 0) {
        output.writeUInt32(7, pointIndex_);
      }
      if (java.lang.Float.floatToRawIntBits(waitTime_) != 0) {
        output.writeFloat(15, waitTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(targetVelocity_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, targetVelocity_);
      }
      if (pointIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, pointIndex_);
      }
      if (java.lang.Float.floatToRawIntBits(waitTime_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(15, waitTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo other = (emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo) obj;

      if (java.lang.Float.floatToIntBits(getTargetVelocity())
          != java.lang.Float.floatToIntBits(
              other.getTargetVelocity())) return false;
      if (getPointIndex()
          != other.getPointIndex()) return false;
      if (java.lang.Float.floatToIntBits(getWaitTime())
          != java.lang.Float.floatToIntBits(
              other.getWaitTime())) return false;
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
      hash = (37 * hash) + TARGET_VELOCITY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getTargetVelocity());
      hash = (37 * hash) + POINT_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getPointIndex();
      hash = (37 * hash) + WAIT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getWaitTime());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo prototype) {
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
     * Name: GAPHHKJNLCG
     * </pre>
     *
     * Protobuf type {@code RoutePointChangeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoutePointChangeInfo)
        emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.class, emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.newBuilder()
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
        targetVelocity_ = 0F;
        pointIndex_ = 0;
        waitTime_ = 0F;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.internal_static_RoutePointChangeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo build() {
        emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo buildPartial() {
        emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo result = new emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.targetVelocity_ = targetVelocity_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.pointIndex_ = pointIndex_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.waitTime_ = waitTime_;
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
        if (other instanceof emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo other) {
        if (other == emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo.getDefaultInstance()) return this;
        if (other.getTargetVelocity() != 0F) {
          setTargetVelocity(other.getTargetVelocity());
        }
        if (other.getPointIndex() != 0) {
          setPointIndex(other.getPointIndex());
        }
        if (other.getWaitTime() != 0F) {
          setWaitTime(other.getWaitTime());
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
              case 45: {
                targetVelocity_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 45
              case 56: {
                pointIndex_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 125: {
                waitTime_ = input.readFloat();
                bitField0_ |= 0x00000004;
                break;
              } // case 125
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

      private float targetVelocity_ ;
      /**
       * <code>float target_velocity = 5;</code>
       * @return The targetVelocity.
       */
      @java.lang.Override
      public float getTargetVelocity() {
        return targetVelocity_;
      }
      /**
       * <code>float target_velocity = 5;</code>
       * @param value The targetVelocity to set.
       * @return This builder for chaining.
       */
      public Builder setTargetVelocity(float value) {

        targetVelocity_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>float target_velocity = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetVelocity() {
        bitField0_ = (bitField0_ & ~0x00000001);
        targetVelocity_ = 0F;
        onChanged();
        return this;
      }

      private int pointIndex_ ;
      /**
       * <code>uint32 point_index = 7;</code>
       * @return The pointIndex.
       */
      @java.lang.Override
      public int getPointIndex() {
        return pointIndex_;
      }
      /**
       * <code>uint32 point_index = 7;</code>
       * @param value The pointIndex to set.
       * @return This builder for chaining.
       */
      public Builder setPointIndex(int value) {

        pointIndex_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_index = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pointIndex_ = 0;
        onChanged();
        return this;
      }

      private float waitTime_ ;
      /**
       * <code>float wait_time = 15;</code>
       * @return The waitTime.
       */
      @java.lang.Override
      public float getWaitTime() {
        return waitTime_;
      }
      /**
       * <code>float wait_time = 15;</code>
       * @param value The waitTime to set.
       * @return This builder for chaining.
       */
      public Builder setWaitTime(float value) {

        waitTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>float wait_time = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearWaitTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        waitTime_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:RoutePointChangeInfo)
    }

    // @@protoc_insertion_point(class_scope:RoutePointChangeInfo)
    private static final emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo();
    }

    public static emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoutePointChangeInfo>
        PARSER = new com.google.protobuf.AbstractParser<RoutePointChangeInfo>() {
      @java.lang.Override
      public RoutePointChangeInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<RoutePointChangeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoutePointChangeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RoutePointChangeInfoOuterClass.RoutePointChangeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoutePointChangeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoutePointChangeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032RoutePointChangeInfo.proto\"W\n\024RoutePoi" +
      "ntChangeInfo\022\027\n\017target_velocity\030\005 \001(\002\022\023\n" +
      "\013point_index\030\007 \001(\r\022\021\n\twait_time\030\017 \001(\002B\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoutePointChangeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoutePointChangeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoutePointChangeInfo_descriptor,
        new java.lang.String[] { "TargetVelocity", "PointIndex", "WaitTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
