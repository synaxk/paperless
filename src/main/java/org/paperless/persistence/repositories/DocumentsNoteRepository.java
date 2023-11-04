package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentsNoteRepository extends JpaRepository<NoteEntity, Integer> {
}
