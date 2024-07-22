package com.mentoring.transporte.domain.usecase;

import com.mentoring.transporte.domain.entity.Location;
import com.mentoring.transporte.domain.request.FindVehicleLocationRequest;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface FindVehicleLocationUseCase {

    Mono<Location> apply(FindVehicleLocationRequest request);

}
