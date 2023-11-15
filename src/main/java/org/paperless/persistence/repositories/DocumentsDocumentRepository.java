package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.DocumentEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
@Repository
public interface DocumentsDocumentRepository extends JpaRepository<DocumentEntity, Integer> {
}
