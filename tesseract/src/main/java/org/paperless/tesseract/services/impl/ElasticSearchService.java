package org.paperless.tesseract.services.impl;


import org.paperless.tesseract.config.ElasticSearchConfig;
import org.paperless.tesseract.services.SearchIndexService;
import org.paperless.tesseract.services.dto.DocumentDTO;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.Result;
import co.elastic.clients.elasticsearch.core.DeleteResponse;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Optional;

@Component
@Slf4j
public class ElasticSearchService implements SearchIndexService {
    private final ElasticsearchClient esClient;

    @Autowired
    public ElasticSearchService(ElasticsearchClient esClient) throws IOException {
        this.esClient = esClient;

        if (!esClient.indices().exists(
                i -> i.index(ElasticSearchConfig.DOCUMENTS_INDEX_NAME)
        ).value()) {
            esClient.indices().create(c -> c
                    .index(ElasticSearchConfig.DOCUMENTS_INDEX_NAME)
            );
        }
    }

    @Override
    public Result indexDocument(DocumentDTO document) throws IOException {
        // do indexing with ElasticSearch
        IndexResponse response = esClient.index(i -> i
                .index(ElasticSearchConfig.DOCUMENTS_INDEX_NAME)
                .id(document.getId().toString())
                .document(document)
        );
        String logMsg = "Indexed document " + document.getId() + ": result=" + response.result() + ", index=" + response.index();
        if ( response.result()!=Result.Created && response.result()!=Result.Updated )
            log.error("Failed to " + logMsg);
        else
            log.info(logMsg);
        return response.result();
    }

    @Override
    public Optional<DocumentDTO> getDocumentById(int id) {
        try {
            GetResponse<DocumentDTO> response = esClient.get(g -> g
                            .index(ElasticSearchConfig.DOCUMENTS_INDEX_NAME)
                            .id(String.valueOf(id)),
                    DocumentDTO.class
            );
            return (response.found() && response.source()!=null) ? Optional.of(response.source()) : Optional.empty();
        } catch (IOException e) {
            log.error("Failed to get document id=" + id + " from elasticsearch: " + e);
            return Optional.empty();
        }
    }

    @Override
    public boolean deleteDocumentById(int id) {
        DeleteResponse result = null;
        try {
            result = esClient.delete(d -> d.index(ElasticSearchConfig.DOCUMENTS_INDEX_NAME).id(String.valueOf(id)));
        } catch (IOException e) {
            log.warn("Failed to delete document id=" + id + " from elasticsearch: " + e);
        }
        if ( result==null )
            return false;
        if (result.result() != Result.Deleted )
            log.warn(result.toString());
        return result.result()==Result.Deleted;
    }

}
