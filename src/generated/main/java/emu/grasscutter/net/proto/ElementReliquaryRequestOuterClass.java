// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ElementReliquaryRequest.proto

package emu.grasscutter.net.proto;

public final class ElementReliquaryRequestOuterClass {
  private ElementReliquaryRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ElementReliquaryRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ElementReliquaryRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 elementType = 12;</code>
     * @return The elementType.
     */
    int getElementType();

    /**
     * <code>uint32 equipType = 7;</code>
     * @return The equipType.
     */
    int getEquipType();
  }
  /**
   * Protobuf type {@code ElementReliquaryRequest}
   */
  public static final class ElementReliquaryRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ElementReliquaryRequest)
      ElementReliquaryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ElementReliquaryRequest.newBuilder() to construct.
    private ElementReliquaryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ElementReliquaryRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ElementReliquaryRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.internal_static_ElementReliquaryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.internal_static_ElementReliquaryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest.class, emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest.Builder.class);
    }

    public static final int ELEMENTTYPE_FIELD_NUMBER = 12;
    private int elementType_ = 0;
    /**
     * <code>uint32 elementType = 12;</code>
     * @return The elementType.
     */
    @java.lang.Override
    public int getElementType() {
      return elementType_;
    }

    public static final int EQUIPTYPE_FIELD_NUMBER = 7;
    private int equipType_ = 0;
    /**
     * <code>uint32 equipType = 7;</code>
     * @return The equipType.
     */
    @java.lang.Override
    public int getEquipType() {
      return equipType_;
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
      if (equipType_ != 0) {
        output.writeUInt32(7, equipType_);
      }
      if (elementType_ != 0) {
        output.writeUInt32(12, elementType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (equipType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, equipType_);
      }
      if (elementType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, elementType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest other = (emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest) obj;

      if (getElementType()
          != other.getElementType()) return false;
      if (getEquipType()
          != other.getEquipType()) return false;
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
      hash = (37 * hash) + ELEMENTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementType();
      hash = (37 * hash) + EQUIPTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEquipType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest prototype) {
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
     * Protobuf type {@code ElementReliquaryRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ElementReliquaryRequest)
        emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.internal_static_ElementReliquaryRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.internal_static_ElementReliquaryRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest.class, emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest.newBuilder()
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
        elementType_ = 0;
        equipType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.internal_static_ElementReliquaryRequest_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest build() {
        emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest buildPartial() {
        emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest result = new emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.elementType_ = elementType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.equipType_ = equipType_;
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
        if (other instanceof emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest) {
          return mergeFrom((emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest other) {
        if (other == emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest.getDefaultInstance()) return this;
        if (other.getElementType() != 0) {
          setElementType(other.getElementType());
        }
        if (other.getEquipType() != 0) {
          setEquipType(other.getEquipType());
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
                equipType_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 96: {
                elementType_ = input.readUInt32();
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

      private int elementType_ ;
      /**
       * <code>uint32 elementType = 12;</code>
       * @return The elementType.
       */
      @java.lang.Override
      public int getElementType() {
        return elementType_;
      }
      /**
       * <code>uint32 elementType = 12;</code>
       * @param value The elementType to set.
       * @return This builder for chaining.
       */
      public Builder setElementType(int value) {

        elementType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 elementType = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        elementType_ = 0;
        onChanged();
        return this;
      }

      private int equipType_ ;
      /**
       * <code>uint32 equipType = 7;</code>
       * @return The equipType.
       */
      @java.lang.Override
      public int getEquipType() {
        return equipType_;
      }
      /**
       * <code>uint32 equipType = 7;</code>
       * @param value The equipType to set.
       * @return This builder for chaining.
       */
      public Builder setEquipType(int value) {

        equipType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 equipType = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearEquipType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        equipType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ElementReliquaryRequest)
    }

    // @@protoc_insertion_point(class_scope:ElementReliquaryRequest)
    private static final emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest();
    }

    public static emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ElementReliquaryRequest>
        PARSER = new com.google.protobuf.AbstractParser<ElementReliquaryRequest>() {
      @java.lang.Override
      public ElementReliquaryRequest parsePartialFrom(
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

    public static com.google.protobuf.Parser<ElementReliquaryRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ElementReliquaryRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ElementReliquaryRequestOuterClass.ElementReliquaryRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ElementReliquaryRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ElementReliquaryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ElementReliquaryRequest.proto\"A\n\027Eleme" +
      "ntReliquaryRequest\022\023\n\013elementType\030\014 \001(\r\022" +
      "\021\n\tequipType\030\007 \001(\rB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ElementReliquaryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ElementReliquaryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ElementReliquaryRequest_descriptor,
        new java.lang.String[] { "ElementType", "EquipType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
