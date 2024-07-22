package com.mentoring.transporte.domain.entity;

import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
public class Stop {

    long id;
    String name;
    Coordinate coords;
    List<LocalTime> arrivalTimes;

}

