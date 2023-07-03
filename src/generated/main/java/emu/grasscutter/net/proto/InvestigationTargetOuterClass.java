// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InvestigationTarget.proto

package emu.grasscutter.net.proto;

public final class InvestigationTargetOuterClass {
  private InvestigationTargetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InvestigationTargetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InvestigationTarget)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 investigation_id = 5;</code>
     * @return The investigationId.
     */
    int getInvestigationId();

    /**
     * <code>.InvestigationTarget.State state = 6;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.InvestigationTarget.State state = 6;</code>
     * @return The state.
     */
    emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State getState();

    /**
     * <code>uint32 progress = 7;</code>
     * @return The progress.
     */
    int getProgress();

    /**
     * <code>uint32 quest_id = 14;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>uint32 total_progress = 11;</code>
     * @return The totalProgress.
     */
    int getTotalProgress();
  }
  /**
   * <pre>
   * Obf: OBIKILBIEGP
   * </pre>
   *
   * Protobuf type {@code InvestigationTarget}
   */
  public static final class InvestigationTarget extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InvestigationTarget)
      InvestigationTargetOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InvestigationTarget.newBuilder() to construct.
    private InvestigationTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InvestigationTarget() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InvestigationTarget();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.class, emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.Builder.class);
    }

    /**
     * <pre>
     * Obf: HBKLOLAACJJ
     * </pre>
     *
     * Protobuf enum {@code InvestigationTarget.State}
     */
    public enum State
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>INVALID = 0;</code>
       */
      INVALID(0),
      /**
       * <code>IN_PROGRESS = 1;</code>
       */
      IN_PROGRESS(1),
      /**
       * <code>COMPLETE = 2;</code>
       */
      COMPLETE(2),
      /**
       * <code>REWARD_TAKEN = 3;</code>
       */
      REWARD_TAKEN(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>INVALID = 0;</code>
       */
      public static final int INVALID_VALUE = 0;
      /**
       * <code>IN_PROGRESS = 1;</code>
       */
      public static final int IN_PROGRESS_VALUE = 1;
      /**
       * <code>COMPLETE = 2;</code>
       */
      public static final int COMPLETE_VALUE = 2;
      /**
       * <code>REWARD_TAKEN = 3;</code>
       */
      public static final int REWARD_TAKEN_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static State valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static State forNumber(int value) {
        switch (value) {
          case 0: return INVALID;
          case 1: return IN_PROGRESS;
          case 2: return COMPLETE;
          case 3: return REWARD_TAKEN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          State> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.getDescriptor().getEnumTypes().get(0);
      }

      private static final State[] VALUES = values();

      public static State valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private State(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:InvestigationTarget.State)
    }

    public static final int INVESTIGATION_ID_FIELD_NUMBER = 5;
    private int investigationId_ = 0;
    /**
     * <code>uint32 investigation_id = 5;</code>
     * @return The investigationId.
     */
    @java.lang.Override
    public int getInvestigationId() {
      return investigationId_;
    }

    public static final int STATE_FIELD_NUMBER = 6;
    private int state_ = 0;
    /**
     * <code>.InvestigationTarget.State state = 6;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.InvestigationTarget.State state = 6;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State getState() {
      emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State result = emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State.forNumber(state_);
      return result == null ? emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State.UNRECOGNIZED : result;
    }

    public static final int PROGRESS_FIELD_NUMBER = 7;
    private int progress_ = 0;
    /**
     * <code>uint32 progress = 7;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }

    public static final int QUEST_ID_FIELD_NUMBER = 14;
    private int questId_ = 0;
    /**
     * <code>uint32 quest_id = 14;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }

    public static final int TOTAL_PROGRESS_FIELD_NUMBER = 11;
    private int totalProgress_ = 0;
    /**
     * <code>uint32 total_progress = 11;</code>
     * @return The totalProgress.
     */
    @java.lang.Override
    public int getTotalProgress() {
      return totalProgress_;
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
      if (investigationId_ != 0) {
        output.writeUInt32(5, investigationId_);
      }
      if (state_ != emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State.INVALID.getNumber()) {
        output.writeEnum(6, state_);
      }
      if (progress_ != 0) {
        output.writeUInt32(7, progress_);
      }
      if (totalProgress_ != 0) {
        output.writeUInt32(11, totalProgress_);
      }
      if (questId_ != 0) {
        output.writeUInt32(14, questId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (investigationId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, investigationId_);
      }
      if (state_ != emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State.INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, state_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, progress_);
      }
      if (totalProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, totalProgress_);
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, questId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget other = (emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget) obj;

      if (getInvestigationId()
          != other.getInvestigationId()) return false;
      if (state_ != other.state_) return false;
      if (getProgress()
          != other.getProgress()) return false;
      if (getQuestId()
          != other.getQuestId()) return false;
      if (getTotalProgress()
          != other.getTotalProgress()) return false;
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
      hash = (37 * hash) + INVESTIGATION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInvestigationId();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (37 * hash) + TOTAL_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalProgress();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget prototype) {
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
     * Obf: OBIKILBIEGP
     * </pre>
     *
     * Protobuf type {@code InvestigationTarget}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InvestigationTarget)
        emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTargetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.class, emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.newBuilder()
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
        investigationId_ = 0;
        state_ = 0;
        progress_ = 0;
        questId_ = 0;
        totalProgress_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InvestigationTargetOuterClass.internal_static_InvestigationTarget_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget build() {
        emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget buildPartial() {
        emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget result = new emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.investigationId_ = investigationId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.state_ = state_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.progress_ = progress_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.questId_ = questId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.totalProgress_ = totalProgress_;
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
        if (other instanceof emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget) {
          return mergeFrom((emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget other) {
        if (other == emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.getDefaultInstance()) return this;
        if (other.getInvestigationId() != 0) {
          setInvestigationId(other.getInvestigationId());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
        }
        if (other.getTotalProgress() != 0) {
          setTotalProgress(other.getTotalProgress());
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
              case 40: {
                investigationId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 48: {
                state_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 56: {
                progress_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
              case 88: {
                totalProgress_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 88
              case 112: {
                questId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
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

      private int investigationId_ ;
      /**
       * <code>uint32 investigation_id = 5;</code>
       * @return The investigationId.
       */
      @java.lang.Override
      public int getInvestigationId() {
        return investigationId_;
      }
      /**
       * <code>uint32 investigation_id = 5;</code>
       * @param value The investigationId to set.
       * @return This builder for chaining.
       */
      public Builder setInvestigationId(int value) {

        investigationId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 investigation_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearInvestigationId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        investigationId_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.InvestigationTarget.State state = 6;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.InvestigationTarget.State state = 6;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        state_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.InvestigationTarget.State state = 6;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State getState() {
        emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State result = emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State.forNumber(state_);
        return result == null ? emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State.UNRECOGNIZED : result;
      }
      /**
       * <code>.InvestigationTarget.State state = 6;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.InvestigationTarget.State state = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000002);
        state_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 7;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 7;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {

        progress_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        bitField0_ = (bitField0_ & ~0x00000004);
        progress_ = 0;
        onChanged();
        return this;
      }

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 14;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 14;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {

        questId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        questId_ = 0;
        onChanged();
        return this;
      }

      private int totalProgress_ ;
      /**
       * <code>uint32 total_progress = 11;</code>
       * @return The totalProgress.
       */
      @java.lang.Override
      public int getTotalProgress() {
        return totalProgress_;
      }
      /**
       * <code>uint32 total_progress = 11;</code>
       * @param value The totalProgress to set.
       * @return This builder for chaining.
       */
      public Builder setTotalProgress(int value) {

        totalProgress_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_progress = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalProgress() {
        bitField0_ = (bitField0_ & ~0x00000010);
        totalProgress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InvestigationTarget)
    }

    // @@protoc_insertion_point(class_scope:InvestigationTarget)
    private static final emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget();
    }

    public static emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InvestigationTarget>
        PARSER = new com.google.protobuf.AbstractParser<InvestigationTarget>() {
      @java.lang.Override
      public InvestigationTarget parsePartialFrom(
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

    public static com.google.protobuf.Parser<InvestigationTarget> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InvestigationTarget> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InvestigationTargetOuterClass.InvestigationTarget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InvestigationTarget_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InvestigationTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031InvestigationTarget.proto\"\335\001\n\023Investig" +
      "ationTarget\022\030\n\020investigation_id\030\005 \001(\r\022)\n" +
      "\005state\030\006 \001(\0162\032.InvestigationTarget.State" +
      "\022\020\n\010progress\030\007 \001(\r\022\020\n\010quest_id\030\016 \001(\r\022\026\n\016" +
      "total_progress\030\013 \001(\r\"E\n\005State\022\013\n\007INVALID" +
      "\020\000\022\017\n\013IN_PROGRESS\020\001\022\014\n\010COMPLETE\020\002\022\020\n\014REW" +
      "ARD_TAKEN\020\003B\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InvestigationTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InvestigationTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InvestigationTarget_descriptor,
        new java.lang.String[] { "InvestigationId", "State", "Progress", "QuestId", "TotalProgress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
