package com.mentoring.vehicles.domain.entity;

import lombok.Data;

@Data
public class Notification {
    NotificationType type;
}

enum NotificationType {
    STOP_ARRIVAL,
    STOP_LEAVE,
    STOP_DELAY,
    EMERGENCY,
    // ...

}