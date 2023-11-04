package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthUserRepository extends JpaRepository<AuthUser, Integer> {
}
