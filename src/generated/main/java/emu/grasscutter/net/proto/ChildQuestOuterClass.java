// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChildQuest.proto

package emu.grasscutter.net.proto;

public final class ChildQuestOuterClass {
  private ChildQuestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChildQuestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChildQuest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 state = 1;</code>
     * @return The state.
     */
    int getState();

    /**
     * <code>uint32 quest_id = 11;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>uint32 quest_config_id = 5;</code>
     * @return The questConfigId.
     */
    int getQuestConfigId();
  }
  /**
   * <pre>
   * Obf: PGDIMINOAPM
   * </pre>
   *
   * Protobuf type {@code ChildQuest}
   */
  public static final class ChildQuest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChildQuest)
      ChildQuestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChildQuest.newBuilder() to construct.
    private ChildQuest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChildQuest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChildQuest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChildQuestOuterClass.internal_static_ChildQuest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChildQuestOuterClass.internal_static_ChildQuest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest.class, emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest.Builder.class);
    }

    public static final int STATE_FIELD_NUMBER = 1;
    private int state_ = 0;
    /**
     * <code>uint32 state = 1;</code>
     * @return The state.
     */
    @java.lang.Override
    public int getState() {
      return state_;
    }

    public static final int QUEST_ID_FIELD_NUMBER = 11;
    private int questId_ = 0;
    /**
     * <code>uint32 quest_id = 11;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }

    public static final int QUEST_CONFIG_ID_FIELD_NUMBER = 5;
    private int questConfigId_ = 0;
    /**
     * <code>uint32 quest_config_id = 5;</code>
     * @return The questConfigId.
     */
    @java.lang.Override
    public int getQuestConfigId() {
      return questConfigId_;
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
      if (state_ != 0) {
        output.writeUInt32(1, state_);
      }
      if (questConfigId_ != 0) {
        output.writeUInt32(5, questConfigId_);
      }
      if (questId_ != 0) {
        output.writeUInt32(11, questId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (state_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, state_);
      }
      if (questConfigId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, questConfigId_);
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, questId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest other = (emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest) obj;

      if (getState()
          != other.getState()) return false;
      if (getQuestId()
          != other.getQuestId()) return false;
      if (getQuestConfigId()
          != other.getQuestConfigId()) return false;
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
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState();
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (37 * hash) + QUEST_CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestConfigId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest prototype) {
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
     * Obf: PGDIMINOAPM
     * </pre>
     *
     * Protobuf type {@code ChildQuest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChildQuest)
        emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChildQuestOuterClass.internal_static_ChildQuest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChildQuestOuterClass.internal_static_ChildQuest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest.class, emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest.newBuilder()
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
        state_ = 0;
        questId_ = 0;
        questConfigId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChildQuestOuterClass.internal_static_ChildQuest_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest build() {
        emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest buildPartial() {
        emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest result = new emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.state_ = state_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.questId_ = questId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.questConfigId_ = questConfigId_;
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
        if (other instanceof emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest) {
          return mergeFrom((emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest other) {
        if (other == emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest.getDefaultInstance()) return this;
        if (other.getState() != 0) {
          setState(other.getState());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
        }
        if (other.getQuestConfigId() != 0) {
          setQuestConfigId(other.getQuestConfigId());
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
                state_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 40: {
                questConfigId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 88: {
                questId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private int state_ ;
      /**
       * <code>uint32 state = 1;</code>
       * @return The state.
       */
      @java.lang.Override
      public int getState() {
        return state_;
      }
      /**
       * <code>uint32 state = 1;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(int value) {

        state_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 state = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = 0;
        onChanged();
        return this;
      }

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 11;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 11;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {

        questId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        questId_ = 0;
        onChanged();
        return this;
      }

      private int questConfigId_ ;
      /**
       * <code>uint32 quest_config_id = 5;</code>
       * @return The questConfigId.
       */
      @java.lang.Override
      public int getQuestConfigId() {
        return questConfigId_;
      }
      /**
       * <code>uint32 quest_config_id = 5;</code>
       * @param value The questConfigId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestConfigId(int value) {

        questConfigId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_config_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestConfigId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        questConfigId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChildQuest)
    }

    // @@protoc_insertion_point(class_scope:ChildQuest)
    private static final emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest();
    }

    public static emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChildQuest>
        PARSER = new com.google.protobuf.AbstractParser<ChildQuest>() {
      @java.lang.Override
      public ChildQuest parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChildQuest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChildQuest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChildQuestOuterClass.ChildQuest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChildQuest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChildQuest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020ChildQuest.proto\"F\n\nChildQuest\022\r\n\005stat" +
      "e\030\001 \001(\r\022\020\n\010quest_id\030\013 \001(\r\022\027\n\017quest_confi" +
      "g_id\030\005 \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChildQuest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChildQuest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChildQuest_descriptor,
        new java.lang.String[] { "State", "QuestId", "QuestConfigId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
