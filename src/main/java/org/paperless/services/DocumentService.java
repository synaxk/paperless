package org.paperless.services;

import org.paperless.services.dtos.DocumentDTO;

public interface DocumentService extends ServiceInterface<DocumentDTO> {
    DocumentDTO getThumb(Long id);
    DocumentDTO getDownload(Long id);
    DocumentDTO getPreview(Long id);
    DocumentDTO getMetadata(Long id);
    //todo: macht das sinn? XD
}
