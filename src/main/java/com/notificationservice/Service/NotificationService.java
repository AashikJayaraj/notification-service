package com.notificationservice.Service;

import com.notificationservice.Dto.NotificationDto;
import com.notificationservice.Entity.Event;
import com.notificationservice.Entity.Notification;
import com.notificationservice.Repository.NotificationEventRepo;
import com.notificationservice.Repository.NotificationRepo;
import com.notificationservice.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class NotificationService {
    @Autowired
    NotificationEventRepo notificationEventRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    NotificationRepo notificationRepo;

    @Autowired
    EventSendingService eventSendingService;

    public long addNotificationEvent(String eventName){
        Event notificationEvent = new Event(eventName);
        return notificationEventRepo.save(notificationEvent).getEventId();
    }

    public long sendNewNotification(NotificationDto notificationDto){
        Notification notification = new Notification();
        notification.setNotificationEvent(notificationEventRepo.getByEventName(notificationDto.getNotificationEvent()));
        notification.setMessage(notificationDto.getMessage());
        notification.setLocalDateTime(LocalDateTime.now());
        notification.setSender(userRepo.findById(notificationDto.getSenderId()));
        notification.setNotificationTypes(notificationDto.getNotificationTypes());
        return notificationRepo.save(notification).getId();
    }
}
