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
 * GetDocumentSuggestions200Response
 */

@JsonTypeName("GetDocumentSuggestions_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetDocumentSuggestions200Response {

  @Valid
  private List<Object> correspondents = new ArrayList<>();

  @Valid
  private List<Object> tags = new ArrayList<>();

  @Valid
  private List<Object> documentTypes = new ArrayList<>();

  @Valid
  private List<Object> storagePaths = new ArrayList<>();

  @Valid
  private List<Object> dates = new ArrayList<>();

  public GetDocumentSuggestions200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetDocumentSuggestions200Response(List<Object> correspondents, List<Object> tags, List<Object> documentTypes, List<Object> storagePaths, List<Object> dates) {
    this.correspondents = correspondents;
    this.tags = tags;
    this.documentTypes = documentTypes;
    this.storagePaths = storagePaths;
    this.dates = dates;
  }

  public GetDocumentSuggestions200Response correspondents(List<Object> correspondents) {
    this.correspondents = correspondents;
    return this;
  }

  public GetDocumentSuggestions200Response addCorrespondentsItem(Object correspondentsItem) {
    if (this.correspondents == null) {
      this.correspondents = new ArrayList<>();
    }
    this.correspondents.add(correspondentsItem);
    return this;
  }

  /**
   * Get correspondents
   * @return correspondents
  */
  @NotNull 
  @Schema(name = "correspondents", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("correspondents")
  public List<Object> getCorrespondents() {
    return correspondents;
  }

  public void setCorrespondents(List<Object> correspondents) {
    this.correspondents = correspondents;
  }

  public GetDocumentSuggestions200Response tags(List<Object> tags) {
    this.tags = tags;
    return this;
  }

  public GetDocumentSuggestions200Response addTagsItem(Object tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @NotNull 
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tags")
  public List<Object> getTags() {
    return tags;
  }

  public void setTags(List<Object> tags) {
    this.tags = tags;
  }

  public GetDocumentSuggestions200Response documentTypes(List<Object> documentTypes) {
    this.documentTypes = documentTypes;
    return this;
  }

  public GetDocumentSuggestions200Response addDocumentTypesItem(Object documentTypesItem) {
    if (this.documentTypes == null) {
      this.documentTypes = new ArrayList<>();
    }
    this.documentTypes.add(documentTypesItem);
    return this;
  }

  /**
   * Get documentTypes
   * @return documentTypes
  */
  @NotNull 
  @Schema(name = "document_types", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("document_types")
  public List<Object> getDocumentTypes() {
    return documentTypes;
  }

  public void setDocumentTypes(List<Object> documentTypes) {
    this.documentTypes = documentTypes;
  }

  public GetDocumentSuggestions200Response storagePaths(List<Object> storagePaths) {
    this.storagePaths = storagePaths;
    return this;
  }

  public GetDocumentSuggestions200Response addStoragePathsItem(Object storagePathsItem) {
    if (this.storagePaths == null) {
      this.storagePaths = new ArrayList<>();
    }
    this.storagePaths.add(storagePathsItem);
    return this;
  }

  /**
   * Get storagePaths
   * @return storagePaths
  */
  @NotNull 
  @Schema(name = "storage_paths", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("storage_paths")
  public List<Object> getStoragePaths() {
    return storagePaths;
  }

  public void setStoragePaths(List<Object> storagePaths) {
    this.storagePaths = storagePaths;
  }

  public GetDocumentSuggestions200Response dates(List<Object> dates) {
    this.dates = dates;
    return this;
  }

  public GetDocumentSuggestions200Response addDatesItem(Object datesItem) {
    if (this.dates == null) {
      this.dates = new ArrayList<>();
    }
    this.dates.add(datesItem);
    return this;
  }

  /**
   * Get dates
   * @return dates
  */
  @NotNull 
  @Schema(name = "dates", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dates")
  public List<Object> getDates() {
    return dates;
  }

  public void setDates(List<Object> dates) {
    this.dates = dates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentSuggestions200Response getDocumentSuggestions200Response = (GetDocumentSuggestions200Response) o;
    return Objects.equals(this.correspondents, getDocumentSuggestions200Response.correspondents) &&
        Objects.equals(this.tags, getDocumentSuggestions200Response.tags) &&
        Objects.equals(this.documentTypes, getDocumentSuggestions200Response.documentTypes) &&
        Objects.equals(this.storagePaths, getDocumentSuggestions200Response.storagePaths) &&
        Objects.equals(this.dates, getDocumentSuggestions200Response.dates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondents, tags, documentTypes, storagePaths, dates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentSuggestions200Response {\n");
    sb.append("    correspondents: ").append(toIndentedString(correspondents)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    documentTypes: ").append(toIndentedString(documentTypes)).append("\n");
    sb.append("    storagePaths: ").append(toIndentedString(storagePaths)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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

