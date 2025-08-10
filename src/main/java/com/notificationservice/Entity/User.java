package com.notificationservice.Entity;

import java.util.List;

public class User {
    long userId;
    String userEmail;
    String password;
    List<String> registeredNotificationEvents;

    public User() {
    }

    public User(long userId, String userEmail, String password, List<String> registeredNotificationEvents) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.password = password;
        this.registeredNotificationEvents = registeredNotificationEvents;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRegisteredNotificationEvents() {
        return registeredNotificationEvents;
    }

    public void setRegisteredNotificationEvents(List<String> registeredNotificationEvents) {
        this.registeredNotificationEvents = registeredNotificationEvents;
    }
}
