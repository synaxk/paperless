package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Statistics200ResponseDocumentFileTypeCountsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Statistics200Response
 */

@JsonTypeName("Statistics_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class Statistics200Response {

  private Integer documentsTotal;

  private Integer documentsInbox;

  private Integer inboxTag;

  @Valid
  private List<@Valid Statistics200ResponseDocumentFileTypeCountsInner> documentFileTypeCounts = new ArrayList<>();

  private Integer characterCount;

  public Statistics200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Statistics200Response(Integer documentsTotal, Integer documentsInbox, Integer inboxTag, List<@Valid Statistics200ResponseDocumentFileTypeCountsInner> documentFileTypeCounts, Integer characterCount) {
    this.documentsTotal = documentsTotal;
    this.documentsInbox = documentsInbox;
    this.inboxTag = inboxTag;
    this.documentFileTypeCounts = documentFileTypeCounts;
    this.characterCount = characterCount;
  }

  public Statistics200Response documentsTotal(Integer documentsTotal) {
    this.documentsTotal = documentsTotal;
    return this;
  }

  /**
   * Get documentsTotal
   * @return documentsTotal
  */
  @NotNull 
  @Schema(name = "documents_total", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("documents_total")
  public Integer getDocumentsTotal() {
    return documentsTotal;
  }

  public void setDocumentsTotal(Integer documentsTotal) {
    this.documentsTotal = documentsTotal;
  }

  public Statistics200Response documentsInbox(Integer documentsInbox) {
    this.documentsInbox = documentsInbox;
    return this;
  }

  /**
   * Get documentsInbox
   * @return documentsInbox
  */
  @NotNull 
  @Schema(name = "documents_inbox", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("documents_inbox")
  public Integer getDocumentsInbox() {
    return documentsInbox;
  }

  public void setDocumentsInbox(Integer documentsInbox) {
    this.documentsInbox = documentsInbox;
  }

  public Statistics200Response inboxTag(Integer inboxTag) {
    this.inboxTag = inboxTag;
    return this;
  }

  /**
   * Get inboxTag
   * @return inboxTag
  */
  @NotNull 
  @Schema(name = "inbox_tag", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("inbox_tag")
  public Integer getInboxTag() {
    return inboxTag;
  }

  public void setInboxTag(Integer inboxTag) {
    this.inboxTag = inboxTag;
  }

  public Statistics200Response documentFileTypeCounts(List<@Valid Statistics200ResponseDocumentFileTypeCountsInner> documentFileTypeCounts) {
    this.documentFileTypeCounts = documentFileTypeCounts;
    return this;
  }

  public Statistics200Response addDocumentFileTypeCountsItem(Statistics200ResponseDocumentFileTypeCountsInner documentFileTypeCountsItem) {
    if (this.documentFileTypeCounts == null) {
      this.documentFileTypeCounts = new ArrayList<>();
    }
    this.documentFileTypeCounts.add(documentFileTypeCountsItem);
    return this;
  }

  /**
   * Get documentFileTypeCounts
   * @return documentFileTypeCounts
  */
  @NotNull @Valid 
  @Schema(name = "document_file_type_counts", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("document_file_type_counts")
  public List<@Valid Statistics200ResponseDocumentFileTypeCountsInner> getDocumentFileTypeCounts() {
    return documentFileTypeCounts;
  }

  public void setDocumentFileTypeCounts(List<@Valid Statistics200ResponseDocumentFileTypeCountsInner> documentFileTypeCounts) {
    this.documentFileTypeCounts = documentFileTypeCounts;
  }

  public Statistics200Response characterCount(Integer characterCount) {
    this.characterCount = characterCount;
    return this;
  }

  /**
   * Get characterCount
   * @return characterCount
  */
  @NotNull 
  @Schema(name = "character_count", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("character_count")
  public Integer getCharacterCount() {
    return characterCount;
  }

  public void setCharacterCount(Integer characterCount) {
    this.characterCount = characterCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statistics200Response statistics200Response = (Statistics200Response) o;
    return Objects.equals(this.documentsTotal, statistics200Response.documentsTotal) &&
        Objects.equals(this.documentsInbox, statistics200Response.documentsInbox) &&
        Objects.equals(this.inboxTag, statistics200Response.inboxTag) &&
        Objects.equals(this.documentFileTypeCounts, statistics200Response.documentFileTypeCounts) &&
        Objects.equals(this.characterCount, statistics200Response.characterCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentsTotal, documentsInbox, inboxTag, documentFileTypeCounts, characterCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statistics200Response {\n");
    sb.append("    documentsTotal: ").append(toIndentedString(documentsTotal)).append("\n");
    sb.append("    documentsInbox: ").append(toIndentedString(documentsInbox)).append("\n");
    sb.append("    inboxTag: ").append(toIndentedString(inboxTag)).append("\n");
    sb.append("    documentFileTypeCounts: ").append(toIndentedString(documentFileTypeCounts)).append("\n");
    sb.append("    characterCount: ").append(toIndentedString(characterCount)).append("\n");
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

