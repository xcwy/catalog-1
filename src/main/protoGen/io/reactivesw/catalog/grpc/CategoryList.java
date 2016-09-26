// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog_message.proto

package io.reactivesw.catalog.grpc;

/**
 * <pre>
 **
 * response when call queryAllCategories.
 * </pre>
 *
 * Protobuf type {@code io.reactivesw.catalog.infrastructure.CategoryList}
 */
public  final class CategoryList extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.reactivesw.catalog.infrastructure.CategoryList)
    CategoryListOrBuilder {
  // Use CategoryList.newBuilder() to construct.
  private CategoryList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CategoryList() {
    category_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CategoryList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              category_ = new java.util.ArrayList<io.reactivesw.catalog.grpc.GrpcCategory>();
              mutable_bitField0_ |= 0x00000001;
            }
            category_.add(input.readMessage(io.reactivesw.catalog.grpc.GrpcCategory.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        category_ = java.util.Collections.unmodifiableList(category_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.reactivesw.catalog.grpc.CatalogMessage.internal_static_io_reactivesw_catalog_infrastructure_CategoryList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.reactivesw.catalog.grpc.CatalogMessage.internal_static_io_reactivesw_catalog_infrastructure_CategoryList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.reactivesw.catalog.grpc.CategoryList.class, io.reactivesw.catalog.grpc.CategoryList.Builder.class);
  }

  public static final int CATEGORY_FIELD_NUMBER = 1;
  private java.util.List<io.reactivesw.catalog.grpc.GrpcCategory> category_;
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
   */
  public java.util.List<io.reactivesw.catalog.grpc.GrpcCategory> getCategoryList() {
    return category_;
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
   */
  public java.util.List<? extends io.reactivesw.catalog.grpc.GrpcCategoryOrBuilder> 
      getCategoryOrBuilderList() {
    return category_;
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
   */
  public int getCategoryCount() {
    return category_.size();
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
   */
  public io.reactivesw.catalog.grpc.GrpcCategory getCategory(int index) {
    return category_.get(index);
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
   */
  public io.reactivesw.catalog.grpc.GrpcCategoryOrBuilder getCategoryOrBuilder(
      int index) {
    return category_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < category_.size(); i++) {
      output.writeMessage(1, category_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < category_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, category_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.reactivesw.catalog.grpc.CategoryList)) {
      return super.equals(obj);
    }
    io.reactivesw.catalog.grpc.CategoryList other = (io.reactivesw.catalog.grpc.CategoryList) obj;

    boolean result = true;
    result = result && getCategoryList()
        .equals(other.getCategoryList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getCategoryCount() > 0) {
      hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
      hash = (53 * hash) + getCategoryList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.reactivesw.catalog.grpc.CategoryList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.reactivesw.catalog.grpc.CategoryList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.CategoryList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.reactivesw.catalog.grpc.CategoryList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.CategoryList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.reactivesw.catalog.grpc.CategoryList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.CategoryList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.reactivesw.catalog.grpc.CategoryList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.CategoryList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.reactivesw.catalog.grpc.CategoryList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.reactivesw.catalog.grpc.CategoryList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * response when call queryAllCategories.
   * </pre>
   *
   * Protobuf type {@code io.reactivesw.catalog.infrastructure.CategoryList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.reactivesw.catalog.infrastructure.CategoryList)
      io.reactivesw.catalog.grpc.CategoryListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.reactivesw.catalog.grpc.CatalogMessage.internal_static_io_reactivesw_catalog_infrastructure_CategoryList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.reactivesw.catalog.grpc.CatalogMessage.internal_static_io_reactivesw_catalog_infrastructure_CategoryList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.reactivesw.catalog.grpc.CategoryList.class, io.reactivesw.catalog.grpc.CategoryList.Builder.class);
    }

    // Construct using io.reactivesw.catalog.grpc.CategoryList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getCategoryFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (categoryBuilder_ == null) {
        category_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        categoryBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.reactivesw.catalog.grpc.CatalogMessage.internal_static_io_reactivesw_catalog_infrastructure_CategoryList_descriptor;
    }

    public io.reactivesw.catalog.grpc.CategoryList getDefaultInstanceForType() {
      return io.reactivesw.catalog.grpc.CategoryList.getDefaultInstance();
    }

    public io.reactivesw.catalog.grpc.CategoryList build() {
      io.reactivesw.catalog.grpc.CategoryList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.reactivesw.catalog.grpc.CategoryList buildPartial() {
      io.reactivesw.catalog.grpc.CategoryList result = new io.reactivesw.catalog.grpc.CategoryList(this);
      int from_bitField0_ = bitField0_;
      if (categoryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          category_ = java.util.Collections.unmodifiableList(category_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.category_ = category_;
      } else {
        result.category_ = categoryBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.reactivesw.catalog.grpc.CategoryList) {
        return mergeFrom((io.reactivesw.catalog.grpc.CategoryList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.reactivesw.catalog.grpc.CategoryList other) {
      if (other == io.reactivesw.catalog.grpc.CategoryList.getDefaultInstance()) return this;
      if (categoryBuilder_ == null) {
        if (!other.category_.isEmpty()) {
          if (category_.isEmpty()) {
            category_ = other.category_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCategoryIsMutable();
            category_.addAll(other.category_);
          }
          onChanged();
        }
      } else {
        if (!other.category_.isEmpty()) {
          if (categoryBuilder_.isEmpty()) {
            categoryBuilder_.dispose();
            categoryBuilder_ = null;
            category_ = other.category_;
            bitField0_ = (bitField0_ & ~0x00000001);
            categoryBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getCategoryFieldBuilder() : null;
          } else {
            categoryBuilder_.addAllMessages(other.category_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.reactivesw.catalog.grpc.CategoryList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.reactivesw.catalog.grpc.CategoryList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.reactivesw.catalog.grpc.GrpcCategory> category_ =
      java.util.Collections.emptyList();
    private void ensureCategoryIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        category_ = new java.util.ArrayList<io.reactivesw.catalog.grpc.GrpcCategory>(category_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        io.reactivesw.catalog.grpc.GrpcCategory, io.reactivesw.catalog.grpc.GrpcCategory.Builder, io.reactivesw.catalog.grpc.GrpcCategoryOrBuilder> categoryBuilder_;

    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public java.util.List<io.reactivesw.catalog.grpc.GrpcCategory> getCategoryList() {
      if (categoryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(category_);
      } else {
        return categoryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public int getCategoryCount() {
      if (categoryBuilder_ == null) {
        return category_.size();
      } else {
        return categoryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcCategory getCategory(int index) {
      if (categoryBuilder_ == null) {
        return category_.get(index);
      } else {
        return categoryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public Builder setCategory(
        int index, io.reactivesw.catalog.grpc.GrpcCategory value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.set(index, value);
        onChanged();
      } else {
        categoryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public Builder setCategory(
        int index, io.reactivesw.catalog.grpc.GrpcCategory.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.set(index, builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public Builder addCategory(io.reactivesw.catalog.grpc.GrpcCategory value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.add(value);
        onChanged();
      } else {
        categoryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public Builder addCategory(
        int index, io.reactivesw.catalog.grpc.GrpcCategory value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCategoryIsMutable();
        category_.add(index, value);
        onChanged();
      } else {
        categoryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public Builder addCategory(
        io.reactivesw.catalog.grpc.GrpcCategory.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.add(builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public Builder addCategory(
        int index, io.reactivesw.catalog.grpc.GrpcCategory.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.add(index, builderForValue.build());
        onChanged();
      } else {
        categoryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public Builder addAllCategory(
        java.lang.Iterable<? extends io.reactivesw.catalog.grpc.GrpcCategory> values) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, category_);
        onChanged();
      } else {
        categoryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public Builder clearCategory() {
      if (categoryBuilder_ == null) {
        category_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        categoryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public Builder removeCategory(int index) {
      if (categoryBuilder_ == null) {
        ensureCategoryIsMutable();
        category_.remove(index);
        onChanged();
      } else {
        categoryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcCategory.Builder getCategoryBuilder(
        int index) {
      return getCategoryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcCategoryOrBuilder getCategoryOrBuilder(
        int index) {
      if (categoryBuilder_ == null) {
        return category_.get(index);  } else {
        return categoryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public java.util.List<? extends io.reactivesw.catalog.grpc.GrpcCategoryOrBuilder> 
         getCategoryOrBuilderList() {
      if (categoryBuilder_ != null) {
        return categoryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(category_);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcCategory.Builder addCategoryBuilder() {
      return getCategoryFieldBuilder().addBuilder(
          io.reactivesw.catalog.grpc.GrpcCategory.getDefaultInstance());
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcCategory.Builder addCategoryBuilder(
        int index) {
      return getCategoryFieldBuilder().addBuilder(
          index, io.reactivesw.catalog.grpc.GrpcCategory.getDefaultInstance());
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcCategory category = 1;</code>
     */
    public java.util.List<io.reactivesw.catalog.grpc.GrpcCategory.Builder> 
         getCategoryBuilderList() {
      return getCategoryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        io.reactivesw.catalog.grpc.GrpcCategory, io.reactivesw.catalog.grpc.GrpcCategory.Builder, io.reactivesw.catalog.grpc.GrpcCategoryOrBuilder> 
        getCategoryFieldBuilder() {
      if (categoryBuilder_ == null) {
        categoryBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            io.reactivesw.catalog.grpc.GrpcCategory, io.reactivesw.catalog.grpc.GrpcCategory.Builder, io.reactivesw.catalog.grpc.GrpcCategoryOrBuilder>(
                category_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        category_ = null;
      }
      return categoryBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.reactivesw.catalog.infrastructure.CategoryList)
  }

  // @@protoc_insertion_point(class_scope:io.reactivesw.catalog.infrastructure.CategoryList)
  private static final io.reactivesw.catalog.grpc.CategoryList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.reactivesw.catalog.grpc.CategoryList();
  }

  public static io.reactivesw.catalog.grpc.CategoryList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CategoryList>
      PARSER = new com.google.protobuf.AbstractParser<CategoryList>() {
    public CategoryList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CategoryList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CategoryList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CategoryList> getParserForType() {
    return PARSER;
  }

  public io.reactivesw.catalog.grpc.CategoryList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
