package com.notificationservice.Entity;

import com.notificationservice.Enum.NotificationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDateTime localDateTime;
    User sender;
    List<NotificationType> notificationTypes;
    Event notificationEvent;
    String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(Optional<User> sender) {
        this.sender = sender;
    }

    public List<NotificationType> getNotificationTypes() {
        return notificationTypes;
    }

    public void setNotificationTypes(List<NotificationType> notificationTypes) {
        this.notificationTypes = notificationTypes;
    }

    public Event getNotificationEvent() {
        return notificationEvent;
    }

    public void setNotificationEvent(Event notificationEvent) {
        this.notificationEvent = notificationEvent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
