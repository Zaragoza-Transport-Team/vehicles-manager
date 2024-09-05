package com.mentoring.vehicles.infrastructure.persistence.mongodb;

import com.mentoring.vehicles.domain.entity.Vehicle;
import com.mentoring.vehicles.domain.repository.VehicleRepository;
import com.mentoring.vehicles.infrastructure.persistence.mongodb.mapper.MongoDBVehicleMapper;
import com.mentoring.vehicles.infrastructure.persistence.mongodb.repository.MongoDBVehicleRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

/* TODO implement MongoDB
@Component
public class MongoDBVehicleRepositoryAdapter implements VehicleRepository {

    MongoDBVehicleRepository repository;
    MongoDBVehicleMapper mapper;

    public Optional<Vehicle> findVehicle(long vehicleId) {

        return repository.findVehicleById(vehicleId)
                .map(mapper::map);

    }
}*/
