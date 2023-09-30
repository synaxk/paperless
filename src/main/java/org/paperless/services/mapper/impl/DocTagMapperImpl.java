package org.paperless.services.mapper.impl;

import org.paperless.persistence.entity.DocTag;
import org.paperless.services.dtos.DocTagDTO;
import org.paperless.services.mapper.DocTagMapper;

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
