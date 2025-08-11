package com.notificationservice.Controller;

import com.notificationservice.Dto.NotificationDto;
import com.notificationservice.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class NotificationController {

    @Autowired
    NotificationService notificationService;
    @PostMapping("/addEvent")
    public ResponseEntity<Long> addNotificationEvent(@RequestBody String notificationEvent){
        return new ResponseEntity<>(notificationService.addNotificationEvent(notificationEvent), HttpStatus.OK);
    }

    @PostMapping("/sendNotification")
    public ResponseEntity<Long> sendNewNotification(@RequestBody NotificationDto notificationDto){
        return new ResponseEntity<>(notificationService.sendNewNotification(notificationDto),HttpStatus.OK);
    }
}
