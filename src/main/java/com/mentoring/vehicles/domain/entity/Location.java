package com.mentoring.vehicles.domain.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.awt.*;
import java.time.LocalTime;

@Data
@RequiredArgsConstructor
public class Location {

    private final long vehicleId;
    private final Point coords;
    private final LocalTime timestamp;

}
