package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GetCorrespondents200ResponseResultsInnerPermissions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateDocumentRequest
 */

@JsonTypeName("UpdateDocument_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class UpdateDocumentRequest {

  private Integer id;

  private Integer correspondent;

  private Integer documentType;

  private Integer storagePath;

  private String title;

  private String content;

  @Valid
  private List<Integer> tags = new ArrayList<>();

  private String createdDate;

  private String modified;

  private String added;

  private Integer archiveSerialNumber;

  private String originalFileName;

  private String archivedFileName;

  private Integer owner;

  private GetCorrespondents200ResponseResultsInnerPermissions permissions;

  @Valid
  private List<Object> notes = new ArrayList<>();

  private GetCorrespondents200ResponseResultsInnerPermissions setPermissions;

  public UpdateDocumentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateDocumentRequest(Integer id, Integer correspondent, Integer documentType, Integer storagePath, String title, String content, List<Integer> tags, String createdDate, String modified, String added, Integer archiveSerialNumber, String originalFileName, String archivedFileName, Integer owner, GetCorrespondents200ResponseResultsInnerPermissions permissions, List<Object> notes, GetCorrespondents200ResponseResultsInnerPermissions setPermissions) {
    this.id = id;
    this.correspondent = correspondent;
    this.documentType = documentType;
    this.storagePath = storagePath;
    this.title = title;
    this.content = content;
    this.tags = tags;
    this.createdDate = createdDate;
    this.modified = modified;
    this.added = added;
    this.archiveSerialNumber = archiveSerialNumber;
    this.originalFileName = originalFileName;
    this.archivedFileName = archivedFileName;
    this.owner = owner;
    this.permissions = permissions;
    this.notes = notes;
    this.setPermissions = setPermissions;
  }

  public UpdateDocumentRequest id(Integer id) {
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

  public UpdateDocumentRequest correspondent(Integer correspondent) {
    this.correspondent = correspondent;
    return this;
  }

  /**
   * Get correspondent
   * @return correspondent
  */
  @NotNull 
  @Schema(name = "correspondent", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("correspondent")
  public Integer getCorrespondent() {
    return correspondent;
  }

  public void setCorrespondent(Integer correspondent) {
    this.correspondent = correspondent;
  }

  public UpdateDocumentRequest documentType(Integer documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
  */
  @NotNull 
  @Schema(name = "document_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("document_type")
  public Integer getDocumentType() {
    return documentType;
  }

  public void setDocumentType(Integer documentType) {
    this.documentType = documentType;
  }

  public UpdateDocumentRequest storagePath(Integer storagePath) {
    this.storagePath = storagePath;
    return this;
  }

  /**
   * Get storagePath
   * @return storagePath
  */
  @NotNull 
  @Schema(name = "storage_path", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("storage_path")
  public Integer getStoragePath() {
    return storagePath;
  }

  public void setStoragePath(Integer storagePath) {
    this.storagePath = storagePath;
  }

  public UpdateDocumentRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UpdateDocumentRequest content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @NotNull 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public UpdateDocumentRequest tags(List<Integer> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateDocumentRequest addTagsItem(Integer tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @NotNull 
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tags")
  public List<Integer> getTags() {
    return tags;
  }

  public void setTags(List<Integer> tags) {
    this.tags = tags;
  }

  public UpdateDocumentRequest createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @NotNull 
  @Schema(name = "created_date", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_date")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public UpdateDocumentRequest modified(String modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
  */
  @NotNull 
  @Schema(name = "modified", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("modified")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }

  public UpdateDocumentRequest added(String added) {
    this.added = added;
    return this;
  }

  /**
   * Get added
   * @return added
  */
  @NotNull 
  @Schema(name = "added", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("added")
  public String getAdded() {
    return added;
  }

  public void setAdded(String added) {
    this.added = added;
  }

  public UpdateDocumentRequest archiveSerialNumber(Integer archiveSerialNumber) {
    this.archiveSerialNumber = archiveSerialNumber;
    return this;
  }

  /**
   * Get archiveSerialNumber
   * @return archiveSerialNumber
  */
  @NotNull 
  @Schema(name = "archive_serial_number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("archive_serial_number")
  public Integer getArchiveSerialNumber() {
    return archiveSerialNumber;
  }

  public void setArchiveSerialNumber(Integer archiveSerialNumber) {
    this.archiveSerialNumber = archiveSerialNumber;
  }

  public UpdateDocumentRequest originalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
    return this;
  }

  /**
   * Get originalFileName
   * @return originalFileName
  */
  @NotNull 
  @Schema(name = "original_file_name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("original_file_name")
  public String getOriginalFileName() {
    return originalFileName;
  }

  public void setOriginalFileName(String originalFileName) {
    this.originalFileName = originalFileName;
  }

  public UpdateDocumentRequest archivedFileName(String archivedFileName) {
    this.archivedFileName = archivedFileName;
    return this;
  }

  /**
   * Get archivedFileName
   * @return archivedFileName
  */
  @NotNull 
  @Schema(name = "archived_file_name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("archived_file_name")
  public String getArchivedFileName() {
    return archivedFileName;
  }

  public void setArchivedFileName(String archivedFileName) {
    this.archivedFileName = archivedFileName;
  }

  public UpdateDocumentRequest owner(Integer owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @NotNull 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("owner")
  public Integer getOwner() {
    return owner;
  }

  public void setOwner(Integer owner) {
    this.owner = owner;
  }

  public UpdateDocumentRequest permissions(GetCorrespondents200ResponseResultsInnerPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  */
  @NotNull @Valid 
  @Schema(name = "permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permissions")
  public GetCorrespondents200ResponseResultsInnerPermissions getPermissions() {
    return permissions;
  }

  public UpdateDocumentRequest notes(List<Object> notes) {
    this.notes = notes;
    return this;
  }

  public UpdateDocumentRequest addNotesItem(Object notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  @NotNull 
  @Schema(name = "notes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notes")
  public List<Object> getNotes() {
    return notes;
  }

  public void setNotes(List<Object> notes) {
    this.notes = notes;
  }

  public UpdateDocumentRequest setPermissions(GetCorrespondents200ResponseResultsInnerPermissions setPermissions) {
    this.setPermissions = setPermissions;
    return this;
  }

  /**
   * Get setPermissions
   * @return setPermissions
  */
  @NotNull @Valid 
  @Schema(name = "set_permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("set_permissions")
  public GetCorrespondents200ResponseResultsInnerPermissions getSetPermissions() {
    return setPermissions;
  }

  public void setSetPermissions(GetCorrespondents200ResponseResultsInnerPermissions setPermissions) {
    this.setPermissions = setPermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDocumentRequest updateDocumentRequest = (UpdateDocumentRequest) o;
    return Objects.equals(this.id, updateDocumentRequest.id) &&
        Objects.equals(this.correspondent, updateDocumentRequest.correspondent) &&
        Objects.equals(this.documentType, updateDocumentRequest.documentType) &&
        Objects.equals(this.storagePath, updateDocumentRequest.storagePath) &&
        Objects.equals(this.title, updateDocumentRequest.title) &&
        Objects.equals(this.content, updateDocumentRequest.content) &&
        Objects.equals(this.tags, updateDocumentRequest.tags) &&
        Objects.equals(this.createdDate, updateDocumentRequest.createdDate) &&
        Objects.equals(this.modified, updateDocumentRequest.modified) &&
        Objects.equals(this.added, updateDocumentRequest.added) &&
        Objects.equals(this.archiveSerialNumber, updateDocumentRequest.archiveSerialNumber) &&
        Objects.equals(this.originalFileName, updateDocumentRequest.originalFileName) &&
        Objects.equals(this.archivedFileName, updateDocumentRequest.archivedFileName) &&
        Objects.equals(this.owner, updateDocumentRequest.owner) &&
        Objects.equals(this.permissions, updateDocumentRequest.permissions) &&
        Objects.equals(this.notes, updateDocumentRequest.notes) &&
        Objects.equals(this.setPermissions, updateDocumentRequest.setPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, correspondent, documentType, storagePath, title, content, tags, createdDate, modified, added, archiveSerialNumber, originalFileName, archivedFileName, owner, permissions, notes, setPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDocumentRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correspondent: ").append(toIndentedString(correspondent)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    storagePath: ").append(toIndentedString(storagePath)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    archiveSerialNumber: ").append(toIndentedString(archiveSerialNumber)).append("\n");
    sb.append("    originalFileName: ").append(toIndentedString(originalFileName)).append("\n");
    sb.append("    archivedFileName: ").append(toIndentedString(archivedFileName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    setPermissions: ").append(toIndentedString(setPermissions)).append("\n");
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

