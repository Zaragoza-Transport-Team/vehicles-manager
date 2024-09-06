package com.mentoring.vehicles.domain.repository;

import com.mentoring.vehicles.domain.entity.Vehicle;

import java.util.Optional;

public interface VehicleRepository {

    Optional<Vehicle> findVehicle(long vehicleId);
}
