package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.DocumentTagsEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentsDocumentTagsRepository extends JpaRepository<DocumentTagsEntity, Integer> {
}
