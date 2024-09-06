package com.mentoring.vehicles.domain.usecase;

import com.mentoring.vehicles.domain.entity.Location;
import com.mentoring.vehicles.domain.request.FindVehicleLocationRequest;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface FindVehicleLocationUseCase {

    Mono<Location> apply(FindVehicleLocationRequest request);

}
