package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AckTasksRequest
 */

@JsonTypeName("AckTasks_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class AckTasksRequest {

  @Valid
  private List<Integer> tasks = new ArrayList<>();

  public AckTasksRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AckTasksRequest(List<Integer> tasks) {
    this.tasks = tasks;
  }

  public AckTasksRequest tasks(List<Integer> tasks) {
    this.tasks = tasks;
    return this;
  }

  public AckTasksRequest addTasksItem(Integer tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

  /**
   * Get tasks
   * @return tasks
  */
  @NotNull 
  @Schema(name = "tasks", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tasks")
  public List<Integer> getTasks() {
    return tasks;
  }

  public void setTasks(List<Integer> tasks) {
    this.tasks = tasks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckTasksRequest ackTasksRequest = (AckTasksRequest) o;
    return Objects.equals(this.tasks, ackTasksRequest.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckTasksRequest {\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

