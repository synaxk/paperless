package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.GetUISettings200ResponseSettingsUpdateChecking;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetUISettings200ResponseSettings
 */

@JsonTypeName("GetUISettings_200_response_settings")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetUISettings200ResponseSettings {

  private GetUISettings200ResponseSettingsUpdateChecking updateChecking;

  public GetUISettings200ResponseSettings() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetUISettings200ResponseSettings(GetUISettings200ResponseSettingsUpdateChecking updateChecking) {
    this.updateChecking = updateChecking;
  }

  public GetUISettings200ResponseSettings updateChecking(GetUISettings200ResponseSettingsUpdateChecking updateChecking) {
    this.updateChecking = updateChecking;
    return this;
  }

  /**
   * Get updateChecking
   * @return updateChecking
  */
  @NotNull @Valid 
  @Schema(name = "update_checking", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("update_checking")
  public GetUISettings200ResponseSettingsUpdateChecking getUpdateChecking() {
    return updateChecking;
  }

  public void setUpdateChecking(GetUISettings200ResponseSettingsUpdateChecking updateChecking) {
    this.updateChecking = updateChecking;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUISettings200ResponseSettings getUISettings200ResponseSettings = (GetUISettings200ResponseSettings) o;
    return Objects.equals(this.updateChecking, getUISettings200ResponseSettings.updateChecking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateChecking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUISettings200ResponseSettings {\n");
    sb.append("    updateChecking: ").append(toIndentedString(updateChecking)).append("\n");
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

