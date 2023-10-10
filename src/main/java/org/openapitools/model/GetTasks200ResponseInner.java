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
 * GetTasks200ResponseInner
 */

@JsonTypeName("GetTasks_200_response_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetTasks200ResponseInner {

  private Integer id;

  private String taskId;

  private String taskFileName;

  private String dateCreated;

  private String dateDone;

  private String type;

  private String status;

  private String result;

  private Boolean acknowledged;

  private String relatedDocument;

  public GetTasks200ResponseInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetTasks200ResponseInner(Integer id, String taskId, String taskFileName, String dateCreated, String type, String status, String result, Boolean acknowledged) {
    this.id = id;
    this.taskId = taskId;
    this.taskFileName = taskFileName;
    this.dateCreated = dateCreated;
    this.type = type;
    this.status = status;
    this.result = result;
    this.acknowledged = acknowledged;
  }

  public GetTasks200ResponseInner id(Integer id) {
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

  public GetTasks200ResponseInner taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
  */
  @NotNull 
  @Schema(name = "task_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("task_id")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public GetTasks200ResponseInner taskFileName(String taskFileName) {
    this.taskFileName = taskFileName;
    return this;
  }

  /**
   * Get taskFileName
   * @return taskFileName
  */
  @NotNull 
  @Schema(name = "task_file_name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("task_file_name")
  public String getTaskFileName() {
    return taskFileName;
  }

  public void setTaskFileName(String taskFileName) {
    this.taskFileName = taskFileName;
  }

  public GetTasks200ResponseInner dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
  */
  @NotNull 
  @Schema(name = "date_created", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date_created")
  public String getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  public GetTasks200ResponseInner dateDone(String dateDone) {
    this.dateDone = dateDone;
    return this;
  }

  /**
   * Get dateDone
   * @return dateDone
  */
  
  @Schema(name = "date_done", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date_done")
  public String getDateDone() {
    return dateDone;
  }

  public void setDateDone(String dateDone) {
    this.dateDone = dateDone;
  }

  public GetTasks200ResponseInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GetTasks200ResponseInner status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetTasks200ResponseInner result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  @NotNull 
  @Schema(name = "result", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("result")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public GetTasks200ResponseInner acknowledged(Boolean acknowledged) {
    this.acknowledged = acknowledged;
    return this;
  }

  /**
   * Get acknowledged
   * @return acknowledged
  */
  @NotNull 
  @Schema(name = "acknowledged", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("acknowledged")
  public Boolean getAcknowledged() {
    return acknowledged;
  }

  public void setAcknowledged(Boolean acknowledged) {
    this.acknowledged = acknowledged;
  }

  public GetTasks200ResponseInner relatedDocument(String relatedDocument) {
    this.relatedDocument = relatedDocument;
    return this;
  }

  /**
   * Get relatedDocument
   * @return relatedDocument
  */
  
  @Schema(name = "related_document", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("related_document")
  public String getRelatedDocument() {
    return relatedDocument;
  }

  public void setRelatedDocument(String relatedDocument) {
    this.relatedDocument = relatedDocument;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTasks200ResponseInner getTasks200ResponseInner = (GetTasks200ResponseInner) o;
    return Objects.equals(this.id, getTasks200ResponseInner.id) &&
        Objects.equals(this.taskId, getTasks200ResponseInner.taskId) &&
        Objects.equals(this.taskFileName, getTasks200ResponseInner.taskFileName) &&
        Objects.equals(this.dateCreated, getTasks200ResponseInner.dateCreated) &&
        Objects.equals(this.dateDone, getTasks200ResponseInner.dateDone) &&
        Objects.equals(this.type, getTasks200ResponseInner.type) &&
        Objects.equals(this.status, getTasks200ResponseInner.status) &&
        Objects.equals(this.result, getTasks200ResponseInner.result) &&
        Objects.equals(this.acknowledged, getTasks200ResponseInner.acknowledged) &&
        Objects.equals(this.relatedDocument, getTasks200ResponseInner.relatedDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskId, taskFileName, dateCreated, dateDone, type, status, result, acknowledged, relatedDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTasks200ResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskFileName: ").append(toIndentedString(taskFileName)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateDone: ").append(toIndentedString(dateDone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
    sb.append("    relatedDocument: ").append(toIndentedString(relatedDocument)).append("\n");
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

