package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DocumentsTagRepository extends JpaRepository<TagEntity, Integer> {
}
