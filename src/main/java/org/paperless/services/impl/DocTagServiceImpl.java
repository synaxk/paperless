package org.paperless.services.impl;

import org.paperless.persistence.entity.DocTag;
import org.paperless.persistence.repository.DocTagRepository;
import org.paperless.services.DocTagService;
import org.paperless.services.dtos.DocTagDTO;
import org.paperless.services.mapper.DocTagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class DocTagServiceImpl implements DocTagService {
    @Autowired
    private DocTagRepository docTagRepository;
    @Autowired
    private DocTagMapper docTagMapper;
    @Override
    public void save(DocTagDTO docTagDTO) {
        docTagRepository.save(docTagMapper.toEntity(docTagDTO));
    }

    @Override
    public List<DocTagDTO> getList() {
        List<DocTag> docTagList = docTagRepository.findAll();
        return docTagMapper.toDto(docTagList);
    }

    @Override
    public void update(DocTagDTO docTagDTO) {
        docTagRepository.deleteById(docTagDTO.getId());
        docTagRepository.save(docTagMapper.toEntity(docTagDTO));
    }

    @Override
    public void delete(DocTagDTO docTagDTO) {
        docTagRepository.delete(docTagMapper.toEntity(docTagDTO));
    }
}
