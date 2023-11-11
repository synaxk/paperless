package org.paperless.mapper;

import org.mapstruct.*;
import org.paperless.model.PermissionsDTO;
import org.paperless.model.get.GetDocument200Response;
import org.paperless.model.DocumentNoteDTO;
import org.paperless.persistence.entities.*;
import org.paperless.persistence.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
@Service
public abstract class GetDocument200ResponseMapper implements BaseMapper<DocumentEntity, GetDocument200Response> {
    @Autowired
    private DocumentsCorrespondentRepository correspondentRepository;
    @Autowired
    private DocumentsDocumenttypeRepository documentTypeRepository;
    @Autowired
    private DocumentsStoragepathRepository storagePathRepository;
    @Autowired
    private AuthUserRepository userRepository;
    @Autowired
    private DocumentsDocumentTagsRepository documentTagsRepository;

    @Autowired
    private PermissionsMapper PermissionsMapper;
    @Autowired
    private DocumentNotesMapper documentNotesMapper;

    @Mapping(target = "correspondent", source = "correspondent", qualifiedByName = "correspondentDto")
    @Mapping(target = "documentType", source = "documentType", qualifiedByName = "documentTypeDto")
    @Mapping(target = "storagePath", source = "storagePath", qualifiedByName = "storagePathDto")
    @Mapping(target = "documentTagsEntities", source = "tags", qualifiedByName = "tagsDto")
    @Mapping(target = "archiveSerialNumber", source = "archiveSerialNumber", qualifiedByName = "archiveSerialNumberDto")
    @Mapping(target = "owner", source = "owner", qualifiedByName = "ownerDto")
    @Mapping(target = "documentNoteEntities", source = "notes", qualifiedByName = "notesDto")
    abstract public DocumentEntity dtoToEntity(GetDocument200Response dto);

    @Mapping(target = "correspondent", source = "correspondent", qualifiedByName = "correspondentEntity")
    @Mapping(target = "documentType", source = "documentType", qualifiedByName = "documentTypeEntity")
    @Mapping(target = "storagePath", source = "storagePath", qualifiedByName = "storagePathEntity")
    @Mapping(target = "tags", source = "documentTagsEntities", qualifiedByName = "tagsEntity")
    @Mapping(target = "createdDate", source = "created")
    @Mapping(target = "owner", source = "owner", qualifiedByName = "ownerEntity")
    @Mapping(target = "permissions", source = "owner", qualifiedByName = "permissionsEntity")
    @Mapping(target = "notes", source = "documentNoteEntities", qualifiedByName = "notesEntity")
    abstract public GetDocument200Response entityToDto(DocumentEntity entity);

    @Named("correspondentEntity")
    Integer map(CorrespondentEntity correspondent) {
        if(correspondent == null) return null;

        return correspondent.getId();
    }

    @Named("documentTypeEntity")
    Integer map(DocumenttypeEntity documentType) {
        if(documentType == null) return null;
        return documentType.getId();
    }

    @Named("storagePathEntity")
    Integer map(StoragepathEntity storagePath) {
        if(storagePath == null) return null;
        return storagePath.getId();
    }

    @Named("ownerEntity")
    Integer map(AuthUser owner) {
        if(owner == null) return null;

        return owner.getId();
    }

    @Named("tagsEntity")
    List<Integer> map(Set<DocumentTagsEntity> tags) {
        if(tags == null) return null;
        return tags.stream().map( tag->(int)tag.getId() ).toList();
    }

    @Named("permissionsEntity")
    PermissionsDTO mapPermissions(AuthUser owner) {
        if(owner == null) return null;
        return PermissionsMapper.entityToDto(owner);
    }

    @Named("notesEntity")
    List<DocumentNoteDTO> mapNotes(Set<NoteEntity> notes) {
        if(notes == null) return null;
        return notes.stream().map( note->documentNotesMapper.entityToDto(note) ).toList();
    }

    // map created to createdDate (Date without the time)
    OffsetDateTime mapCreatedDate(OffsetDateTime value) {
        return value!=null ? value.withOffsetSameInstant(ZoneOffset.UTC).toLocalDate().atStartOfDay().atOffset(ZoneOffset.UTC) : null;
    }

    OffsetDateTime map(String value){
        return value != null ? OffsetDateTime.parse(value) : null;
    }

    String map (OffsetDateTime value){
        return value != null ? value.toString() : null;
    }

    @Named("correspondentDto")
    CorrespondentEntity mapCorrespondent(Integer value) {
        if(value == null) return null;
        return correspondentRepository.findById(value).orElse(null);
    }

    @Named("documentTypeDto")
    DocumenttypeEntity mapDocumentType(Integer value) {
        if(value == null) return null;

        return documentTypeRepository.findById(value).orElse(null);
    }

    @Named("storagePathDto")
    StoragepathEntity mapStoragePath(Integer value) {
        if(value == null) return null;
        return storagePathRepository.findById(value).orElse(null);
    }

    @Named("ownerDto")
    AuthUser mapOwner(Integer value) {
        if(value == null) return null;
        return userRepository.findById(value).orElse(null);
    }

    @Named("tagsDto")
    Set<DocumentTagsEntity> mapDocTag(List<Integer> value) {
        if(value == null) return null;
        return new HashSet<DocumentTagsEntity>(documentTagsRepository.findAllById(value));
    }

    @Named("archiveSerialNumberDto")
    Integer mapArchiveSerialNumber(String value) {
        if(value==null || value.isEmpty()) return null;
        return Integer.parseInt(value);
    }

    @Named("notesDto")
    Set<NoteEntity> mapNotes(List<DocumentNoteDTO> value) {
        if(value==null || value.isEmpty()) return null;

        HashSet<NoteEntity> notes = new HashSet<NoteEntity>();

        for(DocumentNoteDTO note : value) {
            notes.add(documentNotesMapper.dtoToEntity(note));
        }

        return notes;
    }
}
