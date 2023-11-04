package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentsLogRepository extends JpaRepository<LogEntity, Integer> {
}
