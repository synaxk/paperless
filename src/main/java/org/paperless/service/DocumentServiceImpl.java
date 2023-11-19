package org.paperless.service;

import lombok.extern.slf4j.Slf4j;
import org.paperless.mapper.DocumentsDocumentMapper;
import org.paperless.mapper.GetDocument200ResponseMapper;
import org.paperless.model.DocumentDTO;
import org.paperless.model.get.GetDocument200Response;
import org.paperless.model.get.GetDocuments200Response;
import org.paperless.model.update.UpdateDocument200Response;
import org.paperless.model.update.UpdateDocumentRequest;
import org.paperless.persistence.entities.DocumentEntity;
import org.paperless.persistence.repositories.DocumentsDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService{
    private final DocumentsDocumentRepository documentRepository;
    private final DocumentsDocumentMapper documentMapper;
    private final GetDocument200ResponseMapper getDocument200ResponseMapper;
    private final RabbitMQService rabbitMQService;
    @Autowired
    public DocumentServiceImpl(DocumentsDocumentRepository documentRepository, DocumentsDocumentMapper documentMapper, GetDocument200ResponseMapper getDocument200ResponseMapper, RabbitMQService rabbitMQSender){
        this.documentRepository = documentRepository;
        this.documentMapper = documentMapper;
        this.getDocument200ResponseMapper = getDocument200ResponseMapper;
        this.rabbitMQService = rabbitMQSender;
    }
    @Override
    public GetDocument200Response getDocument(Integer id, Integer page, Boolean fullPerms) {
        DocumentEntity foundEntity =  documentRepository.getReferenceById(id);
        return getDocument200ResponseMapper.entityToDto(foundEntity);
    }


    @Override
    public void uploadDocument(DocumentDTO documentDTO, List<MultipartFile> document) {
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

        rabbitMQService.sendToOcrDocumentInQueue(documentToBeSaved.getStoragePath().getPath());

        documentRepository.save(documentToBeSaved);
    }


    @Override
    public ResponseEntity<GetDocuments200Response> getDocuments(Integer page, Integer pageSize, String query, String ordering, List<Integer> tagsIdAll, Integer documentTypeId, Integer storagePathIdIn, Integer correspondentId, Boolean truncateContent) {
        List<DocumentDTO> documentDTOS = new ArrayList<>();
        for (DocumentEntity document : documentRepository.findAll()) {
            documentDTOS.add(documentMapper.entityToDto(document));
        }


        GetDocuments200Response sampleResponse = new GetDocuments200Response();
        // We will need GetDocuments200ResponseResultsInner dtos here....
        // sampleResponse.addResultsItem()
        return ResponseEntity.ok(sampleResponse);
    }

    @Override
    public ResponseEntity<UpdateDocument200Response> updateDocument(Integer id, UpdateDocumentRequest updateDocumentRequest) {
        return null;
    }


//    @Override
//    public DocumentsDocument uploadDocument(String title, OffsetDateTime created, Integer documentType, List<Integer> tags, Integer correspondent, List<MultipartFile> document) {
//        return documentRepository.save();
//    }
}
