package org.paperless.mapper;

import org.mapstruct.*;
import org.paperless.model.PermissionsDTO;
import org.paperless.model.PermissionsViewDTO;
import org.paperless.persistence.entities.AuthUser;
import org.paperless.persistence.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public abstract class PermissionsMapper implements BaseMapper<AuthUser, PermissionsDTO> {
    @Autowired
    private DocumentsCorrespondentRepository correspondentRepository;
    @Autowired
    private DocumentsDocumenttypeRepository documentTypeRepository;
    @Autowired
    private DocumentsStoragepathRepository storagePathRepository;
    @Autowired
    private AuthUserRepository userRepository;
    @Autowired
    private AuthGroupRepository groupRepository;
    @Autowired
    private DocumentsDocumentTagsRepository documentTagsRepository;
    @Autowired
    private AuthPermissionRepository  permissionRepository;

    @Mapping(target = "view", source = "id", qualifiedByName = "viewEntity")
    @Mapping(target = "change", source = "id", qualifiedByName = "changeEntity")
    abstract public PermissionsDTO entityToDto(AuthUser entity);

    @Named("viewEntity")
    PermissionsViewDTO map1(Integer id) {
        if(id==null)
            return new PermissionsViewDTO();
        return new PermissionsViewDTO().addUsersItem(id);
    }

    @Named("changeEntity")
    PermissionsViewDTO map2(Integer id) {
        if(id==null)
            return new PermissionsViewDTO();
        return new PermissionsViewDTO().addUsersItem(id);
    }
}
