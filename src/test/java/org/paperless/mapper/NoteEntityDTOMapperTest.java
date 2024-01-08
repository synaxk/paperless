package org.paperless.mapper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openapitools.jackson.nullable.JsonNullable;
import org.paperless.model.DocumentNoteDTO;
import org.paperless.persistence.entities.AuthUser;
import org.paperless.persistence.entities.DocumentEntity;
import org.paperless.persistence.entities.NoteEntity;
import org.paperless.persistence.repositories.*;
        ;import java.time.OffsetDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class NoteEntityDTOMapperTest {
    @Mock
    private DocumentsCorrespondentRepository correspondentRepository;
    @Mock
    private DocumentsDocumentTagsRepository documentTypeRepository;
    @Mock
    private DocumentsStoragepathRepository storagePathRepository;
    @Mock
    private AuthUserRepository userRepository;
    @Mock
    private DocumentsDocumentTagsRepository documentTagsRepository;
    @Mock
    private DocumentsDocumentRepository documentRepository;

    @InjectMocks
    DocumentNotesMapperImpl documentNotesMapper;

    @Test
    @DisplayName("Map DTO to entity")
    void dtoToEntity() {
        DocumentNoteDTO documentNoteDTO = new DocumentNoteDTO();
        documentNoteDTO.setId(1);
        documentNoteDTO.setNote("note");
        OffsetDateTime now = OffsetDateTime.now();
        documentNoteDTO.setCreated(now.toString());
        documentNoteDTO.setDocument(2);
        documentNoteDTO.setUser(3);
        AuthUser authUser = new AuthUser();
        authUser.setId(3);
        DocumentEntity document = new DocumentEntity();
        document.setId(2);


        Mockito.when(userRepository.findById(3)).thenReturn(Optional.of(authUser));
        Mockito.when(documentRepository.findById(2)).thenReturn(Optional.of(document));

        NoteEntity note = documentNotesMapper.dtoToEntity(documentNoteDTO);

        assertEquals(1, note.getId());
        assertEquals("note", note.getNote());
        assertEquals(now, note.getCreated());
        assertEquals(authUser, note.getUser());
        assertEquals(document, note.getDocument());

    }

    @Test
    @DisplayName("Entity to DTO")
    void entityToDTO(){
        NoteEntity note = new NoteEntity();
        note.setId(1);
        note.setNote("note");
        note.setCreated(OffsetDateTime.now());
        DocumentEntity doc = new DocumentEntity();
        doc.setId(2);
        note.setDocument(doc);
        AuthUser user = new AuthUser();
        user.setId(3);
        note.setUser(user);

        DocumentNoteDTO noteDTO = documentNotesMapper.entityToDto(note);

        assertEquals(1, noteDTO.getId());
        assertEquals("note", noteDTO.getNote());
        assertEquals(note.getCreated().toString(), noteDTO.getCreated());
        assertEquals(2, noteDTO.getDocument());
        assertEquals(3, noteDTO.getUser());
    }
}
