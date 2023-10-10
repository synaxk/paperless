package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BulkEditRequest
 */

@JsonTypeName("BulkEdit_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class BulkEditRequest {

  @Valid
  private List<Integer> documents = new ArrayList<>();

  private String method;

  private Object parameters;

  public BulkEditRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BulkEditRequest(List<Integer> documents, String method, Object parameters) {
    this.documents = documents;
    this.method = method;
    this.parameters = parameters;
  }

  public BulkEditRequest documents(List<Integer> documents) {
    this.documents = documents;
    return this;
  }

  public BulkEditRequest addDocumentsItem(Integer documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Get documents
   * @return documents
  */
  @NotNull 
  @Schema(name = "documents", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("documents")
  public List<Integer> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Integer> documents) {
    this.documents = documents;
  }

  public BulkEditRequest method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  @NotNull 
  @Schema(name = "method", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public BulkEditRequest parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  */
  @NotNull 
  @Schema(name = "parameters", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parameters")
  public Object getParameters() {
    return parameters;
  }

  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkEditRequest bulkEditRequest = (BulkEditRequest) o;
    return Objects.equals(this.documents, bulkEditRequest.documents) &&
        Objects.equals(this.method, bulkEditRequest.method) &&
        Objects.equals(this.parameters, bulkEditRequest.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents, method, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEditRequest {\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

