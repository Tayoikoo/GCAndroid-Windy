// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FurnitureMakeCancelReq.proto

package emu.grasscutter.net.proto;

public final class FurnitureMakeCancelReqOuterClass {
  private FurnitureMakeCancelReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FurnitureMakeCancelReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FurnitureMakeCancelReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 index = 6;</code>
     * @return The index.
     */
    int getIndex();

    /**
     * <code>uint32 make_id = 1;</code>
     * @return The makeId.
     */
    int getMakeId();
  }
  /**
   * <pre>
   * CmdId: 4663
   * Obf: NNJHMCNPNHK
   * </pre>
   *
   * Protobuf type {@code FurnitureMakeCancelReq}
   */
  public static final class FurnitureMakeCancelReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FurnitureMakeCancelReq)
      FurnitureMakeCancelReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FurnitureMakeCancelReq.newBuilder() to construct.
    private FurnitureMakeCancelReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FurnitureMakeCancelReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FurnitureMakeCancelReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.internal_static_FurnitureMakeCancelReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.internal_static_FurnitureMakeCancelReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq.class, emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq.Builder.class);
    }

    public static final int INDEX_FIELD_NUMBER = 6;
    private int index_ = 0;
    /**
     * <code>uint32 index = 6;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }

    public static final int MAKE_ID_FIELD_NUMBER = 1;
    private int makeId_ = 0;
    /**
     * <code>uint32 make_id = 1;</code>
     * @return The makeId.
     */
    @java.lang.Override
    public int getMakeId() {
      return makeId_;
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
      if (makeId_ != 0) {
        output.writeUInt32(1, makeId_);
      }
      if (index_ != 0) {
        output.writeUInt32(6, index_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (makeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, makeId_);
      }
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, index_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq other = (emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq) obj;

      if (getIndex()
          != other.getIndex()) return false;
      if (getMakeId()
          != other.getMakeId()) return false;
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
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (37 * hash) + MAKE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMakeId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq prototype) {
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
     * CmdId: 4663
     * Obf: NNJHMCNPNHK
     * </pre>
     *
     * Protobuf type {@code FurnitureMakeCancelReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FurnitureMakeCancelReq)
        emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.internal_static_FurnitureMakeCancelReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.internal_static_FurnitureMakeCancelReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq.class, emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq.newBuilder()
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
        index_ = 0;
        makeId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.internal_static_FurnitureMakeCancelReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq build() {
        emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq buildPartial() {
        emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq result = new emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.index_ = index_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.makeId_ = makeId_;
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
        if (other instanceof emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq) {
          return mergeFrom((emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq other) {
        if (other == emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq.getDefaultInstance()) return this;
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
        }
        if (other.getMakeId() != 0) {
          setMakeId(other.getMakeId());
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
                makeId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 48: {
                index_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
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

      private int index_ ;
      /**
       * <code>uint32 index = 6;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 6;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {

        index_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        bitField0_ = (bitField0_ & ~0x00000001);
        index_ = 0;
        onChanged();
        return this;
      }

      private int makeId_ ;
      /**
       * <code>uint32 make_id = 1;</code>
       * @return The makeId.
       */
      @java.lang.Override
      public int getMakeId() {
        return makeId_;
      }
      /**
       * <code>uint32 make_id = 1;</code>
       * @param value The makeId to set.
       * @return This builder for chaining.
       */
      public Builder setMakeId(int value) {

        makeId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 make_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMakeId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        makeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FurnitureMakeCancelReq)
    }

    // @@protoc_insertion_point(class_scope:FurnitureMakeCancelReq)
    private static final emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq();
    }

    public static emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FurnitureMakeCancelReq>
        PARSER = new com.google.protobuf.AbstractParser<FurnitureMakeCancelReq>() {
      @java.lang.Override
      public FurnitureMakeCancelReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<FurnitureMakeCancelReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FurnitureMakeCancelReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeCancelReqOuterClass.FurnitureMakeCancelReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FurnitureMakeCancelReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FurnitureMakeCancelReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034FurnitureMakeCancelReq.proto\"8\n\026Furnit" +
      "ureMakeCancelReq\022\r\n\005index\030\006 \001(\r\022\017\n\007make_" +
      "id\030\001 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FurnitureMakeCancelReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FurnitureMakeCancelReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FurnitureMakeCancelReq_descriptor,
        new java.lang.String[] { "Index", "MakeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
