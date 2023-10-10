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
 * Statistics200ResponseDocumentFileTypeCountsInner
 */

@JsonTypeName("Statistics_200_response_document_file_type_counts_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class Statistics200ResponseDocumentFileTypeCountsInner {

  private String mimeType;

  private Integer mimeTypeCount;

  public Statistics200ResponseDocumentFileTypeCountsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Statistics200ResponseDocumentFileTypeCountsInner(String mimeType, Integer mimeTypeCount) {
    this.mimeType = mimeType;
    this.mimeTypeCount = mimeTypeCount;
  }

  public Statistics200ResponseDocumentFileTypeCountsInner mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Get mimeType
   * @return mimeType
  */
  @NotNull 
  @Schema(name = "mime_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mime_type")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Statistics200ResponseDocumentFileTypeCountsInner mimeTypeCount(Integer mimeTypeCount) {
    this.mimeTypeCount = mimeTypeCount;
    return this;
  }

  /**
   * Get mimeTypeCount
   * @return mimeTypeCount
  */
  @NotNull 
  @Schema(name = "mime_type_count", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mime_type_count")
  public Integer getMimeTypeCount() {
    return mimeTypeCount;
  }

  public void setMimeTypeCount(Integer mimeTypeCount) {
    this.mimeTypeCount = mimeTypeCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statistics200ResponseDocumentFileTypeCountsInner statistics200ResponseDocumentFileTypeCountsInner = (Statistics200ResponseDocumentFileTypeCountsInner) o;
    return Objects.equals(this.mimeType, statistics200ResponseDocumentFileTypeCountsInner.mimeType) &&
        Objects.equals(this.mimeTypeCount, statistics200ResponseDocumentFileTypeCountsInner.mimeTypeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeType, mimeTypeCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statistics200ResponseDocumentFileTypeCountsInner {\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    mimeTypeCount: ").append(toIndentedString(mimeTypeCount)).append("\n");
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

