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
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

/**
 *
 *
 * <pre>
 * The request for [Datastore.Rollback][google.datastore.v1.Datastore.Rollback].
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.RollbackRequest}
 */
public final class RollbackRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.RollbackRequest)
    RollbackRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RollbackRequest.newBuilder() to construct.
  private RollbackRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RollbackRequest() {
    projectId_ = "";
    databaseId_ = "";
    transaction_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RollbackRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_RollbackRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_RollbackRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.RollbackRequest.class,
            com.google.datastore.v1.RollbackRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 8;
  private volatile java.lang.Object projectId_;
  /**
   *
   *
   * <pre>
   * Required. The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATABASE_ID_FIELD_NUMBER = 9;
  private volatile java.lang.Object databaseId_;
  /**
   *
   *
   * <pre>
   * The ID of the database against which to make the request.
   * '(default)' is not allowed; please use empty string '' to refer the default
   * database.
   * </pre>
   *
   * <code>string database_id = 9;</code>
   *
   * @return The databaseId.
   */
  @java.lang.Override
  public java.lang.String getDatabaseId() {
    java.lang.Object ref = databaseId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      databaseId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID of the database against which to make the request.
   * '(default)' is not allowed; please use empty string '' to refer the default
   * database.
   * </pre>
   *
   * <code>string database_id = 9;</code>
   *
   * @return The bytes for databaseId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDatabaseIdBytes() {
    java.lang.Object ref = databaseId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      databaseId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTION_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString transaction_;
  /**
   *
   *
   * <pre>
   * Required. The transaction identifier, returned by a call to
   * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
   * </pre>
   *
   * <code>bytes transaction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The transaction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTransaction() {
    return transaction_;
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
    if (!transaction_.isEmpty()) {
      output.writeBytes(1, transaction_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(databaseId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 9, databaseId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!transaction_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, transaction_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(databaseId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, databaseId_);
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
    if (!(obj instanceof com.google.datastore.v1.RollbackRequest)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.RollbackRequest other = (com.google.datastore.v1.RollbackRequest) obj;

    if (!getProjectId().equals(other.getProjectId())) return false;
    if (!getDatabaseId().equals(other.getDatabaseId())) return false;
    if (!getTransaction().equals(other.getTransaction())) return false;
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + DATABASE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDatabaseId().hashCode();
    hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
    hash = (53 * hash) + getTransaction().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.RollbackRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.RollbackRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.RollbackRequest parseFrom(
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

  public static Builder newBuilder(com.google.datastore.v1.RollbackRequest prototype) {
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
   * The request for [Datastore.Rollback][google.datastore.v1.Datastore.Rollback].
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.RollbackRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.RollbackRequest)
      com.google.datastore.v1.RollbackRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_RollbackRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_RollbackRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.RollbackRequest.class,
              com.google.datastore.v1.RollbackRequest.Builder.class);
    }

    // Construct using com.google.datastore.v1.RollbackRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      projectId_ = "";

      databaseId_ = "";

      transaction_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_RollbackRequest_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1.RollbackRequest getDefaultInstanceForType() {
      return com.google.datastore.v1.RollbackRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1.RollbackRequest build() {
      com.google.datastore.v1.RollbackRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1.RollbackRequest buildPartial() {
      com.google.datastore.v1.RollbackRequest result =
          new com.google.datastore.v1.RollbackRequest(this);
      result.projectId_ = projectId_;
      result.databaseId_ = databaseId_;
      result.transaction_ = transaction_;
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
      if (other instanceof com.google.datastore.v1.RollbackRequest) {
        return mergeFrom((com.google.datastore.v1.RollbackRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.RollbackRequest other) {
      if (other == com.google.datastore.v1.RollbackRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getDatabaseId().isEmpty()) {
        databaseId_ = other.databaseId_;
        onChanged();
      }
      if (other.getTransaction() != com.google.protobuf.ByteString.EMPTY) {
        setTransaction(other.getTransaction());
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
                transaction_ = input.readBytes();

                break;
              } // case 10
            case 66:
              {
                projectId_ = input.readStringRequireUtf8();

                break;
              } // case 66
            case 74:
              {
                databaseId_ = input.readStringRequireUtf8();

                break;
              } // case 74
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

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {

      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object databaseId_ = "";
    /**
     *
     *
     * <pre>
     * The ID of the database against which to make the request.
     * '(default)' is not allowed; please use empty string '' to refer the default
     * database.
     * </pre>
     *
     * <code>string database_id = 9;</code>
     *
     * @return The databaseId.
     */
    public java.lang.String getDatabaseId() {
      java.lang.Object ref = databaseId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        databaseId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the database against which to make the request.
     * '(default)' is not allowed; please use empty string '' to refer the default
     * database.
     * </pre>
     *
     * <code>string database_id = 9;</code>
     *
     * @return The bytes for databaseId.
     */
    public com.google.protobuf.ByteString getDatabaseIdBytes() {
      java.lang.Object ref = databaseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        databaseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the database against which to make the request.
     * '(default)' is not allowed; please use empty string '' to refer the default
     * database.
     * </pre>
     *
     * <code>string database_id = 9;</code>
     *
     * @param value The databaseId to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      databaseId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the database against which to make the request.
     * '(default)' is not allowed; please use empty string '' to refer the default
     * database.
     * </pre>
     *
     * <code>string database_id = 9;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDatabaseId() {

      databaseId_ = getDefaultInstance().getDatabaseId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the database against which to make the request.
     * '(default)' is not allowed; please use empty string '' to refer the default
     * database.
     * </pre>
     *
     * <code>string database_id = 9;</code>
     *
     * @param value The bytes for databaseId to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      databaseId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString transaction_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Required. The transaction identifier, returned by a call to
     * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
     * </pre>
     *
     * <code>bytes transaction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The transaction.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTransaction() {
      return transaction_;
    }
    /**
     *
     *
     * <pre>
     * Required. The transaction identifier, returned by a call to
     * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
     * </pre>
     *
     * <code>bytes transaction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The transaction to set.
     * @return This builder for chaining.
     */
    public Builder setTransaction(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      transaction_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The transaction identifier, returned by a call to
     * [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
     * </pre>
     *
     * <code>bytes transaction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTransaction() {

      transaction_ = getDefaultInstance().getTransaction();
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

    // @@protoc_insertion_point(builder_scope:google.datastore.v1.RollbackRequest)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.RollbackRequest)
  private static final com.google.datastore.v1.RollbackRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.RollbackRequest();
  }

  public static com.google.datastore.v1.RollbackRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RollbackRequest> PARSER =
      new com.google.protobuf.AbstractParser<RollbackRequest>() {
        @java.lang.Override
        public RollbackRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RollbackRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RollbackRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1.RollbackRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
