// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeaLampV3RaceLevelInfo.proto

package emu.grasscutter.net.proto;

public final class SeaLampV3RaceLevelInfoOuterClass {
  private SeaLampV3RaceLevelInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SeaLampV3RaceLevelInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SeaLampV3RaceLevelInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_score = 10;</code>
     * @return The maxScore.
     */
    int getMaxScore();

    /**
     * <code>uint32 level_id = 1;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * <pre>
   * Name: PNKEEJMOCCM
   * </pre>
   *
   * Protobuf type {@code SeaLampV3RaceLevelInfo}
   */
  public static final class SeaLampV3RaceLevelInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SeaLampV3RaceLevelInfo)
      SeaLampV3RaceLevelInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SeaLampV3RaceLevelInfo.newBuilder() to construct.
    private SeaLampV3RaceLevelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SeaLampV3RaceLevelInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SeaLampV3RaceLevelInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.internal_static_SeaLampV3RaceLevelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.internal_static_SeaLampV3RaceLevelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo.class, emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo.Builder.class);
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 10;
    private int maxScore_ = 0;
    /**
     * <code>uint32 max_score = 10;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 1;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 1;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 5;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 5;</code>
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
      if (levelId_ != 0) {
        output.writeUInt32(1, levelId_);
      }
      if (isOpen_ != false) {
        output.writeBool(5, isOpen_);
      }
      if (maxScore_ != 0) {
        output.writeUInt32(10, maxScore_);
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
          .computeUInt32Size(1, levelId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isOpen_);
      }
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, maxScore_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo other = (emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo) obj;

      if (getMaxScore()
          != other.getMaxScore()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo prototype) {
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
     * Name: PNKEEJMOCCM
     * </pre>
     *
     * Protobuf type {@code SeaLampV3RaceLevelInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SeaLampV3RaceLevelInfo)
        emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.internal_static_SeaLampV3RaceLevelInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.internal_static_SeaLampV3RaceLevelInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo.class, emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo.newBuilder()
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
        maxScore_ = 0;
        levelId_ = 0;
        isOpen_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.internal_static_SeaLampV3RaceLevelInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo build() {
        emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo buildPartial() {
        emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo result = new emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.maxScore_ = maxScore_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
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
        if (other instanceof emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo other) {
        if (other == emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo.getDefaultInstance()) return this;
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
              case 8: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 40: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 80: {
                maxScore_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
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

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 10;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 10;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {

        maxScore_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        bitField0_ = (bitField0_ & ~0x00000001);
        maxScore_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 1;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 1;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 5;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {

        isOpen_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:SeaLampV3RaceLevelInfo)
    }

    // @@protoc_insertion_point(class_scope:SeaLampV3RaceLevelInfo)
    private static final emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo();
    }

    public static emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SeaLampV3RaceLevelInfo>
        PARSER = new com.google.protobuf.AbstractParser<SeaLampV3RaceLevelInfo>() {
      @java.lang.Override
      public SeaLampV3RaceLevelInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SeaLampV3RaceLevelInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SeaLampV3RaceLevelInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SeaLampV3RaceLevelInfoOuterClass.SeaLampV3RaceLevelInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeaLampV3RaceLevelInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeaLampV3RaceLevelInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SeaLampV3RaceLevelInfo.proto\"N\n\026SeaLam" +
      "pV3RaceLevelInfo\022\021\n\tmax_score\030\n \001(\r\022\020\n\010l" +
      "evel_id\030\001 \001(\r\022\017\n\007is_open\030\005 \001(\010B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SeaLampV3RaceLevelInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SeaLampV3RaceLevelInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeaLampV3RaceLevelInfo_descriptor,
        new java.lang.String[] { "MaxScore", "LevelId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
