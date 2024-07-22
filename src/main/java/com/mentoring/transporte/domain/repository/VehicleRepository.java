package com.mentoring.transporte.domain.repository;

import com.mentoring.transporte.domain.entity.Vehicle;

import java.util.Optional;

public interface VehicleRepository {

    Optional<Vehicle> findVehicle(long vehicleId);
}
