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
 * CreateUISettingsRequestSettingsDarkMode
 */

@JsonTypeName("CreateUISettings_request_settings_dark_mode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class CreateUISettingsRequestSettingsDarkMode {

  private Boolean useSystem;

  private String enabled;

  private String thumbInverted;

  public CreateUISettingsRequestSettingsDarkMode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUISettingsRequestSettingsDarkMode(Boolean useSystem, String enabled, String thumbInverted) {
    this.useSystem = useSystem;
    this.enabled = enabled;
    this.thumbInverted = thumbInverted;
  }

  public CreateUISettingsRequestSettingsDarkMode useSystem(Boolean useSystem) {
    this.useSystem = useSystem;
    return this;
  }

  /**
   * Get useSystem
   * @return useSystem
  */
  @NotNull 
  @Schema(name = "use_system", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("use_system")
  public Boolean getUseSystem() {
    return useSystem;
  }

  public void setUseSystem(Boolean useSystem) {
    this.useSystem = useSystem;
  }

  public CreateUISettingsRequestSettingsDarkMode enabled(String enabled) {
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
  public String getEnabled() {
    return enabled;
  }

  public void setEnabled(String enabled) {
    this.enabled = enabled;
  }

  public CreateUISettingsRequestSettingsDarkMode thumbInverted(String thumbInverted) {
    this.thumbInverted = thumbInverted;
    return this;
  }

  /**
   * Get thumbInverted
   * @return thumbInverted
  */
  @NotNull 
  @Schema(name = "thumb_inverted", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("thumb_inverted")
  public String getThumbInverted() {
    return thumbInverted;
  }

  public void setThumbInverted(String thumbInverted) {
    this.thumbInverted = thumbInverted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUISettingsRequestSettingsDarkMode createUISettingsRequestSettingsDarkMode = (CreateUISettingsRequestSettingsDarkMode) o;
    return Objects.equals(this.useSystem, createUISettingsRequestSettingsDarkMode.useSystem) &&
        Objects.equals(this.enabled, createUISettingsRequestSettingsDarkMode.enabled) &&
        Objects.equals(this.thumbInverted, createUISettingsRequestSettingsDarkMode.thumbInverted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useSystem, enabled, thumbInverted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUISettingsRequestSettingsDarkMode {\n");
    sb.append("    useSystem: ").append(toIndentedString(useSystem)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    thumbInverted: ").append(toIndentedString(thumbInverted)).append("\n");
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

