package com.renanbarhbosa.dslearnbootcamp.repositories;

import com.renanbarhbosa.dslearnbootcamp.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliverRepository extends JpaRepository<Deliver, Long> {
}
