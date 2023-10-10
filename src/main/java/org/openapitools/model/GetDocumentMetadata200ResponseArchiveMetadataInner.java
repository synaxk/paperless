package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetDocumentMetadata200ResponseArchiveMetadataInner
 */

@JsonTypeName("GetDocumentMetadata_200_response_archive_metadata_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetDocumentMetadata200ResponseArchiveMetadataInner {

  private String namespace;

  private String prefix;

  private String key;

  private String value;

  public GetDocumentMetadata200ResponseArchiveMetadataInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetDocumentMetadata200ResponseArchiveMetadataInner(String namespace, String prefix, String key, String value) {
    this.namespace = namespace;
    this.prefix = prefix;
    this.key = key;
    this.value = value;
  }

  public GetDocumentMetadata200ResponseArchiveMetadataInner namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
  */
  @NotNull 
  @Schema(name = "namespace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public GetDocumentMetadata200ResponseArchiveMetadataInner prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
  */
  @NotNull 
  @Schema(name = "prefix", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public GetDocumentMetadata200ResponseArchiveMetadataInner key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  @NotNull 
  @Schema(name = "key", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public GetDocumentMetadata200ResponseArchiveMetadataInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @NotNull 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentMetadata200ResponseArchiveMetadataInner getDocumentMetadata200ResponseArchiveMetadataInner = (GetDocumentMetadata200ResponseArchiveMetadataInner) o;
    return Objects.equals(this.namespace, getDocumentMetadata200ResponseArchiveMetadataInner.namespace) &&
        Objects.equals(this.prefix, getDocumentMetadata200ResponseArchiveMetadataInner.prefix) &&
        Objects.equals(this.key, getDocumentMetadata200ResponseArchiveMetadataInner.key) &&
        Objects.equals(this.value, getDocumentMetadata200ResponseArchiveMetadataInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, prefix, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentMetadata200ResponseArchiveMetadataInner {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

