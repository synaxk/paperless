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
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateSavedViewsRequest
 */

@JsonTypeName("CreateSavedViews_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class CreateSavedViewsRequest {

  private String name;

  private Boolean showOnDashboard;

  private Boolean showInSidebar;

  @Valid
  private List<@Valid GetSavedViews200ResponseResultsInnerFilterRulesInner> filterRules = new ArrayList<>();

  private Boolean sortReverse;

  private String sortField;

  public CreateSavedViewsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateSavedViewsRequest(String name, Boolean showOnDashboard, Boolean showInSidebar, List<@Valid GetSavedViews200ResponseResultsInnerFilterRulesInner> filterRules, Boolean sortReverse, String sortField) {
    this.name = name;
    this.showOnDashboard = showOnDashboard;
    this.showInSidebar = showInSidebar;
    this.filterRules = filterRules;
    this.sortReverse = sortReverse;
    this.sortField = sortField;
  }

  public CreateSavedViewsRequest name(String name) {
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

  public CreateSavedViewsRequest showOnDashboard(Boolean showOnDashboard) {
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

  public CreateSavedViewsRequest showInSidebar(Boolean showInSidebar) {
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

  public CreateSavedViewsRequest filterRules(List<@Valid GetSavedViews200ResponseResultsInnerFilterRulesInner> filterRules) {
    this.filterRules = filterRules;
    return this;
  }

  public CreateSavedViewsRequest addFilterRulesItem(GetSavedViews200ResponseResultsInnerFilterRulesInner filterRulesItem) {
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

  public CreateSavedViewsRequest sortReverse(Boolean sortReverse) {
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

  public CreateSavedViewsRequest sortField(String sortField) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSavedViewsRequest createSavedViewsRequest = (CreateSavedViewsRequest) o;
    return Objects.equals(this.name, createSavedViewsRequest.name) &&
        Objects.equals(this.showOnDashboard, createSavedViewsRequest.showOnDashboard) &&
        Objects.equals(this.showInSidebar, createSavedViewsRequest.showInSidebar) &&
        Objects.equals(this.filterRules, createSavedViewsRequest.filterRules) &&
        Objects.equals(this.sortReverse, createSavedViewsRequest.sortReverse) &&
        Objects.equals(this.sortField, createSavedViewsRequest.sortField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, showOnDashboard, showInSidebar, filterRules, sortReverse, sortField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSavedViewsRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    showOnDashboard: ").append(toIndentedString(showOnDashboard)).append("\n");
    sb.append("    showInSidebar: ").append(toIndentedString(showInSidebar)).append("\n");
    sb.append("    filterRules: ").append(toIndentedString(filterRules)).append("\n");
    sb.append("    sortReverse: ").append(toIndentedString(sortReverse)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
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

