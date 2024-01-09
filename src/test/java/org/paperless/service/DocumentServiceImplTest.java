package org.paperless.service;

import io.minio.MinioClient;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openapitools.jackson.nullable.JsonNullable;
import org.paperless.mapper.DocumentsDocumentMapper;
import org.paperless.mapper.DocumentsDocumentMapperImpl;
import org.paperless.mapper.GetDocument200ResponseMapper;
import org.paperless.model.DocumentDTO;
import org.paperless.model.get.GetDocuments200Response;
import org.paperless.model.get.GetDocuments200ResponseResultsInner;
import org.paperless.persistence.entities.*;
import org.paperless.persistence.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

import javax.print.Doc;
import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class DocumentServiceImplTest {
    @Mock
    private DocumentsDocumentMapper documentMapper;
    @Mock
    private DocumentsDocumentRepository documentRepository;
    @Mock
    private GetDocument200ResponseMapper getDocument200ResponseMapper;
    @Mock
    private RabbitMQService rabbitMQService;
    @Mock
    private MinioClient minioClient;
    @Mock
    private ElasticSearchService elasticSearchService;
    @Mock
    private Logger logger;

    @InjectMocks
    private DocumentServiceImpl documentService;

    @Test
    @DisplayName("Search Documents without query")
    void searchWOQuery() throws IOException {
        //setup a query, entities and dtos
        String query = "";
        List<DocumentEntity> entityList = new ArrayList<>();
        DocumentEntity entity1 = new DocumentEntity();
        entity1.setId(1);
        entity1.setTitle("Title1");
        DocumentEntity entity2 = new DocumentEntity();
        entity2.setId(2);
        entity2.setTitle("Title2");
        entityList.add(entity1);
        entityList.add(entity2);

        DocumentDTO dto1 = new DocumentDTO();
        dto1.setId(entity1.getId());
        dto1.setTitle(JsonNullable.of(entity1.getTitle()));
        DocumentDTO dto2 = new DocumentDTO();
        dto2.setId(entity2.getId());
        dto2.setTitle(JsonNullable.of(entity2.getTitle()));

        // mock repository response and mapper
        Mockito.when(documentRepository.findAll()).thenReturn(entityList);
        Mockito.when(documentMapper.entityToDto(entity1)).thenReturn(dto1);
        Mockito.when(documentMapper.entityToDto(entity2)).thenReturn(dto2);

        // call the function with dummy values except for query
        ResponseEntity<GetDocuments200Response> response = documentService.getDocuments(0, 0, query, null, null, 0, 0, 0, null);
        assert response != null;
        // extract results from response
        List<GetDocuments200ResponseResultsInner> results = Objects.requireNonNull(response.getBody()).getResults();

        // assert
        assertEquals(2, results.size());
        assertEquals(entityList.get(0).getId(), results.get(0).getId());
        assertEquals(entityList.get(0).getTitle(), results.get(0).getTitle());
        assertEquals(entityList.get(1).getId(), results.get(1).getId());
        assertEquals(entityList.get(1).getTitle(), results.get(1).getTitle());

    }

}
