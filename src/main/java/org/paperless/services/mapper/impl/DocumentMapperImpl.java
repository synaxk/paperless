package org.paperless.services.mapper.impl;

import org.openapitools.jackson.nullable.JsonNullable;
import org.paperless.persistence.entity.Document;
import org.paperless.services.dtos.DocumentDTO;
import org.paperless.services.mapper.DocumentMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Component
public class DocumentMapperImpl extends AbstractMapper<Document, DocumentDTO> implements DocumentMapper {
    @Override
    public DocumentDTO toDto(Document document) {
        return DocumentDTO.builder()
                .id(document.getId())
                //correspondent
                //documentType
                //storagePath
                .title(JsonNullable.of(document.getTitle()))
                .content(JsonNullable.of(document.getContent()))
                //tags
                .created(OffsetDateTime.from(document.getCreatedAt()))
                .createdDate(OffsetDateTime.from(document.getCreatedAt()))
                //modified
                //added
                //archiveSerialNumber
                //originalFileName
                //archivedFileName
                .build();


    }

    @Override
    public Document toEntity(DocumentDTO documentDTO) {
        return Document.builder()
                .id(documentDTO.getId())
                .title(documentDTO.getTitle().get())
                .content(documentDTO.getContent().get())
                .createdAt(LocalDateTime.from(documentDTO.getCreated()))
                //Correspondent.class
                //DocumentType.class
                //List<DocTag>
                .build();
    }
}
