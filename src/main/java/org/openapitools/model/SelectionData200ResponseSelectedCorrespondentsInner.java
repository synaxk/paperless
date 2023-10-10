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
 * SelectionData200ResponseSelectedCorrespondentsInner
 */

@JsonTypeName("SelectionData_200_response_selected_correspondents_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class SelectionData200ResponseSelectedCorrespondentsInner {

  private Integer id;

  private Integer documentCount;

  public SelectionData200ResponseSelectedCorrespondentsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SelectionData200ResponseSelectedCorrespondentsInner(Integer id, Integer documentCount) {
    this.id = id;
    this.documentCount = documentCount;
  }

  public SelectionData200ResponseSelectedCorrespondentsInner id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SelectionData200ResponseSelectedCorrespondentsInner documentCount(Integer documentCount) {
    this.documentCount = documentCount;
    return this;
  }

  /**
   * Get documentCount
   * @return documentCount
  */
  @NotNull 
  @Schema(name = "document_count", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("document_count")
  public Integer getDocumentCount() {
    return documentCount;
  }

  public void setDocumentCount(Integer documentCount) {
    this.documentCount = documentCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectionData200ResponseSelectedCorrespondentsInner selectionData200ResponseSelectedCorrespondentsInner = (SelectionData200ResponseSelectedCorrespondentsInner) o;
    return Objects.equals(this.id, selectionData200ResponseSelectedCorrespondentsInner.id) &&
        Objects.equals(this.documentCount, selectionData200ResponseSelectedCorrespondentsInner.documentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectionData200ResponseSelectedCorrespondentsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentCount: ").append(toIndentedString(documentCount)).append("\n");
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

