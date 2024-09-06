package com.mentoring.vehicles.domain.usecase;

import com.mentoring.vehicles.domain.entity.Vehicle;
import com.mentoring.vehicles.domain.request.RegisterNewVehicleRequest;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface RegisterNewVehicleUseCase {

    Mono<Vehicle> apply(RegisterNewVehicleRequest request);
}
