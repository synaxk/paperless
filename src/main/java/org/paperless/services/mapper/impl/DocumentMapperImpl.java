package org.paperless.service.mapper.impl;

import org.paperless.persistence.entity.Document;
import org.paperless.service.dtos.DocumentDTO;
import org.paperless.service.mapper.DocTagMapper;
import org.paperless.service.mapper.DocumentMapper;

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
