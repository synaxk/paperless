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
 * CreateUISettingsRequestSettingsUpdateChecking
 */

@JsonTypeName("CreateUISettings_request_settings_update_checking")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class CreateUISettingsRequestSettingsUpdateChecking {

  private String backendSetting;

  private Boolean enabled;

  public CreateUISettingsRequestSettingsUpdateChecking() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUISettingsRequestSettingsUpdateChecking(String backendSetting, Boolean enabled) {
    this.backendSetting = backendSetting;
    this.enabled = enabled;
  }

  public CreateUISettingsRequestSettingsUpdateChecking backendSetting(String backendSetting) {
    this.backendSetting = backendSetting;
    return this;
  }

  /**
   * Get backendSetting
   * @return backendSetting
  */
  @NotNull 
  @Schema(name = "backend_setting", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("backend_setting")
  public String getBackendSetting() {
    return backendSetting;
  }

  public void setBackendSetting(String backendSetting) {
    this.backendSetting = backendSetting;
  }

  public CreateUISettingsRequestSettingsUpdateChecking enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  */
  @NotNull 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUISettingsRequestSettingsUpdateChecking createUISettingsRequestSettingsUpdateChecking = (CreateUISettingsRequestSettingsUpdateChecking) o;
    return Objects.equals(this.backendSetting, createUISettingsRequestSettingsUpdateChecking.backendSetting) &&
        Objects.equals(this.enabled, createUISettingsRequestSettingsUpdateChecking.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendSetting, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUISettingsRequestSettingsUpdateChecking {\n");
    sb.append("    backendSetting: ").append(toIndentedString(backendSetting)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

