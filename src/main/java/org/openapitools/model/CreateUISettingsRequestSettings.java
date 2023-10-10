package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CreateUISettingsRequestSettingsBulkEdit;
import org.openapitools.model.CreateUISettingsRequestSettingsDarkMode;
import org.openapitools.model.CreateUISettingsRequestSettingsDateDisplay;
import org.openapitools.model.CreateUISettingsRequestSettingsDocumentDetails;
import org.openapitools.model.CreateUISettingsRequestSettingsNotifications;
import org.openapitools.model.CreateUISettingsRequestSettingsSavedViews;
import org.openapitools.model.CreateUISettingsRequestSettingsTheme;
import org.openapitools.model.CreateUISettingsRequestSettingsUpdateChecking;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateUISettingsRequestSettings
 */

@JsonTypeName("CreateUISettings_request_settings")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class CreateUISettingsRequestSettings {

  private CreateUISettingsRequestSettingsUpdateChecking updateChecking;

  private Boolean tourComplete;

  private CreateUISettingsRequestSettingsBulkEdit bulkEdit;

  private Integer documentListSize;

  private Boolean slimSidebar;

  private CreateUISettingsRequestSettingsDarkMode darkMode;

  private CreateUISettingsRequestSettingsTheme theme;

  private CreateUISettingsRequestSettingsDocumentDetails documentDetails;

  private CreateUISettingsRequestSettingsDateDisplay dateDisplay;

  private CreateUISettingsRequestSettingsNotifications notifications;

  private Boolean notesEnabled;

  private CreateUISettingsRequestSettingsSavedViews savedViews;

  private String language;

  public CreateUISettingsRequestSettings() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUISettingsRequestSettings(CreateUISettingsRequestSettingsUpdateChecking updateChecking, Boolean tourComplete, CreateUISettingsRequestSettingsBulkEdit bulkEdit, Integer documentListSize, Boolean slimSidebar, CreateUISettingsRequestSettingsDarkMode darkMode, CreateUISettingsRequestSettingsTheme theme, CreateUISettingsRequestSettingsDocumentDetails documentDetails, CreateUISettingsRequestSettingsDateDisplay dateDisplay, CreateUISettingsRequestSettingsNotifications notifications, Boolean notesEnabled, CreateUISettingsRequestSettingsSavedViews savedViews, String language) {
    this.updateChecking = updateChecking;
    this.tourComplete = tourComplete;
    this.bulkEdit = bulkEdit;
    this.documentListSize = documentListSize;
    this.slimSidebar = slimSidebar;
    this.darkMode = darkMode;
    this.theme = theme;
    this.documentDetails = documentDetails;
    this.dateDisplay = dateDisplay;
    this.notifications = notifications;
    this.notesEnabled = notesEnabled;
    this.savedViews = savedViews;
    this.language = language;
  }

  public CreateUISettingsRequestSettings updateChecking(CreateUISettingsRequestSettingsUpdateChecking updateChecking) {
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
  public CreateUISettingsRequestSettingsUpdateChecking getUpdateChecking() {
    return updateChecking;
  }

  public void setUpdateChecking(CreateUISettingsRequestSettingsUpdateChecking updateChecking) {
    this.updateChecking = updateChecking;
  }

  public CreateUISettingsRequestSettings tourComplete(Boolean tourComplete) {
    this.tourComplete = tourComplete;
    return this;
  }

  /**
   * Get tourComplete
   * @return tourComplete
  */
  @NotNull 
  @Schema(name = "tour_complete", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tour_complete")
  public Boolean getTourComplete() {
    return tourComplete;
  }

  public void setTourComplete(Boolean tourComplete) {
    this.tourComplete = tourComplete;
  }

  public CreateUISettingsRequestSettings bulkEdit(CreateUISettingsRequestSettingsBulkEdit bulkEdit) {
    this.bulkEdit = bulkEdit;
    return this;
  }

  /**
   * Get bulkEdit
   * @return bulkEdit
  */
  @NotNull @Valid 
  @Schema(name = "bulk_edit", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bulk_edit")
  public CreateUISettingsRequestSettingsBulkEdit getBulkEdit() {
    return bulkEdit;
  }

  public void setBulkEdit(CreateUISettingsRequestSettingsBulkEdit bulkEdit) {
    this.bulkEdit = bulkEdit;
  }

  public CreateUISettingsRequestSettings documentListSize(Integer documentListSize) {
    this.documentListSize = documentListSize;
    return this;
  }

  /**
   * Get documentListSize
   * @return documentListSize
  */
  @NotNull 
  @Schema(name = "documentListSize", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("documentListSize")
  public Integer getDocumentListSize() {
    return documentListSize;
  }

  public void setDocumentListSize(Integer documentListSize) {
    this.documentListSize = documentListSize;
  }

  public CreateUISettingsRequestSettings slimSidebar(Boolean slimSidebar) {
    this.slimSidebar = slimSidebar;
    return this;
  }

  /**
   * Get slimSidebar
   * @return slimSidebar
  */
  @NotNull 
  @Schema(name = "slim_sidebar", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("slim_sidebar")
  public Boolean getSlimSidebar() {
    return slimSidebar;
  }

  public void setSlimSidebar(Boolean slimSidebar) {
    this.slimSidebar = slimSidebar;
  }

  public CreateUISettingsRequestSettings darkMode(CreateUISettingsRequestSettingsDarkMode darkMode) {
    this.darkMode = darkMode;
    return this;
  }

  /**
   * Get darkMode
   * @return darkMode
  */
  @NotNull @Valid 
  @Schema(name = "dark_mode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dark_mode")
  public CreateUISettingsRequestSettingsDarkMode getDarkMode() {
    return darkMode;
  }

  public void setDarkMode(CreateUISettingsRequestSettingsDarkMode darkMode) {
    this.darkMode = darkMode;
  }

  public CreateUISettingsRequestSettings theme(CreateUISettingsRequestSettingsTheme theme) {
    this.theme = theme;
    return this;
  }

  /**
   * Get theme
   * @return theme
  */
  @NotNull @Valid 
  @Schema(name = "theme", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("theme")
  public CreateUISettingsRequestSettingsTheme getTheme() {
    return theme;
  }

  public void setTheme(CreateUISettingsRequestSettingsTheme theme) {
    this.theme = theme;
  }

  public CreateUISettingsRequestSettings documentDetails(CreateUISettingsRequestSettingsDocumentDetails documentDetails) {
    this.documentDetails = documentDetails;
    return this;
  }

  /**
   * Get documentDetails
   * @return documentDetails
  */
  @NotNull @Valid 
  @Schema(name = "document_details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("document_details")
  public CreateUISettingsRequestSettingsDocumentDetails getDocumentDetails() {
    return documentDetails;
  }

  public void setDocumentDetails(CreateUISettingsRequestSettingsDocumentDetails documentDetails) {
    this.documentDetails = documentDetails;
  }

  public CreateUISettingsRequestSettings dateDisplay(CreateUISettingsRequestSettingsDateDisplay dateDisplay) {
    this.dateDisplay = dateDisplay;
    return this;
  }

  /**
   * Get dateDisplay
   * @return dateDisplay
  */
  @NotNull @Valid 
  @Schema(name = "date_display", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date_display")
  public CreateUISettingsRequestSettingsDateDisplay getDateDisplay() {
    return dateDisplay;
  }

  public void setDateDisplay(CreateUISettingsRequestSettingsDateDisplay dateDisplay) {
    this.dateDisplay = dateDisplay;
  }

  public CreateUISettingsRequestSettings notifications(CreateUISettingsRequestSettingsNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

  /**
   * Get notifications
   * @return notifications
  */
  @NotNull @Valid 
  @Schema(name = "notifications", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notifications")
  public CreateUISettingsRequestSettingsNotifications getNotifications() {
    return notifications;
  }

  public void setNotifications(CreateUISettingsRequestSettingsNotifications notifications) {
    this.notifications = notifications;
  }

  public CreateUISettingsRequestSettings notesEnabled(Boolean notesEnabled) {
    this.notesEnabled = notesEnabled;
    return this;
  }

  /**
   * Get notesEnabled
   * @return notesEnabled
  */
  @NotNull 
  @Schema(name = "notes_enabled", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notes_enabled")
  public Boolean getNotesEnabled() {
    return notesEnabled;
  }

  public void setNotesEnabled(Boolean notesEnabled) {
    this.notesEnabled = notesEnabled;
  }

  public CreateUISettingsRequestSettings savedViews(CreateUISettingsRequestSettingsSavedViews savedViews) {
    this.savedViews = savedViews;
    return this;
  }

  /**
   * Get savedViews
   * @return savedViews
  */
  @NotNull @Valid 
  @Schema(name = "saved_views", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("saved_views")
  public CreateUISettingsRequestSettingsSavedViews getSavedViews() {
    return savedViews;
  }

  public void setSavedViews(CreateUISettingsRequestSettingsSavedViews savedViews) {
    this.savedViews = savedViews;
  }

  public CreateUISettingsRequestSettings language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  */
  @NotNull 
  @Schema(name = "language", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUISettingsRequestSettings createUISettingsRequestSettings = (CreateUISettingsRequestSettings) o;
    return Objects.equals(this.updateChecking, createUISettingsRequestSettings.updateChecking) &&
        Objects.equals(this.tourComplete, createUISettingsRequestSettings.tourComplete) &&
        Objects.equals(this.bulkEdit, createUISettingsRequestSettings.bulkEdit) &&
        Objects.equals(this.documentListSize, createUISettingsRequestSettings.documentListSize) &&
        Objects.equals(this.slimSidebar, createUISettingsRequestSettings.slimSidebar) &&
        Objects.equals(this.darkMode, createUISettingsRequestSettings.darkMode) &&
        Objects.equals(this.theme, createUISettingsRequestSettings.theme) &&
        Objects.equals(this.documentDetails, createUISettingsRequestSettings.documentDetails) &&
        Objects.equals(this.dateDisplay, createUISettingsRequestSettings.dateDisplay) &&
        Objects.equals(this.notifications, createUISettingsRequestSettings.notifications) &&
        Objects.equals(this.notesEnabled, createUISettingsRequestSettings.notesEnabled) &&
        Objects.equals(this.savedViews, createUISettingsRequestSettings.savedViews) &&
        Objects.equals(this.language, createUISettingsRequestSettings.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateChecking, tourComplete, bulkEdit, documentListSize, slimSidebar, darkMode, theme, documentDetails, dateDisplay, notifications, notesEnabled, savedViews, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUISettingsRequestSettings {\n");
    sb.append("    updateChecking: ").append(toIndentedString(updateChecking)).append("\n");
    sb.append("    tourComplete: ").append(toIndentedString(tourComplete)).append("\n");
    sb.append("    bulkEdit: ").append(toIndentedString(bulkEdit)).append("\n");
    sb.append("    documentListSize: ").append(toIndentedString(documentListSize)).append("\n");
    sb.append("    slimSidebar: ").append(toIndentedString(slimSidebar)).append("\n");
    sb.append("    darkMode: ").append(toIndentedString(darkMode)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    documentDetails: ").append(toIndentedString(documentDetails)).append("\n");
    sb.append("    dateDisplay: ").append(toIndentedString(dateDisplay)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    notesEnabled: ").append(toIndentedString(notesEnabled)).append("\n");
    sb.append("    savedViews: ").append(toIndentedString(savedViews)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

