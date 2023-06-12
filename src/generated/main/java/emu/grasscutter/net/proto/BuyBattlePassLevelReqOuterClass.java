// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BuyBattlePassLevelReq.proto

package emu.grasscutter.net.proto;

public final class BuyBattlePassLevelReqOuterClass {
  private BuyBattlePassLevelReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuyBattlePassLevelReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BuyBattlePassLevelReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 buy_level = 12;</code>
     * @return The buyLevel.
     */
    int getBuyLevel();
  }
  /**
   * <pre>
   * CmdId: 2624
   * Name: KABEBBFHLDC
   * </pre>
   *
   * Protobuf type {@code BuyBattlePassLevelReq}
   */
  public static final class BuyBattlePassLevelReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BuyBattlePassLevelReq)
      BuyBattlePassLevelReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BuyBattlePassLevelReq.newBuilder() to construct.
    private BuyBattlePassLevelReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BuyBattlePassLevelReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BuyBattlePassLevelReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.internal_static_BuyBattlePassLevelReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.internal_static_BuyBattlePassLevelReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq.class, emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq.Builder.class);
    }

    public static final int BUY_LEVEL_FIELD_NUMBER = 12;
    private int buyLevel_ = 0;
    /**
     * <code>uint32 buy_level = 12;</code>
     * @return The buyLevel.
     */
    @java.lang.Override
    public int getBuyLevel() {
      return buyLevel_;
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
      if (buyLevel_ != 0) {
        output.writeUInt32(12, buyLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (buyLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, buyLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq other = (emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq) obj;

      if (getBuyLevel()
          != other.getBuyLevel()) return false;
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
      hash = (37 * hash) + BUY_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getBuyLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq prototype) {
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
     * CmdId: 2624
     * Name: KABEBBFHLDC
     * </pre>
     *
     * Protobuf type {@code BuyBattlePassLevelReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BuyBattlePassLevelReq)
        emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.internal_static_BuyBattlePassLevelReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.internal_static_BuyBattlePassLevelReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq.class, emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq.newBuilder()
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
        buyLevel_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.internal_static_BuyBattlePassLevelReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq build() {
        emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq buildPartial() {
        emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq result = new emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.buyLevel_ = buyLevel_;
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
        if (other instanceof emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq) {
          return mergeFrom((emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq other) {
        if (other == emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq.getDefaultInstance()) return this;
        if (other.getBuyLevel() != 0) {
          setBuyLevel(other.getBuyLevel());
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
              case 96: {
                buyLevel_ = input.readUInt32();
                bitField0_ |= 0x00000001;
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

      private int buyLevel_ ;
      /**
       * <code>uint32 buy_level = 12;</code>
       * @return The buyLevel.
       */
      @java.lang.Override
      public int getBuyLevel() {
        return buyLevel_;
      }
      /**
       * <code>uint32 buy_level = 12;</code>
       * @param value The buyLevel to set.
       * @return This builder for chaining.
       */
      public Builder setBuyLevel(int value) {

        buyLevel_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buy_level = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuyLevel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        buyLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BuyBattlePassLevelReq)
    }

    // @@protoc_insertion_point(class_scope:BuyBattlePassLevelReq)
    private static final emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq();
    }

    public static emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BuyBattlePassLevelReq>
        PARSER = new com.google.protobuf.AbstractParser<BuyBattlePassLevelReq>() {
      @java.lang.Override
      public BuyBattlePassLevelReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<BuyBattlePassLevelReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BuyBattlePassLevelReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BuyBattlePassLevelReqOuterClass.BuyBattlePassLevelReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BuyBattlePassLevelReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BuyBattlePassLevelReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033BuyBattlePassLevelReq.proto\"*\n\025BuyBatt" +
      "lePassLevelReq\022\021\n\tbuy_level\030\014 \001(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BuyBattlePassLevelReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BuyBattlePassLevelReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BuyBattlePassLevelReq_descriptor,
        new java.lang.String[] { "BuyLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
