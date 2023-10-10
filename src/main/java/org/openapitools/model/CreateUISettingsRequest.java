package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CreateUISettingsRequestSettings;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateUISettingsRequest
 */

@JsonTypeName("CreateUISettings_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class CreateUISettingsRequest {

  private CreateUISettingsRequestSettings settings;

  public CreateUISettingsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUISettingsRequest(CreateUISettingsRequestSettings settings) {
    this.settings = settings;
  }

  public CreateUISettingsRequest settings(CreateUISettingsRequestSettings settings) {
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
  public CreateUISettingsRequestSettings getSettings() {
    return settings;
  }

  public void setSettings(CreateUISettingsRequestSettings settings) {
    this.settings = settings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUISettingsRequest createUISettingsRequest = (CreateUISettingsRequest) o;
    return Objects.equals(this.settings, createUISettingsRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUISettingsRequest {\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

