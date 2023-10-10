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
 * GetUISettings200ResponseUser
 */

@JsonTypeName("GetUISettings_200_response_user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetUISettings200ResponseUser {

  private Integer id;

  private String username;

  private Boolean isSuperuser;

  @Valid
  private List<Object> groups = new ArrayList<>();

  public GetUISettings200ResponseUser() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetUISettings200ResponseUser(Integer id, String username, Boolean isSuperuser, List<Object> groups) {
    this.id = id;
    this.username = username;
    this.isSuperuser = isSuperuser;
    this.groups = groups;
  }

  public GetUISettings200ResponseUser id(Integer id) {
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

  public GetUISettings200ResponseUser username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @NotNull 
  @Schema(name = "username", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public GetUISettings200ResponseUser isSuperuser(Boolean isSuperuser) {
    this.isSuperuser = isSuperuser;
    return this;
  }

  /**
   * Get isSuperuser
   * @return isSuperuser
  */
  @NotNull 
  @Schema(name = "is_superuser", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_superuser")
  public Boolean getIsSuperuser() {
    return isSuperuser;
  }

  public void setIsSuperuser(Boolean isSuperuser) {
    this.isSuperuser = isSuperuser;
  }

  public GetUISettings200ResponseUser groups(List<Object> groups) {
    this.groups = groups;
    return this;
  }

  public GetUISettings200ResponseUser addGroupsItem(Object groupsItem) {
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
    GetUISettings200ResponseUser getUISettings200ResponseUser = (GetUISettings200ResponseUser) o;
    return Objects.equals(this.id, getUISettings200ResponseUser.id) &&
        Objects.equals(this.username, getUISettings200ResponseUser.username) &&
        Objects.equals(this.isSuperuser, getUISettings200ResponseUser.isSuperuser) &&
        Objects.equals(this.groups, getUISettings200ResponseUser.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, isSuperuser, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUISettings200ResponseUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    isSuperuser: ").append(toIndentedString(isSuperuser)).append("\n");
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

