package com.mentoring.vehicles.domain.entity;

import lombok.Data;

import java.time.LocalTime;

/* For the Message Queue */

@Data
public class Message {

    LocalTime timestamp;
    MessageType type;
    // payload ???
}

enum MessageType {

    POSITION_UPDATE,
    ROUTE_DELAY,
    NOTIFICATION,
    // ... ???
}
