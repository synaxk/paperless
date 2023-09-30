package org.paperless.services.impl;

import org.paperless.persistence.entity.DocumentType;
import org.paperless.persistence.repository.DocumentTypeRepository;
import org.paperless.services.DocumentTypeService;
import org.paperless.services.dtos.DocumentTypeDTO;
import org.paperless.services.mapper.DocumentTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DocumentTypeServiceImpl implements DocumentTypeService {

    @Autowired
    private DocumentTypeRepository documentTypeRepository;
    @Autowired
    private DocumentTypeMapper documentTypeMapper;
    @Override
    public void save(DocumentTypeDTO documentTypeDTO) {

    }

    @Override
    public List<DocumentTypeDTO> getList() {
        return null;
    }

    @Override
    public void update(DocumentTypeDTO documentTypeDTO) {

    }

    @Override
    public void delete(DocumentTypeDTO documentTypeDTO) {

    }
}
