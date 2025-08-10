package com.notificationservice.Dto;

import com.notificationservice.Enum.NotificationType;

import java.util.List;

public class NotificationDto {
    Long senderId;
    List<NotificationType> notificationTypes;
    String notificationEvent;
    String message;
}
