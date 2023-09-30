package org.paperless.services.mapper.impl;

import org.paperless.persistence.entity.DocumentType;
import org.paperless.services.dtos.DocumentTypeDTO;
import org.paperless.services.mapper.DocumentTypeMapper;

public class DocumentTypeMapperImpl extends AbstractMapper<DocumentType, DocumentTypeDTO> implements DocumentTypeMapper {
    @Override
    public DocumentTypeDTO toDto(DocumentType documentType) {
        return null;
    }

    @Override
    public DocumentType toEntity(DocumentTypeDTO documentTypeDTO) {
        return null;
    }
}
