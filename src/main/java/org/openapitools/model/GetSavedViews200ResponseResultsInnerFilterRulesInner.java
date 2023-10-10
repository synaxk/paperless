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
 * GetSavedViews200ResponseResultsInnerFilterRulesInner
 */

@JsonTypeName("GetSavedViews_200_response_results_inner_filter_rules_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetSavedViews200ResponseResultsInnerFilterRulesInner {

  private Integer ruleType;

  private String value;

  public GetSavedViews200ResponseResultsInnerFilterRulesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetSavedViews200ResponseResultsInnerFilterRulesInner(Integer ruleType, String value) {
    this.ruleType = ruleType;
    this.value = value;
  }

  public GetSavedViews200ResponseResultsInnerFilterRulesInner ruleType(Integer ruleType) {
    this.ruleType = ruleType;
    return this;
  }

  /**
   * Get ruleType
   * @return ruleType
  */
  @NotNull 
  @Schema(name = "rule_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rule_type")
  public Integer getRuleType() {
    return ruleType;
  }

  public void setRuleType(Integer ruleType) {
    this.ruleType = ruleType;
  }

  public GetSavedViews200ResponseResultsInnerFilterRulesInner value(String value) {
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
    GetSavedViews200ResponseResultsInnerFilterRulesInner getSavedViews200ResponseResultsInnerFilterRulesInner = (GetSavedViews200ResponseResultsInnerFilterRulesInner) o;
    return Objects.equals(this.ruleType, getSavedViews200ResponseResultsInnerFilterRulesInner.ruleType) &&
        Objects.equals(this.value, getSavedViews200ResponseResultsInnerFilterRulesInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavedViews200ResponseResultsInnerFilterRulesInner {\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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

