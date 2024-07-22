package com.mentoring.transporte.infrastructure.persistence.mongodb.repository;

import com.mentoring.transporte.infrastructure.persistence.mongodb.document.VehicleDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

// TODO stub : no idea of mongo api
public interface MongoDBVehicleRepository extends MongoRepository<VehicleDocument, Long> {

    Optional<VehicleDocument> findVehicleById(long id);

}
