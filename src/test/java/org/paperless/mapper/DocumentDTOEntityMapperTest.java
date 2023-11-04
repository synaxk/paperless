package org.paperless.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.openapitools.jackson.nullable.JsonNullable;
import org.paperless.model.DocumentDTO;
import org.paperless.persistence.entities.*;
import org.paperless.persistence.repositories.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;
import java.util.HashSet;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
class DocumentDTOEntityMapperTest {

    @MockBean
    private DocumentsCorrespondentRepository correspondentRepository;
    @MockBean
    private DocumentsDocumenttypeRepository documentTypeRepository;
    @MockBean
    private DocumentsStoragepathRepository storagePathRepository;
    @MockBean
    private AuthUserRepository userRepository;
    @MockBean
    private DocumentsDocumentTagsRepository documentTagsRepository;

    @InjectMocks
    private final DocumentsDocumentMapper documentMapper = DocumentsDocumentMapper.INSTANCE;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Map DTO to entity")
    void dtoToEntity() {

        // Create a sample DocumentDTO
        DocumentDTO documentDTO = new DocumentDTO();
        documentDTO.setId(1);
        documentDTO.setArchiveSerialNumber(JsonNullable.of("1"));
        documentDTO.setCorrespondent(JsonNullable.of(1));
        documentDTO.setDocumentType(JsonNullable.of(2));
        documentDTO.setStoragePath(JsonNullable.of(3));
        documentDTO.setTags(JsonNullable.of(Collections.singletonList(4)));

        // Mock repository responses
        CorrespondentEntity correspondent = new CorrespondentEntity();
        correspondent.setId(1);
        DocumenttypeEntity documentType = new DocumenttypeEntity();
        documentType.setId(2);
        StoragepathEntity storagePath = new StoragepathEntity();
        storagePath.setId(3);
        DocumentTagsEntity documentTags = new DocumentTagsEntity();
        documentTags.setId(4);
        AuthUser authUser = new AuthUser();
        authUser.setId(5);


        Mockito.when(correspondentRepository.findById(1)).thenReturn(java.util.Optional.of(correspondent));
        Mockito.when(documentTypeRepository.findById(2)).thenReturn(java.util.Optional.of(documentType));
        Mockito.when(storagePathRepository.findById(3)).thenReturn(java.util.Optional.of(storagePath));
        Mockito.when(userRepository.findById(5)).thenReturn(java.util.Optional.of(authUser));
        Mockito.when(documentTagsRepository.findAllById(Collections.singletonList(4))).thenReturn(Collections.singletonList(documentTags));

        DocumentEntity document = documentMapper.dtoToEntity(documentDTO);

        // Assert that the entity is correctly mapped
        assertEquals(correspondent, document.getCorrespondent());
        assertEquals(documentType, document.getDocumentType());
        assertEquals(storagePath, document.getStoragePath());
        assertEquals(Collections.singleton(documentTags), document.getDocumentTagsEntities());
    }


    @Test
    @DisplayName("Map entity to DTO")
    void entityToDto() {
        // Create a sample Document entity
        DocumentEntity document = new DocumentEntity();
        CorrespondentEntity correspondent = new CorrespondentEntity();
        correspondent.setId(1);
        DocumenttypeEntity documentType = new DocumenttypeEntity();
        documentType.setId(2);
        StoragepathEntity storagePath = new StoragepathEntity();
        storagePath.setId(3);
        DocumentTagsEntity documentTags = new DocumentTagsEntity();
        documentTags.setId(4);
        AuthUser authUser = new AuthUser();
        authUser.setId(5);
        document.setCorrespondent(correspondent);
        document.setDocumentType(documentType);
        document.setStoragePath(storagePath);
        document.setOwner(authUser);
        document.setDocumentTagsEntities(new HashSet<>(Collections.singletonList(documentTags)));

        DocumentDTO documentDTO = documentMapper.entityToDto(document);

        // Assert that the DTO is correctly mapped
        assertEquals(JsonNullable.of(1), documentDTO.getCorrespondent());
        assertEquals(JsonNullable.of(2), documentDTO.getDocumentType());
        assertEquals(JsonNullable.of(3), documentDTO.getStoragePath());
        assertEquals(JsonNullable.of(Collections.singletonList(4)), documentDTO.getTags());
    }
}