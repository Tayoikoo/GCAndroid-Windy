// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldDungeonSettleInfo.proto

package emu.grasscutter.net.proto;

public final class WindFieldDungeonSettleInfoOuterClass {
  private WindFieldDungeonSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindFieldDungeonSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindFieldDungeonSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 DNPOFKIINPL = 4;</code>
     * @return A list containing the dNPOFKIINPL.
     */
    java.util.List<java.lang.Integer> getDNPOFKIINPLList();
    /**
     * <code>repeated uint32 DNPOFKIINPL = 4;</code>
     * @return The count of dNPOFKIINPL.
     */
    int getDNPOFKIINPLCount();
    /**
     * <code>repeated uint32 DNPOFKIINPL = 4;</code>
     * @param index The index of the element to return.
     * @return The dNPOFKIINPL at the given index.
     */
    int getDNPOFKIINPL(int index);

    /**
     * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
     * @return A list containing the eDDJEJMNLLC.
     */
    java.util.List<java.lang.Integer> getEDDJEJMNLLCList();
    /**
     * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
     * @return The count of eDDJEJMNLLC.
     */
    int getEDDJEJMNLLCCount();
    /**
     * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
     * @param index The index of the element to return.
     * @return The eDDJEJMNLLC at the given index.
     */
    int getEDDJEJMNLLC(int index);

    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 5;</code>
     * @return The enum numeric value on the wire for failReason.
     */
    int getFailReasonValue();
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 5;</code>
     * @return The failReason.
     */
    emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason();
  }
  /**
   * <pre>
   * Obf: PPOLACNECHC
   * </pre>
   *
   * Protobuf type {@code WindFieldDungeonSettleInfo}
   */
  public static final class WindFieldDungeonSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindFieldDungeonSettleInfo)
      WindFieldDungeonSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindFieldDungeonSettleInfo.newBuilder() to construct.
    private WindFieldDungeonSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindFieldDungeonSettleInfo() {
      dNPOFKIINPL_ = emptyIntList();
      eDDJEJMNLLC_ = emptyIntList();
      failReason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindFieldDungeonSettleInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.class, emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.Builder.class);
    }

    public static final int DNPOFKIINPL_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList dNPOFKIINPL_;
    /**
     * <code>repeated uint32 DNPOFKIINPL = 4;</code>
     * @return A list containing the dNPOFKIINPL.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDNPOFKIINPLList() {
      return dNPOFKIINPL_;
    }
    /**
     * <code>repeated uint32 DNPOFKIINPL = 4;</code>
     * @return The count of dNPOFKIINPL.
     */
    public int getDNPOFKIINPLCount() {
      return dNPOFKIINPL_.size();
    }
    /**
     * <code>repeated uint32 DNPOFKIINPL = 4;</code>
     * @param index The index of the element to return.
     * @return The dNPOFKIINPL at the given index.
     */
    public int getDNPOFKIINPL(int index) {
      return dNPOFKIINPL_.getInt(index);
    }
    private int dNPOFKIINPLMemoizedSerializedSize = -1;

    public static final int EDDJEJMNLLC_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList eDDJEJMNLLC_;
    /**
     * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
     * @return A list containing the eDDJEJMNLLC.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEDDJEJMNLLCList() {
      return eDDJEJMNLLC_;
    }
    /**
     * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
     * @return The count of eDDJEJMNLLC.
     */
    public int getEDDJEJMNLLCCount() {
      return eDDJEJMNLLC_.size();
    }
    /**
     * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
     * @param index The index of the element to return.
     * @return The eDDJEJMNLLC at the given index.
     */
    public int getEDDJEJMNLLC(int index) {
      return eDDJEJMNLLC_.getInt(index);
    }
    private int eDDJEJMNLLCMemoizedSerializedSize = -1;

    public static final int FAIL_REASON_FIELD_NUMBER = 5;
    private int failReason_ = 0;
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 5;</code>
     * @return The enum numeric value on the wire for failReason.
     */
    @java.lang.Override public int getFailReasonValue() {
      return failReason_;
    }
    /**
     * <code>.WindFieldDungeonFailReason fail_reason = 5;</code>
     * @return The failReason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason() {
      emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason result = emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.forNumber(failReason_);
      return result == null ? emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.UNRECOGNIZED : result;
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
      getSerializedSize();
      if (getDNPOFKIINPLList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(dNPOFKIINPLMemoizedSerializedSize);
      }
      for (int i = 0; i < dNPOFKIINPL_.size(); i++) {
        output.writeUInt32NoTag(dNPOFKIINPL_.getInt(i));
      }
      if (failReason_ != emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.WIND_FIELD_DUNGEON_FAIL_NONE.getNumber()) {
        output.writeEnum(5, failReason_);
      }
      if (getEDDJEJMNLLCList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(eDDJEJMNLLCMemoizedSerializedSize);
      }
      for (int i = 0; i < eDDJEJMNLLC_.size(); i++) {
        output.writeUInt32NoTag(eDDJEJMNLLC_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < dNPOFKIINPL_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dNPOFKIINPL_.getInt(i));
        }
        size += dataSize;
        if (!getDNPOFKIINPLList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        dNPOFKIINPLMemoizedSerializedSize = dataSize;
      }
      if (failReason_ != emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.WIND_FIELD_DUNGEON_FAIL_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, failReason_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < eDDJEJMNLLC_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(eDDJEJMNLLC_.getInt(i));
        }
        size += dataSize;
        if (!getEDDJEJMNLLCList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        eDDJEJMNLLCMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo other = (emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) obj;

      if (!getDNPOFKIINPLList()
          .equals(other.getDNPOFKIINPLList())) return false;
      if (!getEDDJEJMNLLCList()
          .equals(other.getEDDJEJMNLLCList())) return false;
      if (failReason_ != other.failReason_) return false;
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
      if (getDNPOFKIINPLCount() > 0) {
        hash = (37 * hash) + DNPOFKIINPL_FIELD_NUMBER;
        hash = (53 * hash) + getDNPOFKIINPLList().hashCode();
      }
      if (getEDDJEJMNLLCCount() > 0) {
        hash = (37 * hash) + EDDJEJMNLLC_FIELD_NUMBER;
        hash = (53 * hash) + getEDDJEJMNLLCList().hashCode();
      }
      hash = (37 * hash) + FAIL_REASON_FIELD_NUMBER;
      hash = (53 * hash) + failReason_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo prototype) {
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
     * Obf: PPOLACNECHC
     * </pre>
     *
     * Protobuf type {@code WindFieldDungeonSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindFieldDungeonSettleInfo)
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.class, emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.newBuilder()
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
        dNPOFKIINPL_ = emptyIntList();
        eDDJEJMNLLC_ = emptyIntList();
        failReason_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.internal_static_WindFieldDungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo build() {
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo buildPartial() {
        emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result = new emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dNPOFKIINPL_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dNPOFKIINPL_ = dNPOFKIINPL_;
        if (((bitField0_ & 0x00000002) != 0)) {
          eDDJEJMNLLC_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.eDDJEJMNLLC_ = eDDJEJMNLLC_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.failReason_ = failReason_;
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
        if (other instanceof emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo other) {
        if (other == emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo.getDefaultInstance()) return this;
        if (!other.dNPOFKIINPL_.isEmpty()) {
          if (dNPOFKIINPL_.isEmpty()) {
            dNPOFKIINPL_ = other.dNPOFKIINPL_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDNPOFKIINPLIsMutable();
            dNPOFKIINPL_.addAll(other.dNPOFKIINPL_);
          }
          onChanged();
        }
        if (!other.eDDJEJMNLLC_.isEmpty()) {
          if (eDDJEJMNLLC_.isEmpty()) {
            eDDJEJMNLLC_ = other.eDDJEJMNLLC_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureEDDJEJMNLLCIsMutable();
            eDDJEJMNLLC_.addAll(other.eDDJEJMNLLC_);
          }
          onChanged();
        }
        if (other.failReason_ != 0) {
          setFailReasonValue(other.getFailReasonValue());
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
                int v = input.readUInt32();
                ensureDNPOFKIINPLIsMutable();
                dNPOFKIINPL_.addInt(v);
                break;
              } // case 32
              case 34: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureDNPOFKIINPLIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  dNPOFKIINPL_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 34
              case 40: {
                failReason_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 96: {
                int v = input.readUInt32();
                ensureEDDJEJMNLLCIsMutable();
                eDDJEJMNLLC_.addInt(v);
                break;
              } // case 96
              case 98: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureEDDJEJMNLLCIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  eDDJEJMNLLC_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 98
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

      private com.google.protobuf.Internal.IntList dNPOFKIINPL_ = emptyIntList();
      private void ensureDNPOFKIINPLIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dNPOFKIINPL_ = mutableCopy(dNPOFKIINPL_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 DNPOFKIINPL = 4;</code>
       * @return A list containing the dNPOFKIINPL.
       */
      public java.util.List<java.lang.Integer>
          getDNPOFKIINPLList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(dNPOFKIINPL_) : dNPOFKIINPL_;
      }
      /**
       * <code>repeated uint32 DNPOFKIINPL = 4;</code>
       * @return The count of dNPOFKIINPL.
       */
      public int getDNPOFKIINPLCount() {
        return dNPOFKIINPL_.size();
      }
      /**
       * <code>repeated uint32 DNPOFKIINPL = 4;</code>
       * @param index The index of the element to return.
       * @return The dNPOFKIINPL at the given index.
       */
      public int getDNPOFKIINPL(int index) {
        return dNPOFKIINPL_.getInt(index);
      }
      /**
       * <code>repeated uint32 DNPOFKIINPL = 4;</code>
       * @param index The index to set the value at.
       * @param value The dNPOFKIINPL to set.
       * @return This builder for chaining.
       */
      public Builder setDNPOFKIINPL(
          int index, int value) {

        ensureDNPOFKIINPLIsMutable();
        dNPOFKIINPL_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DNPOFKIINPL = 4;</code>
       * @param value The dNPOFKIINPL to add.
       * @return This builder for chaining.
       */
      public Builder addDNPOFKIINPL(int value) {

        ensureDNPOFKIINPLIsMutable();
        dNPOFKIINPL_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DNPOFKIINPL = 4;</code>
       * @param values The dNPOFKIINPL to add.
       * @return This builder for chaining.
       */
      public Builder addAllDNPOFKIINPL(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDNPOFKIINPLIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dNPOFKIINPL_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DNPOFKIINPL = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDNPOFKIINPL() {
        dNPOFKIINPL_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList eDDJEJMNLLC_ = emptyIntList();
      private void ensureEDDJEJMNLLCIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          eDDJEJMNLLC_ = mutableCopy(eDDJEJMNLLC_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
       * @return A list containing the eDDJEJMNLLC.
       */
      public java.util.List<java.lang.Integer>
          getEDDJEJMNLLCList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(eDDJEJMNLLC_) : eDDJEJMNLLC_;
      }
      /**
       * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
       * @return The count of eDDJEJMNLLC.
       */
      public int getEDDJEJMNLLCCount() {
        return eDDJEJMNLLC_.size();
      }
      /**
       * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
       * @param index The index of the element to return.
       * @return The eDDJEJMNLLC at the given index.
       */
      public int getEDDJEJMNLLC(int index) {
        return eDDJEJMNLLC_.getInt(index);
      }
      /**
       * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
       * @param index The index to set the value at.
       * @param value The eDDJEJMNLLC to set.
       * @return This builder for chaining.
       */
      public Builder setEDDJEJMNLLC(
          int index, int value) {

        ensureEDDJEJMNLLCIsMutable();
        eDDJEJMNLLC_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
       * @param value The eDDJEJMNLLC to add.
       * @return This builder for chaining.
       */
      public Builder addEDDJEJMNLLC(int value) {

        ensureEDDJEJMNLLCIsMutable();
        eDDJEJMNLLC_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
       * @param values The eDDJEJMNLLC to add.
       * @return This builder for chaining.
       */
      public Builder addAllEDDJEJMNLLC(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEDDJEJMNLLCIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, eDDJEJMNLLC_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 EDDJEJMNLLC = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearEDDJEJMNLLC() {
        eDDJEJMNLLC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int failReason_ = 0;
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 5;</code>
       * @return The enum numeric value on the wire for failReason.
       */
      @java.lang.Override public int getFailReasonValue() {
        return failReason_;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 5;</code>
       * @param value The enum numeric value on the wire for failReason to set.
       * @return This builder for chaining.
       */
      public Builder setFailReasonValue(int value) {
        failReason_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 5;</code>
       * @return The failReason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason getFailReason() {
        emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason result = emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.forNumber(failReason_);
        return result == null ? emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 5;</code>
       * @param value The failReason to set.
       * @return This builder for chaining.
       */
      public Builder setFailReason(emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.WindFieldDungeonFailReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        failReason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WindFieldDungeonFailReason fail_reason = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFailReason() {
        bitField0_ = (bitField0_ & ~0x00000004);
        failReason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WindFieldDungeonSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:WindFieldDungeonSettleInfo)
    private static final emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo();
    }

    public static emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindFieldDungeonSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<WindFieldDungeonSettleInfo>() {
      @java.lang.Override
      public WindFieldDungeonSettleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<WindFieldDungeonSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindFieldDungeonSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WindFieldDungeonSettleInfoOuterClass.WindFieldDungeonSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindFieldDungeonSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n WindFieldDungeonSettleInfo.proto\032 Wind" +
      "FieldDungeonFailReason.proto\"x\n\032WindFiel" +
      "dDungeonSettleInfo\022\023\n\013DNPOFKIINPL\030\004 \003(\r\022" +
      "\023\n\013EDDJEJMNLLC\030\014 \003(\r\0220\n\013fail_reason\030\005 \001(" +
      "\0162\033.WindFieldDungeonFailReasonB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.getDescriptor(),
        });
    internal_static_WindFieldDungeonSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindFieldDungeonSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindFieldDungeonSettleInfo_descriptor,
        new java.lang.String[] { "DNPOFKIINPL", "EDDJEJMNLLC", "FailReason", });
    emu.grasscutter.net.proto.WindFieldDungeonFailReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
