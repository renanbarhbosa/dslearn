package com.renanbarhbosa.dslearnbootcamp.repositories;

import com.renanbarhbosa.dslearnbootcamp.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
