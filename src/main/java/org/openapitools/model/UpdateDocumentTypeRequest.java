package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.GetCorrespondents200ResponseResultsInnerPermissions;
import org.openapitools.model.UpdateCorrespondentRequestPermissionsForm;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateDocumentTypeRequest
 */

@JsonTypeName("UpdateDocumentType_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class UpdateDocumentTypeRequest {

  private Integer id;

  private String slug;

  private String name;

  private String match;

  private Integer matchingAlgorithm;

  private Boolean isInsensitive;

  private Integer documentCount;

  private Integer owner;

  private GetCorrespondents200ResponseResultsInnerPermissions permissions;

  private GetCorrespondents200ResponseResultsInnerPermissions setPermissions;

  private UpdateCorrespondentRequestPermissionsForm permissionsForm;

  public UpdateDocumentTypeRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateDocumentTypeRequest(Integer id, String slug, String name, String match, Integer matchingAlgorithm, Boolean isInsensitive, Integer documentCount, Integer owner, GetCorrespondents200ResponseResultsInnerPermissions permissions, GetCorrespondents200ResponseResultsInnerPermissions setPermissions, UpdateCorrespondentRequestPermissionsForm permissionsForm) {
    this.id = id;
    this.slug = slug;
    this.name = name;
    this.match = match;
    this.matchingAlgorithm = matchingAlgorithm;
    this.isInsensitive = isInsensitive;
    this.documentCount = documentCount;
    this.owner = owner;
    this.permissions = permissions;
    this.setPermissions = setPermissions;
    this.permissionsForm = permissionsForm;
  }

  public UpdateDocumentTypeRequest id(Integer id) {
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

  public UpdateDocumentTypeRequest slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
  */
  @NotNull 
  @Schema(name = "slug", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public UpdateDocumentTypeRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateDocumentTypeRequest match(String match) {
    this.match = match;
    return this;
  }

  /**
   * Get match
   * @return match
  */
  @NotNull 
  @Schema(name = "match", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("match")
  public String getMatch() {
    return match;
  }

  public void setMatch(String match) {
    this.match = match;
  }

  public UpdateDocumentTypeRequest matchingAlgorithm(Integer matchingAlgorithm) {
    this.matchingAlgorithm = matchingAlgorithm;
    return this;
  }

  /**
   * Get matchingAlgorithm
   * @return matchingAlgorithm
  */
  @NotNull 
  @Schema(name = "matching_algorithm", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("matching_algorithm")
  public Integer getMatchingAlgorithm() {
    return matchingAlgorithm;
  }

  public void setMatchingAlgorithm(Integer matchingAlgorithm) {
    this.matchingAlgorithm = matchingAlgorithm;
  }

  public UpdateDocumentTypeRequest isInsensitive(Boolean isInsensitive) {
    this.isInsensitive = isInsensitive;
    return this;
  }

  /**
   * Get isInsensitive
   * @return isInsensitive
  */
  @NotNull 
  @Schema(name = "is_insensitive", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_insensitive")
  public Boolean getIsInsensitive() {
    return isInsensitive;
  }

  public void setIsInsensitive(Boolean isInsensitive) {
    this.isInsensitive = isInsensitive;
  }

  public UpdateDocumentTypeRequest documentCount(Integer documentCount) {
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

  public UpdateDocumentTypeRequest owner(Integer owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @NotNull 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("owner")
  public Integer getOwner() {
    return owner;
  }

  public void setOwner(Integer owner) {
    this.owner = owner;
  }

  public UpdateDocumentTypeRequest permissions(GetCorrespondents200ResponseResultsInnerPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  */
  @NotNull @Valid 
  @Schema(name = "permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permissions")
  public GetCorrespondents200ResponseResultsInnerPermissions getPermissions() {
    return permissions;
  }


  public UpdateDocumentTypeRequest setPermissions(GetCorrespondents200ResponseResultsInnerPermissions setPermissions) {
    this.setPermissions = setPermissions;
    return this;
  }

  /**
   * Get setPermissions
   * @return setPermissions
  */
  @NotNull @Valid 
  @Schema(name = "set_permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("set_permissions")
  public GetCorrespondents200ResponseResultsInnerPermissions getSetPermissions() {
    return setPermissions;
  }

  public void setSetPermissions(GetCorrespondents200ResponseResultsInnerPermissions setPermissions) {
    this.setPermissions = setPermissions;
  }

  public UpdateDocumentTypeRequest permissionsForm(UpdateCorrespondentRequestPermissionsForm permissionsForm) {
    this.permissionsForm = permissionsForm;
    return this;
  }

  /**
   * Get permissionsForm
   * @return permissionsForm
  */
  @NotNull @Valid 
  @Schema(name = "permissions_form", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permissions_form")
  public UpdateCorrespondentRequestPermissionsForm getPermissionsForm() {
    return permissionsForm;
  }

  public void setPermissionsForm(UpdateCorrespondentRequestPermissionsForm permissionsForm) {
    this.permissionsForm = permissionsForm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDocumentTypeRequest updateDocumentTypeRequest = (UpdateDocumentTypeRequest) o;
    return Objects.equals(this.id, updateDocumentTypeRequest.id) &&
        Objects.equals(this.slug, updateDocumentTypeRequest.slug) &&
        Objects.equals(this.name, updateDocumentTypeRequest.name) &&
        Objects.equals(this.match, updateDocumentTypeRequest.match) &&
        Objects.equals(this.matchingAlgorithm, updateDocumentTypeRequest.matchingAlgorithm) &&
        Objects.equals(this.isInsensitive, updateDocumentTypeRequest.isInsensitive) &&
        Objects.equals(this.documentCount, updateDocumentTypeRequest.documentCount) &&
        Objects.equals(this.owner, updateDocumentTypeRequest.owner) &&
        Objects.equals(this.permissions, updateDocumentTypeRequest.permissions) &&
        Objects.equals(this.setPermissions, updateDocumentTypeRequest.setPermissions) &&
        Objects.equals(this.permissionsForm, updateDocumentTypeRequest.permissionsForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, name, match, matchingAlgorithm, isInsensitive, documentCount, owner, permissions, setPermissions, permissionsForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDocumentTypeRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    matchingAlgorithm: ").append(toIndentedString(matchingAlgorithm)).append("\n");
    sb.append("    isInsensitive: ").append(toIndentedString(isInsensitive)).append("\n");
    sb.append("    documentCount: ").append(toIndentedString(documentCount)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    setPermissions: ").append(toIndentedString(setPermissions)).append("\n");
    sb.append("    permissionsForm: ").append(toIndentedString(permissionsForm)).append("\n");
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

