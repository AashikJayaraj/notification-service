package com.notificationservice.Repository;

import com.notificationservice.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationEventRepo extends JpaRepository<Event, Long> {
    public Event getByEventName(String eventName);
}
