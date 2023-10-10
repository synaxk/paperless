package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GetDocuments200ResponseResultsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetDocuments200Response
 */

@JsonTypeName("GetDocuments_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetDocuments200Response {

  private Integer count;

  private Integer next;

  private Integer previous;

  @Valid
  private List<Integer> all = new ArrayList<>();

  @Valid
  private List<@Valid GetDocuments200ResponseResultsInner> results = new ArrayList<>();

  public GetDocuments200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetDocuments200Response(Integer count, Integer next, Integer previous, List<Integer> all, List<@Valid GetDocuments200ResponseResultsInner> results) {
    this.count = count;
    this.next = next;
    this.previous = previous;
    this.all = all;
    this.results = results;
  }

  public GetDocuments200Response count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  @NotNull 
  @Schema(name = "count", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public GetDocuments200Response next(Integer next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  */
  @NotNull 
  @Schema(name = "next", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("next")
  public Integer getNext() {
    return next;
  }

  public void setNext(Integer next) {
    this.next = next;
  }

  public GetDocuments200Response previous(Integer previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
  */
  @NotNull 
  @Schema(name = "previous", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("previous")
  public Integer getPrevious() {
    return previous;
  }

  public void setPrevious(Integer previous) {
    this.previous = previous;
  }

  public GetDocuments200Response all(List<Integer> all) {
    this.all = all;
    return this;
  }

  public GetDocuments200Response addAllItem(Integer allItem) {
    if (this.all == null) {
      this.all = new ArrayList<>();
    }
    this.all.add(allItem);
    return this;
  }

  /**
   * Get all
   * @return all
  */
  @NotNull 
  @Schema(name = "all", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("all")
  public List<Integer> getAll() {
    return all;
  }

  public void setAll(List<Integer> all) {
    this.all = all;
  }

  public GetDocuments200Response results(List<@Valid GetDocuments200ResponseResultsInner> results) {
    this.results = results;
    return this;
  }

  public GetDocuments200Response addResultsItem(GetDocuments200ResponseResultsInner resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @NotNull @Valid 
  @Schema(name = "results", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("results")
  public List<@Valid GetDocuments200ResponseResultsInner> getResults() {
    return results;
  }

  public void setResults(List<@Valid GetDocuments200ResponseResultsInner> results) {
    this.results = results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocuments200Response getDocuments200Response = (GetDocuments200Response) o;
    return Objects.equals(this.count, getDocuments200Response.count) &&
        Objects.equals(this.next, getDocuments200Response.next) &&
        Objects.equals(this.previous, getDocuments200Response.previous) &&
        Objects.equals(this.all, getDocuments200Response.all) &&
        Objects.equals(this.results, getDocuments200Response.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, all, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocuments200Response {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

