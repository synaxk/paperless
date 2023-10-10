package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateGroupRequestPermissionsForm;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateGroupRequest
 */

@JsonTypeName("UpdateGroup_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class UpdateGroupRequest {

  private Integer id;

  private String name;

  @Valid
  private List<String> permissions = new ArrayList<>();

  @Valid
  private List<String> setPermissions = new ArrayList<>();

  private UpdateGroupRequestPermissionsForm permissionsForm;

  public UpdateGroupRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateGroupRequest(Integer id, String name, List<String> permissions, List<String> setPermissions, UpdateGroupRequestPermissionsForm permissionsForm) {
    this.id = id;
    this.name = name;
    this.permissions = permissions;
    this.setPermissions = setPermissions;
    this.permissionsForm = permissionsForm;
  }

  public UpdateGroupRequest id(Integer id) {
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

  public UpdateGroupRequest name(String name) {
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

  public UpdateGroupRequest permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UpdateGroupRequest addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  */
  @NotNull 
  @Schema(name = "permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  public UpdateGroupRequest setPermissions(List<String> setPermissions) {
    this.setPermissions = setPermissions;
    return this;
  }

  public UpdateGroupRequest addSetPermissionsItem(String setPermissionsItem) {
    if (this.setPermissions == null) {
      this.setPermissions = new ArrayList<>();
    }
    this.setPermissions.add(setPermissionsItem);
    return this;
  }

  /**
   * Get setPermissions
   * @return setPermissions
  */
  @NotNull 
  @Schema(name = "set_permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("set_permissions")
  public List<String> getSetPermissions() {
    return setPermissions;
  }

  public void setSetPermissions(List<String> setPermissions) {
    this.setPermissions = setPermissions;
  }

  public UpdateGroupRequest permissionsForm(UpdateGroupRequestPermissionsForm permissionsForm) {
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
  public UpdateGroupRequestPermissionsForm getPermissionsForm() {
    return permissionsForm;
  }

  public void setPermissionsForm(UpdateGroupRequestPermissionsForm permissionsForm) {
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
    UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) o;
    return Objects.equals(this.id, updateGroupRequest.id) &&
        Objects.equals(this.name, updateGroupRequest.name) &&
        Objects.equals(this.permissions, updateGroupRequest.permissions) &&
        Objects.equals(this.setPermissions, updateGroupRequest.setPermissions) &&
        Objects.equals(this.permissionsForm, updateGroupRequest.permissionsForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, permissions, setPermissions, permissionsForm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

