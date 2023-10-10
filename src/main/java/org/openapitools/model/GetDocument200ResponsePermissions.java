package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.GetDocument200ResponsePermissionsView;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetDocument200ResponsePermissions
 */

@JsonTypeName("GetDocument_200_response_permissions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetDocument200ResponsePermissions {

  private GetDocument200ResponsePermissionsView view;

  private GetDocument200ResponsePermissionsView change;

  public GetDocument200ResponsePermissions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetDocument200ResponsePermissions(GetDocument200ResponsePermissionsView view, GetDocument200ResponsePermissionsView change) {
    this.view = view;
    this.change = change;
  }

  public GetDocument200ResponsePermissions view(GetDocument200ResponsePermissionsView view) {
    this.view = view;
    return this;
  }

  /**
   * Get view
   * @return view
  */
  @NotNull @Valid 
  @Schema(name = "view", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("view")
  public GetDocument200ResponsePermissionsView getView() {
    return view;
  }

  public void setView(GetDocument200ResponsePermissionsView view) {
    this.view = view;
  }

  public GetDocument200ResponsePermissions change(GetDocument200ResponsePermissionsView change) {
    this.change = change;
    return this;
  }

  /**
   * Get change
   * @return change
  */
  @NotNull @Valid 
  @Schema(name = "change", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("change")
  public GetDocument200ResponsePermissionsView getChange() {
    return change;
  }

  public void setChange(GetDocument200ResponsePermissionsView change) {
    this.change = change;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocument200ResponsePermissions getDocument200ResponsePermissions = (GetDocument200ResponsePermissions) o;
    return Objects.equals(this.view, getDocument200ResponsePermissions.view) &&
        Objects.equals(this.change, getDocument200ResponsePermissions.change);
  }

  @Override
  public int hashCode() {
    return Objects.hash(view, change);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocument200ResponsePermissions {\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
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

