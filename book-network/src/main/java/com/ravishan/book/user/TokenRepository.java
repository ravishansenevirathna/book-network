package com.ravishan.book.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : Book Social Network
 * Created date : 6/15/2024
 * Created time : 10:22 AM
 */
public interface TokenRepository extends JpaRepository<Token, Integer> {

    Optional<Token> findByToken(String token);
}
