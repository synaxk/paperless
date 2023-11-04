package org.openapitools.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Correspondent;
import org.openapitools.model.Document;
import org.openapitools.model.DocumentType;
import org.openapitools.persistence.entities.*;
import org.openapitools.persistence.repositories.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.ObjectUtils;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
class DocumentsDocumentMapperTest {

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
        Document documentDTO = new Document();
        documentDTO.setId(1);
        documentDTO.setArchiveSerialNumber(JsonNullable.of("1"));
        documentDTO.setCorrespondent(JsonNullable.of(1));
        documentDTO.setDocumentType(JsonNullable.of(2));
        documentDTO.setStoragePath(JsonNullable.of(3));
        documentDTO.setTags(JsonNullable.of(Collections.singletonList(4)));

        // Mock repository responses
        DocumentsCorrespondent correspondent = new DocumentsCorrespondent();
        correspondent.setId(1);
        DocumentsDocumenttype documentType = new DocumentsDocumenttype();
        documentType.setId(2);
        DocumentsStoragepath storagePath = new DocumentsStoragepath();
        storagePath.setId(3);
        DocumentsDocumentTags documentTags = new DocumentsDocumentTags();
        documentTags.setId(4);
        AuthUser authUser = new AuthUser();
        authUser.setId(5);


        Mockito.when(correspondentRepository.findById(1)).thenReturn(java.util.Optional.of(correspondent));
        Mockito.when(documentTypeRepository.findById(2)).thenReturn(java.util.Optional.of(documentType));
        Mockito.when(storagePathRepository.findById(3)).thenReturn(java.util.Optional.of(storagePath));
        Mockito.when(userRepository.findById(5)).thenReturn(java.util.Optional.of(authUser));
        Mockito.when(documentTagsRepository.findAllById(Collections.singletonList(4))).thenReturn(Collections.singletonList(documentTags));

        DocumentsDocument document = documentMapper.dtoToEntity(documentDTO);

        // Assert that the entity is correctly mapped
        assertEquals(correspondent, document.getCorrespondent());
        assertEquals(documentType, document.getDocumentType());
        assertEquals(storagePath, document.getStoragePath());
        assertEquals(Collections.singleton(documentTags), document.getDocumentDocumentsDocumentTagses());
    }


    @Test
    @DisplayName("Map entity to DTO")
    void entityToDto() {
        // Create a sample Document entity
        DocumentsDocument document = new DocumentsDocument();
        DocumentsCorrespondent correspondent = new DocumentsCorrespondent();
        correspondent.setId(1);
        DocumentsDocumenttype documentType = new DocumentsDocumenttype();
        documentType.setId(2);
        DocumentsStoragepath storagePath = new DocumentsStoragepath();
        storagePath.setId(3);
        DocumentsDocumentTags documentTags = new DocumentsDocumentTags();
        documentTags.setId(4);
        AuthUser authUser = new AuthUser();
        authUser.setId(5);
        document.setCorrespondent(correspondent);
        document.setDocumentType(documentType);
        document.setStoragePath(storagePath);
        document.setOwner(authUser);
        document.setDocumentDocumentsDocumentTagses(new HashSet<>(Collections.singletonList(documentTags)));

        Document documentDTO = documentMapper.entityToDto(document);

        // Assert that the DTO is correctly mapped
        assertEquals(JsonNullable.of(1), documentDTO.getCorrespondent());
        assertEquals(JsonNullable.of(2), documentDTO.getDocumentType());
        assertEquals(JsonNullable.of(3), documentDTO.getStoragePath());
        assertEquals(JsonNullable.of(Collections.singletonList(4)), documentDTO.getTags());
    }
}