package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GetSavedViews200ResponseResultsInnerFilterRulesInner;
import org.openapitools.model.GetSavedViews200ResponseResultsInnerOwner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetSavedViews200ResponseResultsInner
 */

@JsonTypeName("GetSavedViews_200_response_results_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetSavedViews200ResponseResultsInner {

  private Integer id;

  private String name;

  private Boolean showOnDashboard;

  private Boolean showInSidebar;

  private String sortField;

  private Boolean sortReverse;

  @Valid
  private List<@Valid GetSavedViews200ResponseResultsInnerFilterRulesInner> filterRules = new ArrayList<>();

  private GetSavedViews200ResponseResultsInnerOwner owner;

  private Boolean userCanChange;

  public GetSavedViews200ResponseResultsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetSavedViews200ResponseResultsInner(Integer id, String name, Boolean showOnDashboard, Boolean showInSidebar, String sortField, Boolean sortReverse, List<@Valid GetSavedViews200ResponseResultsInnerFilterRulesInner> filterRules, GetSavedViews200ResponseResultsInnerOwner owner, Boolean userCanChange) {
    this.id = id;
    this.name = name;
    this.showOnDashboard = showOnDashboard;
    this.showInSidebar = showInSidebar;
    this.sortField = sortField;
    this.sortReverse = sortReverse;
    this.filterRules = filterRules;
    this.owner = owner;
    this.userCanChange = userCanChange;
  }

  public GetSavedViews200ResponseResultsInner id(Integer id) {
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

  public GetSavedViews200ResponseResultsInner name(String name) {
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

  public GetSavedViews200ResponseResultsInner showOnDashboard(Boolean showOnDashboard) {
    this.showOnDashboard = showOnDashboard;
    return this;
  }

  /**
   * Get showOnDashboard
   * @return showOnDashboard
  */
  @NotNull 
  @Schema(name = "show_on_dashboard", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("show_on_dashboard")
  public Boolean getShowOnDashboard() {
    return showOnDashboard;
  }

  public void setShowOnDashboard(Boolean showOnDashboard) {
    this.showOnDashboard = showOnDashboard;
  }

  public GetSavedViews200ResponseResultsInner showInSidebar(Boolean showInSidebar) {
    this.showInSidebar = showInSidebar;
    return this;
  }

  /**
   * Get showInSidebar
   * @return showInSidebar
  */
  @NotNull 
  @Schema(name = "show_in_sidebar", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("show_in_sidebar")
  public Boolean getShowInSidebar() {
    return showInSidebar;
  }

  public void setShowInSidebar(Boolean showInSidebar) {
    this.showInSidebar = showInSidebar;
  }

  public GetSavedViews200ResponseResultsInner sortField(String sortField) {
    this.sortField = sortField;
    return this;
  }

  /**
   * Get sortField
   * @return sortField
  */
  @NotNull 
  @Schema(name = "sort_field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sort_field")
  public String getSortField() {
    return sortField;
  }

  public void setSortField(String sortField) {
    this.sortField = sortField;
  }

  public GetSavedViews200ResponseResultsInner sortReverse(Boolean sortReverse) {
    this.sortReverse = sortReverse;
    return this;
  }

  /**
   * Get sortReverse
   * @return sortReverse
  */
  @NotNull 
  @Schema(name = "sort_reverse", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sort_reverse")
  public Boolean getSortReverse() {
    return sortReverse;
  }

  public void setSortReverse(Boolean sortReverse) {
    this.sortReverse = sortReverse;
  }

  public GetSavedViews200ResponseResultsInner filterRules(List<@Valid GetSavedViews200ResponseResultsInnerFilterRulesInner> filterRules) {
    this.filterRules = filterRules;
    return this;
  }

  public GetSavedViews200ResponseResultsInner addFilterRulesItem(GetSavedViews200ResponseResultsInnerFilterRulesInner filterRulesItem) {
    if (this.filterRules == null) {
      this.filterRules = new ArrayList<>();
    }
    this.filterRules.add(filterRulesItem);
    return this;
  }

  /**
   * Get filterRules
   * @return filterRules
  */
  @NotNull @Valid 
  @Schema(name = "filter_rules", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filter_rules")
  public List<@Valid GetSavedViews200ResponseResultsInnerFilterRulesInner> getFilterRules() {
    return filterRules;
  }

  public void setFilterRules(List<@Valid GetSavedViews200ResponseResultsInnerFilterRulesInner> filterRules) {
    this.filterRules = filterRules;
  }

  public GetSavedViews200ResponseResultsInner owner(GetSavedViews200ResponseResultsInnerOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @NotNull @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("owner")
  public GetSavedViews200ResponseResultsInnerOwner getOwner() {
    return owner;
  }

  public void setOwner(GetSavedViews200ResponseResultsInnerOwner owner) {
    this.owner = owner;
  }

  public GetSavedViews200ResponseResultsInner userCanChange(Boolean userCanChange) {
    this.userCanChange = userCanChange;
    return this;
  }

  /**
   * Get userCanChange
   * @return userCanChange
  */
  @NotNull 
  @Schema(name = "user_can_change", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_can_change")
  public Boolean getUserCanChange() {
    return userCanChange;
  }

  public void setUserCanChange(Boolean userCanChange) {
    this.userCanChange = userCanChange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavedViews200ResponseResultsInner getSavedViews200ResponseResultsInner = (GetSavedViews200ResponseResultsInner) o;
    return Objects.equals(this.id, getSavedViews200ResponseResultsInner.id) &&
        Objects.equals(this.name, getSavedViews200ResponseResultsInner.name) &&
        Objects.equals(this.showOnDashboard, getSavedViews200ResponseResultsInner.showOnDashboard) &&
        Objects.equals(this.showInSidebar, getSavedViews200ResponseResultsInner.showInSidebar) &&
        Objects.equals(this.sortField, getSavedViews200ResponseResultsInner.sortField) &&
        Objects.equals(this.sortReverse, getSavedViews200ResponseResultsInner.sortReverse) &&
        Objects.equals(this.filterRules, getSavedViews200ResponseResultsInner.filterRules) &&
        Objects.equals(this.owner, getSavedViews200ResponseResultsInner.owner) &&
        Objects.equals(this.userCanChange, getSavedViews200ResponseResultsInner.userCanChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, showOnDashboard, showInSidebar, sortField, sortReverse, filterRules, owner, userCanChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavedViews200ResponseResultsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    showOnDashboard: ").append(toIndentedString(showOnDashboard)).append("\n");
    sb.append("    showInSidebar: ").append(toIndentedString(showInSidebar)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortReverse: ").append(toIndentedString(sortReverse)).append("\n");
    sb.append("    filterRules: ").append(toIndentedString(filterRules)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    userCanChange: ").append(toIndentedString(userCanChange)).append("\n");
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

