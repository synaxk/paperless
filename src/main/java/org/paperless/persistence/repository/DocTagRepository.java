package org.paperless.persistence.repository;

import org.paperless.persistence.entity.DocTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocTagRepository extends JpaRepository<DocTag, Long> {
}
