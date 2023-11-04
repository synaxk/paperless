package org.openapitools.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Correspondent;
import org.openapitools.model.Document;
import org.openapitools.persistence.entities.*;
import org.openapitools.persistence.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class DocumentsDocumentMapper implements BaseMapper<DocumentsDocument, Document> {
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
    @Mapping(target = "documentDocumentsDocumentTagses", source = "tags", qualifiedByName = "tagsDto")
    @Mapping(target = "archiveSerialNumber", source = "archiveSerialNumber", qualifiedByName = "archiveSerialNumberDto")
    abstract public DocumentsDocument dtoToEntity(Document dto);

    @Mapping(target = "correspondent", source = "correspondent", qualifiedByName = "correspondentEntity")
    @Mapping(target = "documentType", source = "documentType", qualifiedByName = "documentTypeEntity")
    @Mapping(target = "storagePath", source = "storagePath", qualifiedByName = "storagePathEntity")
    @Mapping(target = "tags", source = "documentDocumentsDocumentTagses", qualifiedByName = "tagsEntity")
    @Mapping(target = "createdDate", source = "created", qualifiedByName = "createdToCreatedDate")
    abstract public Document entityToDto(DocumentsDocument entity);

    @Named("correspondentEntity")
    JsonNullable<Integer> map(DocumentsCorrespondent correspondent) {
        return correspondent!=null ? JsonNullable.of(correspondent.getId()) : JsonNullable.undefined();
    }

    @Named("documentTypeEntity")
    JsonNullable<Integer> map(DocumentsDocumenttype documentType) {
        return documentType!=null ? JsonNullable.of(documentType.getId()) : JsonNullable.undefined();
    }

    @Named("storagePathEntity")
    JsonNullable<Integer> map(DocumentsStoragepath storagePath) {
        return storagePath!=null ? JsonNullable.of(storagePath.getId()) : JsonNullable.undefined();
    }

    @Named("ownerEntity")
    JsonNullable<Integer> map(AuthUser owner) {
        return owner!=null ? JsonNullable.of(owner.getId()) : JsonNullable.undefined();
    }

    @Named("tagsEntity")
    JsonNullable<List<Integer>> map(Set<DocumentsDocumentTags> tags) {
        return tags!=null ? JsonNullable.of( tags.stream().map( tag->(int)tag.getId() ).toList() ) : JsonNullable.undefined();
    }

    // map created to createdDate (Date without the time)
    @Named("createdToCreatedDate")
    OffsetDateTime mapCreatedDate(OffsetDateTime value) {
        return value!=null ? value.withOffsetSameInstant(ZoneOffset.UTC).toLocalDate().atStartOfDay().atOffset(ZoneOffset.UTC) : null;
    }

    @Named("correspondentDto")
    DocumentsCorrespondent mapCorrespondent(JsonNullable<Integer> value) {
        return correspondentRepository.findById(value.get()).orElse(null);
    }

    @Named("documentTypeDto")
    DocumentsDocumenttype mapDocumentType(JsonNullable<Integer> value) {
        return documentTypeRepository.findById(value.get()).orElse(null);
    }

    @Named("storagePathDto")
    DocumentsStoragepath mapStoragePath(JsonNullable<Integer> value) {
        return storagePathRepository.findById(value.get()).orElse(null);
    }

    @Named("ownerDto")
    AuthUser mapOwner(JsonNullable<Integer> value) {
        return userRepository.findById(value.get()).orElse(null);
    }

    @Named("tagsDto")
    Set<DocumentsDocumentTags> mapDocTag(JsonNullable<List<Integer>> value) {
        return new HashSet<DocumentsDocumentTags>(documentTagsRepository.findAllById(value.get()));
    }

    @Named("archiveSerialNumberDto")
    Integer mapArchiveSerialNumber(JsonNullable<String> value) {
        if(value==null || !value.isPresent() || value.get()==null) return null;
        return Integer.parseInt(value.get());
    }

}
