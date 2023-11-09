package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.CorrespondentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface DocumentsCorrespondentRepository extends JpaRepository<CorrespondentEntity, Integer> {
}
