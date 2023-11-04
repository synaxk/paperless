package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.PaperlesstaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentsPaperlesstaskRepository extends JpaRepository<PaperlesstaskEntity, Integer> {
}
