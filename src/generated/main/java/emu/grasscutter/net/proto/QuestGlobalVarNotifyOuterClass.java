// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestGlobalVarNotify.proto

package emu.grasscutter.net.proto;

public final class QuestGlobalVarNotifyOuterClass {
  private QuestGlobalVarNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestGlobalVarNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestGlobalVarNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .QuestGlobalVar var_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar> 
        getVarListList();
    /**
     * <code>repeated .QuestGlobalVar var_list = 12;</code>
     */
    emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar getVarList(int index);
    /**
     * <code>repeated .QuestGlobalVar var_list = 12;</code>
     */
    int getVarListCount();
    /**
     * <code>repeated .QuestGlobalVar var_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVarOrBuilder> 
        getVarListOrBuilderList();
    /**
     * <code>repeated .QuestGlobalVar var_list = 12;</code>
     */
    emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVarOrBuilder getVarListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 403
   * Obf: BICAFJINAPH
   * </pre>
   *
   * Protobuf type {@code QuestGlobalVarNotify}
   */
  public static final class QuestGlobalVarNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestGlobalVarNotify)
      QuestGlobalVarNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestGlobalVarNotify.newBuilder() to construct.
    private QuestGlobalVarNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestGlobalVarNotify() {
      varList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestGlobalVarNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.internal_static_QuestGlobalVarNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.internal_static_QuestGlobalVarNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify.class, emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify.Builder.class);
    }

    public static final int VAR_LIST_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar> varList_;
    /**
     * <code>repeated .QuestGlobalVar var_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar> getVarListList() {
      return varList_;
    }
    /**
     * <code>repeated .QuestGlobalVar var_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVarOrBuilder> 
        getVarListOrBuilderList() {
      return varList_;
    }
    /**
     * <code>repeated .QuestGlobalVar var_list = 12;</code>
     */
    @java.lang.Override
    public int getVarListCount() {
      return varList_.size();
    }
    /**
     * <code>repeated .QuestGlobalVar var_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar getVarList(int index) {
      return varList_.get(index);
    }
    /**
     * <code>repeated .QuestGlobalVar var_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVarOrBuilder getVarListOrBuilder(
        int index) {
      return varList_.get(index);
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
      for (int i = 0; i < varList_.size(); i++) {
        output.writeMessage(12, varList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < varList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, varList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify other = (emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify) obj;

      if (!getVarListList()
          .equals(other.getVarListList())) return false;
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
      if (getVarListCount() > 0) {
        hash = (37 * hash) + VAR_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getVarListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify prototype) {
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
     * CmdId: 403
     * Obf: BICAFJINAPH
     * </pre>
     *
     * Protobuf type {@code QuestGlobalVarNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestGlobalVarNotify)
        emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.internal_static_QuestGlobalVarNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.internal_static_QuestGlobalVarNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify.class, emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify.newBuilder()
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
        if (varListBuilder_ == null) {
          varList_ = java.util.Collections.emptyList();
        } else {
          varList_ = null;
          varListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.internal_static_QuestGlobalVarNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify build() {
        emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify buildPartial() {
        emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify result = new emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify result) {
        if (varListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            varList_ = java.util.Collections.unmodifiableList(varList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.varList_ = varList_;
        } else {
          result.varList_ = varListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify) {
          return mergeFrom((emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify other) {
        if (other == emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify.getDefaultInstance()) return this;
        if (varListBuilder_ == null) {
          if (!other.varList_.isEmpty()) {
            if (varList_.isEmpty()) {
              varList_ = other.varList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureVarListIsMutable();
              varList_.addAll(other.varList_);
            }
            onChanged();
          }
        } else {
          if (!other.varList_.isEmpty()) {
            if (varListBuilder_.isEmpty()) {
              varListBuilder_.dispose();
              varListBuilder_ = null;
              varList_ = other.varList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              varListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getVarListFieldBuilder() : null;
            } else {
              varListBuilder_.addAllMessages(other.varList_);
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
              case 98: {
                emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar m =
                    input.readMessage(
                        emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.parser(),
                        extensionRegistry);
                if (varListBuilder_ == null) {
                  ensureVarListIsMutable();
                  varList_.add(m);
                } else {
                  varListBuilder_.addMessage(m);
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

      private java.util.List<emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar> varList_ =
        java.util.Collections.emptyList();
      private void ensureVarListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          varList_ = new java.util.ArrayList<emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar>(varList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar, emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder, emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVarOrBuilder> varListBuilder_;

      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar> getVarListList() {
        if (varListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(varList_);
        } else {
          return varListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public int getVarListCount() {
        if (varListBuilder_ == null) {
          return varList_.size();
        } else {
          return varListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar getVarList(int index) {
        if (varListBuilder_ == null) {
          return varList_.get(index);
        } else {
          return varListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public Builder setVarList(
          int index, emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar value) {
        if (varListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVarListIsMutable();
          varList_.set(index, value);
          onChanged();
        } else {
          varListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public Builder setVarList(
          int index, emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder builderForValue) {
        if (varListBuilder_ == null) {
          ensureVarListIsMutable();
          varList_.set(index, builderForValue.build());
          onChanged();
        } else {
          varListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public Builder addVarList(emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar value) {
        if (varListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVarListIsMutable();
          varList_.add(value);
          onChanged();
        } else {
          varListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public Builder addVarList(
          int index, emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar value) {
        if (varListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVarListIsMutable();
          varList_.add(index, value);
          onChanged();
        } else {
          varListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public Builder addVarList(
          emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder builderForValue) {
        if (varListBuilder_ == null) {
          ensureVarListIsMutable();
          varList_.add(builderForValue.build());
          onChanged();
        } else {
          varListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public Builder addVarList(
          int index, emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder builderForValue) {
        if (varListBuilder_ == null) {
          ensureVarListIsMutable();
          varList_.add(index, builderForValue.build());
          onChanged();
        } else {
          varListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public Builder addAllVarList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar> values) {
        if (varListBuilder_ == null) {
          ensureVarListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, varList_);
          onChanged();
        } else {
          varListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public Builder clearVarList() {
        if (varListBuilder_ == null) {
          varList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          varListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public Builder removeVarList(int index) {
        if (varListBuilder_ == null) {
          ensureVarListIsMutable();
          varList_.remove(index);
          onChanged();
        } else {
          varListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder getVarListBuilder(
          int index) {
        return getVarListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVarOrBuilder getVarListOrBuilder(
          int index) {
        if (varListBuilder_ == null) {
          return varList_.get(index);  } else {
          return varListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVarOrBuilder> 
           getVarListOrBuilderList() {
        if (varListBuilder_ != null) {
          return varListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(varList_);
        }
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder addVarListBuilder() {
        return getVarListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.getDefaultInstance());
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder addVarListBuilder(
          int index) {
        return getVarListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.getDefaultInstance());
      }
      /**
       * <code>repeated .QuestGlobalVar var_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder> 
           getVarListBuilderList() {
        return getVarListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar, emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder, emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVarOrBuilder> 
          getVarListFieldBuilder() {
        if (varListBuilder_ == null) {
          varListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar, emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVar.Builder, emu.grasscutter.net.proto.QuestGlobalVarOuterClass.QuestGlobalVarOrBuilder>(
                  varList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          varList_ = null;
        }
        return varListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:QuestGlobalVarNotify)
    }

    // @@protoc_insertion_point(class_scope:QuestGlobalVarNotify)
    private static final emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify();
    }

    public static emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestGlobalVarNotify>
        PARSER = new com.google.protobuf.AbstractParser<QuestGlobalVarNotify>() {
      @java.lang.Override
      public QuestGlobalVarNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestGlobalVarNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestGlobalVarNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestGlobalVarNotifyOuterClass.QuestGlobalVarNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestGlobalVarNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestGlobalVarNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032QuestGlobalVarNotify.proto\032\024QuestGloba" +
      "lVar.proto\"9\n\024QuestGlobalVarNotify\022!\n\010va" +
      "r_list\030\014 \003(\0132\017.QuestGlobalVarB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.QuestGlobalVarOuterClass.getDescriptor(),
        });
    internal_static_QuestGlobalVarNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestGlobalVarNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestGlobalVarNotify_descriptor,
        new java.lang.String[] { "VarList", });
    emu.grasscutter.net.proto.QuestGlobalVarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
