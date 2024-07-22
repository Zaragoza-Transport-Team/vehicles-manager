package com.mentoring.transporte.infrastructure.persistence.mongodb.mapper;

import com.mentoring.transporte.domain.entity.Vehicle;
import com.mentoring.transporte.infrastructure.persistence.mongodb.document.VehicleDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MongoDBVehicleMapper {

    public Vehicle map(VehicleDocument document);
}
