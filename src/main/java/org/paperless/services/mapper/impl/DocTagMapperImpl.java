package org.paperless.service.mapper.impl;

import org.paperless.persistence.entity.DocTag;
import org.paperless.service.dtos.DocTagDTO;
import org.paperless.service.mapper.DocTagMapper;

public class DocTagMapperImpl extends AbstractMapper<DocTag, DocTagDTO> implements DocTagMapper {
    @Override
    public DocTagDTO toDto(DocTag docTag) {
        return null;
    }

    @Override
    public DocTag toEntity(DocTagDTO docTagDTO) {
        return null;
    }
}
