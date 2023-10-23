package org.openapitools.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Document;
import org.openapitools.persistence.entities.DocumentsDocument;
import org.springframework.core.convert.converter.Converter;

@Mapper
public interface DocumentsDocumentMapper extends IMapper<Document, DocumentsDocument> {
    DocumentsDocumentMapper INSTANCE = Mappers.getMapper(DocumentsDocumentMapper.class);


}
