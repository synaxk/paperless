package org.paperless.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.minio.MinioClient;
import lombok.extern.slf4j.Slf4j;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.paperless.mapper.DocumentsDocumentMapper;
import org.paperless.mapper.GetDocument200ResponseMapper;
import org.paperless.model.DocumentDTO;
import org.paperless.model.get.GetDocument200Response;
import org.paperless.model.get.GetDocuments200Response;
import org.paperless.model.update.UpdateDocument200Response;
import org.paperless.model.update.UpdateDocumentRequest;
import org.paperless.persistence.entities.DocumentEntity;
import org.paperless.persistence.entities.StoragepathEntity;
import org.paperless.persistence.repositories.DocumentsDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.errors.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
@Service
//@Slf4j
public class DocumentServiceImpl implements DocumentService{
    private final DocumentsDocumentRepository documentRepository;
    private final DocumentsDocumentMapper documentMapper;
    private final GetDocument200ResponseMapper getDocument200ResponseMapper;
    private final RabbitMQService rabbitMQService;
    private final MinioClient minioClient;
    private final ElasticSearchService elasticSearchService;
    private final Logger logger = LoggerFactory.getLogger(DocumentServiceImpl.class);

    @Value("${minio.bucketName}")
    private String bucketName;

    @Autowired
    public DocumentServiceImpl(DocumentsDocumentRepository documentRepository, DocumentsDocumentMapper documentMapper, GetDocument200ResponseMapper getDocument200ResponseMapper, RabbitMQService rabbitMQSender, MinioClient minioClient, ElasticSearchService elasticSearchService){
        this.documentRepository = documentRepository;
        this.documentMapper = documentMapper;
        this.getDocument200ResponseMapper = getDocument200ResponseMapper;
        this.rabbitMQService = rabbitMQSender;
        this.minioClient = minioClient;
        this.elasticSearchService = elasticSearchService;
    }
    @Override
    public GetDocument200Response getDocument(Integer id, Integer page, Boolean fullPerms) {
        DocumentEntity foundEntity =  documentRepository.getReferenceById(id);
        return getDocument200ResponseMapper.entityToDto(foundEntity);
    }


    @Override
    public void uploadDocument(DocumentDTO documentDTO, MultipartFile document) {
        // TODO: document variable is unused yet
        documentDTO.setCreated(OffsetDateTime.now());
        documentDTO.setAdded(OffsetDateTime.now());
        documentDTO.setModified(OffsetDateTime.now());
        documentDTO.content("");
        documentDTO.setAdded(OffsetDateTime.now());

        DocumentEntity documentToBeSaved = documentMapper.dtoToEntity(documentDTO);

        documentToBeSaved.setChecksum("checksum");
        documentToBeSaved.setStorageType("pdf");
        documentToBeSaved.setMimeType("pdf");


        documentRepository.save(documentToBeSaved);


        String objectName = documentToBeSaved.getId() + getFileExtension(Objects.requireNonNull(document.getOriginalFilename()));

        try {
            minioClient.putObject(
                    PutObjectArgs.builder()
                            .bucket(bucketName)
                            .object(objectName)
                            .stream(document.getInputStream(), document.getSize(), -1)
                            .contentType(document.getContentType())
                            .build()
            );
        } catch (ErrorResponseException | InsufficientDataException | InternalException | InvalidKeyException | InvalidResponseException | IOException | NoSuchAlgorithmException | ServerException | XmlParserException e) {
            logger.error("Error while uploading file to Minio. Error: {}", e.getMessage());
            throw new RuntimeException(e);
        }

        StoragepathEntity pathToFile = new StoragepathEntity();
        pathToFile.setPath(bucketName + "/" + objectName);
        pathToFile.setName(document.getOriginalFilename());
        pathToFile.setMatch("");
        pathToFile.setMatchingAlgorithm(0);
        pathToFile.setIsInsensitive(false);

        documentToBeSaved.setStoragePath(pathToFile);

        documentDTO.setId(documentToBeSaved.getId());
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.registerModule(new JsonNullableModule());
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        String dtoJson = null;
        try {
            dtoJson = mapper.writeValueAsString(documentDTO);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }


        rabbitMQService.sendToOcrDocumentInQueue(dtoJson, objectName);

        documentRepository.save(documentToBeSaved);
        logger.info("Document {} was saved", documentToBeSaved.getTitle());
    }


    @Override
    public ResponseEntity<GetDocuments200Response> getDocuments(Integer page, Integer pageSize, String query, String ordering, List<Integer> tagsIdAll, Integer documentTypeId, Integer storagePathIdIn, Integer correspondentId, Boolean truncateContent) throws IOException {
        List<DocumentDTO> documentDTOS = new ArrayList<>();

        if(query == null || query.isEmpty()) {
            //find all documents
            for (DocumentEntity document : documentRepository.findAll()) {
                documentDTOS.add(documentMapper.entityToDto(document));
            }
            logger.info("Query was empty. Searching for all documents");
        } else {
            //search with elasticsearch
            for (DocumentEntity document : elasticSearchService.searchDocument(query)) {
                documentDTOS.add(documentMapper.entityToDto(document));
            }
            logger.info("Searching for documents matching '{}'", query);
        }



        GetDocuments200Response sampleResponse = new GetDocuments200Response();
        sampleResponse.setCount(100);
        sampleResponse.setNext(1);
        sampleResponse.setPrevious(1);
        sampleResponse.addAllItem(1);

        for(DocumentDTO documentDTO : documentDTOS) {
            // transform a dto into a GetDocuments200ResponseResultsInner to attach it to the response
            sampleResponse.addResultsItem(documentDTO.toGetDocuments200ResponseResultsInner());
        }

        logger.info("Returning found documents");
        return ResponseEntity.ok(sampleResponse);
    }

    @Override
    public ResponseEntity<UpdateDocument200Response> updateDocument(Integer id, UpdateDocumentRequest updateDocumentRequest) {
        return null;
    }


    private String generateRandomName() {
        return UUID.randomUUID().toString();
    }

    private String getFileExtension(String filename) {
        int lastDotIndex = filename.lastIndexOf(".");
        return (lastDotIndex != -1) ? filename.substring(lastDotIndex) : "";
    }
}
