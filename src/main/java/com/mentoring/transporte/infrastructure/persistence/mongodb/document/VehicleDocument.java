package com.mentoring.transporte.infrastructure.persistence.mongodb.document;

import com.mentoring.transporte.domain.entity.Coordinate;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Driver;
import java.time.LocalDate;
import java.time.LocalTime;

// TODO just a stub: No idea of mongo api
@Document("vehicles")
@Data
public class VehicleDocument {

    private long id;
    private long routeId;
    private Driver driver;
    private String plateId;
    private String type;

    // ...

}
