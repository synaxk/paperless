package org.paperless.service.mapper.impl;

import org.paperless.persistence.entity.Correspondent;
import org.paperless.service.dtos.CorrespondentDTO;
import org.paperless.service.mapper.CorrespondentMapper;

public class CorrespondentMapperImpl extends AbstractMapper<Correspondent, CorrespondentDTO> implements CorrespondentMapper {

    @Override
    public CorrespondentDTO toDto(Correspondent correspondent) {
        return null;
    }

    @Override
    public Correspondent toEntity(CorrespondentDTO correspondentDTO) {
        return null;
    }
}
