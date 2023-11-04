package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.UisettingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentsUisettingsRepository extends JpaRepository<UisettingsEntity, Integer> {
}
