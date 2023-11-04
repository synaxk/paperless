package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentsDocumentRepository extends JpaRepository<DocumentEntity, Integer> {
}
