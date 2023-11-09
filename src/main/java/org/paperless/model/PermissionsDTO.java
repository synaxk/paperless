package org.paperless.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * GetDocument200ResponsePermissions
 */

@JsonTypeName("GetDocument_200_response_permissions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class PermissionsDTO {

  private PermissionsViewDTO view;

  private PermissionsViewDTO change;

  public PermissionsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PermissionsDTO(PermissionsViewDTO view, PermissionsViewDTO change) {
    this.view = view;
    this.change = change;
  }

  public PermissionsDTO view(PermissionsViewDTO view) {
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
  public PermissionsViewDTO getView() {
    return view;
  }

  public void setView(PermissionsViewDTO view) {
    this.view = view;
  }

  public PermissionsDTO change(PermissionsViewDTO change) {
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
  public PermissionsViewDTO getChange() {
    return change;
  }

  public void setChange(PermissionsViewDTO change) {
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
    PermissionsDTO permissionsDTO = (PermissionsDTO) o;
    return Objects.equals(this.view, permissionsDTO.view) &&
        Objects.equals(this.change, permissionsDTO.change);
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

