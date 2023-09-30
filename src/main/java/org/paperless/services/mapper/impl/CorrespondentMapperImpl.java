package org.paperless.services.mapper.impl;

import org.paperless.persistence.entity.Correspondent;
import org.paperless.services.dtos.CorrespondentDTO;
import org.paperless.services.mapper.CorrespondentMapper;

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
