// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JAAACKLMLHI.proto

package emu.grasscutter.net.proto;

public final class JAAACKLMLHIOuterClass {
  private JAAACKLMLHIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JAAACKLMLHIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JAAACKLMLHI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 DHNNFFCLPGH = 12;</code>
     * @return The dHNNFFCLPGH.
     */
    int getDHNNFFCLPGH();

    /**
     * <code>bool is_finish = 2;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>bool is_open = 10;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 level_id = 1;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * Name: JAAACKLMLHI
   * </pre>
   *
   * Protobuf type {@code JAAACKLMLHI}
   */
  public static final class JAAACKLMLHI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JAAACKLMLHI)
      JAAACKLMLHIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JAAACKLMLHI.newBuilder() to construct.
    private JAAACKLMLHI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JAAACKLMLHI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JAAACKLMLHI();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.internal_static_JAAACKLMLHI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.internal_static_JAAACKLMLHI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI.class, emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI.Builder.class);
    }

    public static final int DHNNFFCLPGH_FIELD_NUMBER = 12;
    private int dHNNFFCLPGH_ = 0;
    /**
     * <code>uint32 DHNNFFCLPGH = 12;</code>
     * @return The dHNNFFCLPGH.
     */
    @java.lang.Override
    public int getDHNNFFCLPGH() {
      return dHNNFFCLPGH_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 2;
    private boolean isFinish_ = false;
    /**
     * <code>bool is_finish = 2;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 10;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 10;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 1;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 1;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
        output.writeUInt32(1, levelId_);
      }
      if (isFinish_ != false) {
        output.writeBool(2, isFinish_);
      }
      if (isOpen_ != false) {
        output.writeBool(10, isOpen_);
      }
      if (dHNNFFCLPGH_ != 0) {
        output.writeUInt32(12, dHNNFFCLPGH_);
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
          .computeUInt32Size(1, levelId_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isFinish_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isOpen_);
      }
      if (dHNNFFCLPGH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, dHNNFFCLPGH_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI other = (emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI) obj;

      if (getDHNNFFCLPGH()
          != other.getDHNNFFCLPGH()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + DHNNFFCLPGH_FIELD_NUMBER;
      hash = (53 * hash) + getDHNNFFCLPGH();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI prototype) {
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
     * Name: JAAACKLMLHI
     * </pre>
     *
     * Protobuf type {@code JAAACKLMLHI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JAAACKLMLHI)
        emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.internal_static_JAAACKLMLHI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.internal_static_JAAACKLMLHI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI.class, emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI.newBuilder()
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
        dHNNFFCLPGH_ = 0;
        isFinish_ = false;
        isOpen_ = false;
        levelId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.internal_static_JAAACKLMLHI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI build() {
        emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI buildPartial() {
        emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI result = new emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dHNNFFCLPGH_ = dHNNFFCLPGH_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isFinish_ = isFinish_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI) {
          return mergeFrom((emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI other) {
        if (other == emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI.getDefaultInstance()) return this;
        if (other.getDHNNFFCLPGH() != 0) {
          setDHNNFFCLPGH(other.getDHNNFFCLPGH());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 8
              case 16: {
                isFinish_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 80: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 80
              case 96: {
                dHNNFFCLPGH_ = input.readUInt32();
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

      private int dHNNFFCLPGH_ ;
      /**
       * <code>uint32 DHNNFFCLPGH = 12;</code>
       * @return The dHNNFFCLPGH.
       */
      @java.lang.Override
      public int getDHNNFFCLPGH() {
        return dHNNFFCLPGH_;
      }
      /**
       * <code>uint32 DHNNFFCLPGH = 12;</code>
       * @param value The dHNNFFCLPGH to set.
       * @return This builder for chaining.
       */
      public Builder setDHNNFFCLPGH(int value) {

        dHNNFFCLPGH_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DHNNFFCLPGH = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDHNNFFCLPGH() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dHNNFFCLPGH_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 2;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 2;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {

        isFinish_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isFinish_ = false;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 10;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 10;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {

        isOpen_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 1;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 1;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:JAAACKLMLHI)
    }

    // @@protoc_insertion_point(class_scope:JAAACKLMLHI)
    private static final emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI();
    }

    public static emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JAAACKLMLHI>
        PARSER = new com.google.protobuf.AbstractParser<JAAACKLMLHI>() {
      @java.lang.Override
      public JAAACKLMLHI parsePartialFrom(
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

    public static com.google.protobuf.Parser<JAAACKLMLHI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JAAACKLMLHI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JAAACKLMLHIOuterClass.JAAACKLMLHI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JAAACKLMLHI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JAAACKLMLHI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JAAACKLMLHI.proto\"X\n\013JAAACKLMLHI\022\023\n\013DH" +
      "NNFFCLPGH\030\014 \001(\r\022\021\n\tis_finish\030\002 \001(\010\022\017\n\007is" +
      "_open\030\n \001(\010\022\020\n\010level_id\030\001 \001(\rB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JAAACKLMLHI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JAAACKLMLHI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JAAACKLMLHI_descriptor,
        new java.lang.String[] { "DHNNFFCLPGH", "IsFinish", "IsOpen", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
