package com.mentoring.vehicles.domain.entity;

import lombok.Data;

import java.sql.Driver;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Vehicle {

    private long id;
    private long routeId;
    private Driver driver;
    private String plateId;
    private int capacity;
    private Coordinate location;
    private LocalTime lastUpdated;
    private LocalDate lastMaintenance;
    private VehicleStatus status;
    private VehicleType type;

}

enum VehicleStatus {

    IDLE,
    IN_SERVICE,
    MAINTENANCE,

}

enum VehicleType {

    BUS,
    TRAIN,

}
