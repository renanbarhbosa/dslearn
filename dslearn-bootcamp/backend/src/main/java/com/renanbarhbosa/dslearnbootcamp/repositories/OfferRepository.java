package com.renanbarhbosa.dslearnbootcamp.repositories;

import com.renanbarhbosa.dslearnbootcamp.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}
