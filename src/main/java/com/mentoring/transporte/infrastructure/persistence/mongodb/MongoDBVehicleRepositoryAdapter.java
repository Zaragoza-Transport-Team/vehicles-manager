package com.mentoring.transporte.infrastructure.persistence.mongodb;

import com.mentoring.transporte.domain.entity.Vehicle;
import com.mentoring.transporte.domain.repository.VehicleRepository;
import com.mentoring.transporte.infrastructure.persistence.mongodb.mapper.MongoDBVehicleMapper;
import com.mentoring.transporte.infrastructure.persistence.mongodb.repository.MongoDBVehicleRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MongoDBVehicleRepositoryAdapter implements VehicleRepository {

    MongoDBVehicleRepository repository;
    MongoDBVehicleMapper mapper;

    public Optional<Vehicle> findVehicle(long vehicleId) {

        return repository.findVehicleById(vehicleId)
                .map(mapper::map);

    }
}
