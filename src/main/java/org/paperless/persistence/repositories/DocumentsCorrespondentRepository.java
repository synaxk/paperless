package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.CorrespondentEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentsCorrespondentRepository extends JpaRepository<CorrespondentEntity, Integer> {
}
