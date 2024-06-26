// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TreasureMapRegionInfoNotify.proto

package emu.grasscutter.net.proto;

public final class TreasureMapRegionInfoNotifyOuterClass {
  private TreasureMapRegionInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TreasureMapRegionInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TreasureMapRegionInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.TreasureMapRegionInfo region_info = 10;</code>
     * @return Whether the regionInfo field is set.
     */
    boolean hasRegionInfo();
    /**
     * <code>.TreasureMapRegionInfo region_info = 10;</code>
     * @return The regionInfo.
     */
    emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo getRegionInfo();
    /**
     * <code>.TreasureMapRegionInfo region_info = 10;</code>
     */
    emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfoOrBuilder getRegionInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 2034
   * Obf: DEKOGKDOANP
   * </pre>
   *
   * Protobuf type {@code TreasureMapRegionInfoNotify}
   */
  public static final class TreasureMapRegionInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TreasureMapRegionInfoNotify)
      TreasureMapRegionInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TreasureMapRegionInfoNotify.newBuilder() to construct.
    private TreasureMapRegionInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TreasureMapRegionInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TreasureMapRegionInfoNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.internal_static_TreasureMapRegionInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.internal_static_TreasureMapRegionInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify.class, emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify.Builder.class);
    }

    public static final int REGION_INFO_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo regionInfo_;
    /**
     * <code>.TreasureMapRegionInfo region_info = 10;</code>
     * @return Whether the regionInfo field is set.
     */
    @java.lang.Override
    public boolean hasRegionInfo() {
      return regionInfo_ != null;
    }
    /**
     * <code>.TreasureMapRegionInfo region_info = 10;</code>
     * @return The regionInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo getRegionInfo() {
      return regionInfo_ == null ? emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo.getDefaultInstance() : regionInfo_;
    }
    /**
     * <code>.TreasureMapRegionInfo region_info = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfoOrBuilder getRegionInfoOrBuilder() {
      return regionInfo_ == null ? emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo.getDefaultInstance() : regionInfo_;
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
      if (regionInfo_ != null) {
        output.writeMessage(10, getRegionInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (regionInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getRegionInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify other = (emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify) obj;

      if (hasRegionInfo() != other.hasRegionInfo()) return false;
      if (hasRegionInfo()) {
        if (!getRegionInfo()
            .equals(other.getRegionInfo())) return false;
      }
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
      if (hasRegionInfo()) {
        hash = (37 * hash) + REGION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getRegionInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify prototype) {
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
     * CmdId: 2034
     * Obf: DEKOGKDOANP
     * </pre>
     *
     * Protobuf type {@code TreasureMapRegionInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TreasureMapRegionInfoNotify)
        emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.internal_static_TreasureMapRegionInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.internal_static_TreasureMapRegionInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify.class, emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify.newBuilder()
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
        regionInfo_ = null;
        if (regionInfoBuilder_ != null) {
          regionInfoBuilder_.dispose();
          regionInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.internal_static_TreasureMapRegionInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify build() {
        emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify buildPartial() {
        emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify result = new emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.regionInfo_ = regionInfoBuilder_ == null
              ? regionInfo_
              : regionInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify other) {
        if (other == emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify.getDefaultInstance()) return this;
        if (other.hasRegionInfo()) {
          mergeRegionInfo(other.getRegionInfo());
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
              case 82: {
                input.readMessage(
                    getRegionInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 82
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

      private emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo regionInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo, emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo.Builder, emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfoOrBuilder> regionInfoBuilder_;
      /**
       * <code>.TreasureMapRegionInfo region_info = 10;</code>
       * @return Whether the regionInfo field is set.
       */
      public boolean hasRegionInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.TreasureMapRegionInfo region_info = 10;</code>
       * @return The regionInfo.
       */
      public emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo getRegionInfo() {
        if (regionInfoBuilder_ == null) {
          return regionInfo_ == null ? emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo.getDefaultInstance() : regionInfo_;
        } else {
          return regionInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.TreasureMapRegionInfo region_info = 10;</code>
       */
      public Builder setRegionInfo(emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo value) {
        if (regionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          regionInfo_ = value;
        } else {
          regionInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.TreasureMapRegionInfo region_info = 10;</code>
       */
      public Builder setRegionInfo(
          emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo.Builder builderForValue) {
        if (regionInfoBuilder_ == null) {
          regionInfo_ = builderForValue.build();
        } else {
          regionInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.TreasureMapRegionInfo region_info = 10;</code>
       */
      public Builder mergeRegionInfo(emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo value) {
        if (regionInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            regionInfo_ != null &&
            regionInfo_ != emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo.getDefaultInstance()) {
            getRegionInfoBuilder().mergeFrom(value);
          } else {
            regionInfo_ = value;
          }
        } else {
          regionInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.TreasureMapRegionInfo region_info = 10;</code>
       */
      public Builder clearRegionInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        regionInfo_ = null;
        if (regionInfoBuilder_ != null) {
          regionInfoBuilder_.dispose();
          regionInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.TreasureMapRegionInfo region_info = 10;</code>
       */
      public emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo.Builder getRegionInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRegionInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.TreasureMapRegionInfo region_info = 10;</code>
       */
      public emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfoOrBuilder getRegionInfoOrBuilder() {
        if (regionInfoBuilder_ != null) {
          return regionInfoBuilder_.getMessageOrBuilder();
        } else {
          return regionInfo_ == null ?
              emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo.getDefaultInstance() : regionInfo_;
        }
      }
      /**
       * <code>.TreasureMapRegionInfo region_info = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo, emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo.Builder, emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfoOrBuilder> 
          getRegionInfoFieldBuilder() {
        if (regionInfoBuilder_ == null) {
          regionInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo, emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfo.Builder, emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.TreasureMapRegionInfoOrBuilder>(
                  getRegionInfo(),
                  getParentForChildren(),
                  isClean());
          regionInfo_ = null;
        }
        return regionInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TreasureMapRegionInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:TreasureMapRegionInfoNotify)
    private static final emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify();
    }

    public static emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TreasureMapRegionInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<TreasureMapRegionInfoNotify>() {
      @java.lang.Override
      public TreasureMapRegionInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<TreasureMapRegionInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TreasureMapRegionInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TreasureMapRegionInfoNotifyOuterClass.TreasureMapRegionInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TreasureMapRegionInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TreasureMapRegionInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!TreasureMapRegionInfoNotify.proto\032\033Tre" +
      "asureMapRegionInfo.proto\"J\n\033TreasureMapR" +
      "egionInfoNotify\022+\n\013region_info\030\n \001(\0132\026.T" +
      "reasureMapRegionInfoB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.getDescriptor(),
        });
    internal_static_TreasureMapRegionInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TreasureMapRegionInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TreasureMapRegionInfoNotify_descriptor,
        new java.lang.String[] { "RegionInfo", });
    emu.grasscutter.net.proto.TreasureMapRegionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
