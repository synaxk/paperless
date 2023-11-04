package org.openapitools.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.openapitools.model.Document;
import org.openapitools.persistence.entities.DocumentsDocument;

@Mapper
public interface DocumentsDocumentMapper extends BaseMapper<Document, DocumentsDocument> {
    DocumentsDocumentMapper INSTANCE = Mappers.getMapper(DocumentsDocumentMapper.class);


    @Override
    default Document toEntity(DocumentsDocument documentsDocument) {
        return null;
    }

    @Override
    default DocumentsDocument toDto(Document document) {
        return null;
    }
}
