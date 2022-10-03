/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/admin/v1/datastore_admin.proto

package com.google.datastore.admin.v1;

/**
 *
 *
 * <pre>
 * Identifies a subset of entities in a project. This is specified as
 * combinations of kinds and namespaces (either or both of which may be all, as
 * described in the following examples).
 * Example usage:
 * Entire project:
 *   kinds=[], namespace_ids=[]
 * Kinds Foo and Bar in all namespaces:
 *   kinds=['Foo', 'Bar'], namespace_ids=[]
 * Kinds Foo and Bar only in the default namespace:
 *   kinds=['Foo', 'Bar'], namespace_ids=['']
 * Kinds Foo and Bar in both the default and Baz namespaces:
 *   kinds=['Foo', 'Bar'], namespace_ids=['', 'Baz']
 * The entire Baz namespace:
 *   kinds=[], namespace_ids=['Baz']
 * </pre>
 *
 * Protobuf type {@code google.datastore.admin.v1.EntityFilter}
 */
public final class EntityFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.datastore.admin.v1.EntityFilter)
    EntityFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EntityFilter.newBuilder() to construct.
  private EntityFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EntityFilter() {
    kinds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    namespaceIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EntityFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.datastore.admin.v1.DatastoreAdminProto
        .internal_static_google_datastore_admin_v1_EntityFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.admin.v1.DatastoreAdminProto
        .internal_static_google_datastore_admin_v1_EntityFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.admin.v1.EntityFilter.class,
            com.google.datastore.admin.v1.EntityFilter.Builder.class);
  }

  public static final int KINDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList kinds_;
  /**
   *
   *
   * <pre>
   * If empty, then this represents all kinds.
   * </pre>
   *
   * <code>repeated string kinds = 1;</code>
   *
   * @return A list containing the kinds.
   */
  public com.google.protobuf.ProtocolStringList getKindsList() {
    return kinds_;
  }
  /**
   *
   *
   * <pre>
   * If empty, then this represents all kinds.
   * </pre>
   *
   * <code>repeated string kinds = 1;</code>
   *
   * @return The count of kinds.
   */
  public int getKindsCount() {
    return kinds_.size();
  }
  /**
   *
   *
   * <pre>
   * If empty, then this represents all kinds.
   * </pre>
   *
   * <code>repeated string kinds = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The kinds at the given index.
   */
  public java.lang.String getKinds(int index) {
    return kinds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * If empty, then this represents all kinds.
   * </pre>
   *
   * <code>repeated string kinds = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the kinds at the given index.
   */
  public com.google.protobuf.ByteString getKindsBytes(int index) {
    return kinds_.getByteString(index);
  }

  public static final int NAMESPACE_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList namespaceIds_;
  /**
   *
   *
   * <pre>
   * An empty list represents all namespaces. This is the preferred
   * usage for projects that don't use namespaces.
   * An empty string element represents the default namespace. This should be
   * used if the project has data in non-default namespaces, but doesn't want to
   * include them.
   * Each namespace in this list must be unique.
   * </pre>
   *
   * <code>repeated string namespace_ids = 2;</code>
   *
   * @return A list containing the namespaceIds.
   */
  public com.google.protobuf.ProtocolStringList getNamespaceIdsList() {
    return namespaceIds_;
  }
  /**
   *
   *
   * <pre>
   * An empty list represents all namespaces. This is the preferred
   * usage for projects that don't use namespaces.
   * An empty string element represents the default namespace. This should be
   * used if the project has data in non-default namespaces, but doesn't want to
   * include them.
   * Each namespace in this list must be unique.
   * </pre>
   *
   * <code>repeated string namespace_ids = 2;</code>
   *
   * @return The count of namespaceIds.
   */
  public int getNamespaceIdsCount() {
    return namespaceIds_.size();
  }
  /**
   *
   *
   * <pre>
   * An empty list represents all namespaces. This is the preferred
   * usage for projects that don't use namespaces.
   * An empty string element represents the default namespace. This should be
   * used if the project has data in non-default namespaces, but doesn't want to
   * include them.
   * Each namespace in this list must be unique.
   * </pre>
   *
   * <code>repeated string namespace_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The namespaceIds at the given index.
   */
  public java.lang.String getNamespaceIds(int index) {
    return namespaceIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * An empty list represents all namespaces. This is the preferred
   * usage for projects that don't use namespaces.
   * An empty string element represents the default namespace. This should be
   * used if the project has data in non-default namespaces, but doesn't want to
   * include them.
   * Each namespace in this list must be unique.
   * </pre>
   *
   * <code>repeated string namespace_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the namespaceIds at the given index.
   */
  public com.google.protobuf.ByteString getNamespaceIdsBytes(int index) {
    return namespaceIds_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < kinds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kinds_.getRaw(i));
    }
    for (int i = 0; i < namespaceIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, namespaceIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < kinds_.size(); i++) {
        dataSize += computeStringSizeNoTag(kinds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKindsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < namespaceIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(namespaceIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNamespaceIdsList().size();
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
    if (!(obj instanceof com.google.datastore.admin.v1.EntityFilter)) {
      return super.equals(obj);
    }
    com.google.datastore.admin.v1.EntityFilter other =
        (com.google.datastore.admin.v1.EntityFilter) obj;

    if (!getKindsList().equals(other.getKindsList())) return false;
    if (!getNamespaceIdsList().equals(other.getNamespaceIdsList())) return false;
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
    if (getKindsCount() > 0) {
      hash = (37 * hash) + KINDS_FIELD_NUMBER;
      hash = (53 * hash) + getKindsList().hashCode();
    }
    if (getNamespaceIdsCount() > 0) {
      hash = (37 * hash) + NAMESPACE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getNamespaceIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.admin.v1.EntityFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.admin.v1.EntityFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.admin.v1.EntityFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.admin.v1.EntityFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.admin.v1.EntityFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.admin.v1.EntityFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.admin.v1.EntityFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.admin.v1.EntityFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.admin.v1.EntityFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.datastore.admin.v1.EntityFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.admin.v1.EntityFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.admin.v1.EntityFilter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.datastore.admin.v1.EntityFilter prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Identifies a subset of entities in a project. This is specified as
   * combinations of kinds and namespaces (either or both of which may be all, as
   * described in the following examples).
   * Example usage:
   * Entire project:
   *   kinds=[], namespace_ids=[]
   * Kinds Foo and Bar in all namespaces:
   *   kinds=['Foo', 'Bar'], namespace_ids=[]
   * Kinds Foo and Bar only in the default namespace:
   *   kinds=['Foo', 'Bar'], namespace_ids=['']
   * Kinds Foo and Bar in both the default and Baz namespaces:
   *   kinds=['Foo', 'Bar'], namespace_ids=['', 'Baz']
   * The entire Baz namespace:
   *   kinds=[], namespace_ids=['Baz']
   * </pre>
   *
   * Protobuf type {@code google.datastore.admin.v1.EntityFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.datastore.admin.v1.EntityFilter)
      com.google.datastore.admin.v1.EntityFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.datastore.admin.v1.DatastoreAdminProto
          .internal_static_google_datastore_admin_v1_EntityFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.admin.v1.DatastoreAdminProto
          .internal_static_google_datastore_admin_v1_EntityFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.admin.v1.EntityFilter.class,
              com.google.datastore.admin.v1.EntityFilter.Builder.class);
    }

    // Construct using com.google.datastore.admin.v1.EntityFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      kinds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      namespaceIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.datastore.admin.v1.DatastoreAdminProto
          .internal_static_google_datastore_admin_v1_EntityFilter_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.admin.v1.EntityFilter getDefaultInstanceForType() {
      return com.google.datastore.admin.v1.EntityFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.admin.v1.EntityFilter build() {
      com.google.datastore.admin.v1.EntityFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.admin.v1.EntityFilter buildPartial() {
      com.google.datastore.admin.v1.EntityFilter result =
          new com.google.datastore.admin.v1.EntityFilter(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        kinds_ = kinds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.kinds_ = kinds_;
      if (((bitField0_ & 0x00000002) != 0)) {
        namespaceIds_ = namespaceIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.namespaceIds_ = namespaceIds_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.datastore.admin.v1.EntityFilter) {
        return mergeFrom((com.google.datastore.admin.v1.EntityFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.admin.v1.EntityFilter other) {
      if (other == com.google.datastore.admin.v1.EntityFilter.getDefaultInstance()) return this;
      if (!other.kinds_.isEmpty()) {
        if (kinds_.isEmpty()) {
          kinds_ = other.kinds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureKindsIsMutable();
          kinds_.addAll(other.kinds_);
        }
        onChanged();
      }
      if (!other.namespaceIds_.isEmpty()) {
        if (namespaceIds_.isEmpty()) {
          namespaceIds_ = other.namespaceIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureNamespaceIdsIsMutable();
          namespaceIds_.addAll(other.namespaceIds_);
        }
        onChanged();
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureKindsIsMutable();
                kinds_.add(s);
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureNamespaceIdsIsMutable();
                namespaceIds_.add(s);
                break;
              } // case 18
            default:
              {
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

    private com.google.protobuf.LazyStringList kinds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureKindsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        kinds_ = new com.google.protobuf.LazyStringArrayList(kinds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * If empty, then this represents all kinds.
     * </pre>
     *
     * <code>repeated string kinds = 1;</code>
     *
     * @return A list containing the kinds.
     */
    public com.google.protobuf.ProtocolStringList getKindsList() {
      return kinds_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * If empty, then this represents all kinds.
     * </pre>
     *
     * <code>repeated string kinds = 1;</code>
     *
     * @return The count of kinds.
     */
    public int getKindsCount() {
      return kinds_.size();
    }
    /**
     *
     *
     * <pre>
     * If empty, then this represents all kinds.
     * </pre>
     *
     * <code>repeated string kinds = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The kinds at the given index.
     */
    public java.lang.String getKinds(int index) {
      return kinds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * If empty, then this represents all kinds.
     * </pre>
     *
     * <code>repeated string kinds = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the kinds at the given index.
     */
    public com.google.protobuf.ByteString getKindsBytes(int index) {
      return kinds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * If empty, then this represents all kinds.
     * </pre>
     *
     * <code>repeated string kinds = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The kinds to set.
     * @return This builder for chaining.
     */
    public Builder setKinds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureKindsIsMutable();
      kinds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If empty, then this represents all kinds.
     * </pre>
     *
     * <code>repeated string kinds = 1;</code>
     *
     * @param value The kinds to add.
     * @return This builder for chaining.
     */
    public Builder addKinds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureKindsIsMutable();
      kinds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If empty, then this represents all kinds.
     * </pre>
     *
     * <code>repeated string kinds = 1;</code>
     *
     * @param values The kinds to add.
     * @return This builder for chaining.
     */
    public Builder addAllKinds(java.lang.Iterable<java.lang.String> values) {
      ensureKindsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, kinds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If empty, then this represents all kinds.
     * </pre>
     *
     * <code>repeated string kinds = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKinds() {
      kinds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If empty, then this represents all kinds.
     * </pre>
     *
     * <code>repeated string kinds = 1;</code>
     *
     * @param value The bytes of the kinds to add.
     * @return This builder for chaining.
     */
    public Builder addKindsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureKindsIsMutable();
      kinds_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList namespaceIds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureNamespaceIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        namespaceIds_ = new com.google.protobuf.LazyStringArrayList(namespaceIds_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * An empty list represents all namespaces. This is the preferred
     * usage for projects that don't use namespaces.
     * An empty string element represents the default namespace. This should be
     * used if the project has data in non-default namespaces, but doesn't want to
     * include them.
     * Each namespace in this list must be unique.
     * </pre>
     *
     * <code>repeated string namespace_ids = 2;</code>
     *
     * @return A list containing the namespaceIds.
     */
    public com.google.protobuf.ProtocolStringList getNamespaceIdsList() {
      return namespaceIds_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * An empty list represents all namespaces. This is the preferred
     * usage for projects that don't use namespaces.
     * An empty string element represents the default namespace. This should be
     * used if the project has data in non-default namespaces, but doesn't want to
     * include them.
     * Each namespace in this list must be unique.
     * </pre>
     *
     * <code>repeated string namespace_ids = 2;</code>
     *
     * @return The count of namespaceIds.
     */
    public int getNamespaceIdsCount() {
      return namespaceIds_.size();
    }
    /**
     *
     *
     * <pre>
     * An empty list represents all namespaces. This is the preferred
     * usage for projects that don't use namespaces.
     * An empty string element represents the default namespace. This should be
     * used if the project has data in non-default namespaces, but doesn't want to
     * include them.
     * Each namespace in this list must be unique.
     * </pre>
     *
     * <code>repeated string namespace_ids = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The namespaceIds at the given index.
     */
    public java.lang.String getNamespaceIds(int index) {
      return namespaceIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * An empty list represents all namespaces. This is the preferred
     * usage for projects that don't use namespaces.
     * An empty string element represents the default namespace. This should be
     * used if the project has data in non-default namespaces, but doesn't want to
     * include them.
     * Each namespace in this list must be unique.
     * </pre>
     *
     * <code>repeated string namespace_ids = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the namespaceIds at the given index.
     */
    public com.google.protobuf.ByteString getNamespaceIdsBytes(int index) {
      return namespaceIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * An empty list represents all namespaces. This is the preferred
     * usage for projects that don't use namespaces.
     * An empty string element represents the default namespace. This should be
     * used if the project has data in non-default namespaces, but doesn't want to
     * include them.
     * Each namespace in this list must be unique.
     * </pre>
     *
     * <code>repeated string namespace_ids = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The namespaceIds to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNamespaceIdsIsMutable();
      namespaceIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An empty list represents all namespaces. This is the preferred
     * usage for projects that don't use namespaces.
     * An empty string element represents the default namespace. This should be
     * used if the project has data in non-default namespaces, but doesn't want to
     * include them.
     * Each namespace in this list must be unique.
     * </pre>
     *
     * <code>repeated string namespace_ids = 2;</code>
     *
     * @param value The namespaceIds to add.
     * @return This builder for chaining.
     */
    public Builder addNamespaceIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNamespaceIdsIsMutable();
      namespaceIds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An empty list represents all namespaces. This is the preferred
     * usage for projects that don't use namespaces.
     * An empty string element represents the default namespace. This should be
     * used if the project has data in non-default namespaces, but doesn't want to
     * include them.
     * Each namespace in this list must be unique.
     * </pre>
     *
     * <code>repeated string namespace_ids = 2;</code>
     *
     * @param values The namespaceIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllNamespaceIds(java.lang.Iterable<java.lang.String> values) {
      ensureNamespaceIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, namespaceIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An empty list represents all namespaces. This is the preferred
     * usage for projects that don't use namespaces.
     * An empty string element represents the default namespace. This should be
     * used if the project has data in non-default namespaces, but doesn't want to
     * include them.
     * Each namespace in this list must be unique.
     * </pre>
     *
     * <code>repeated string namespace_ids = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNamespaceIds() {
      namespaceIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An empty list represents all namespaces. This is the preferred
     * usage for projects that don't use namespaces.
     * An empty string element represents the default namespace. This should be
     * used if the project has data in non-default namespaces, but doesn't want to
     * include them.
     * Each namespace in this list must be unique.
     * </pre>
     *
     * <code>repeated string namespace_ids = 2;</code>
     *
     * @param value The bytes of the namespaceIds to add.
     * @return This builder for chaining.
     */
    public Builder addNamespaceIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureNamespaceIdsIsMutable();
      namespaceIds_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.datastore.admin.v1.EntityFilter)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.admin.v1.EntityFilter)
  private static final com.google.datastore.admin.v1.EntityFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.datastore.admin.v1.EntityFilter();
  }

  public static com.google.datastore.admin.v1.EntityFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityFilter> PARSER =
      new com.google.protobuf.AbstractParser<EntityFilter>() {
        @java.lang.Override
        public EntityFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<EntityFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.admin.v1.EntityFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
