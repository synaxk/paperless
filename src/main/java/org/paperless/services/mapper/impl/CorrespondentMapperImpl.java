package org.paperless.services.mapper.impl;

import org.paperless.persistence.entity.Correspondent;
import org.paperless.services.dtos.CorrespondentDTO;
import org.paperless.services.mapper.CorrespondentMapper;
import org.springframework.stereotype.Component;

@Component
public class CorrespondentMapperImpl extends AbstractMapper<Correspondent, CorrespondentDTO> implements CorrespondentMapper {

    @Override
    public CorrespondentDTO toDto(Correspondent correspondent) {
        return CorrespondentDTO.builder()
                .id(correspondent.getId())
                .matchingAlgorithm(correspondent.getMatchingAlgorithm())
                .isInsensitive(correspondent.isInsensitive())
                .documentCount(correspondent.getDocumentCount())
                .lastCorrespondence(correspondent.getLastCorrespondence())
                .build();
    }

    @Override
    public Correspondent toEntity(CorrespondentDTO correspondentDTO) {
        return Correspondent.builder()
                .id(correspondentDTO.getId())
                .matchingAlgorithm(correspondentDTO.getMatchingAlgorithm())
                .isInsensitive(correspondentDTO.getIsInsensitive())
                .documentCount(correspondentDTO.getDocumentCount())
                .lastCorrespondence(correspondentDTO.getLastCorrespondence())
                .build();
    }
}
