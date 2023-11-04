package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.SavedviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentsSavedviewRepository extends JpaRepository<SavedviewEntity, Integer> {
}
