// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerLevelStarCondData.proto

package emu.grasscutter.net.proto;

public final class TowerLevelStarCondDataOuterClass {
  private TowerLevelStarCondDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerLevelStarCondDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerLevelStarCondData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 KIGONGLABHC = 2;</code>
     * @return The kIGONGLABHC.
     */
    int getKIGONGLABHC();

    /**
     * <code>uint32 DLEMDNGLGAP = 4;</code>
     * @return The dLEMDNGLGAP.
     */
    int getDLEMDNGLGAP();

    /**
     * <code>bool FGBFALDMDAB = 3;</code>
     * @return The fGBFALDMDAB.
     */
    boolean getFGBFALDMDAB();

    /**
     * <code>bool KPLBFMBGPAP = 9;</code>
     * @return The kPLBFMBGPAP.
     */
    boolean getKPLBFMBGPAP();
  }
  /**
   * <pre>
   * Name: GFLKMONOFNG
   * </pre>
   *
   * Protobuf type {@code TowerLevelStarCondData}
   */
  public static final class TowerLevelStarCondData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerLevelStarCondData)
      TowerLevelStarCondDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerLevelStarCondData.newBuilder() to construct.
    private TowerLevelStarCondData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerLevelStarCondData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerLevelStarCondData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.class, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder.class);
    }

    public static final int KIGONGLABHC_FIELD_NUMBER = 2;
    private int kIGONGLABHC_ = 0;
    /**
     * <code>uint32 KIGONGLABHC = 2;</code>
     * @return The kIGONGLABHC.
     */
    @java.lang.Override
    public int getKIGONGLABHC() {
      return kIGONGLABHC_;
    }

    public static final int DLEMDNGLGAP_FIELD_NUMBER = 4;
    private int dLEMDNGLGAP_ = 0;
    /**
     * <code>uint32 DLEMDNGLGAP = 4;</code>
     * @return The dLEMDNGLGAP.
     */
    @java.lang.Override
    public int getDLEMDNGLGAP() {
      return dLEMDNGLGAP_;
    }

    public static final int FGBFALDMDAB_FIELD_NUMBER = 3;
    private boolean fGBFALDMDAB_ = false;
    /**
     * <code>bool FGBFALDMDAB = 3;</code>
     * @return The fGBFALDMDAB.
     */
    @java.lang.Override
    public boolean getFGBFALDMDAB() {
      return fGBFALDMDAB_;
    }

    public static final int KPLBFMBGPAP_FIELD_NUMBER = 9;
    private boolean kPLBFMBGPAP_ = false;
    /**
     * <code>bool KPLBFMBGPAP = 9;</code>
     * @return The kPLBFMBGPAP.
     */
    @java.lang.Override
    public boolean getKPLBFMBGPAP() {
      return kPLBFMBGPAP_;
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
      if (kIGONGLABHC_ != 0) {
        output.writeUInt32(2, kIGONGLABHC_);
      }
      if (fGBFALDMDAB_ != false) {
        output.writeBool(3, fGBFALDMDAB_);
      }
      if (dLEMDNGLGAP_ != 0) {
        output.writeUInt32(4, dLEMDNGLGAP_);
      }
      if (kPLBFMBGPAP_ != false) {
        output.writeBool(9, kPLBFMBGPAP_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (kIGONGLABHC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, kIGONGLABHC_);
      }
      if (fGBFALDMDAB_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, fGBFALDMDAB_);
      }
      if (dLEMDNGLGAP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, dLEMDNGLGAP_);
      }
      if (kPLBFMBGPAP_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, kPLBFMBGPAP_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData other = (emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData) obj;

      if (getKIGONGLABHC()
          != other.getKIGONGLABHC()) return false;
      if (getDLEMDNGLGAP()
          != other.getDLEMDNGLGAP()) return false;
      if (getFGBFALDMDAB()
          != other.getFGBFALDMDAB()) return false;
      if (getKPLBFMBGPAP()
          != other.getKPLBFMBGPAP()) return false;
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
      hash = (37 * hash) + KIGONGLABHC_FIELD_NUMBER;
      hash = (53 * hash) + getKIGONGLABHC();
      hash = (37 * hash) + DLEMDNGLGAP_FIELD_NUMBER;
      hash = (53 * hash) + getDLEMDNGLGAP();
      hash = (37 * hash) + FGBFALDMDAB_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFGBFALDMDAB());
      hash = (37 * hash) + KPLBFMBGPAP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKPLBFMBGPAP());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData prototype) {
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
     * Name: GFLKMONOFNG
     * </pre>
     *
     * Protobuf type {@code TowerLevelStarCondData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerLevelStarCondData)
        emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.class, emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.newBuilder()
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
        kIGONGLABHC_ = 0;
        dLEMDNGLGAP_ = 0;
        fGBFALDMDAB_ = false;
        kPLBFMBGPAP_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.internal_static_TowerLevelStarCondData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData build() {
        emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData buildPartial() {
        emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData result = new emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.kIGONGLABHC_ = kIGONGLABHC_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.dLEMDNGLGAP_ = dLEMDNGLGAP_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.fGBFALDMDAB_ = fGBFALDMDAB_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.kPLBFMBGPAP_ = kPLBFMBGPAP_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData) {
          return mergeFrom((emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData other) {
        if (other == emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance()) return this;
        if (other.getKIGONGLABHC() != 0) {
          setKIGONGLABHC(other.getKIGONGLABHC());
        }
        if (other.getDLEMDNGLGAP() != 0) {
          setDLEMDNGLGAP(other.getDLEMDNGLGAP());
        }
        if (other.getFGBFALDMDAB() != false) {
          setFGBFALDMDAB(other.getFGBFALDMDAB());
        }
        if (other.getKPLBFMBGPAP() != false) {
          setKPLBFMBGPAP(other.getKPLBFMBGPAP());
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
                kIGONGLABHC_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 24: {
                fGBFALDMDAB_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                dLEMDNGLGAP_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 72: {
                kPLBFMBGPAP_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 72
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

      private int kIGONGLABHC_ ;
      /**
       * <code>uint32 KIGONGLABHC = 2;</code>
       * @return The kIGONGLABHC.
       */
      @java.lang.Override
      public int getKIGONGLABHC() {
        return kIGONGLABHC_;
      }
      /**
       * <code>uint32 KIGONGLABHC = 2;</code>
       * @param value The kIGONGLABHC to set.
       * @return This builder for chaining.
       */
      public Builder setKIGONGLABHC(int value) {

        kIGONGLABHC_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KIGONGLABHC = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearKIGONGLABHC() {
        bitField0_ = (bitField0_ & ~0x00000001);
        kIGONGLABHC_ = 0;
        onChanged();
        return this;
      }

      private int dLEMDNGLGAP_ ;
      /**
       * <code>uint32 DLEMDNGLGAP = 4;</code>
       * @return The dLEMDNGLGAP.
       */
      @java.lang.Override
      public int getDLEMDNGLGAP() {
        return dLEMDNGLGAP_;
      }
      /**
       * <code>uint32 DLEMDNGLGAP = 4;</code>
       * @param value The dLEMDNGLGAP to set.
       * @return This builder for chaining.
       */
      public Builder setDLEMDNGLGAP(int value) {

        dLEMDNGLGAP_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DLEMDNGLGAP = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDLEMDNGLGAP() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dLEMDNGLGAP_ = 0;
        onChanged();
        return this;
      }

      private boolean fGBFALDMDAB_ ;
      /**
       * <code>bool FGBFALDMDAB = 3;</code>
       * @return The fGBFALDMDAB.
       */
      @java.lang.Override
      public boolean getFGBFALDMDAB() {
        return fGBFALDMDAB_;
      }
      /**
       * <code>bool FGBFALDMDAB = 3;</code>
       * @param value The fGBFALDMDAB to set.
       * @return This builder for chaining.
       */
      public Builder setFGBFALDMDAB(boolean value) {

        fGBFALDMDAB_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool FGBFALDMDAB = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFGBFALDMDAB() {
        bitField0_ = (bitField0_ & ~0x00000004);
        fGBFALDMDAB_ = false;
        onChanged();
        return this;
      }

      private boolean kPLBFMBGPAP_ ;
      /**
       * <code>bool KPLBFMBGPAP = 9;</code>
       * @return The kPLBFMBGPAP.
       */
      @java.lang.Override
      public boolean getKPLBFMBGPAP() {
        return kPLBFMBGPAP_;
      }
      /**
       * <code>bool KPLBFMBGPAP = 9;</code>
       * @param value The kPLBFMBGPAP to set.
       * @return This builder for chaining.
       */
      public Builder setKPLBFMBGPAP(boolean value) {

        kPLBFMBGPAP_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool KPLBFMBGPAP = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearKPLBFMBGPAP() {
        bitField0_ = (bitField0_ & ~0x00000008);
        kPLBFMBGPAP_ = false;
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


      // @@protoc_insertion_point(builder_scope:TowerLevelStarCondData)
    }

    // @@protoc_insertion_point(class_scope:TowerLevelStarCondData)
    private static final emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData();
    }

    public static emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerLevelStarCondData>
        PARSER = new com.google.protobuf.AbstractParser<TowerLevelStarCondData>() {
      @java.lang.Override
      public TowerLevelStarCondData parsePartialFrom(
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

    public static com.google.protobuf.Parser<TowerLevelStarCondData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerLevelStarCondData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerLevelStarCondData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerLevelStarCondData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034TowerLevelStarCondData.proto\"l\n\026TowerL" +
      "evelStarCondData\022\023\n\013KIGONGLABHC\030\002 \001(\r\022\023\n" +
      "\013DLEMDNGLGAP\030\004 \001(\r\022\023\n\013FGBFALDMDAB\030\003 \001(\010\022" +
      "\023\n\013KPLBFMBGPAP\030\t \001(\010B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerLevelStarCondData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerLevelStarCondData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerLevelStarCondData_descriptor,
        new java.lang.String[] { "KIGONGLABHC", "DLEMDNGLGAP", "FGBFALDMDAB", "KPLBFMBGPAP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
