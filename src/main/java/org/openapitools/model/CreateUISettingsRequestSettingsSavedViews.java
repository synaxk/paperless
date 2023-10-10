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
 * CreateUISettingsRequestSettingsSavedViews
 */

@JsonTypeName("CreateUISettings_request_settings_saved_views")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class CreateUISettingsRequestSettingsSavedViews {

  private Boolean warnOnUnsavedChange;

  public CreateUISettingsRequestSettingsSavedViews() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUISettingsRequestSettingsSavedViews(Boolean warnOnUnsavedChange) {
    this.warnOnUnsavedChange = warnOnUnsavedChange;
  }

  public CreateUISettingsRequestSettingsSavedViews warnOnUnsavedChange(Boolean warnOnUnsavedChange) {
    this.warnOnUnsavedChange = warnOnUnsavedChange;
    return this;
  }

  /**
   * Get warnOnUnsavedChange
   * @return warnOnUnsavedChange
  */
  @NotNull 
  @Schema(name = "warn_on_unsaved_change", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warn_on_unsaved_change")
  public Boolean getWarnOnUnsavedChange() {
    return warnOnUnsavedChange;
  }

  public void setWarnOnUnsavedChange(Boolean warnOnUnsavedChange) {
    this.warnOnUnsavedChange = warnOnUnsavedChange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUISettingsRequestSettingsSavedViews createUISettingsRequestSettingsSavedViews = (CreateUISettingsRequestSettingsSavedViews) o;
    return Objects.equals(this.warnOnUnsavedChange, createUISettingsRequestSettingsSavedViews.warnOnUnsavedChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warnOnUnsavedChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUISettingsRequestSettingsSavedViews {\n");
    sb.append("    warnOnUnsavedChange: ").append(toIndentedString(warnOnUnsavedChange)).append("\n");
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

