package com.budiluhur.repository;

import java.util.Optional;

import com.budiluhur.model.ERole;
import com.budiluhur.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
