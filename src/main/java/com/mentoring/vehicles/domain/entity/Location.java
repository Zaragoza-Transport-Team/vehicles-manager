package com.mentoring.vehicles.domain.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalTime;

@Data
@RequiredArgsConstructor
public class Location {

    private final long vehicleId;
    private final Coordinate coords;
    private final LocalTime timestamp;

}
