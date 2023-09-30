package org.paperless.services.mapper.impl;

import org.paperless.persistence.entity.Document;
import org.paperless.services.dtos.DocumentDTO;
import org.paperless.services.mapper.DocumentMapper;
import org.springframework.stereotype.Component;

@Component
public class DocumentMapperImpl extends AbstractMapper<Document, DocumentDTO> implements DocumentMapper {
    @Override
    public DocumentDTO toDto(Document document) {
        return null;
    }

    @Override
    public Document toEntity(DocumentDTO documentDTO) {
        return null;
    }
}
