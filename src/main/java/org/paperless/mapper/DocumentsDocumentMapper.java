package org.paperless.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.openapitools.jackson.nullable.JsonNullable;
import org.paperless.model.DocumentDTO;
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

public abstract class DocumentsDocumentMapper implements BaseMapper<DocumentEntity, DocumentDTO> {
    public static DocumentsDocumentMapper INSTANCE = Mappers.getMapper(DocumentsDocumentMapper.class);

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

    @Mapping(target = "correspondent", source = "correspondent", qualifiedByName = "correspondentDto")
    @Mapping(target = "documentType", source = "documentType", qualifiedByName = "documentTypeDto")
    @Mapping(target = "storagePath", source = "storagePath", qualifiedByName = "storagePathDto")
    @Mapping(target = "documentTagsEntities", source = "tags", qualifiedByName = "tagsDto")
    @Mapping(target = "archiveSerialNumber", source = "archiveSerialNumber", qualifiedByName = "archiveSerialNumberDto")
    abstract public DocumentEntity dtoToEntity(DocumentDTO dto);

    @Mapping(target = "correspondent", source = "correspondent", qualifiedByName = "correspondentEntity")
    @Mapping(target = "documentType", source = "documentType", qualifiedByName = "documentTypeEntity")
    @Mapping(target = "storagePath", source = "storagePath", qualifiedByName = "storagePathEntity")
    @Mapping(target = "tags", source = "documentTagsEntities", qualifiedByName = "tagsEntity")
    @Mapping(target = "createdDate", source = "created", qualifiedByName = "createdToCreatedDate")
    abstract public DocumentDTO entityToDto(DocumentEntity entity);

    @Named("correspondentEntity")
    JsonNullable<Integer> map(CorrespondentEntity correspondent) {
        return correspondent!=null ? JsonNullable.of(correspondent.getId()) : JsonNullable.undefined();
    }

    @Named("documentTypeEntity")
    JsonNullable<Integer> map(DocumenttypeEntity documentType) {
        return documentType!=null ? JsonNullable.of(documentType.getId()) : JsonNullable.undefined();
    }

    @Named("storagePathEntity")
    JsonNullable<Integer> map(StoragepathEntity storagePath) {
        return storagePath!=null ? JsonNullable.of(storagePath.getId()) : JsonNullable.undefined();
    }

    @Named("ownerEntity")
    JsonNullable<Integer> map(AuthUser owner) {
        return owner!=null ? JsonNullable.of(owner.getId()) : JsonNullable.undefined();
    }

    @Named("tagsEntity")
    JsonNullable<List<Integer>> map(Set<DocumentTagsEntity> tags) {
        return tags!=null ? JsonNullable.of( tags.stream().map( tag->(int)tag.getId() ).toList() ) : JsonNullable.undefined();
    }

    // map created to createdDate (Date without the time)
    @Named("createdToCreatedDate")
    OffsetDateTime mapCreatedDate(OffsetDateTime value) {
        return value!=null ? value.withOffsetSameInstant(ZoneOffset.UTC).toLocalDate().atStartOfDay().atOffset(ZoneOffset.UTC) : null;
    }

    @Named("correspondentDto")
    CorrespondentEntity mapCorrespondent(JsonNullable<Integer> value) {
        return correspondentRepository.findById(value.get()).orElse(null);
    }

    @Named("documentTypeDto")
    DocumenttypeEntity mapDocumentType(JsonNullable<Integer> value) {
        return documentTypeRepository.findById(value.get()).orElse(null);
    }

    @Named("storagePathDto")
    StoragepathEntity mapStoragePath(JsonNullable<Integer> value) {
        return storagePathRepository.findById(value.get()).orElse(null);
    }

    @Named("ownerDto")
    AuthUser mapOwner(JsonNullable<Integer> value) {
        return userRepository.findById(value.get()).orElse(null);
    }

    @Named("tagsDto")
    Set<DocumentTagsEntity> mapDocTag(JsonNullable<List<Integer>> value) {
        return new HashSet<DocumentTagsEntity>(documentTagsRepository.findAllById(value.get()));
    }

    @Named("archiveSerialNumberDto")
    Integer mapArchiveSerialNumber(JsonNullable<String> value) {
        if(value==null || !value.isPresent() || value.get()==null) return null;
        return Integer.parseInt(value.get());
    }

}
