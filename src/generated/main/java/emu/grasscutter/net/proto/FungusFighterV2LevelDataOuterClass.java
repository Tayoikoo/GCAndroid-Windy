// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterV2LevelData.proto

package emu.grasscutter.net.proto;

public final class FungusFighterV2LevelDataOuterClass {
  private FungusFighterV2LevelDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterV2LevelDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterV2LevelData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 PJIHHFHLOGM = 5;</code>
     * @return The pJIHHFHLOGM.
     */
    int getPJIHHFHLOGM();

    /**
     * <code>bool is_level_open = 15;</code>
     * @return The isLevelOpen.
     */
    boolean getIsLevelOpen();

    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * Obf: LLIPOHHDJOL
   * </pre>
   *
   * Protobuf type {@code FungusFighterV2LevelData}
   */
  public static final class FungusFighterV2LevelData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterV2LevelData)
      FungusFighterV2LevelDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterV2LevelData.newBuilder() to construct.
    private FungusFighterV2LevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterV2LevelData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterV2LevelData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.internal_static_FungusFighterV2LevelData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.internal_static_FungusFighterV2LevelData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.class, emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.Builder.class);
    }

    public static final int PJIHHFHLOGM_FIELD_NUMBER = 5;
    private int pJIHHFHLOGM_ = 0;
    /**
     * <code>uint32 PJIHHFHLOGM = 5;</code>
     * @return The pJIHHFHLOGM.
     */
    @java.lang.Override
    public int getPJIHHFHLOGM() {
      return pJIHHFHLOGM_;
    }

    public static final int IS_LEVEL_OPEN_FIELD_NUMBER = 15;
    private boolean isLevelOpen_ = false;
    /**
     * <code>bool is_level_open = 15;</code>
     * @return The isLevelOpen.
     */
    @java.lang.Override
    public boolean getIsLevelOpen() {
      return isLevelOpen_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 12;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 12;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (pJIHHFHLOGM_ != 0) {
        output.writeUInt32(5, pJIHHFHLOGM_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(12, levelId_);
      }
      if (isLevelOpen_ != false) {
        output.writeBool(15, isLevelOpen_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pJIHHFHLOGM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, pJIHHFHLOGM_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, levelId_);
      }
      if (isLevelOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isLevelOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData other = (emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData) obj;

      if (getPJIHHFHLOGM()
          != other.getPJIHHFHLOGM()) return false;
      if (getIsLevelOpen()
          != other.getIsLevelOpen()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + PJIHHFHLOGM_FIELD_NUMBER;
      hash = (53 * hash) + getPJIHHFHLOGM();
      hash = (37 * hash) + IS_LEVEL_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLevelOpen());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData prototype) {
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
     * Obf: LLIPOHHDJOL
     * </pre>
     *
     * Protobuf type {@code FungusFighterV2LevelData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterV2LevelData)
        emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.internal_static_FungusFighterV2LevelData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.internal_static_FungusFighterV2LevelData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.class, emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.newBuilder()
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
        pJIHHFHLOGM_ = 0;
        isLevelOpen_ = false;
        levelId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.internal_static_FungusFighterV2LevelData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData build() {
        emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData buildPartial() {
        emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData result = new emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.pJIHHFHLOGM_ = pJIHHFHLOGM_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isLevelOpen_ = isLevelOpen_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData) {
          return mergeFrom((emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData other) {
        if (other == emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData.getDefaultInstance()) return this;
        if (other.getPJIHHFHLOGM() != 0) {
          setPJIHHFHLOGM(other.getPJIHHFHLOGM());
        }
        if (other.getIsLevelOpen() != false) {
          setIsLevelOpen(other.getIsLevelOpen());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
                pJIHHFHLOGM_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 96: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 96
              case 120: {
                isLevelOpen_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 120
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

      private int pJIHHFHLOGM_ ;
      /**
       * <code>uint32 PJIHHFHLOGM = 5;</code>
       * @return The pJIHHFHLOGM.
       */
      @java.lang.Override
      public int getPJIHHFHLOGM() {
        return pJIHHFHLOGM_;
      }
      /**
       * <code>uint32 PJIHHFHLOGM = 5;</code>
       * @param value The pJIHHFHLOGM to set.
       * @return This builder for chaining.
       */
      public Builder setPJIHHFHLOGM(int value) {

        pJIHHFHLOGM_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PJIHHFHLOGM = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearPJIHHFHLOGM() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pJIHHFHLOGM_ = 0;
        onChanged();
        return this;
      }

      private boolean isLevelOpen_ ;
      /**
       * <code>bool is_level_open = 15;</code>
       * @return The isLevelOpen.
       */
      @java.lang.Override
      public boolean getIsLevelOpen() {
        return isLevelOpen_;
      }
      /**
       * <code>bool is_level_open = 15;</code>
       * @param value The isLevelOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsLevelOpen(boolean value) {

        isLevelOpen_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_level_open = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLevelOpen() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isLevelOpen_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 12;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 12;</code>
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
       * <code>uint32 level_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FungusFighterV2LevelData)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterV2LevelData)
    private static final emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData();
    }

    public static emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterV2LevelData>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterV2LevelData>() {
      @java.lang.Override
      public FungusFighterV2LevelData parsePartialFrom(
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

    public static com.google.protobuf.Parser<FungusFighterV2LevelData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterV2LevelData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FungusFighterV2LevelDataOuterClass.FungusFighterV2LevelData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterV2LevelData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterV2LevelData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036FungusFighterV2LevelData.proto\"X\n\030Fung" +
      "usFighterV2LevelData\022\023\n\013PJIHHFHLOGM\030\005 \001(" +
      "\r\022\025\n\ris_level_open\030\017 \001(\010\022\020\n\010level_id\030\014 \001" +
      "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusFighterV2LevelData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterV2LevelData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterV2LevelData_descriptor,
        new java.lang.String[] { "PJIHHFHLOGM", "IsLevelOpen", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
