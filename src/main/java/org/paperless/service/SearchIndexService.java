package org.paperless.service;

import co.elastic.clients.elasticsearch._types.Result;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.paperless.persistence.entities.DocumentEntity;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface SearchIndexService {
    List<DocumentEntity>  searchDocument(String query) throws IOException ;

}