package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.DocumenttypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentsDocumenttypeRepository extends JpaRepository<DocumenttypeEntity, Integer> {
}
