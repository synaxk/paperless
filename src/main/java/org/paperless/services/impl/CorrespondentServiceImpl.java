package org.paperless.services.impl;

import org.paperless.persistence.repository.CorrespondentRepository;
import org.paperless.services.dtos.CorrespondentDTO;
import org.paperless.services.mapper.CorrespondentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CorrespondentServiceImpl implements org.paperless.services.CorrespondentService {

    @Autowired
    private CorrespondentRepository correspondentRepository;
    @Autowired
    private CorrespondentMapper correspondentMapper;
    @Override
    public void update(CorrespondentDTO correspondentDTO) {

    }

    @Override
    public void delete(CorrespondentDTO correspondentDTO) {

    }

    @Override
    public void save(CorrespondentDTO correspondentDTO) {

    }

    @Override
    public List<CorrespondentDTO> getList() {
        return null;
    }
}
