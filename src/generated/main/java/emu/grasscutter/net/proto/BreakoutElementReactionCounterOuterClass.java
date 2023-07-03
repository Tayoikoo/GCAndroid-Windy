// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BreakoutElementReactionCounter.proto

package emu.grasscutter.net.proto;

public final class BreakoutElementReactionCounterOuterClass {
  private BreakoutElementReactionCounterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BreakoutElementReactionCounterOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BreakoutElementReactionCounter)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 element_reaction = 1;</code>
     * @return The elementReaction.
     */
    int getElementReaction();

    /**
     * <code>uint32 count = 2;</code>
     * @return The count.
     */
    int getCount();
  }
  /**
   * <pre>
   * Obf: ECLOAEHKMCA
   * </pre>
   *
   * Protobuf type {@code BreakoutElementReactionCounter}
   */
  public static final class BreakoutElementReactionCounter extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BreakoutElementReactionCounter)
      BreakoutElementReactionCounterOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BreakoutElementReactionCounter.newBuilder() to construct.
    private BreakoutElementReactionCounter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BreakoutElementReactionCounter() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BreakoutElementReactionCounter();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.internal_static_BreakoutElementReactionCounter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.internal_static_BreakoutElementReactionCounter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.class, emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.Builder.class);
    }

    public static final int ELEMENT_REACTION_FIELD_NUMBER = 1;
    private int elementReaction_ = 0;
    /**
     * <code>uint32 element_reaction = 1;</code>
     * @return The elementReaction.
     */
    @java.lang.Override
    public int getElementReaction() {
      return elementReaction_;
    }

    public static final int COUNT_FIELD_NUMBER = 2;
    private int count_ = 0;
    /**
     * <code>uint32 count = 2;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
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
      if (elementReaction_ != 0) {
        output.writeUInt32(1, elementReaction_);
      }
      if (count_ != 0) {
        output.writeUInt32(2, count_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (elementReaction_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, elementReaction_);
      }
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, count_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter other = (emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter) obj;

      if (getElementReaction()
          != other.getElementReaction()) return false;
      if (getCount()
          != other.getCount()) return false;
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
      hash = (37 * hash) + ELEMENT_REACTION_FIELD_NUMBER;
      hash = (53 * hash) + getElementReaction();
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter prototype) {
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
     * Obf: ECLOAEHKMCA
     * </pre>
     *
     * Protobuf type {@code BreakoutElementReactionCounter}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BreakoutElementReactionCounter)
        emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.internal_static_BreakoutElementReactionCounter_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.internal_static_BreakoutElementReactionCounter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.class, emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.newBuilder()
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
        elementReaction_ = 0;
        count_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.internal_static_BreakoutElementReactionCounter_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter build() {
        emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter buildPartial() {
        emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter result = new emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.elementReaction_ = elementReaction_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.count_ = count_;
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
        if (other instanceof emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter) {
          return mergeFrom((emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter other) {
        if (other == emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter.getDefaultInstance()) return this;
        if (other.getElementReaction() != 0) {
          setElementReaction(other.getElementReaction());
        }
        if (other.getCount() != 0) {
          setCount(other.getCount());
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
                elementReaction_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                count_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private int elementReaction_ ;
      /**
       * <code>uint32 element_reaction = 1;</code>
       * @return The elementReaction.
       */
      @java.lang.Override
      public int getElementReaction() {
        return elementReaction_;
      }
      /**
       * <code>uint32 element_reaction = 1;</code>
       * @param value The elementReaction to set.
       * @return This builder for chaining.
       */
      public Builder setElementReaction(int value) {

        elementReaction_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_reaction = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementReaction() {
        bitField0_ = (bitField0_ & ~0x00000001);
        elementReaction_ = 0;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>uint32 count = 2;</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 2;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {

        count_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        count_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BreakoutElementReactionCounter)
    }

    // @@protoc_insertion_point(class_scope:BreakoutElementReactionCounter)
    private static final emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter();
    }

    public static emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BreakoutElementReactionCounter>
        PARSER = new com.google.protobuf.AbstractParser<BreakoutElementReactionCounter>() {
      @java.lang.Override
      public BreakoutElementReactionCounter parsePartialFrom(
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

    public static com.google.protobuf.Parser<BreakoutElementReactionCounter> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BreakoutElementReactionCounter> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BreakoutElementReactionCounterOuterClass.BreakoutElementReactionCounter getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BreakoutElementReactionCounter_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BreakoutElementReactionCounter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$BreakoutElementReactionCounter.proto\"I" +
      "\n\036BreakoutElementReactionCounter\022\030\n\020elem" +
      "ent_reaction\030\001 \001(\r\022\r\n\005count\030\002 \001(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BreakoutElementReactionCounter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BreakoutElementReactionCounter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BreakoutElementReactionCounter_descriptor,
        new java.lang.String[] { "ElementReaction", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
