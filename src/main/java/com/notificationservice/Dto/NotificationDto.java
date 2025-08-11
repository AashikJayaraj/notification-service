package com.notificationservice.Dto;

import com.notificationservice.Enum.NotificationType;

import java.util.List;

public class NotificationDto {
    Long senderId;
    List<NotificationType> notificationTypes;
    String notificationEvent;
    String message;

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public List<NotificationType> getNotificationTypes() {
        return notificationTypes;
    }

    public void setNotificationTypes(List<NotificationType> notificationTypes) {
        this.notificationTypes = notificationTypes;
    }

    public String getNotificationEvent() {
        return notificationEvent;
    }

    public void setNotificationEvent(String notificationEvent) {
        this.notificationEvent = notificationEvent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
