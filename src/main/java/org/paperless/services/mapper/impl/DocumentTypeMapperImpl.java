package org.paperless.service.mapper.impl;

import org.paperless.persistence.entity.DocumentType;
import org.paperless.service.dtos.DocumentTypeDTO;
import org.paperless.service.mapper.DocumentMapper;
import org.paperless.service.mapper.DocumentTypeMapper;

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
