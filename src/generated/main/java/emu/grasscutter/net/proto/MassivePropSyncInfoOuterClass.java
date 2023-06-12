// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MassivePropSyncInfo.proto

package emu.grasscutter.net.proto;

public final class MassivePropSyncInfoOuterClass {
  private MassivePropSyncInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MassivePropSyncInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MassivePropSyncInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    long getId();

    /**
     * <code>repeated .MassivePropParam prop_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam> 
        getPropListList();
    /**
     * <code>repeated .MassivePropParam prop_list = 2;</code>
     */
    emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam getPropList(int index);
    /**
     * <code>repeated .MassivePropParam prop_list = 2;</code>
     */
    int getPropListCount();
    /**
     * <code>repeated .MassivePropParam prop_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParamOrBuilder> 
        getPropListOrBuilderList();
    /**
     * <code>repeated .MassivePropParam prop_list = 2;</code>
     */
    emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParamOrBuilder getPropListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: MNKOCGLGJNP
   * </pre>
   *
   * Protobuf type {@code MassivePropSyncInfo}
   */
  public static final class MassivePropSyncInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MassivePropSyncInfo)
      MassivePropSyncInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MassivePropSyncInfo.newBuilder() to construct.
    private MassivePropSyncInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MassivePropSyncInfo() {
      propList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MassivePropSyncInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.internal_static_MassivePropSyncInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.internal_static_MassivePropSyncInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo.class, emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_ = 0L;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }

    public static final int PROP_LIST_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam> propList_;
    /**
     * <code>repeated .MassivePropParam prop_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam> getPropListList() {
      return propList_;
    }
    /**
     * <code>repeated .MassivePropParam prop_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParamOrBuilder> 
        getPropListOrBuilderList() {
      return propList_;
    }
    /**
     * <code>repeated .MassivePropParam prop_list = 2;</code>
     */
    @java.lang.Override
    public int getPropListCount() {
      return propList_.size();
    }
    /**
     * <code>repeated .MassivePropParam prop_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam getPropList(int index) {
      return propList_.get(index);
    }
    /**
     * <code>repeated .MassivePropParam prop_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParamOrBuilder getPropListOrBuilder(
        int index) {
      return propList_.get(index);
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
      if (id_ != 0L) {
        output.writeInt64(1, id_);
      }
      for (int i = 0; i < propList_.size(); i++) {
        output.writeMessage(2, propList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      for (int i = 0; i < propList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, propList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo other = (emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo) obj;

      if (getId()
          != other.getId()) return false;
      if (!getPropListList()
          .equals(other.getPropListList())) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      if (getPropListCount() > 0) {
        hash = (37 * hash) + PROP_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPropListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo prototype) {
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
     * Name: MNKOCGLGJNP
     * </pre>
     *
     * Protobuf type {@code MassivePropSyncInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MassivePropSyncInfo)
        emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.internal_static_MassivePropSyncInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.internal_static_MassivePropSyncInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo.class, emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo.newBuilder()
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
        id_ = 0L;
        if (propListBuilder_ == null) {
          propList_ = java.util.Collections.emptyList();
        } else {
          propList_ = null;
          propListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.internal_static_MassivePropSyncInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo build() {
        emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo buildPartial() {
        emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo result = new emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo result) {
        if (propListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            propList_ = java.util.Collections.unmodifiableList(propList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.propList_ = propList_;
        } else {
          result.propList_ = propListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo) {
          return mergeFrom((emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo other) {
        if (other == emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (propListBuilder_ == null) {
          if (!other.propList_.isEmpty()) {
            if (propList_.isEmpty()) {
              propList_ = other.propList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensurePropListIsMutable();
              propList_.addAll(other.propList_);
            }
            onChanged();
          }
        } else {
          if (!other.propList_.isEmpty()) {
            if (propListBuilder_.isEmpty()) {
              propListBuilder_.dispose();
              propListBuilder_ = null;
              propList_ = other.propList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              propListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPropListFieldBuilder() : null;
            } else {
              propListBuilder_.addAllMessages(other.propList_);
            }
          }
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
                id_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam m =
                    input.readMessage(
                        emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.parser(),
                        extensionRegistry);
                if (propListBuilder_ == null) {
                  ensurePropListIsMutable();
                  propList_.add(m);
                } else {
                  propListBuilder_.addMessage(m);
                }
                break;
              } // case 18
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

      private long id_ ;
      /**
       * <code>int64 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public long getId() {
        return id_;
      }
      /**
       * <code>int64 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {

        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int64 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam> propList_ =
        java.util.Collections.emptyList();
      private void ensurePropListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          propList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam>(propList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParamOrBuilder> propListBuilder_;

      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam> getPropListList() {
        if (propListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(propList_);
        } else {
          return propListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public int getPropListCount() {
        if (propListBuilder_ == null) {
          return propList_.size();
        } else {
          return propListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam getPropList(int index) {
        if (propListBuilder_ == null) {
          return propList_.get(index);
        } else {
          return propListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public Builder setPropList(
          int index, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam value) {
        if (propListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropListIsMutable();
          propList_.set(index, value);
          onChanged();
        } else {
          propListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public Builder setPropList(
          int index, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder builderForValue) {
        if (propListBuilder_ == null) {
          ensurePropListIsMutable();
          propList_.set(index, builderForValue.build());
          onChanged();
        } else {
          propListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public Builder addPropList(emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam value) {
        if (propListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropListIsMutable();
          propList_.add(value);
          onChanged();
        } else {
          propListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public Builder addPropList(
          int index, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam value) {
        if (propListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropListIsMutable();
          propList_.add(index, value);
          onChanged();
        } else {
          propListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public Builder addPropList(
          emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder builderForValue) {
        if (propListBuilder_ == null) {
          ensurePropListIsMutable();
          propList_.add(builderForValue.build());
          onChanged();
        } else {
          propListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public Builder addPropList(
          int index, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder builderForValue) {
        if (propListBuilder_ == null) {
          ensurePropListIsMutable();
          propList_.add(index, builderForValue.build());
          onChanged();
        } else {
          propListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public Builder addAllPropList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam> values) {
        if (propListBuilder_ == null) {
          ensurePropListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, propList_);
          onChanged();
        } else {
          propListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public Builder clearPropList() {
        if (propListBuilder_ == null) {
          propList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          propListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public Builder removePropList(int index) {
        if (propListBuilder_ == null) {
          ensurePropListIsMutable();
          propList_.remove(index);
          onChanged();
        } else {
          propListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder getPropListBuilder(
          int index) {
        return getPropListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParamOrBuilder getPropListOrBuilder(
          int index) {
        if (propListBuilder_ == null) {
          return propList_.get(index);  } else {
          return propListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParamOrBuilder> 
           getPropListOrBuilderList() {
        if (propListBuilder_ != null) {
          return propListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(propList_);
        }
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder addPropListBuilder() {
        return getPropListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.getDefaultInstance());
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder addPropListBuilder(
          int index) {
        return getPropListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.getDefaultInstance());
      }
      /**
       * <code>repeated .MassivePropParam prop_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder> 
           getPropListBuilderList() {
        return getPropListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParamOrBuilder> 
          getPropListFieldBuilder() {
        if (propListBuilder_ == null) {
          propListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParamOrBuilder>(
                  propList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          propList_ = null;
        }
        return propListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MassivePropSyncInfo)
    }

    // @@protoc_insertion_point(class_scope:MassivePropSyncInfo)
    private static final emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo();
    }

    public static emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MassivePropSyncInfo>
        PARSER = new com.google.protobuf.AbstractParser<MassivePropSyncInfo>() {
      @java.lang.Override
      public MassivePropSyncInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<MassivePropSyncInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MassivePropSyncInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MassivePropSyncInfoOuterClass.MassivePropSyncInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MassivePropSyncInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MassivePropSyncInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031MassivePropSyncInfo.proto\032\026MassiveProp" +
      "Param.proto\"G\n\023MassivePropSyncInfo\022\n\n\002id" +
      "\030\001 \001(\003\022$\n\tprop_list\030\002 \003(\0132\021.MassivePropP" +
      "aramB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MassivePropParamOuterClass.getDescriptor(),
        });
    internal_static_MassivePropSyncInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MassivePropSyncInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MassivePropSyncInfo_descriptor,
        new java.lang.String[] { "Id", "PropList", });
    emu.grasscutter.net.proto.MassivePropParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
