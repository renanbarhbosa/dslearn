package com.renanbarhbosa.dslearnbootcamp.repositories;

import com.renanbarhbosa.dslearnbootcamp.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
