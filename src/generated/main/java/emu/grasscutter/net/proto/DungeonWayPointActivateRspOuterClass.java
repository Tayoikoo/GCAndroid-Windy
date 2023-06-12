// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonWayPointActivateRsp.proto

package emu.grasscutter.net.proto;

public final class DungeonWayPointActivateRspOuterClass {
  private DungeonWayPointActivateRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonWayPointActivateRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonWayPointActivateRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 way_point_id = 10;</code>
     * @return The wayPointId.
     */
    int getWayPointId();
  }
  /**
   * <pre>
   * CmdId: 992
   * Name: CDEOCFMPMKK
   * </pre>
   *
   * Protobuf type {@code DungeonWayPointActivateRsp}
   */
  public static final class DungeonWayPointActivateRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonWayPointActivateRsp)
      DungeonWayPointActivateRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonWayPointActivateRsp.newBuilder() to construct.
    private DungeonWayPointActivateRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonWayPointActivateRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonWayPointActivateRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.internal_static_DungeonWayPointActivateRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.internal_static_DungeonWayPointActivateRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp.class, emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int WAY_POINT_ID_FIELD_NUMBER = 10;
    private int wayPointId_ = 0;
    /**
     * <code>uint32 way_point_id = 10;</code>
     * @return The wayPointId.
     */
    @java.lang.Override
    public int getWayPointId() {
      return wayPointId_;
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
      if (wayPointId_ != 0) {
        output.writeUInt32(10, wayPointId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (wayPointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, wayPointId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp other = (emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getWayPointId()
          != other.getWayPointId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + WAY_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWayPointId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp prototype) {
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
     * CmdId: 992
     * Name: CDEOCFMPMKK
     * </pre>
     *
     * Protobuf type {@code DungeonWayPointActivateRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonWayPointActivateRsp)
        emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.internal_static_DungeonWayPointActivateRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.internal_static_DungeonWayPointActivateRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp.class, emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp.newBuilder()
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
        retcode_ = 0;
        wayPointId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.internal_static_DungeonWayPointActivateRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp build() {
        emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp buildPartial() {
        emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp result = new emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.wayPointId_ = wayPointId_;
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
        if (other instanceof emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp other) {
        if (other == emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getWayPointId() != 0) {
          setWayPointId(other.getWayPointId());
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
              case 80: {
                wayPointId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 88: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int wayPointId_ ;
      /**
       * <code>uint32 way_point_id = 10;</code>
       * @return The wayPointId.
       */
      @java.lang.Override
      public int getWayPointId() {
        return wayPointId_;
      }
      /**
       * <code>uint32 way_point_id = 10;</code>
       * @param value The wayPointId to set.
       * @return This builder for chaining.
       */
      public Builder setWayPointId(int value) {

        wayPointId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 way_point_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearWayPointId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        wayPointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonWayPointActivateRsp)
    }

    // @@protoc_insertion_point(class_scope:DungeonWayPointActivateRsp)
    private static final emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp();
    }

    public static emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonWayPointActivateRsp>
        PARSER = new com.google.protobuf.AbstractParser<DungeonWayPointActivateRsp>() {
      @java.lang.Override
      public DungeonWayPointActivateRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonWayPointActivateRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonWayPointActivateRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonWayPointActivateRspOuterClass.DungeonWayPointActivateRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonWayPointActivateRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonWayPointActivateRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n DungeonWayPointActivateRsp.proto\"C\n\032Du" +
      "ngeonWayPointActivateRsp\022\017\n\007retcode\030\013 \001(" +
      "\005\022\024\n\014way_point_id\030\n \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonWayPointActivateRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonWayPointActivateRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonWayPointActivateRsp_descriptor,
        new java.lang.String[] { "Retcode", "WayPointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
