// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IslandPartyStageData.proto

package emu.grasscutter.net.proto;

public final class IslandPartyStageDataOuterClass {
  private IslandPartyStageDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IslandPartyStageDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IslandPartyStageData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 best_score = 11;</code>
     * @return The bestScore.
     */
    int getBestScore();
  }
  /**
   * <pre>
   * Name: GKGMAEBKDCC
   * </pre>
   *
   * Protobuf type {@code IslandPartyStageData}
   */
  public static final class IslandPartyStageData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IslandPartyStageData)
      IslandPartyStageDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IslandPartyStageData.newBuilder() to construct.
    private IslandPartyStageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IslandPartyStageData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IslandPartyStageData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.internal_static_IslandPartyStageData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.internal_static_IslandPartyStageData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.class, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 3;
    private int stageId_ = 0;
    /**
     * <code>uint32 stage_id = 3;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 12;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 11;
    private int bestScore_ = 0;
    /**
     * <code>uint32 best_score = 11;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
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
      if (stageId_ != 0) {
        output.writeUInt32(3, stageId_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(11, bestScore_);
      }
      if (isOpen_ != false) {
        output.writeBool(12, isOpen_);
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
          .computeUInt32Size(3, stageId_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, bestScore_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData other = (emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData prototype) {
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
     * Name: GKGMAEBKDCC
     * </pre>
     *
     * Protobuf type {@code IslandPartyStageData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IslandPartyStageData)
        emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.internal_static_IslandPartyStageData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.internal_static_IslandPartyStageData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.class, emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.newBuilder()
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
        stageId_ = 0;
        isOpen_ = false;
        bestScore_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.internal_static_IslandPartyStageData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData build() {
        emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData buildPartial() {
        emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData result = new emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.stageId_ = stageId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.bestScore_ = bestScore_;
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
        if (other instanceof emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData) {
          return mergeFrom((emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData other) {
        if (other == emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
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
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 88: {
                bestScore_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
              case 96: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000002;
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

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {

        stageId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 12;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 12;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {

        isOpen_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 11;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 11;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {

        bestScore_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        bitField0_ = (bitField0_ & ~0x00000004);
        bestScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IslandPartyStageData)
    }

    // @@protoc_insertion_point(class_scope:IslandPartyStageData)
    private static final emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData();
    }

    public static emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IslandPartyStageData>
        PARSER = new com.google.protobuf.AbstractParser<IslandPartyStageData>() {
      @java.lang.Override
      public IslandPartyStageData parsePartialFrom(
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

    public static com.google.protobuf.Parser<IslandPartyStageData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IslandPartyStageData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IslandPartyStageDataOuterClass.IslandPartyStageData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IslandPartyStageData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IslandPartyStageData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032IslandPartyStageData.proto\"M\n\024IslandPa" +
      "rtyStageData\022\020\n\010stage_id\030\003 \001(\r\022\017\n\007is_ope" +
      "n\030\014 \001(\010\022\022\n\nbest_score\030\013 \001(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IslandPartyStageData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IslandPartyStageData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IslandPartyStageData_descriptor,
        new java.lang.String[] { "StageId", "IsOpen", "BestScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
