package org.paperless.services.mapper;

import org.paperless.persistence.entity.Document;
import org.paperless.services.dtos.DocumentDTO;
import org.springframework.context.annotation.Bean;


public interface DocumentMapper extends Mapper<Document, DocumentDTO> {
}
