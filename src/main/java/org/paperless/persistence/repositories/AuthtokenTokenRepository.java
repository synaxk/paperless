package org.paperless.persistence.repositories;

import org.paperless.persistence.entities.AuthtokenToken;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthtokenTokenRepository extends JpaRepository<AuthtokenToken, Long> {
}
