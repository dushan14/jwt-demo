package com.training.data.security.repository;

import java.util.Optional;
import com.training.data.security.entity.Role;
import com.training.data.security.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}