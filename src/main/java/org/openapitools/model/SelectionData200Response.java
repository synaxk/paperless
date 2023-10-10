package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SelectionData200ResponseSelectedCorrespondentsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SelectionData200Response
 */

@JsonTypeName("SelectionData_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class SelectionData200Response {

  @Valid
  private List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedCorrespondents = new ArrayList<>();

  @Valid
  private List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedTags = new ArrayList<>();

  @Valid
  private List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedDocumentTypes = new ArrayList<>();

  @Valid
  private List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedStoragePaths = new ArrayList<>();

  public SelectionData200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SelectionData200Response(List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedCorrespondents, List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedTags, List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedDocumentTypes, List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedStoragePaths) {
    this.selectedCorrespondents = selectedCorrespondents;
    this.selectedTags = selectedTags;
    this.selectedDocumentTypes = selectedDocumentTypes;
    this.selectedStoragePaths = selectedStoragePaths;
  }

  public SelectionData200Response selectedCorrespondents(List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedCorrespondents) {
    this.selectedCorrespondents = selectedCorrespondents;
    return this;
  }

  public SelectionData200Response addSelectedCorrespondentsItem(SelectionData200ResponseSelectedCorrespondentsInner selectedCorrespondentsItem) {
    if (this.selectedCorrespondents == null) {
      this.selectedCorrespondents = new ArrayList<>();
    }
    this.selectedCorrespondents.add(selectedCorrespondentsItem);
    return this;
  }

  /**
   * Get selectedCorrespondents
   * @return selectedCorrespondents
  */
  @NotNull @Valid 
  @Schema(name = "selected_correspondents", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("selected_correspondents")
  public List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> getSelectedCorrespondents() {
    return selectedCorrespondents;
  }

  public void setSelectedCorrespondents(List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedCorrespondents) {
    this.selectedCorrespondents = selectedCorrespondents;
  }

  public SelectionData200Response selectedTags(List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedTags) {
    this.selectedTags = selectedTags;
    return this;
  }

  public SelectionData200Response addSelectedTagsItem(SelectionData200ResponseSelectedCorrespondentsInner selectedTagsItem) {
    if (this.selectedTags == null) {
      this.selectedTags = new ArrayList<>();
    }
    this.selectedTags.add(selectedTagsItem);
    return this;
  }

  /**
   * Get selectedTags
   * @return selectedTags
  */
  @NotNull @Valid 
  @Schema(name = "selected_tags", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("selected_tags")
  public List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> getSelectedTags() {
    return selectedTags;
  }

  public void setSelectedTags(List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedTags) {
    this.selectedTags = selectedTags;
  }

  public SelectionData200Response selectedDocumentTypes(List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedDocumentTypes) {
    this.selectedDocumentTypes = selectedDocumentTypes;
    return this;
  }

  public SelectionData200Response addSelectedDocumentTypesItem(SelectionData200ResponseSelectedCorrespondentsInner selectedDocumentTypesItem) {
    if (this.selectedDocumentTypes == null) {
      this.selectedDocumentTypes = new ArrayList<>();
    }
    this.selectedDocumentTypes.add(selectedDocumentTypesItem);
    return this;
  }

  /**
   * Get selectedDocumentTypes
   * @return selectedDocumentTypes
  */
  @NotNull @Valid 
  @Schema(name = "selected_document_types", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("selected_document_types")
  public List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> getSelectedDocumentTypes() {
    return selectedDocumentTypes;
  }

  public void setSelectedDocumentTypes(List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedDocumentTypes) {
    this.selectedDocumentTypes = selectedDocumentTypes;
  }

  public SelectionData200Response selectedStoragePaths(List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedStoragePaths) {
    this.selectedStoragePaths = selectedStoragePaths;
    return this;
  }

  public SelectionData200Response addSelectedStoragePathsItem(SelectionData200ResponseSelectedCorrespondentsInner selectedStoragePathsItem) {
    if (this.selectedStoragePaths == null) {
      this.selectedStoragePaths = new ArrayList<>();
    }
    this.selectedStoragePaths.add(selectedStoragePathsItem);
    return this;
  }

  /**
   * Get selectedStoragePaths
   * @return selectedStoragePaths
  */
  @NotNull @Valid 
  @Schema(name = "selected_storage_paths", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("selected_storage_paths")
  public List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> getSelectedStoragePaths() {
    return selectedStoragePaths;
  }

  public void setSelectedStoragePaths(List<@Valid SelectionData200ResponseSelectedCorrespondentsInner> selectedStoragePaths) {
    this.selectedStoragePaths = selectedStoragePaths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectionData200Response selectionData200Response = (SelectionData200Response) o;
    return Objects.equals(this.selectedCorrespondents, selectionData200Response.selectedCorrespondents) &&
        Objects.equals(this.selectedTags, selectionData200Response.selectedTags) &&
        Objects.equals(this.selectedDocumentTypes, selectionData200Response.selectedDocumentTypes) &&
        Objects.equals(this.selectedStoragePaths, selectionData200Response.selectedStoragePaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedCorrespondents, selectedTags, selectedDocumentTypes, selectedStoragePaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectionData200Response {\n");
    sb.append("    selectedCorrespondents: ").append(toIndentedString(selectedCorrespondents)).append("\n");
    sb.append("    selectedTags: ").append(toIndentedString(selectedTags)).append("\n");
    sb.append("    selectedDocumentTypes: ").append(toIndentedString(selectedDocumentTypes)).append("\n");
    sb.append("    selectedStoragePaths: ").append(toIndentedString(selectedStoragePaths)).append("\n");
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

