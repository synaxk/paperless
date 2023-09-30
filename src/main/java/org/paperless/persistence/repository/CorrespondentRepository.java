package org.paperless.persistence.repository;

import org.paperless.persistence.entity.Correspondent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrespondentRepository extends JpaRepository<Correspondent, Long> {
}
