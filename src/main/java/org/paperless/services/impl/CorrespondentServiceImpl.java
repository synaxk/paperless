package org.paperless.services.impl;

import org.paperless.persistence.entity.Correspondent;
import org.paperless.persistence.repository.CorrespondentRepository;
import org.paperless.services.CorrespondentService;
import org.paperless.services.dtos.CorrespondentDTO;
import org.paperless.services.mapper.CorrespondentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CorrespondentServiceImpl implements CorrespondentService {

    @Autowired
    private CorrespondentRepository correspondentRepository;
    @Autowired
    private CorrespondentMapper correspondentMapper;
    @Override
    public void update(CorrespondentDTO correspondentDTO) {
        correspondentRepository.deleteById(correspondentDTO.getId());
        correspondentRepository.save(correspondentMapper.toEntity(correspondentDTO));
    }

    @Override
    public void delete(CorrespondentDTO correspondentDTO) {
        correspondentRepository.delete(correspondentMapper.toEntity(correspondentDTO));
    }

    @Override
    public void save(CorrespondentDTO correspondentDTO) {
        correspondentRepository.save(correspondentMapper.toEntity(correspondentDTO));
    }

    @Override
    public List<CorrespondentDTO> getList() {
        List<Correspondent> correspondentList = correspondentRepository.findAll();
        return correspondentMapper.toDto(correspondentList);
    }
}
