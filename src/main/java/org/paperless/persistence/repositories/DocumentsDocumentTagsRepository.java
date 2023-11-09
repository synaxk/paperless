package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.DocumentTagsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface DocumentsDocumentTagsRepository extends JpaRepository<DocumentTagsEntity, Integer> {
}
