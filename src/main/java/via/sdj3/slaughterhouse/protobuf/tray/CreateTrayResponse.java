// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tray.proto

package via.sdj3.slaughterhouse.protobuf.tray;

/**
 * Protobuf type {@code via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse}
 */
public final class CreateTrayResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse)
    CreateTrayResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTrayResponse.newBuilder() to construct.
  private CreateTrayResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTrayResponse() {
    confirmation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTrayResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateTrayResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            confirmation_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sdj3.slaughterhouse.protobuf.tray.Tray.internal_static_via_sdj3_slaughterhouse_protobuf_tray_CreateTrayResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.slaughterhouse.protobuf.tray.Tray.internal_static_via_sdj3_slaughterhouse_protobuf_tray_CreateTrayResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse.class, via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse.Builder.class);
  }

  public static final int CONFIRMATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object confirmation_;
  /**
   * <code>string confirmation = 1;</code>
   * @return The confirmation.
   */
  @java.lang.Override
  public java.lang.String getConfirmation() {
    java.lang.Object ref = confirmation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      confirmation_ = s;
      return s;
    }
  }
  /**
   * <code>string confirmation = 1;</code>
   * @return The bytes for confirmation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConfirmationBytes() {
    java.lang.Object ref = confirmation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      confirmation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(confirmation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, confirmation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(confirmation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, confirmation_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse)) {
      return super.equals(obj);
    }
    via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse other = (via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse) obj;

    if (!getConfirmation()
        .equals(other.getConfirmation())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CONFIRMATION_FIELD_NUMBER;
    hash = (53 * hash) + getConfirmation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parseFrom(
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
  public static Builder newBuilder(via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse prototype) {
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
   * Protobuf type {@code via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse)
      via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.slaughterhouse.protobuf.tray.Tray.internal_static_via_sdj3_slaughterhouse_protobuf_tray_CreateTrayResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.slaughterhouse.protobuf.tray.Tray.internal_static_via_sdj3_slaughterhouse_protobuf_tray_CreateTrayResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse.class, via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse.Builder.class);
    }

    // Construct using via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      confirmation_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.slaughterhouse.protobuf.tray.Tray.internal_static_via_sdj3_slaughterhouse_protobuf_tray_CreateTrayResponse_descriptor;
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse getDefaultInstanceForType() {
      return via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse build() {
      via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse buildPartial() {
      via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse result = new via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse(this);
      result.confirmation_ = confirmation_;
      onBuilt();
      return result;
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
      if (other instanceof via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse) {
        return mergeFrom((via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse other) {
      if (other == via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse.getDefaultInstance()) return this;
      if (!other.getConfirmation().isEmpty()) {
        confirmation_ = other.confirmation_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object confirmation_ = "";
    /**
     * <code>string confirmation = 1;</code>
     * @return The confirmation.
     */
    public java.lang.String getConfirmation() {
      java.lang.Object ref = confirmation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        confirmation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string confirmation = 1;</code>
     * @return The bytes for confirmation.
     */
    public com.google.protobuf.ByteString
        getConfirmationBytes() {
      java.lang.Object ref = confirmation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        confirmation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string confirmation = 1;</code>
     * @param value The confirmation to set.
     * @return This builder for chaining.
     */
    public Builder setConfirmation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      confirmation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string confirmation = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfirmation() {
      
      confirmation_ = getDefaultInstance().getConfirmation();
      onChanged();
      return this;
    }
    /**
     * <code>string confirmation = 1;</code>
     * @param value The bytes for confirmation to set.
     * @return This builder for chaining.
     */
    public Builder setConfirmationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      confirmation_ = value;
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


    // @@protoc_insertion_point(builder_scope:via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse)
  }

  // @@protoc_insertion_point(class_scope:via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse)
  private static final via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse();
  }

  public static via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTrayResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateTrayResponse>() {
    @java.lang.Override
    public CreateTrayResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateTrayResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateTrayResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTrayResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.slaughterhouse.protobuf.tray.CreateTrayResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

