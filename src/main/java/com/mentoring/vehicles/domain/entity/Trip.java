package com.mentoring.vehicles.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Trip {

    LocalDateTime start;
    LocalDateTime end;

    Route route;

    Stop stopBegin;
    Stop stopEnd;

}
