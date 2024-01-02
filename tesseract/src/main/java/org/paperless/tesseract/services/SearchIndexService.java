package org.paperless.tesseract.services;

import org.paperless.tesseract.services.dto.DocumentDTO;
import co.elastic.clients.elasticsearch._types.Result;

import java.io.IOException;
import java.util.Optional;

public interface SearchIndexService {
    Result indexDocument(DocumentDTO document) throws IOException;

    Optional<DocumentDTO> getDocumentById(int id);

    boolean deleteDocumentById(int id);
}
