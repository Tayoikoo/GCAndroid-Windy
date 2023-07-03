// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CrystalLinkBuffInfo.proto

package emu.grasscutter.net.proto;

public final class CrystalLinkBuffInfoOuterClass {
  private CrystalLinkBuffInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CrystalLinkBuffInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CrystalLinkBuffInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 DBKGEODHPNC = 7;</code>
     * @return The dBKGEODHPNC.
     */
    int getDBKGEODHPNC();

    /**
     * <code>uint32 OECGHFDFIII = 2;</code>
     * @return The oECGHFDFIII.
     */
    int getOECGHFDFIII();
  }
  /**
   * <pre>
   * Obf: PHGJADJONIC
   * </pre>
   *
   * Protobuf type {@code CrystalLinkBuffInfo}
   */
  public static final class CrystalLinkBuffInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CrystalLinkBuffInfo)
      CrystalLinkBuffInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CrystalLinkBuffInfo.newBuilder() to construct.
    private CrystalLinkBuffInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CrystalLinkBuffInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CrystalLinkBuffInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.internal_static_CrystalLinkBuffInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.internal_static_CrystalLinkBuffInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo.class, emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo.Builder.class);
    }

    public static final int DBKGEODHPNC_FIELD_NUMBER = 7;
    private int dBKGEODHPNC_ = 0;
    /**
     * <code>uint32 DBKGEODHPNC = 7;</code>
     * @return The dBKGEODHPNC.
     */
    @java.lang.Override
    public int getDBKGEODHPNC() {
      return dBKGEODHPNC_;
    }

    public static final int OECGHFDFIII_FIELD_NUMBER = 2;
    private int oECGHFDFIII_ = 0;
    /**
     * <code>uint32 OECGHFDFIII = 2;</code>
     * @return The oECGHFDFIII.
     */
    @java.lang.Override
    public int getOECGHFDFIII() {
      return oECGHFDFIII_;
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
      if (oECGHFDFIII_ != 0) {
        output.writeUInt32(2, oECGHFDFIII_);
      }
      if (dBKGEODHPNC_ != 0) {
        output.writeUInt32(7, dBKGEODHPNC_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oECGHFDFIII_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, oECGHFDFIII_);
      }
      if (dBKGEODHPNC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, dBKGEODHPNC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo other = (emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo) obj;

      if (getDBKGEODHPNC()
          != other.getDBKGEODHPNC()) return false;
      if (getOECGHFDFIII()
          != other.getOECGHFDFIII()) return false;
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
      hash = (37 * hash) + DBKGEODHPNC_FIELD_NUMBER;
      hash = (53 * hash) + getDBKGEODHPNC();
      hash = (37 * hash) + OECGHFDFIII_FIELD_NUMBER;
      hash = (53 * hash) + getOECGHFDFIII();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo prototype) {
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
     * Obf: PHGJADJONIC
     * </pre>
     *
     * Protobuf type {@code CrystalLinkBuffInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CrystalLinkBuffInfo)
        emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.internal_static_CrystalLinkBuffInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.internal_static_CrystalLinkBuffInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo.class, emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo.newBuilder()
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
        dBKGEODHPNC_ = 0;
        oECGHFDFIII_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.internal_static_CrystalLinkBuffInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo build() {
        emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo buildPartial() {
        emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo result = new emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dBKGEODHPNC_ = dBKGEODHPNC_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.oECGHFDFIII_ = oECGHFDFIII_;
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
        if (other instanceof emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo) {
          return mergeFrom((emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo other) {
        if (other == emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo.getDefaultInstance()) return this;
        if (other.getDBKGEODHPNC() != 0) {
          setDBKGEODHPNC(other.getDBKGEODHPNC());
        }
        if (other.getOECGHFDFIII() != 0) {
          setOECGHFDFIII(other.getOECGHFDFIII());
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
              case 16: {
                oECGHFDFIII_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 56: {
                dBKGEODHPNC_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
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

      private int dBKGEODHPNC_ ;
      /**
       * <code>uint32 DBKGEODHPNC = 7;</code>
       * @return The dBKGEODHPNC.
       */
      @java.lang.Override
      public int getDBKGEODHPNC() {
        return dBKGEODHPNC_;
      }
      /**
       * <code>uint32 DBKGEODHPNC = 7;</code>
       * @param value The dBKGEODHPNC to set.
       * @return This builder for chaining.
       */
      public Builder setDBKGEODHPNC(int value) {

        dBKGEODHPNC_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DBKGEODHPNC = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDBKGEODHPNC() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dBKGEODHPNC_ = 0;
        onChanged();
        return this;
      }

      private int oECGHFDFIII_ ;
      /**
       * <code>uint32 OECGHFDFIII = 2;</code>
       * @return The oECGHFDFIII.
       */
      @java.lang.Override
      public int getOECGHFDFIII() {
        return oECGHFDFIII_;
      }
      /**
       * <code>uint32 OECGHFDFIII = 2;</code>
       * @param value The oECGHFDFIII to set.
       * @return This builder for chaining.
       */
      public Builder setOECGHFDFIII(int value) {

        oECGHFDFIII_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OECGHFDFIII = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOECGHFDFIII() {
        bitField0_ = (bitField0_ & ~0x00000002);
        oECGHFDFIII_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CrystalLinkBuffInfo)
    }

    // @@protoc_insertion_point(class_scope:CrystalLinkBuffInfo)
    private static final emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo();
    }

    public static emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CrystalLinkBuffInfo>
        PARSER = new com.google.protobuf.AbstractParser<CrystalLinkBuffInfo>() {
      @java.lang.Override
      public CrystalLinkBuffInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CrystalLinkBuffInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CrystalLinkBuffInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CrystalLinkBuffInfoOuterClass.CrystalLinkBuffInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CrystalLinkBuffInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CrystalLinkBuffInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031CrystalLinkBuffInfo.proto\"?\n\023CrystalLi" +
      "nkBuffInfo\022\023\n\013DBKGEODHPNC\030\007 \001(\r\022\023\n\013OECGH" +
      "FDFIII\030\002 \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CrystalLinkBuffInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CrystalLinkBuffInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CrystalLinkBuffInfo_descriptor,
        new java.lang.String[] { "DBKGEODHPNC", "OECGHFDFIII", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
