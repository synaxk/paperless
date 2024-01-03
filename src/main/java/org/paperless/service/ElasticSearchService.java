package org.paperless.service;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.Result;
import co.elastic.clients.elasticsearch.core.DeleteResponse;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.core.search.HitsMetadata;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.paperless.configuration.ElasticSearchConfig;
import org.paperless.persistence.entities.DocumentEntity;
import org.paperless.persistence.repositories.DocumentsDocumentRepository;
import org.paperless.mapper.DocumentsDocumentMapper;
import org.paperless.mapper.GetDocument200ResponseMapper;
import io.minio.MinioClient;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
//@Slf4j
public class ElasticSearchService implements SearchIndexService {
    private final ElasticsearchClient esClient;
    private final DocumentsDocumentRepository documentRepository;
    private final Logger logger = LoggerFactory.getLogger(ElasticSearchService.class);

    @Autowired
    public ElasticSearchService(ElasticsearchClient esClient, DocumentsDocumentRepository documentRepository) throws IOException {
        this.esClient = esClient;
        this.documentRepository = documentRepository;
    }

    @Override
    public List<DocumentEntity> searchDocument(String query) throws IOException {
        SearchResponse<ObjectNode> response = esClient.search(s -> s
                        .index(ElasticSearchConfig.DOCUMENTS_INDEX_NAME)
                        .query(q -> q.match(m -> m.field("content").query(query))),
                ObjectNode.class
        );

        assert response.hits().total() != null;
        if (response.hits().total().value() != 0) {
          logger.info("Found {} documents", response.hits().total().value());
        } else {
         logger.info("No documents found");
        }

        return extractDocuments(response.hits());
    }

    private List<DocumentEntity> extractDocuments(HitsMetadata<ObjectNode> hitsMetadata) {
        List<ObjectNode> documents = new ArrayList<>();

        //get hits
        for (Hit<ObjectNode> hit : hitsMetadata.hits()) {
            documents.add(hit.source());
        }

        //extract ids
        List<Integer> documentIds = new ArrayList<>();
        for (ObjectNode document : documents) {
            documentIds.add(document.get("id").asInt());
        }

        //get documents from repository
        List<DocumentEntity> documentEntities = new ArrayList<>();
        for (Integer documentId : documentIds) {
            Optional<DocumentEntity> document = documentRepository.findById(documentId);
            document.ifPresent(documentEntities::add);
        }
        logger.info("Extracted {} documents", documentEntities.size());
        return documentEntities;
    }


}