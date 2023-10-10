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
 * GetCorrespondents200ResponseResultsInnerPermissionsView
 */

@JsonTypeName("GetCorrespondents_200_response_results_inner_permissions_view")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetCorrespondents200ResponseResultsInnerPermissionsView {

  @Valid
  private List<Object> users = new ArrayList<>();

  @Valid
  private List<Object> groups = new ArrayList<>();

  public GetCorrespondents200ResponseResultsInnerPermissionsView() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetCorrespondents200ResponseResultsInnerPermissionsView(List<Object> users, List<Object> groups) {
    this.users = users;
    this.groups = groups;
  }

  public GetCorrespondents200ResponseResultsInnerPermissionsView users(List<Object> users) {
    this.users = users;
    return this;
  }

  public GetCorrespondents200ResponseResultsInnerPermissionsView addUsersItem(Object usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
  */
  @NotNull 
  @Schema(name = "users", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("users")
  public List<Object> getUsers() {
    return users;
  }

  public void setUsers(List<Object> users) {
    this.users = users;
  }

  public GetCorrespondents200ResponseResultsInnerPermissionsView groups(List<Object> groups) {
    this.groups = groups;
    return this;
  }

  public GetCorrespondents200ResponseResultsInnerPermissionsView addGroupsItem(Object groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  */
  @NotNull 
  @Schema(name = "groups", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("groups")
  public List<Object> getGroups() {
    return groups;
  }

  public void setGroups(List<Object> groups) {
    this.groups = groups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorrespondents200ResponseResultsInnerPermissionsView getCorrespondents200ResponseResultsInnerPermissionsView = (GetCorrespondents200ResponseResultsInnerPermissionsView) o;
    return Objects.equals(this.users, getCorrespondents200ResponseResultsInnerPermissionsView.users) &&
        Objects.equals(this.groups, getCorrespondents200ResponseResultsInnerPermissionsView.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorrespondents200ResponseResultsInnerPermissionsView {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

