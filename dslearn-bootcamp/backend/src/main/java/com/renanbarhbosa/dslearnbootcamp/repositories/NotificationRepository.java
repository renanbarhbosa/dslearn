package com.renanbarhbosa.dslearnbootcamp.repositories;

import com.renanbarhbosa.dslearnbootcamp.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
