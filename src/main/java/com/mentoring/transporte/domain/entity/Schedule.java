package com.mentoring.transporte.domain.entity;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Schedule {

    LocalTime startTime;
    LocalTime endTime;
    int frequencyMinutes;
    Schedules schedules;

}

class Schedules {

    Schedule weekdays;
    Schedule weekends;

}
