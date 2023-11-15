package org.paperless.mapper;

import org.mapstruct.*;
import org.paperless.model.DocumentNoteDTO;
import org.paperless.persistence.entities.AuthUser;
import org.paperless.persistence.entities.DocumentEntity;
import org.paperless.persistence.entities.NoteEntity;
import org.paperless.persistence.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public abstract class DocumentNotesMapper implements BaseMapper<NoteEntity, DocumentNoteDTO> {
    @Autowired
    private DocumentsCorrespondentRepository correspondentRepository;
    @Autowired
    private DocumentsDocumentTagsRepository documentTypeRepository;
    @Autowired
    private DocumentsStoragepathRepository storagePathRepository;
    @Autowired
    private AuthUserRepository userRepository;
    @Autowired
    private DocumentsDocumentTagsRepository documentTagsRepository;
    @Autowired
    private DocumentsDocumentRepository documentRepository;

    @Mapping(target = "document", source = "document", qualifiedByName = "documentDto")
    @Mapping(target = "user", source = "user", qualifiedByName = "userDto")
    abstract public NoteEntity dtoToEntity(DocumentNoteDTO dto);

    @Mapping(target = "document", source = "document", qualifiedByName = "documentEntity")
    @Mapping(target = "user", source = "user", qualifiedByName = "userEntity")
    abstract public DocumentNoteDTO entityToDto(NoteEntity entity);

    @Named("userEntity")
    Integer map(AuthUser user) {
        return user.getId();
    }

    @Named("documentEntity")
    Integer map(DocumentEntity document) {
        return document.getId();
    }

    String map(OffsetDateTime created) {
        return created != null ? created.toString() : null;
    }

    OffsetDateTime map(String value){
        return value != null ? OffsetDateTime.parse(value) : null;
    }
    @Named("userDto")
    AuthUser mapCorrespondent(Integer value) {
        return userRepository.findById(value).orElse(null);
    }

    @Named("documentDto")
    DocumentEntity mapDocument(Integer value) {
        return documentRepository.findById(value).orElse(null);
    }


}
