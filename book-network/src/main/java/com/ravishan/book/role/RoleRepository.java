package com.ravishan.book.role;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : Book Social Network
 * Created date : 6/15/2024
 * Created time : 10:12 AM
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(String role);
}
