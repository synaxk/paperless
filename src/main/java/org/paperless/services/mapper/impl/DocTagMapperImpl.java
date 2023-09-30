package org.paperless.services.mapper.impl;

import org.openapitools.jackson.nullable.JsonNullable;
import org.paperless.persistence.entity.DocTag;
import org.paperless.services.dtos.DocTagDTO;
import org.paperless.services.mapper.DocTagMapper;
import org.springframework.stereotype.Component;

@Component
public class DocTagMapperImpl extends AbstractMapper<DocTag, DocTagDTO> implements DocTagMapper {
    @Override
    public DocTagDTO toDto(DocTag docTag) {
        return DocTagDTO.builder()
                .id(docTag.getId())
                .slug(JsonNullable.of(docTag.getSlug()))
                .name(JsonNullable.of(docTag.getName()))
                .color(JsonNullable.of(docTag.getColor()))
                .match(JsonNullable.of(docTag.getMatch()))
                .matchingAlgorithm(docTag.getMatchingAlgorithm())
                .isInsensitive(docTag.isInsensitive())
                .isInboxTag(docTag.isInboxTag())
                .documentCount(docTag.getDocumentCount())
                .build();
    }

    @Override
    public DocTag toEntity(DocTagDTO docTagDTO) {
        return DocTag.builder()
                .id(docTagDTO.getId())
                .slug(docTagDTO.getSlug().get())
                .name(docTagDTO.getName().get())
                .color(docTagDTO.getColor().get())
                .match(docTagDTO.getMatch().get())
                .matchingAlgorithm(docTagDTO.getMatchingAlgorithm())
                .isInsensitive(docTagDTO.getIsInsensitive())
                .isInboxTag(docTagDTO.getIsInboxTag())
                .documentCount(docTagDTO.getDocumentCount())
                .build();
    }
}
