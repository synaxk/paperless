package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GetDocumentMetadata200ResponseArchiveMetadataInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetDocumentMetadata200Response
 */

@JsonTypeName("GetDocumentMetadata_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
public class GetDocumentMetadata200Response {

  private String originalChecksum;

  private Integer originalSize;

  private String originalMimeType;

  private String mediaFilename;

  private Boolean hasArchiveVersion;

  @Valid
  private List<Object> originalMetadata = new ArrayList<>();

  private String archiveChecksum;

  private String archiveMediaFilename;

  private String originalFilename;

  private String lang;

  private Integer archiveSize;

  @Valid
  private List<@Valid GetDocumentMetadata200ResponseArchiveMetadataInner> archiveMetadata = new ArrayList<>();

  public GetDocumentMetadata200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetDocumentMetadata200Response(String originalChecksum, Integer originalSize, String originalMimeType, String mediaFilename, Boolean hasArchiveVersion, List<Object> originalMetadata, String archiveChecksum, String archiveMediaFilename, String originalFilename, String lang, Integer archiveSize, List<@Valid GetDocumentMetadata200ResponseArchiveMetadataInner> archiveMetadata) {
    this.originalChecksum = originalChecksum;
    this.originalSize = originalSize;
    this.originalMimeType = originalMimeType;
    this.mediaFilename = mediaFilename;
    this.hasArchiveVersion = hasArchiveVersion;
    this.originalMetadata = originalMetadata;
    this.archiveChecksum = archiveChecksum;
    this.archiveMediaFilename = archiveMediaFilename;
    this.originalFilename = originalFilename;
    this.lang = lang;
    this.archiveSize = archiveSize;
    this.archiveMetadata = archiveMetadata;
  }

  public GetDocumentMetadata200Response originalChecksum(String originalChecksum) {
    this.originalChecksum = originalChecksum;
    return this;
  }

  /**
   * Get originalChecksum
   * @return originalChecksum
  */
  @NotNull 
  @Schema(name = "original_checksum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("original_checksum")
  public String getOriginalChecksum() {
    return originalChecksum;
  }

  public void setOriginalChecksum(String originalChecksum) {
    this.originalChecksum = originalChecksum;
  }

  public GetDocumentMetadata200Response originalSize(Integer originalSize) {
    this.originalSize = originalSize;
    return this;
  }

  /**
   * Get originalSize
   * @return originalSize
  */
  @NotNull 
  @Schema(name = "original_size", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("original_size")
  public Integer getOriginalSize() {
    return originalSize;
  }

  public void setOriginalSize(Integer originalSize) {
    this.originalSize = originalSize;
  }

  public GetDocumentMetadata200Response originalMimeType(String originalMimeType) {
    this.originalMimeType = originalMimeType;
    return this;
  }

  /**
   * Get originalMimeType
   * @return originalMimeType
  */
  @NotNull 
  @Schema(name = "original_mime_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("original_mime_type")
  public String getOriginalMimeType() {
    return originalMimeType;
  }

  public void setOriginalMimeType(String originalMimeType) {
    this.originalMimeType = originalMimeType;
  }

  public GetDocumentMetadata200Response mediaFilename(String mediaFilename) {
    this.mediaFilename = mediaFilename;
    return this;
  }

  /**
   * Get mediaFilename
   * @return mediaFilename
  */
  @NotNull 
  @Schema(name = "media_filename", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_filename")
  public String getMediaFilename() {
    return mediaFilename;
  }

  public void setMediaFilename(String mediaFilename) {
    this.mediaFilename = mediaFilename;
  }

  public GetDocumentMetadata200Response hasArchiveVersion(Boolean hasArchiveVersion) {
    this.hasArchiveVersion = hasArchiveVersion;
    return this;
  }

  /**
   * Get hasArchiveVersion
   * @return hasArchiveVersion
  */
  @NotNull 
  @Schema(name = "has_archive_version", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_archive_version")
  public Boolean getHasArchiveVersion() {
    return hasArchiveVersion;
  }

  public void setHasArchiveVersion(Boolean hasArchiveVersion) {
    this.hasArchiveVersion = hasArchiveVersion;
  }

  public GetDocumentMetadata200Response originalMetadata(List<Object> originalMetadata) {
    this.originalMetadata = originalMetadata;
    return this;
  }

  public GetDocumentMetadata200Response addOriginalMetadataItem(Object originalMetadataItem) {
    if (this.originalMetadata == null) {
      this.originalMetadata = new ArrayList<>();
    }
    this.originalMetadata.add(originalMetadataItem);
    return this;
  }

  /**
   * Get originalMetadata
   * @return originalMetadata
  */
  @NotNull 
  @Schema(name = "original_metadata", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("original_metadata")
  public List<Object> getOriginalMetadata() {
    return originalMetadata;
  }

  public void setOriginalMetadata(List<Object> originalMetadata) {
    this.originalMetadata = originalMetadata;
  }

  public GetDocumentMetadata200Response archiveChecksum(String archiveChecksum) {
    this.archiveChecksum = archiveChecksum;
    return this;
  }

  /**
   * Get archiveChecksum
   * @return archiveChecksum
  */
  @NotNull 
  @Schema(name = "archive_checksum", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("archive_checksum")
  public String getArchiveChecksum() {
    return archiveChecksum;
  }

  public void setArchiveChecksum(String archiveChecksum) {
    this.archiveChecksum = archiveChecksum;
  }

  public GetDocumentMetadata200Response archiveMediaFilename(String archiveMediaFilename) {
    this.archiveMediaFilename = archiveMediaFilename;
    return this;
  }

  /**
   * Get archiveMediaFilename
   * @return archiveMediaFilename
  */
  @NotNull 
  @Schema(name = "archive_media_filename", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("archive_media_filename")
  public String getArchiveMediaFilename() {
    return archiveMediaFilename;
  }

  public void setArchiveMediaFilename(String archiveMediaFilename) {
    this.archiveMediaFilename = archiveMediaFilename;
  }

  public GetDocumentMetadata200Response originalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
    return this;
  }

  /**
   * Get originalFilename
   * @return originalFilename
  */
  @NotNull 
  @Schema(name = "original_filename", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("original_filename")
  public String getOriginalFilename() {
    return originalFilename;
  }

  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }

  public GetDocumentMetadata200Response lang(String lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @NotNull 
  @Schema(name = "lang", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public GetDocumentMetadata200Response archiveSize(Integer archiveSize) {
    this.archiveSize = archiveSize;
    return this;
  }

  /**
   * Get archiveSize
   * @return archiveSize
  */
  @NotNull 
  @Schema(name = "archive_size", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("archive_size")
  public Integer getArchiveSize() {
    return archiveSize;
  }

  public void setArchiveSize(Integer archiveSize) {
    this.archiveSize = archiveSize;
  }

  public GetDocumentMetadata200Response archiveMetadata(List<@Valid GetDocumentMetadata200ResponseArchiveMetadataInner> archiveMetadata) {
    this.archiveMetadata = archiveMetadata;
    return this;
  }

  public GetDocumentMetadata200Response addArchiveMetadataItem(GetDocumentMetadata200ResponseArchiveMetadataInner archiveMetadataItem) {
    if (this.archiveMetadata == null) {
      this.archiveMetadata = new ArrayList<>();
    }
    this.archiveMetadata.add(archiveMetadataItem);
    return this;
  }

  /**
   * Get archiveMetadata
   * @return archiveMetadata
  */
  @NotNull @Valid 
  @Schema(name = "archive_metadata", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("archive_metadata")
  public List<@Valid GetDocumentMetadata200ResponseArchiveMetadataInner> getArchiveMetadata() {
    return archiveMetadata;
  }

  public void setArchiveMetadata(List<@Valid GetDocumentMetadata200ResponseArchiveMetadataInner> archiveMetadata) {
    this.archiveMetadata = archiveMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentMetadata200Response getDocumentMetadata200Response = (GetDocumentMetadata200Response) o;
    return Objects.equals(this.originalChecksum, getDocumentMetadata200Response.originalChecksum) &&
        Objects.equals(this.originalSize, getDocumentMetadata200Response.originalSize) &&
        Objects.equals(this.originalMimeType, getDocumentMetadata200Response.originalMimeType) &&
        Objects.equals(this.mediaFilename, getDocumentMetadata200Response.mediaFilename) &&
        Objects.equals(this.hasArchiveVersion, getDocumentMetadata200Response.hasArchiveVersion) &&
        Objects.equals(this.originalMetadata, getDocumentMetadata200Response.originalMetadata) &&
        Objects.equals(this.archiveChecksum, getDocumentMetadata200Response.archiveChecksum) &&
        Objects.equals(this.archiveMediaFilename, getDocumentMetadata200Response.archiveMediaFilename) &&
        Objects.equals(this.originalFilename, getDocumentMetadata200Response.originalFilename) &&
        Objects.equals(this.lang, getDocumentMetadata200Response.lang) &&
        Objects.equals(this.archiveSize, getDocumentMetadata200Response.archiveSize) &&
        Objects.equals(this.archiveMetadata, getDocumentMetadata200Response.archiveMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalChecksum, originalSize, originalMimeType, mediaFilename, hasArchiveVersion, originalMetadata, archiveChecksum, archiveMediaFilename, originalFilename, lang, archiveSize, archiveMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentMetadata200Response {\n");
    sb.append("    originalChecksum: ").append(toIndentedString(originalChecksum)).append("\n");
    sb.append("    originalSize: ").append(toIndentedString(originalSize)).append("\n");
    sb.append("    originalMimeType: ").append(toIndentedString(originalMimeType)).append("\n");
    sb.append("    mediaFilename: ").append(toIndentedString(mediaFilename)).append("\n");
    sb.append("    hasArchiveVersion: ").append(toIndentedString(hasArchiveVersion)).append("\n");
    sb.append("    originalMetadata: ").append(toIndentedString(originalMetadata)).append("\n");
    sb.append("    archiveChecksum: ").append(toIndentedString(archiveChecksum)).append("\n");
    sb.append("    archiveMediaFilename: ").append(toIndentedString(archiveMediaFilename)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    archiveSize: ").append(toIndentedString(archiveSize)).append("\n");
    sb.append("    archiveMetadata: ").append(toIndentedString(archiveMetadata)).append("\n");
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

