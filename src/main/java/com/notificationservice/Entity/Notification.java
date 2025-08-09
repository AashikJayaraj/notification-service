package com.notificationservice.Entity;

import com.notificationservice.Enum.NotificationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Event notificationEvent;
    User sender;
    List<NotificationType> notificationTypes;

}
