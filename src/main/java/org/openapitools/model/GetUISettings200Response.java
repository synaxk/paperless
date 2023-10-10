package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GetUISettings200ResponseSettings;
import org.openapitools.model.GetUISettings200ResponseUser;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetUISettings200Response
 */

@JsonTypeName("GetUISettings_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetUISettings200Response {

  private String displayName;

  private GetUISettings200ResponseUser user;

  private GetUISettings200ResponseSettings settings;

  @Valid
  private List<String> permissions = new ArrayList<>();

  public GetUISettings200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetUISettings200Response(String displayName, GetUISettings200ResponseUser user, GetUISettings200ResponseSettings settings, List<String> permissions) {
    this.displayName = displayName;
    this.user = user;
    this.settings = settings;
    this.permissions = permissions;
  }

  public GetUISettings200Response displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  @NotNull 
  @Schema(name = "display_name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public GetUISettings200Response user(GetUISettings200ResponseUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @NotNull @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user")
  public GetUISettings200ResponseUser getUser() {
    return user;
  }

  public void setUser(GetUISettings200ResponseUser user) {
    this.user = user;
  }

  public GetUISettings200Response settings(GetUISettings200ResponseSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
  */
  @NotNull @Valid 
  @Schema(name = "settings", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("settings")
  public GetUISettings200ResponseSettings getSettings() {
    return settings;
  }

  public void setSettings(GetUISettings200ResponseSettings settings) {
    this.settings = settings;
  }

  public GetUISettings200Response permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public GetUISettings200Response addPermissionsItem(String permissionsItem) {
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

  public void setPermissions(List<String> permissions) {
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
    GetUISettings200Response getUISettings200Response = (GetUISettings200Response) o;
    return Objects.equals(this.displayName, getUISettings200Response.displayName) &&
        Objects.equals(this.user, getUISettings200Response.user) &&
        Objects.equals(this.settings, getUISettings200Response.settings) &&
        Objects.equals(this.permissions, getUISettings200Response.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, user, settings, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUISettings200Response {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

