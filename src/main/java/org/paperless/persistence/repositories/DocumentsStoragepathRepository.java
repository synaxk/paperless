package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.StoragepathEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentsStoragepathRepository extends JpaRepository<StoragepathEntity, Integer> {
}
