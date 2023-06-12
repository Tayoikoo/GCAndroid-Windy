// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassCurScheduleUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class BattlePassCurScheduleUpdateNotifyOuterClass {
  private BattlePassCurScheduleUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BattlePassCurScheduleUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BattlePassCurScheduleUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.BattlePassSchedule cur_schedule = 7;</code>
     * @return Whether the curSchedule field is set.
     */
    boolean hasCurSchedule();
    /**
     * <code>.BattlePassSchedule cur_schedule = 7;</code>
     * @return The curSchedule.
     */
    emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule();
    /**
     * <code>.BattlePassSchedule cur_schedule = 7;</code>
     */
    emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder();

    /**
     * <code>bool have_cur_schedule = 6;</code>
     * @return The haveCurSchedule.
     */
    boolean getHaveCurSchedule();
  }
  /**
   * <pre>
   * CmdId: 2649
   * Name: NEBFLGBEDBM
   * </pre>
   *
   * Protobuf type {@code BattlePassCurScheduleUpdateNotify}
   */
  public static final class BattlePassCurScheduleUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BattlePassCurScheduleUpdateNotify)
      BattlePassCurScheduleUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BattlePassCurScheduleUpdateNotify.newBuilder() to construct.
    private BattlePassCurScheduleUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BattlePassCurScheduleUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BattlePassCurScheduleUpdateNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.class, emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.Builder.class);
    }

    public static final int CUR_SCHEDULE_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule curSchedule_;
    /**
     * <code>.BattlePassSchedule cur_schedule = 7;</code>
     * @return Whether the curSchedule field is set.
     */
    @java.lang.Override
    public boolean hasCurSchedule() {
      return curSchedule_ != null;
    }
    /**
     * <code>.BattlePassSchedule cur_schedule = 7;</code>
     * @return The curSchedule.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule() {
      return curSchedule_ == null ? emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : curSchedule_;
    }
    /**
     * <code>.BattlePassSchedule cur_schedule = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder() {
      return curSchedule_ == null ? emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : curSchedule_;
    }

    public static final int HAVE_CUR_SCHEDULE_FIELD_NUMBER = 6;
    private boolean haveCurSchedule_ = false;
    /**
     * <code>bool have_cur_schedule = 6;</code>
     * @return The haveCurSchedule.
     */
    @java.lang.Override
    public boolean getHaveCurSchedule() {
      return haveCurSchedule_;
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
      if (haveCurSchedule_ != false) {
        output.writeBool(6, haveCurSchedule_);
      }
      if (curSchedule_ != null) {
        output.writeMessage(7, getCurSchedule());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (haveCurSchedule_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, haveCurSchedule_);
      }
      if (curSchedule_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getCurSchedule());
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
      if (!(obj instanceof emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify other = (emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify) obj;

      if (hasCurSchedule() != other.hasCurSchedule()) return false;
      if (hasCurSchedule()) {
        if (!getCurSchedule()
            .equals(other.getCurSchedule())) return false;
      }
      if (getHaveCurSchedule()
          != other.getHaveCurSchedule()) return false;
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
      if (hasCurSchedule()) {
        hash = (37 * hash) + CUR_SCHEDULE_FIELD_NUMBER;
        hash = (53 * hash) + getCurSchedule().hashCode();
      }
      hash = (37 * hash) + HAVE_CUR_SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHaveCurSchedule());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify prototype) {
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
     * CmdId: 2649
     * Name: NEBFLGBEDBM
     * </pre>
     *
     * Protobuf type {@code BattlePassCurScheduleUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BattlePassCurScheduleUpdateNotify)
        emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.class, emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.newBuilder()
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
        curSchedule_ = null;
        if (curScheduleBuilder_ != null) {
          curScheduleBuilder_.dispose();
          curScheduleBuilder_ = null;
        }
        haveCurSchedule_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify build() {
        emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify result = new emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.curSchedule_ = curScheduleBuilder_ == null
              ? curSchedule_
              : curScheduleBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.haveCurSchedule_ = haveCurSchedule_;
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
        if (other instanceof emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify.getDefaultInstance()) return this;
        if (other.hasCurSchedule()) {
          mergeCurSchedule(other.getCurSchedule());
        }
        if (other.getHaveCurSchedule() != false) {
          setHaveCurSchedule(other.getHaveCurSchedule());
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
              case 48: {
                haveCurSchedule_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 58: {
                input.readMessage(
                    getCurScheduleFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 58
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

      private emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule curSchedule_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.Builder, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder> curScheduleBuilder_;
      /**
       * <code>.BattlePassSchedule cur_schedule = 7;</code>
       * @return Whether the curSchedule field is set.
       */
      public boolean hasCurSchedule() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 7;</code>
       * @return The curSchedule.
       */
      public emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule getCurSchedule() {
        if (curScheduleBuilder_ == null) {
          return curSchedule_ == null ? emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : curSchedule_;
        } else {
          return curScheduleBuilder_.getMessage();
        }
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 7;</code>
       */
      public Builder setCurSchedule(emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule value) {
        if (curScheduleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          curSchedule_ = value;
        } else {
          curScheduleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 7;</code>
       */
      public Builder setCurSchedule(
          emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.Builder builderForValue) {
        if (curScheduleBuilder_ == null) {
          curSchedule_ = builderForValue.build();
        } else {
          curScheduleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 7;</code>
       */
      public Builder mergeCurSchedule(emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule value) {
        if (curScheduleBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            curSchedule_ != null &&
            curSchedule_ != emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance()) {
            getCurScheduleBuilder().mergeFrom(value);
          } else {
            curSchedule_ = value;
          }
        } else {
          curScheduleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 7;</code>
       */
      public Builder clearCurSchedule() {
        bitField0_ = (bitField0_ & ~0x00000001);
        curSchedule_ = null;
        if (curScheduleBuilder_ != null) {
          curScheduleBuilder_.dispose();
          curScheduleBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 7;</code>
       */
      public emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.Builder getCurScheduleBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCurScheduleFieldBuilder().getBuilder();
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 7;</code>
       */
      public emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder getCurScheduleOrBuilder() {
        if (curScheduleBuilder_ != null) {
          return curScheduleBuilder_.getMessageOrBuilder();
        } else {
          return curSchedule_ == null ?
              emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.getDefaultInstance() : curSchedule_;
        }
      }
      /**
       * <code>.BattlePassSchedule cur_schedule = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.Builder, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder> 
          getCurScheduleFieldBuilder() {
        if (curScheduleBuilder_ == null) {
          curScheduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassSchedule.Builder, emu.grasscutter.net.proto.BattlePassScheduleOuterClass.BattlePassScheduleOrBuilder>(
                  getCurSchedule(),
                  getParentForChildren(),
                  isClean());
          curSchedule_ = null;
        }
        return curScheduleBuilder_;
      }

      private boolean haveCurSchedule_ ;
      /**
       * <code>bool have_cur_schedule = 6;</code>
       * @return The haveCurSchedule.
       */
      @java.lang.Override
      public boolean getHaveCurSchedule() {
        return haveCurSchedule_;
      }
      /**
       * <code>bool have_cur_schedule = 6;</code>
       * @param value The haveCurSchedule to set.
       * @return This builder for chaining.
       */
      public Builder setHaveCurSchedule(boolean value) {

        haveCurSchedule_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool have_cur_schedule = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearHaveCurSchedule() {
        bitField0_ = (bitField0_ & ~0x00000002);
        haveCurSchedule_ = false;
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


      // @@protoc_insertion_point(builder_scope:BattlePassCurScheduleUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:BattlePassCurScheduleUpdateNotify)
    private static final emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify();
    }

    public static emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BattlePassCurScheduleUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<BattlePassCurScheduleUpdateNotify>() {
      @java.lang.Override
      public BattlePassCurScheduleUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<BattlePassCurScheduleUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BattlePassCurScheduleUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassCurScheduleUpdateNotifyOuterClass.BattlePassCurScheduleUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BattlePassCurScheduleUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'BattlePassCurScheduleUpdateNotify.prot" +
      "o\032\030BattlePassSchedule.proto\"i\n!BattlePas" +
      "sCurScheduleUpdateNotify\022)\n\014cur_schedule" +
      "\030\007 \001(\0132\023.BattlePassSchedule\022\031\n\021have_cur_" +
      "schedule\030\006 \001(\010B\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BattlePassScheduleOuterClass.getDescriptor(),
        });
    internal_static_BattlePassCurScheduleUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BattlePassCurScheduleUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BattlePassCurScheduleUpdateNotify_descriptor,
        new java.lang.String[] { "CurSchedule", "HaveCurSchedule", });
    emu.grasscutter.net.proto.BattlePassScheduleOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
