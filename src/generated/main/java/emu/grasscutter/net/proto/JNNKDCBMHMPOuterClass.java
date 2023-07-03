// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JNNKDCBMHMP.proto

package emu.grasscutter.net.proto;

public final class JNNKDCBMHMPOuterClass {
  private JNNKDCBMHMPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JNNKDCBMHMPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JNNKDCBMHMP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 min_finish_time = 10;</code>
     * @return The minFinishTime.
     */
    int getMinFinishTime();

    /**
     * <code>uint32 JOCCKLGBFKP = 13;</code>
     * @return The jOCCKLGBFKP.
     */
    int getJOCCKLGBFKP();
  }
  /**
   * Protobuf type {@code JNNKDCBMHMP}
   */
  public static final class JNNKDCBMHMP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JNNKDCBMHMP)
      JNNKDCBMHMPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JNNKDCBMHMP.newBuilder() to construct.
    private JNNKDCBMHMP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JNNKDCBMHMP() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JNNKDCBMHMP();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.internal_static_JNNKDCBMHMP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.internal_static_JNNKDCBMHMP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP.class, emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 12;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 12;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 7;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 7;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int MIN_FINISH_TIME_FIELD_NUMBER = 10;
    private int minFinishTime_ = 0;
    /**
     * <code>uint32 min_finish_time = 10;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public int getMinFinishTime() {
      return minFinishTime_;
    }

    public static final int JOCCKLGBFKP_FIELD_NUMBER = 13;
    private int jOCCKLGBFKP_ = 0;
    /**
     * <code>uint32 JOCCKLGBFKP = 13;</code>
     * @return The jOCCKLGBFKP.
     */
    @java.lang.Override
    public int getJOCCKLGBFKP() {
      return jOCCKLGBFKP_;
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
      if (levelId_ != 0) {
        output.writeUInt32(7, levelId_);
      }
      if (minFinishTime_ != 0) {
        output.writeUInt32(10, minFinishTime_);
      }
      if (isOpen_ != false) {
        output.writeBool(12, isOpen_);
      }
      if (jOCCKLGBFKP_ != 0) {
        output.writeUInt32(13, jOCCKLGBFKP_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, levelId_);
      }
      if (minFinishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, minFinishTime_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isOpen_);
      }
      if (jOCCKLGBFKP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, jOCCKLGBFKP_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP other = (emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getMinFinishTime()
          != other.getMinFinishTime()) return false;
      if (getJOCCKLGBFKP()
          != other.getJOCCKLGBFKP()) return false;
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
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinFinishTime();
      hash = (37 * hash) + JOCCKLGBFKP_FIELD_NUMBER;
      hash = (53 * hash) + getJOCCKLGBFKP();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP prototype) {
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
     * Protobuf type {@code JNNKDCBMHMP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JNNKDCBMHMP)
        emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.internal_static_JNNKDCBMHMP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.internal_static_JNNKDCBMHMP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP.class, emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP.newBuilder()
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
        isOpen_ = false;
        levelId_ = 0;
        minFinishTime_ = 0;
        jOCCKLGBFKP_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.internal_static_JNNKDCBMHMP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP build() {
        emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP buildPartial() {
        emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP result = new emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.minFinishTime_ = minFinishTime_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.jOCCKLGBFKP_ = jOCCKLGBFKP_;
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
        if (other instanceof emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP) {
          return mergeFrom((emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP other) {
        if (other == emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getMinFinishTime() != 0) {
          setMinFinishTime(other.getMinFinishTime());
        }
        if (other.getJOCCKLGBFKP() != 0) {
          setJOCCKLGBFKP(other.getJOCCKLGBFKP());
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
              case 56: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 80: {
                minFinishTime_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 80
              case 96: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
              case 104: {
                jOCCKLGBFKP_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 104
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

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 12;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 12;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {

        isOpen_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 7;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int minFinishTime_ ;
      /**
       * <code>uint32 min_finish_time = 10;</code>
       * @return The minFinishTime.
       */
      @java.lang.Override
      public int getMinFinishTime() {
        return minFinishTime_;
      }
      /**
       * <code>uint32 min_finish_time = 10;</code>
       * @param value The minFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinFinishTime(int value) {

        minFinishTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_finish_time = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinFinishTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        minFinishTime_ = 0;
        onChanged();
        return this;
      }

      private int jOCCKLGBFKP_ ;
      /**
       * <code>uint32 JOCCKLGBFKP = 13;</code>
       * @return The jOCCKLGBFKP.
       */
      @java.lang.Override
      public int getJOCCKLGBFKP() {
        return jOCCKLGBFKP_;
      }
      /**
       * <code>uint32 JOCCKLGBFKP = 13;</code>
       * @param value The jOCCKLGBFKP to set.
       * @return This builder for chaining.
       */
      public Builder setJOCCKLGBFKP(int value) {

        jOCCKLGBFKP_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JOCCKLGBFKP = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearJOCCKLGBFKP() {
        bitField0_ = (bitField0_ & ~0x00000008);
        jOCCKLGBFKP_ = 0;
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


      // @@protoc_insertion_point(builder_scope:JNNKDCBMHMP)
    }

    // @@protoc_insertion_point(class_scope:JNNKDCBMHMP)
    private static final emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP();
    }

    public static emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JNNKDCBMHMP>
        PARSER = new com.google.protobuf.AbstractParser<JNNKDCBMHMP>() {
      @java.lang.Override
      public JNNKDCBMHMP parsePartialFrom(
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

    public static com.google.protobuf.Parser<JNNKDCBMHMP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JNNKDCBMHMP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JNNKDCBMHMPOuterClass.JNNKDCBMHMP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JNNKDCBMHMP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JNNKDCBMHMP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JNNKDCBMHMP.proto\"^\n\013JNNKDCBMHMP\022\017\n\007is" +
      "_open\030\014 \001(\010\022\020\n\010level_id\030\007 \001(\r\022\027\n\017min_fin" +
      "ish_time\030\n \001(\r\022\023\n\013JOCCKLGBFKP\030\r \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JNNKDCBMHMP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JNNKDCBMHMP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JNNKDCBMHMP_descriptor,
        new java.lang.String[] { "IsOpen", "LevelId", "MinFinishTime", "JOCCKLGBFKP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
