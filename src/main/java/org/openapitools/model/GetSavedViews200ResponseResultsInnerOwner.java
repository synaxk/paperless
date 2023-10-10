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
 * GetSavedViews200ResponseResultsInnerOwner
 */

@JsonTypeName("GetSavedViews_200_response_results_inner_owner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetSavedViews200ResponseResultsInnerOwner {

  private Integer id;

  private String password;

  private String lastLogin;

  private Boolean isSuperuser;

  private String username;

  private String firstName;

  private String lastName;

  private String email;

  private Boolean isStaff;

  private Boolean isActive;

  private String dateJoined;

  @Valid
  private List<Object> groups = new ArrayList<>();

  @Valid
  private List<Integer> userPermissions = new ArrayList<>();

  public GetSavedViews200ResponseResultsInnerOwner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetSavedViews200ResponseResultsInnerOwner(Integer id, String password, String lastLogin, Boolean isSuperuser, String username, String firstName, String lastName, String email, Boolean isStaff, Boolean isActive, String dateJoined, List<Object> groups, List<Integer> userPermissions) {
    this.id = id;
    this.password = password;
    this.lastLogin = lastLogin;
    this.isSuperuser = isSuperuser;
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.isStaff = isStaff;
    this.isActive = isActive;
    this.dateJoined = dateJoined;
    this.groups = groups;
    this.userPermissions = userPermissions;
  }

  public GetSavedViews200ResponseResultsInnerOwner id(Integer id) {
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

  public GetSavedViews200ResponseResultsInnerOwner password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @NotNull 
  @Schema(name = "password", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public GetSavedViews200ResponseResultsInnerOwner lastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * Get lastLogin
   * @return lastLogin
  */
  @NotNull 
  @Schema(name = "last_login", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_login")
  public String getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }

  public GetSavedViews200ResponseResultsInnerOwner isSuperuser(Boolean isSuperuser) {
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

  public GetSavedViews200ResponseResultsInnerOwner username(String username) {
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

  public GetSavedViews200ResponseResultsInnerOwner firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull 
  @Schema(name = "first_name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public GetSavedViews200ResponseResultsInnerOwner lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull 
  @Schema(name = "last_name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public GetSavedViews200ResponseResultsInnerOwner email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GetSavedViews200ResponseResultsInnerOwner isStaff(Boolean isStaff) {
    this.isStaff = isStaff;
    return this;
  }

  /**
   * Get isStaff
   * @return isStaff
  */
  @NotNull 
  @Schema(name = "is_staff", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_staff")
  public Boolean getIsStaff() {
    return isStaff;
  }

  public void setIsStaff(Boolean isStaff) {
    this.isStaff = isStaff;
  }

  public GetSavedViews200ResponseResultsInnerOwner isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  */
  @NotNull 
  @Schema(name = "is_active", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_active")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public GetSavedViews200ResponseResultsInnerOwner dateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }

  /**
   * Get dateJoined
   * @return dateJoined
  */
  @NotNull 
  @Schema(name = "date_joined", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date_joined")
  public String getDateJoined() {
    return dateJoined;
  }

  public void setDateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
  }

  public GetSavedViews200ResponseResultsInnerOwner groups(List<Object> groups) {
    this.groups = groups;
    return this;
  }

  public GetSavedViews200ResponseResultsInnerOwner addGroupsItem(Object groupsItem) {
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

  public GetSavedViews200ResponseResultsInnerOwner userPermissions(List<Integer> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public GetSavedViews200ResponseResultsInnerOwner addUserPermissionsItem(Integer userPermissionsItem) {
    if (this.userPermissions == null) {
      this.userPermissions = new ArrayList<>();
    }
    this.userPermissions.add(userPermissionsItem);
    return this;
  }

  /**
   * Get userPermissions
   * @return userPermissions
  */
  @NotNull 
  @Schema(name = "user_permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_permissions")
  public List<Integer> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<Integer> userPermissions) {
    this.userPermissions = userPermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavedViews200ResponseResultsInnerOwner getSavedViews200ResponseResultsInnerOwner = (GetSavedViews200ResponseResultsInnerOwner) o;
    return Objects.equals(this.id, getSavedViews200ResponseResultsInnerOwner.id) &&
        Objects.equals(this.password, getSavedViews200ResponseResultsInnerOwner.password) &&
        Objects.equals(this.lastLogin, getSavedViews200ResponseResultsInnerOwner.lastLogin) &&
        Objects.equals(this.isSuperuser, getSavedViews200ResponseResultsInnerOwner.isSuperuser) &&
        Objects.equals(this.username, getSavedViews200ResponseResultsInnerOwner.username) &&
        Objects.equals(this.firstName, getSavedViews200ResponseResultsInnerOwner.firstName) &&
        Objects.equals(this.lastName, getSavedViews200ResponseResultsInnerOwner.lastName) &&
        Objects.equals(this.email, getSavedViews200ResponseResultsInnerOwner.email) &&
        Objects.equals(this.isStaff, getSavedViews200ResponseResultsInnerOwner.isStaff) &&
        Objects.equals(this.isActive, getSavedViews200ResponseResultsInnerOwner.isActive) &&
        Objects.equals(this.dateJoined, getSavedViews200ResponseResultsInnerOwner.dateJoined) &&
        Objects.equals(this.groups, getSavedViews200ResponseResultsInnerOwner.groups) &&
        Objects.equals(this.userPermissions, getSavedViews200ResponseResultsInnerOwner.userPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password, lastLogin, isSuperuser, username, firstName, lastName, email, isStaff, isActive, dateJoined, groups, userPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavedViews200ResponseResultsInnerOwner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    isSuperuser: ").append(toIndentedString(isSuperuser)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isStaff: ").append(toIndentedString(isStaff)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
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

