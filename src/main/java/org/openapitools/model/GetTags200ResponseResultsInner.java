package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.GetCorrespondents200ResponseResultsInnerPermissions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetTags200ResponseResultsInner
 */

@JsonTypeName("GetTags_200_response_results_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetTags200ResponseResultsInner {

  private Integer id;

  private String slug;

  private String name;

  private String color;

  private String textColor;

  private String match;

  private Integer matchingAlgorithm;

  private Boolean isInsensitive;

  private Boolean isInboxTag;

  private Integer documentCount;

  private Integer owner;

  private GetCorrespondents200ResponseResultsInnerPermissions permissions;

  public GetTags200ResponseResultsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetTags200ResponseResultsInner(Integer id, String slug, String name, String color, String textColor, String match, Integer matchingAlgorithm, Boolean isInsensitive, Boolean isInboxTag, Integer documentCount, Integer owner, GetCorrespondents200ResponseResultsInnerPermissions permissions) {
    this.id = id;
    this.slug = slug;
    this.name = name;
    this.color = color;
    this.textColor = textColor;
    this.match = match;
    this.matchingAlgorithm = matchingAlgorithm;
    this.isInsensitive = isInsensitive;
    this.isInboxTag = isInboxTag;
    this.documentCount = documentCount;
    this.owner = owner;
    this.permissions = permissions;
  }

  public GetTags200ResponseResultsInner id(Integer id) {
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

  public GetTags200ResponseResultsInner slug(String slug) {
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

  public GetTags200ResponseResultsInner name(String name) {
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

  public GetTags200ResponseResultsInner color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  */
  @NotNull 
  @Schema(name = "color", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public GetTags200ResponseResultsInner textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }

  /**
   * Get textColor
   * @return textColor
  */
  @NotNull 
  @Schema(name = "text_color", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text_color")
  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public GetTags200ResponseResultsInner match(String match) {
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

  public GetTags200ResponseResultsInner matchingAlgorithm(Integer matchingAlgorithm) {
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

  public GetTags200ResponseResultsInner isInsensitive(Boolean isInsensitive) {
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

  public GetTags200ResponseResultsInner isInboxTag(Boolean isInboxTag) {
    this.isInboxTag = isInboxTag;
    return this;
  }

  /**
   * Get isInboxTag
   * @return isInboxTag
  */
  @NotNull 
  @Schema(name = "is_inbox_tag", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_inbox_tag")
  public Boolean getIsInboxTag() {
    return isInboxTag;
  }

  public void setIsInboxTag(Boolean isInboxTag) {
    this.isInboxTag = isInboxTag;
  }

  public GetTags200ResponseResultsInner documentCount(Integer documentCount) {
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

  public GetTags200ResponseResultsInner owner(Integer owner) {
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

  public GetTags200ResponseResultsInner permissions(GetCorrespondents200ResponseResultsInnerPermissions permissions) {
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

  public void setPermissions(GetCorrespondents200ResponseResultsInnerPermissions permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTags200ResponseResultsInner getTags200ResponseResultsInner = (GetTags200ResponseResultsInner) o;
    return Objects.equals(this.id, getTags200ResponseResultsInner.id) &&
        Objects.equals(this.slug, getTags200ResponseResultsInner.slug) &&
        Objects.equals(this.name, getTags200ResponseResultsInner.name) &&
        Objects.equals(this.color, getTags200ResponseResultsInner.color) &&
        Objects.equals(this.textColor, getTags200ResponseResultsInner.textColor) &&
        Objects.equals(this.match, getTags200ResponseResultsInner.match) &&
        Objects.equals(this.matchingAlgorithm, getTags200ResponseResultsInner.matchingAlgorithm) &&
        Objects.equals(this.isInsensitive, getTags200ResponseResultsInner.isInsensitive) &&
        Objects.equals(this.isInboxTag, getTags200ResponseResultsInner.isInboxTag) &&
        Objects.equals(this.documentCount, getTags200ResponseResultsInner.documentCount) &&
        Objects.equals(this.owner, getTags200ResponseResultsInner.owner) &&
        Objects.equals(this.permissions, getTags200ResponseResultsInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, name, color, textColor, match, matchingAlgorithm, isInsensitive, isInboxTag, documentCount, owner, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTags200ResponseResultsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    matchingAlgorithm: ").append(toIndentedString(matchingAlgorithm)).append("\n");
    sb.append("    isInsensitive: ").append(toIndentedString(isInsensitive)).append("\n");
    sb.append("    isInboxTag: ").append(toIndentedString(isInboxTag)).append("\n");
    sb.append("    documentCount: ").append(toIndentedString(documentCount)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

