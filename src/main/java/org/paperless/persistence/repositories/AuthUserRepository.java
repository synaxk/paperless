package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface AuthUserRepository extends JpaRepository<AuthUser, Integer> {
}
