// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeShikigamiRecord.proto

package emu.grasscutter.net.proto;

public final class RoguelikeShikigamiRecordOuterClass {
  private RoguelikeShikigamiRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeShikigamiRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeShikigamiRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level = 4;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * Obf: EAGEBKMEIPO
   * </pre>
   *
   * Protobuf type {@code RoguelikeShikigamiRecord}
   */
  public static final class RoguelikeShikigamiRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeShikigamiRecord)
      RoguelikeShikigamiRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeShikigamiRecord.newBuilder() to construct.
    private RoguelikeShikigamiRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeShikigamiRecord() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeShikigamiRecord();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.internal_static_RoguelikeShikigamiRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.internal_static_RoguelikeShikigamiRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.class, emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.Builder.class);
    }

    public static final int LEVEL_FIELD_NUMBER = 4;
    private int level_ = 0;
    /**
     * <code>uint32 level = 4;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int ID_FIELD_NUMBER = 8;
    private int id_ = 0;
    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (level_ != 0) {
        output.writeUInt32(4, level_);
      }
      if (id_ != 0) {
        output.writeUInt32(8, id_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, level_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, id_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord other = (emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord) obj;

      if (getLevel()
          != other.getLevel()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord prototype) {
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
     * Obf: EAGEBKMEIPO
     * </pre>
     *
     * Protobuf type {@code RoguelikeShikigamiRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeShikigamiRecord)
        emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.internal_static_RoguelikeShikigamiRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.internal_static_RoguelikeShikigamiRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.class, emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.newBuilder()
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
        level_ = 0;
        id_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.internal_static_RoguelikeShikigamiRecord_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord build() {
        emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord buildPartial() {
        emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord result = new emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.level_ = level_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord) {
          return mergeFrom((emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord other) {
        if (other == emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord.getDefaultInstance()) return this;
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
              case 32: {
                level_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 64: {
                id_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
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

      private int level_ ;
      /**
       * <code>uint32 level = 4;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 4;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {

        level_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        level_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 8;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeShikigamiRecord)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeShikigamiRecord)
    private static final emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord();
    }

    public static emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeShikigamiRecord>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeShikigamiRecord>() {
      @java.lang.Override
      public RoguelikeShikigamiRecord parsePartialFrom(
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

    public static com.google.protobuf.Parser<RoguelikeShikigamiRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeShikigamiRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RoguelikeShikigamiRecordOuterClass.RoguelikeShikigamiRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeShikigamiRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeShikigamiRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036RoguelikeShikigamiRecord.proto\"5\n\030Rogu" +
      "elikeShikigamiRecord\022\r\n\005level\030\004 \001(\r\022\n\n\002i" +
      "d\030\010 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeShikigamiRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeShikigamiRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeShikigamiRecord_descriptor,
        new java.lang.String[] { "Level", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
