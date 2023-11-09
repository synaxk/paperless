package org.paperless.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * GetDocuments200ResponseResultsInnerNotesInner
 */

@JsonTypeName("GetDocuments_200_response_results_inner_notes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class DocumentNoteDTO {

  private Integer id;

  private String note;

  private String created;

  private Integer document;

  private Integer user;

  public DocumentNoteDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DocumentNoteDTO(Integer id, String note, String created, Integer document, Integer user) {
    this.id = id;
    this.note = note;
    this.created = created;
    this.document = document;
    this.user = user;
  }

  public DocumentNoteDTO id(Integer id) {
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

  public DocumentNoteDTO note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * @return note
  */
  @NotNull 
  @Schema(name = "note", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public DocumentNoteDTO created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @NotNull 
  @Schema(name = "created", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public DocumentNoteDTO document(Integer document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
  */
  @NotNull 
  @Schema(name = "document", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("document")
  public Integer getDocument() {
    return document;
  }

  public void setDocument(Integer document) {
    this.document = document;
  }

  public DocumentNoteDTO user(Integer user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @NotNull 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user")
  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentNoteDTO documentNoteDTO = (DocumentNoteDTO) o;
    return Objects.equals(this.id, documentNoteDTO.id) &&
        Objects.equals(this.note, documentNoteDTO.note) &&
        Objects.equals(this.created, documentNoteDTO.created) &&
        Objects.equals(this.document, documentNoteDTO.document) &&
        Objects.equals(this.user, documentNoteDTO.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, note, created, document, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocuments200ResponseResultsInnerNotesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

