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
 * UpdateUserRequest
 */

@JsonTypeName("UpdateUser_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class UpdateUserRequest {

  private Integer id;

  private String username;

  private String email;

  private String password;

  private String firstName;

  private String lastName;

  private String dateJoined;

  private Boolean isStaff;

  private Boolean isActive;

  private Boolean isSuperuser;

  @Valid
  private List<Object> groups = new ArrayList<>();

  @Valid
  private List<Object> userPermissions = new ArrayList<>();

  @Valid
  private List<String> inheritedPermissions = new ArrayList<>();

  private Object permissionsForm;

  public UpdateUserRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateUserRequest(Integer id, String username, String email, String password, String firstName, String lastName, String dateJoined, Boolean isStaff, Boolean isActive, Boolean isSuperuser, List<Object> groups, List<Object> userPermissions, List<String> inheritedPermissions, Object permissionsForm) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateJoined = dateJoined;
    this.isStaff = isStaff;
    this.isActive = isActive;
    this.isSuperuser = isSuperuser;
    this.groups = groups;
    this.userPermissions = userPermissions;
    this.inheritedPermissions = inheritedPermissions;
    this.permissionsForm = permissionsForm;
  }

  public UpdateUserRequest id(Integer id) {
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

  public UpdateUserRequest username(String username) {
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

  public UpdateUserRequest email(String email) {
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

  public UpdateUserRequest password(String password) {
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

  public UpdateUserRequest firstName(String firstName) {
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

  public UpdateUserRequest lastName(String lastName) {
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

  public UpdateUserRequest dateJoined(String dateJoined) {
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

  public UpdateUserRequest isStaff(Boolean isStaff) {
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

  public UpdateUserRequest isActive(Boolean isActive) {
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

  public UpdateUserRequest isSuperuser(Boolean isSuperuser) {
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

  public UpdateUserRequest groups(List<Object> groups) {
    this.groups = groups;
    return this;
  }

  public UpdateUserRequest addGroupsItem(Object groupsItem) {
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

  public UpdateUserRequest userPermissions(List<Object> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }

  public UpdateUserRequest addUserPermissionsItem(Object userPermissionsItem) {
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
  public List<Object> getUserPermissions() {
    return userPermissions;
  }

  public void setUserPermissions(List<Object> userPermissions) {
    this.userPermissions = userPermissions;
  }

  public UpdateUserRequest inheritedPermissions(List<String> inheritedPermissions) {
    this.inheritedPermissions = inheritedPermissions;
    return this;
  }

  public UpdateUserRequest addInheritedPermissionsItem(String inheritedPermissionsItem) {
    if (this.inheritedPermissions == null) {
      this.inheritedPermissions = new ArrayList<>();
    }
    this.inheritedPermissions.add(inheritedPermissionsItem);
    return this;
  }

  /**
   * Get inheritedPermissions
   * @return inheritedPermissions
  */
  @NotNull 
  @Schema(name = "inherited_permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("inherited_permissions")
  public List<String> getInheritedPermissions() {
    return inheritedPermissions;
  }

  public void setInheritedPermissions(List<String> inheritedPermissions) {
    this.inheritedPermissions = inheritedPermissions;
  }

  public UpdateUserRequest permissionsForm(Object permissionsForm) {
    this.permissionsForm = permissionsForm;
    return this;
  }

  /**
   * Get permissionsForm
   * @return permissionsForm
  */
  @NotNull 
  @Schema(name = "permissions_form", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permissions_form")
  public Object getPermissionsForm() {
    return permissionsForm;
  }

  public void setPermissionsForm(Object permissionsForm) {
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
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.id, updateUserRequest.id) &&
        Objects.equals(this.username, updateUserRequest.username) &&
        Objects.equals(this.email, updateUserRequest.email) &&
        Objects.equals(this.password, updateUserRequest.password) &&
        Objects.equals(this.firstName, updateUserRequest.firstName) &&
        Objects.equals(this.lastName, updateUserRequest.lastName) &&
        Objects.equals(this.dateJoined, updateUserRequest.dateJoined) &&
        Objects.equals(this.isStaff, updateUserRequest.isStaff) &&
        Objects.equals(this.isActive, updateUserRequest.isActive) &&
        Objects.equals(this.isSuperuser, updateUserRequest.isSuperuser) &&
        Objects.equals(this.groups, updateUserRequest.groups) &&
        Objects.equals(this.userPermissions, updateUserRequest.userPermissions) &&
        Objects.equals(this.inheritedPermissions, updateUserRequest.inheritedPermissions) &&
        Objects.equals(this.permissionsForm, updateUserRequest.permissionsForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, email, password, firstName, lastName, dateJoined, isStaff, isActive, isSuperuser, groups, userPermissions, inheritedPermissions, permissionsForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    isStaff: ").append(toIndentedString(isStaff)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isSuperuser: ").append(toIndentedString(isSuperuser)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
    sb.append("    inheritedPermissions: ").append(toIndentedString(inheritedPermissions)).append("\n");
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

