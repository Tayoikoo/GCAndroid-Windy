// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerMonthlyBrief.proto

package emu.grasscutter.net.proto;

public final class TowerMonthlyBriefOuterClass {
  private TowerMonthlyBriefOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerMonthlyBriefOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerMonthlyBrief)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 towerScheduleId = 12;</code>
     * @return The towerScheduleId.
     */
    int getTowerScheduleId();

    /**
     * <code>uint32 bestLevelIndex = 2;</code>
     * @return The bestLevelIndex.
     */
    int getBestLevelIndex();

    /**
     * <code>uint32 bestFloorIndex = 9;</code>
     * @return The bestFloorIndex.
     */
    int getBestFloorIndex();

    /**
     * <code>uint32 totalStarCount = 1;</code>
     * @return The totalStarCount.
     */
    int getTotalStarCount();
  }
  /**
   * <pre>
   * Name: PFEKDHGCBPP
   * </pre>
   *
   * Protobuf type {@code TowerMonthlyBrief}
   */
  public static final class TowerMonthlyBrief extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerMonthlyBrief)
      TowerMonthlyBriefOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerMonthlyBrief.newBuilder() to construct.
    private TowerMonthlyBrief(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerMonthlyBrief() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerMonthlyBrief();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.internal_static_TowerMonthlyBrief_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.internal_static_TowerMonthlyBrief_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.class, emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder.class);
    }

    public static final int TOWERSCHEDULEID_FIELD_NUMBER = 12;
    private int towerScheduleId_ = 0;
    /**
     * <code>uint32 towerScheduleId = 12;</code>
     * @return The towerScheduleId.
     */
    @java.lang.Override
    public int getTowerScheduleId() {
      return towerScheduleId_;
    }

    public static final int BESTLEVELINDEX_FIELD_NUMBER = 2;
    private int bestLevelIndex_ = 0;
    /**
     * <code>uint32 bestLevelIndex = 2;</code>
     * @return The bestLevelIndex.
     */
    @java.lang.Override
    public int getBestLevelIndex() {
      return bestLevelIndex_;
    }

    public static final int BESTFLOORINDEX_FIELD_NUMBER = 9;
    private int bestFloorIndex_ = 0;
    /**
     * <code>uint32 bestFloorIndex = 9;</code>
     * @return The bestFloorIndex.
     */
    @java.lang.Override
    public int getBestFloorIndex() {
      return bestFloorIndex_;
    }

    public static final int TOTALSTARCOUNT_FIELD_NUMBER = 1;
    private int totalStarCount_ = 0;
    /**
     * <code>uint32 totalStarCount = 1;</code>
     * @return The totalStarCount.
     */
    @java.lang.Override
    public int getTotalStarCount() {
      return totalStarCount_;
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
      if (totalStarCount_ != 0) {
        output.writeUInt32(1, totalStarCount_);
      }
      if (bestLevelIndex_ != 0) {
        output.writeUInt32(2, bestLevelIndex_);
      }
      if (bestFloorIndex_ != 0) {
        output.writeUInt32(9, bestFloorIndex_);
      }
      if (towerScheduleId_ != 0) {
        output.writeUInt32(12, towerScheduleId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (totalStarCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, totalStarCount_);
      }
      if (bestLevelIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, bestLevelIndex_);
      }
      if (bestFloorIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, bestFloorIndex_);
      }
      if (towerScheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, towerScheduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief other = (emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief) obj;

      if (getTowerScheduleId()
          != other.getTowerScheduleId()) return false;
      if (getBestLevelIndex()
          != other.getBestLevelIndex()) return false;
      if (getBestFloorIndex()
          != other.getBestFloorIndex()) return false;
      if (getTotalStarCount()
          != other.getTotalStarCount()) return false;
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
      hash = (37 * hash) + TOWERSCHEDULEID_FIELD_NUMBER;
      hash = (53 * hash) + getTowerScheduleId();
      hash = (37 * hash) + BESTLEVELINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getBestLevelIndex();
      hash = (37 * hash) + BESTFLOORINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getBestFloorIndex();
      hash = (37 * hash) + TOTALSTARCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTotalStarCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief prototype) {
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
     * Name: PFEKDHGCBPP
     * </pre>
     *
     * Protobuf type {@code TowerMonthlyBrief}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerMonthlyBrief)
        emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBriefOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.internal_static_TowerMonthlyBrief_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.internal_static_TowerMonthlyBrief_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.class, emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.newBuilder()
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
        towerScheduleId_ = 0;
        bestLevelIndex_ = 0;
        bestFloorIndex_ = 0;
        totalStarCount_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.internal_static_TowerMonthlyBrief_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief build() {
        emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief buildPartial() {
        emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief result = new emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.towerScheduleId_ = towerScheduleId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.bestLevelIndex_ = bestLevelIndex_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.bestFloorIndex_ = bestFloorIndex_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.totalStarCount_ = totalStarCount_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief) {
          return mergeFrom((emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief other) {
        if (other == emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief.getDefaultInstance()) return this;
        if (other.getTowerScheduleId() != 0) {
          setTowerScheduleId(other.getTowerScheduleId());
        }
        if (other.getBestLevelIndex() != 0) {
          setBestLevelIndex(other.getBestLevelIndex());
        }
        if (other.getBestFloorIndex() != 0) {
          setBestFloorIndex(other.getBestFloorIndex());
        }
        if (other.getTotalStarCount() != 0) {
          setTotalStarCount(other.getTotalStarCount());
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
                totalStarCount_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 8
              case 16: {
                bestLevelIndex_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 72: {
                bestFloorIndex_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 72
              case 96: {
                towerScheduleId_ = input.readUInt32();
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

      private int towerScheduleId_ ;
      /**
       * <code>uint32 towerScheduleId = 12;</code>
       * @return The towerScheduleId.
       */
      @java.lang.Override
      public int getTowerScheduleId() {
        return towerScheduleId_;
      }
      /**
       * <code>uint32 towerScheduleId = 12;</code>
       * @param value The towerScheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setTowerScheduleId(int value) {

        towerScheduleId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 towerScheduleId = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearTowerScheduleId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        towerScheduleId_ = 0;
        onChanged();
        return this;
      }

      private int bestLevelIndex_ ;
      /**
       * <code>uint32 bestLevelIndex = 2;</code>
       * @return The bestLevelIndex.
       */
      @java.lang.Override
      public int getBestLevelIndex() {
        return bestLevelIndex_;
      }
      /**
       * <code>uint32 bestLevelIndex = 2;</code>
       * @param value The bestLevelIndex to set.
       * @return This builder for chaining.
       */
      public Builder setBestLevelIndex(int value) {

        bestLevelIndex_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bestLevelIndex = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestLevelIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bestLevelIndex_ = 0;
        onChanged();
        return this;
      }

      private int bestFloorIndex_ ;
      /**
       * <code>uint32 bestFloorIndex = 9;</code>
       * @return The bestFloorIndex.
       */
      @java.lang.Override
      public int getBestFloorIndex() {
        return bestFloorIndex_;
      }
      /**
       * <code>uint32 bestFloorIndex = 9;</code>
       * @param value The bestFloorIndex to set.
       * @return This builder for chaining.
       */
      public Builder setBestFloorIndex(int value) {

        bestFloorIndex_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bestFloorIndex = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestFloorIndex() {
        bitField0_ = (bitField0_ & ~0x00000004);
        bestFloorIndex_ = 0;
        onChanged();
        return this;
      }

      private int totalStarCount_ ;
      /**
       * <code>uint32 totalStarCount = 1;</code>
       * @return The totalStarCount.
       */
      @java.lang.Override
      public int getTotalStarCount() {
        return totalStarCount_;
      }
      /**
       * <code>uint32 totalStarCount = 1;</code>
       * @param value The totalStarCount to set.
       * @return This builder for chaining.
       */
      public Builder setTotalStarCount(int value) {

        totalStarCount_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 totalStarCount = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalStarCount() {
        bitField0_ = (bitField0_ & ~0x00000008);
        totalStarCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TowerMonthlyBrief)
    }

    // @@protoc_insertion_point(class_scope:TowerMonthlyBrief)
    private static final emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief();
    }

    public static emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerMonthlyBrief>
        PARSER = new com.google.protobuf.AbstractParser<TowerMonthlyBrief>() {
      @java.lang.Override
      public TowerMonthlyBrief parsePartialFrom(
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

    public static com.google.protobuf.Parser<TowerMonthlyBrief> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerMonthlyBrief> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerMonthlyBriefOuterClass.TowerMonthlyBrief getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerMonthlyBrief_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerMonthlyBrief_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027TowerMonthlyBrief.proto\"t\n\021TowerMonthl" +
      "yBrief\022\027\n\017towerScheduleId\030\014 \001(\r\022\026\n\016bestL" +
      "evelIndex\030\002 \001(\r\022\026\n\016bestFloorIndex\030\t \001(\r\022" +
      "\026\n\016totalStarCount\030\001 \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerMonthlyBrief_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerMonthlyBrief_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerMonthlyBrief_descriptor,
        new java.lang.String[] { "TowerScheduleId", "BestLevelIndex", "BestFloorIndex", "TotalStarCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
