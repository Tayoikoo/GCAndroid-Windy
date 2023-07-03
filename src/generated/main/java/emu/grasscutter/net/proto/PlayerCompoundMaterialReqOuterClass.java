// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerCompoundMaterialReq.proto

package emu.grasscutter.net.proto;

public final class PlayerCompoundMaterialReqOuterClass {
  private PlayerCompoundMaterialReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerCompoundMaterialReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerCompoundMaterialReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 count = 6;</code>
     * @return The count.
     */
    int getCount();

    /**
     * <code>uint32 compound_id = 12;</code>
     * @return The compoundId.
     */
    int getCompoundId();
  }
  /**
   * <pre>
   * CmdId: 142
   * Obf: CIDMNOMHPKC
   * </pre>
   *
   * Protobuf type {@code PlayerCompoundMaterialReq}
   */
  public static final class PlayerCompoundMaterialReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerCompoundMaterialReq)
      PlayerCompoundMaterialReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerCompoundMaterialReq.newBuilder() to construct.
    private PlayerCompoundMaterialReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerCompoundMaterialReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerCompoundMaterialReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.internal_static_PlayerCompoundMaterialReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.internal_static_PlayerCompoundMaterialReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq.class, emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq.Builder.class);
    }

    public static final int COUNT_FIELD_NUMBER = 6;
    private int count_ = 0;
    /**
     * <code>uint32 count = 6;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }

    public static final int COMPOUND_ID_FIELD_NUMBER = 12;
    private int compoundId_ = 0;
    /**
     * <code>uint32 compound_id = 12;</code>
     * @return The compoundId.
     */
    @java.lang.Override
    public int getCompoundId() {
      return compoundId_;
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
      if (count_ != 0) {
        output.writeUInt32(6, count_);
      }
      if (compoundId_ != 0) {
        output.writeUInt32(12, compoundId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, count_);
      }
      if (compoundId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, compoundId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq other = (emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq) obj;

      if (getCount()
          != other.getCount()) return false;
      if (getCompoundId()
          != other.getCompoundId()) return false;
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
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (37 * hash) + COMPOUND_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCompoundId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq prototype) {
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
     * CmdId: 142
     * Obf: CIDMNOMHPKC
     * </pre>
     *
     * Protobuf type {@code PlayerCompoundMaterialReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerCompoundMaterialReq)
        emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.internal_static_PlayerCompoundMaterialReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.internal_static_PlayerCompoundMaterialReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq.class, emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq.newBuilder()
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
        count_ = 0;
        compoundId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.internal_static_PlayerCompoundMaterialReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq build() {
        emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq buildPartial() {
        emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq result = new emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.count_ = count_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.compoundId_ = compoundId_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq other) {
        if (other == emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq.getDefaultInstance()) return this;
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        if (other.getCompoundId() != 0) {
          setCompoundId(other.getCompoundId());
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
                count_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 96: {
                compoundId_ = input.readUInt32();
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

      private int count_ ;
      /**
       * <code>uint32 count = 6;</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 6;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {

        count_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        count_ = 0;
        onChanged();
        return this;
      }

      private int compoundId_ ;
      /**
       * <code>uint32 compound_id = 12;</code>
       * @return The compoundId.
       */
      @java.lang.Override
      public int getCompoundId() {
        return compoundId_;
      }
      /**
       * <code>uint32 compound_id = 12;</code>
       * @param value The compoundId to set.
       * @return This builder for chaining.
       */
      public Builder setCompoundId(int value) {

        compoundId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 compound_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCompoundId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        compoundId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerCompoundMaterialReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerCompoundMaterialReq)
    private static final emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq();
    }

    public static emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerCompoundMaterialReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerCompoundMaterialReq>() {
      @java.lang.Override
      public PlayerCompoundMaterialReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerCompoundMaterialReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerCompoundMaterialReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerCompoundMaterialReqOuterClass.PlayerCompoundMaterialReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerCompoundMaterialReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerCompoundMaterialReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037PlayerCompoundMaterialReq.proto\"?\n\031Pla" +
      "yerCompoundMaterialReq\022\r\n\005count\030\006 \001(\r\022\023\n" +
      "\013compound_id\030\014 \001(\rB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerCompoundMaterialReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerCompoundMaterialReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerCompoundMaterialReq_descriptor,
        new java.lang.String[] { "Count", "CompoundId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
