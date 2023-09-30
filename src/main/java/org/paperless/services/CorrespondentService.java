package org.paperless.services;

import org.paperless.services.dtos.CorrespondentDTO;

public interface CorrespondentService extends ServiceInterface<CorrespondentDTO> {

    void update(CorrespondentDTO correspondentDTO);
    void delete(CorrespondentDTO correspondentDTO);
}
