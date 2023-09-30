package org.paperless.services.mapper.impl;

import org.openapitools.jackson.nullable.JsonNullable;
import org.paperless.persistence.entity.DocumentType;
import org.paperless.services.dtos.DocumentTypeDTO;
import org.paperless.services.mapper.DocumentTypeMapper;
import org.springframework.stereotype.Component;

@Component
public class DocumentTypeMapperImpl extends AbstractMapper<DocumentType, DocumentTypeDTO> implements DocumentTypeMapper {
    @Override
    public DocumentTypeDTO toDto(DocumentType documentType) {
        return DocumentTypeDTO.builder()
                .id((long) documentType.getId())
                //slug
                .name(JsonNullable.of(documentType.getName()))
                //match
                .matchingAlgorithm(documentType.getMatchingAlgorithm())
                .isInsensitive(documentType.isInsensitive())
                .documentCount((long) documentType.getDocuments().size())
                .build();
    }

    @Override
    public DocumentType toEntity(DocumentTypeDTO documentTypeDTO) {
        return DocumentType.builder()
                .id(documentTypeDTO.getId().intValue())
                .name(documentTypeDTO.getName().get())
                .matchingAlgorithm(documentTypeDTO.getMatchingAlgorithm())
                .isInsensitive(documentTypeDTO.getIsInsensitive())
                //List<Document>
                .build();
    }
}
