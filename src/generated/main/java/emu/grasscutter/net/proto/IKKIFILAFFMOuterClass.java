// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IKKIFILAFFM.proto

package emu.grasscutter.net.proto;

public final class IKKIFILAFFMOuterClass {
  private IKKIFILAFFMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IKKIFILAFFMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IKKIFILAFFM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 3;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return A list containing the affixList.
     */
    java.util.List<java.lang.Integer> getAffixListList();
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return The count of affixList.
     */
    int getAffixListCount();
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    int getAffixList(int index);

    /**
     * <code>uint32 max_score = 10;</code>
     * @return The maxScore.
     */
    int getMaxScore();

    /**
     * <code>uint32 OPGBGHPHELB = 15;</code>
     * @return The oPGBGHPHELB.
     */
    int getOPGBGHPHELB();
  }
  /**
   * Protobuf type {@code IKKIFILAFFM}
   */
  public static final class IKKIFILAFFM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IKKIFILAFFM)
      IKKIFILAFFMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IKKIFILAFFM.newBuilder() to construct.
    private IKKIFILAFFM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IKKIFILAFFM() {
      affixList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IKKIFILAFFM();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.internal_static_IKKIFILAFFM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.internal_static_IKKIFILAFFM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM.class, emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 3;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 3;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int AFFIX_LIST_FIELD_NUMBER = 13;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList affixList_;
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return A list containing the affixList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAffixListList() {
      return affixList_;
    }
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @return The count of affixList.
     */
    public int getAffixListCount() {
      return affixList_.size();
    }
    /**
     * <code>repeated uint32 affix_list = 13;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    public int getAffixList(int index) {
      return affixList_.getInt(index);
    }
    private int affixListMemoizedSerializedSize = -1;

    public static final int MAX_SCORE_FIELD_NUMBER = 10;
    private int maxScore_ = 0;
    /**
     * <code>uint32 max_score = 10;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }

    public static final int OPGBGHPHELB_FIELD_NUMBER = 15;
    private int oPGBGHPHELB_ = 0;
    /**
     * <code>uint32 OPGBGHPHELB = 15;</code>
     * @return The oPGBGHPHELB.
     */
    @java.lang.Override
    public int getOPGBGHPHELB() {
      return oPGBGHPHELB_;
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
      if (levelId_ != 0) {
        output.writeUInt32(3, levelId_);
      }
      if (maxScore_ != 0) {
        output.writeUInt32(10, maxScore_);
      }
      if (getAffixListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(affixListMemoizedSerializedSize);
      }
      for (int i = 0; i < affixList_.size(); i++) {
        output.writeUInt32NoTag(affixList_.getInt(i));
      }
      if (oPGBGHPHELB_ != 0) {
        output.writeUInt32(15, oPGBGHPHELB_);
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
          .computeUInt32Size(3, levelId_);
      }
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, maxScore_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < affixList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(affixList_.getInt(i));
        }
        size += dataSize;
        if (!getAffixListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        affixListMemoizedSerializedSize = dataSize;
      }
      if (oPGBGHPHELB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, oPGBGHPHELB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM other = (emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (!getAffixListList()
          .equals(other.getAffixListList())) return false;
      if (getMaxScore()
          != other.getMaxScore()) return false;
      if (getOPGBGHPHELB()
          != other.getOPGBGHPHELB()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      if (getAffixListCount() > 0) {
        hash = (37 * hash) + AFFIX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAffixListList().hashCode();
      }
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (37 * hash) + OPGBGHPHELB_FIELD_NUMBER;
      hash = (53 * hash) + getOPGBGHPHELB();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM prototype) {
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
     * Protobuf type {@code IKKIFILAFFM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IKKIFILAFFM)
        emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.internal_static_IKKIFILAFFM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.internal_static_IKKIFILAFFM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM.class, emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM.newBuilder()
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
        levelId_ = 0;
        affixList_ = emptyIntList();
        maxScore_ = 0;
        oPGBGHPHELB_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.internal_static_IKKIFILAFFM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM build() {
        emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM buildPartial() {
        emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM result = new emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          affixList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.affixList_ = affixList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.maxScore_ = maxScore_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.oPGBGHPHELB_ = oPGBGHPHELB_;
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
        if (other instanceof emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM) {
          return mergeFrom((emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM other) {
        if (other == emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (!other.affixList_.isEmpty()) {
          if (affixList_.isEmpty()) {
            affixList_ = other.affixList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAffixListIsMutable();
            affixList_.addAll(other.affixList_);
          }
          onChanged();
        }
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
        }
        if (other.getOPGBGHPHELB() != 0) {
          setOPGBGHPHELB(other.getOPGBGHPHELB());
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
              case 24: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 80: {
                maxScore_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 80
              case 104: {
                int v = input.readUInt32();
                ensureAffixListIsMutable();
                affixList_.addInt(v);
                break;
              } // case 104
              case 106: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAffixListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  affixList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 106
              case 120: {
                oPGBGHPHELB_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 120
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

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 3;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 3;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList affixList_ = emptyIntList();
      private void ensureAffixListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          affixList_ = mutableCopy(affixList_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @return A list containing the affixList.
       */
      public java.util.List<java.lang.Integer>
          getAffixListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(affixList_) : affixList_;
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @return The count of affixList.
       */
      public int getAffixListCount() {
        return affixList_.size();
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @param index The index of the element to return.
       * @return The affixList at the given index.
       */
      public int getAffixList(int index) {
        return affixList_.getInt(index);
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The affixList to set.
       * @return This builder for chaining.
       */
      public Builder setAffixList(
          int index, int value) {

        ensureAffixListIsMutable();
        affixList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @param value The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAffixList(int value) {

        ensureAffixListIsMutable();
        affixList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @param values The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAffixList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAffixListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, affixList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAffixList() {
        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 10;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 10;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {

        maxScore_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        bitField0_ = (bitField0_ & ~0x00000004);
        maxScore_ = 0;
        onChanged();
        return this;
      }

      private int oPGBGHPHELB_ ;
      /**
       * <code>uint32 OPGBGHPHELB = 15;</code>
       * @return The oPGBGHPHELB.
       */
      @java.lang.Override
      public int getOPGBGHPHELB() {
        return oPGBGHPHELB_;
      }
      /**
       * <code>uint32 OPGBGHPHELB = 15;</code>
       * @param value The oPGBGHPHELB to set.
       * @return This builder for chaining.
       */
      public Builder setOPGBGHPHELB(int value) {

        oPGBGHPHELB_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OPGBGHPHELB = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearOPGBGHPHELB() {
        bitField0_ = (bitField0_ & ~0x00000008);
        oPGBGHPHELB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IKKIFILAFFM)
    }

    // @@protoc_insertion_point(class_scope:IKKIFILAFFM)
    private static final emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM();
    }

    public static emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IKKIFILAFFM>
        PARSER = new com.google.protobuf.AbstractParser<IKKIFILAFFM>() {
      @java.lang.Override
      public IKKIFILAFFM parsePartialFrom(
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

    public static com.google.protobuf.Parser<IKKIFILAFFM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IKKIFILAFFM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IKKIFILAFFMOuterClass.IKKIFILAFFM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IKKIFILAFFM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IKKIFILAFFM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IKKIFILAFFM.proto\"[\n\013IKKIFILAFFM\022\020\n\010le" +
      "vel_id\030\003 \001(\r\022\022\n\naffix_list\030\r \003(\r\022\021\n\tmax_" +
      "score\030\n \001(\r\022\023\n\013OPGBGHPHELB\030\017 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IKKIFILAFFM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IKKIFILAFFM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IKKIFILAFFM_descriptor,
        new java.lang.String[] { "LevelId", "AffixList", "MaxScore", "OPGBGHPHELB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
