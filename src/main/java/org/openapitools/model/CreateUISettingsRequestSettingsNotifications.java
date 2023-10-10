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
 * CreateUISettingsRequestSettingsNotifications
 */

@JsonTypeName("CreateUISettings_request_settings_notifications")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class CreateUISettingsRequestSettingsNotifications {

  private Boolean consumerNewDocuments;

  private Boolean consumerSuccess;

  private Boolean consumerFailed;

  private Boolean consumerSuppressOnDashboard;

  public CreateUISettingsRequestSettingsNotifications() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUISettingsRequestSettingsNotifications(Boolean consumerNewDocuments, Boolean consumerSuccess, Boolean consumerFailed, Boolean consumerSuppressOnDashboard) {
    this.consumerNewDocuments = consumerNewDocuments;
    this.consumerSuccess = consumerSuccess;
    this.consumerFailed = consumerFailed;
    this.consumerSuppressOnDashboard = consumerSuppressOnDashboard;
  }

  public CreateUISettingsRequestSettingsNotifications consumerNewDocuments(Boolean consumerNewDocuments) {
    this.consumerNewDocuments = consumerNewDocuments;
    return this;
  }

  /**
   * Get consumerNewDocuments
   * @return consumerNewDocuments
  */
  @NotNull 
  @Schema(name = "consumer_new_documents", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consumer_new_documents")
  public Boolean getConsumerNewDocuments() {
    return consumerNewDocuments;
  }

  public void setConsumerNewDocuments(Boolean consumerNewDocuments) {
    this.consumerNewDocuments = consumerNewDocuments;
  }

  public CreateUISettingsRequestSettingsNotifications consumerSuccess(Boolean consumerSuccess) {
    this.consumerSuccess = consumerSuccess;
    return this;
  }

  /**
   * Get consumerSuccess
   * @return consumerSuccess
  */
  @NotNull 
  @Schema(name = "consumer_success", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consumer_success")
  public Boolean getConsumerSuccess() {
    return consumerSuccess;
  }

  public void setConsumerSuccess(Boolean consumerSuccess) {
    this.consumerSuccess = consumerSuccess;
  }

  public CreateUISettingsRequestSettingsNotifications consumerFailed(Boolean consumerFailed) {
    this.consumerFailed = consumerFailed;
    return this;
  }

  /**
   * Get consumerFailed
   * @return consumerFailed
  */
  @NotNull 
  @Schema(name = "consumer_failed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consumer_failed")
  public Boolean getConsumerFailed() {
    return consumerFailed;
  }

  public void setConsumerFailed(Boolean consumerFailed) {
    this.consumerFailed = consumerFailed;
  }

  public CreateUISettingsRequestSettingsNotifications consumerSuppressOnDashboard(Boolean consumerSuppressOnDashboard) {
    this.consumerSuppressOnDashboard = consumerSuppressOnDashboard;
    return this;
  }

  /**
   * Get consumerSuppressOnDashboard
   * @return consumerSuppressOnDashboard
  */
  @NotNull 
  @Schema(name = "consumer_suppress_on_dashboard", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consumer_suppress_on_dashboard")
  public Boolean getConsumerSuppressOnDashboard() {
    return consumerSuppressOnDashboard;
  }

  public void setConsumerSuppressOnDashboard(Boolean consumerSuppressOnDashboard) {
    this.consumerSuppressOnDashboard = consumerSuppressOnDashboard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUISettingsRequestSettingsNotifications createUISettingsRequestSettingsNotifications = (CreateUISettingsRequestSettingsNotifications) o;
    return Objects.equals(this.consumerNewDocuments, createUISettingsRequestSettingsNotifications.consumerNewDocuments) &&
        Objects.equals(this.consumerSuccess, createUISettingsRequestSettingsNotifications.consumerSuccess) &&
        Objects.equals(this.consumerFailed, createUISettingsRequestSettingsNotifications.consumerFailed) &&
        Objects.equals(this.consumerSuppressOnDashboard, createUISettingsRequestSettingsNotifications.consumerSuppressOnDashboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerNewDocuments, consumerSuccess, consumerFailed, consumerSuppressOnDashboard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUISettingsRequestSettingsNotifications {\n");
    sb.append("    consumerNewDocuments: ").append(toIndentedString(consumerNewDocuments)).append("\n");
    sb.append("    consumerSuccess: ").append(toIndentedString(consumerSuccess)).append("\n");
    sb.append("    consumerFailed: ").append(toIndentedString(consumerFailed)).append("\n");
    sb.append("    consumerSuppressOnDashboard: ").append(toIndentedString(consumerSuppressOnDashboard)).append("\n");
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

