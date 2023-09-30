package org.paperless.services.impl;

import org.paperless.persistence.entity.Document;
import org.paperless.persistence.repository.DocumentRepository;
import org.paperless.services.DocumentService;
import org.paperless.services.dtos.DocumentDTO;
import org.paperless.services.mapper.DocumentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentRepository documentRepository;
    @Autowired
    private DocumentMapper documentMapper;
    @Override
    public DocumentDTO getThumb(Long id) {
        return null;
    }

    @Override
    public DocumentDTO getDownload(Long id) {
        return null;
    }

    @Override
    public DocumentDTO getPreview(Long id) {
        return null;
    }

    @Override
    public DocumentDTO getMetadata(Long id) {
        return null;
    }

    @Override
    public void save(DocumentDTO documentDTO) {
        documentRepository.save(documentMapper.toEntity(documentDTO));
    }

    @Override
    public List<DocumentDTO> getList() {
        List<Document> documentList = documentRepository.findAll();
        return documentMapper.toDto(documentList);
    }

    @Override
    public void update(DocumentDTO documentDTO) {
        documentRepository.deleteById(documentDTO.getId().longValue());
        documentRepository.save(documentMapper.toEntity(documentDTO));
    }

    @Override
    public void delete(DocumentDTO documentDTO) {
        documentRepository.delete(documentMapper.toEntity(documentDTO));
    }
}
