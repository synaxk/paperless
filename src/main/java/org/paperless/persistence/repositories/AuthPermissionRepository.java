package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.AuthPermission;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthPermissionRepository extends JpaRepository<AuthPermission, Integer> {
}
