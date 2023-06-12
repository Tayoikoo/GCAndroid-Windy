// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeGetArrangementInfoRsp.proto

package emu.grasscutter.net.proto;

public final class HomeGetArrangementInfoRspOuterClass {
  private HomeGetArrangementInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeGetArrangementInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeGetArrangementInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> 
        getSceneArrangementInfoListList();
    /**
     * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
     */
    emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfoList(int index);
    /**
     * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
     */
    int getSceneArrangementInfoListCount();
    /**
     * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> 
        getSceneArrangementInfoListOrBuilderList();
    /**
     * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
     */
    emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 4822
   * Name: NMPEOOGOBKE
   * </pre>
   *
   * Protobuf type {@code HomeGetArrangementInfoRsp}
   */
  public static final class HomeGetArrangementInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeGetArrangementInfoRsp)
      HomeGetArrangementInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeGetArrangementInfoRsp.newBuilder() to construct.
    private HomeGetArrangementInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeGetArrangementInfoRsp() {
      sceneArrangementInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeGetArrangementInfoRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.internal_static_HomeGetArrangementInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.internal_static_HomeGetArrangementInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp.class, emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp.Builder.class);
    }

    public static final int SCENE_ARRANGEMENT_INFO_LIST_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> sceneArrangementInfoList_;
    /**
     * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> getSceneArrangementInfoListList() {
      return sceneArrangementInfoList_;
    }
    /**
     * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> 
        getSceneArrangementInfoListOrBuilderList() {
      return sceneArrangementInfoList_;
    }
    /**
     * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
     */
    @java.lang.Override
    public int getSceneArrangementInfoListCount() {
      return sceneArrangementInfoList_.size();
    }
    /**
     * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfoList(int index) {
      return sceneArrangementInfoList_.get(index);
    }
    /**
     * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoListOrBuilder(
        int index) {
      return sceneArrangementInfoList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      for (int i = 0; i < sceneArrangementInfoList_.size(); i++) {
        output.writeMessage(12, sceneArrangementInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      for (int i = 0; i < sceneArrangementInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, sceneArrangementInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp other = (emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp) obj;

      if (!getSceneArrangementInfoListList()
          .equals(other.getSceneArrangementInfoListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getSceneArrangementInfoListCount() > 0) {
        hash = (37 * hash) + SCENE_ARRANGEMENT_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSceneArrangementInfoListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp prototype) {
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
     * CmdId: 4822
     * Name: NMPEOOGOBKE
     * </pre>
     *
     * Protobuf type {@code HomeGetArrangementInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeGetArrangementInfoRsp)
        emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.internal_static_HomeGetArrangementInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.internal_static_HomeGetArrangementInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp.class, emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp.newBuilder()
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
        if (sceneArrangementInfoListBuilder_ == null) {
          sceneArrangementInfoList_ = java.util.Collections.emptyList();
        } else {
          sceneArrangementInfoList_ = null;
          sceneArrangementInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.internal_static_HomeGetArrangementInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp build() {
        emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp buildPartial() {
        emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp result = new emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp result) {
        if (sceneArrangementInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            sceneArrangementInfoList_ = java.util.Collections.unmodifiableList(sceneArrangementInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.sceneArrangementInfoList_ = sceneArrangementInfoList_;
        } else {
          result.sceneArrangementInfoList_ = sceneArrangementInfoListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp other) {
        if (other == emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp.getDefaultInstance()) return this;
        if (sceneArrangementInfoListBuilder_ == null) {
          if (!other.sceneArrangementInfoList_.isEmpty()) {
            if (sceneArrangementInfoList_.isEmpty()) {
              sceneArrangementInfoList_ = other.sceneArrangementInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSceneArrangementInfoListIsMutable();
              sceneArrangementInfoList_.addAll(other.sceneArrangementInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.sceneArrangementInfoList_.isEmpty()) {
            if (sceneArrangementInfoListBuilder_.isEmpty()) {
              sceneArrangementInfoListBuilder_.dispose();
              sceneArrangementInfoListBuilder_ = null;
              sceneArrangementInfoList_ = other.sceneArrangementInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              sceneArrangementInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSceneArrangementInfoListFieldBuilder() : null;
            } else {
              sceneArrangementInfoListBuilder_.addAllMessages(other.sceneArrangementInfoList_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 40: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 98: {
                emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.parser(),
                        extensionRegistry);
                if (sceneArrangementInfoListBuilder_ == null) {
                  ensureSceneArrangementInfoListIsMutable();
                  sceneArrangementInfoList_.add(m);
                } else {
                  sceneArrangementInfoListBuilder_.addMessage(m);
                }
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

      private java.util.List<emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> sceneArrangementInfoList_ =
        java.util.Collections.emptyList();
      private void ensureSceneArrangementInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sceneArrangementInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo>(sceneArrangementInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> sceneArrangementInfoListBuilder_;

      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> getSceneArrangementInfoListList() {
        if (sceneArrangementInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(sceneArrangementInfoList_);
        } else {
          return sceneArrangementInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public int getSceneArrangementInfoListCount() {
        if (sceneArrangementInfoListBuilder_ == null) {
          return sceneArrangementInfoList_.size();
        } else {
          return sceneArrangementInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfoList(int index) {
        if (sceneArrangementInfoListBuilder_ == null) {
          return sceneArrangementInfoList_.get(index);
        } else {
          return sceneArrangementInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public Builder setSceneArrangementInfoList(
          int index, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
        if (sceneArrangementInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSceneArrangementInfoListIsMutable();
          sceneArrangementInfoList_.set(index, value);
          onChanged();
        } else {
          sceneArrangementInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public Builder setSceneArrangementInfoList(
          int index, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder builderForValue) {
        if (sceneArrangementInfoListBuilder_ == null) {
          ensureSceneArrangementInfoListIsMutable();
          sceneArrangementInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          sceneArrangementInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public Builder addSceneArrangementInfoList(emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
        if (sceneArrangementInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSceneArrangementInfoListIsMutable();
          sceneArrangementInfoList_.add(value);
          onChanged();
        } else {
          sceneArrangementInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public Builder addSceneArrangementInfoList(
          int index, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
        if (sceneArrangementInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSceneArrangementInfoListIsMutable();
          sceneArrangementInfoList_.add(index, value);
          onChanged();
        } else {
          sceneArrangementInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public Builder addSceneArrangementInfoList(
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder builderForValue) {
        if (sceneArrangementInfoListBuilder_ == null) {
          ensureSceneArrangementInfoListIsMutable();
          sceneArrangementInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          sceneArrangementInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public Builder addSceneArrangementInfoList(
          int index, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder builderForValue) {
        if (sceneArrangementInfoListBuilder_ == null) {
          ensureSceneArrangementInfoListIsMutable();
          sceneArrangementInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          sceneArrangementInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public Builder addAllSceneArrangementInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo> values) {
        if (sceneArrangementInfoListBuilder_ == null) {
          ensureSceneArrangementInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, sceneArrangementInfoList_);
          onChanged();
        } else {
          sceneArrangementInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public Builder clearSceneArrangementInfoList() {
        if (sceneArrangementInfoListBuilder_ == null) {
          sceneArrangementInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          sceneArrangementInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public Builder removeSceneArrangementInfoList(int index) {
        if (sceneArrangementInfoListBuilder_ == null) {
          ensureSceneArrangementInfoListIsMutable();
          sceneArrangementInfoList_.remove(index);
          onChanged();
        } else {
          sceneArrangementInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder getSceneArrangementInfoListBuilder(
          int index) {
        return getSceneArrangementInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoListOrBuilder(
          int index) {
        if (sceneArrangementInfoListBuilder_ == null) {
          return sceneArrangementInfoList_.get(index);  } else {
          return sceneArrangementInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> 
           getSceneArrangementInfoListOrBuilderList() {
        if (sceneArrangementInfoListBuilder_ != null) {
          return sceneArrangementInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(sceneArrangementInfoList_);
        }
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder addSceneArrangementInfoListBuilder() {
        return getSceneArrangementInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder addSceneArrangementInfoListBuilder(
          int index) {
        return getSceneArrangementInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeSceneArrangementInfo scene_arrangement_info_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder> 
           getSceneArrangementInfoListBuilderList() {
        return getSceneArrangementInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> 
          getSceneArrangementInfoListFieldBuilder() {
        if (sceneArrangementInfoListBuilder_ == null) {
          sceneArrangementInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder>(
                  sceneArrangementInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          sceneArrangementInfoList_ = null;
        }
        return sceneArrangementInfoListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeGetArrangementInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeGetArrangementInfoRsp)
    private static final emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp();
    }

    public static emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeGetArrangementInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeGetArrangementInfoRsp>() {
      @java.lang.Override
      public HomeGetArrangementInfoRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeGetArrangementInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeGetArrangementInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGetArrangementInfoRspOuterClass.HomeGetArrangementInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeGetArrangementInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeGetArrangementInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037HomeGetArrangementInfoRsp.proto\032\036HomeS" +
      "ceneArrangementInfo.proto\"l\n\031HomeGetArra" +
      "ngementInfoRsp\022>\n\033scene_arrangement_info" +
      "_list\030\014 \003(\0132\031.HomeSceneArrangementInfo\022\017" +
      "\n\007retcode\030\005 \001(\005B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeGetArrangementInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeGetArrangementInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeGetArrangementInfoRsp_descriptor,
        new java.lang.String[] { "SceneArrangementInfoList", "Retcode", });
    emu.grasscutter.net.proto.HomeSceneArrangementInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
