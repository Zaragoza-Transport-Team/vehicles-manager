package com.mentoring.vehicles.application;

import com.mentoring.vehicles.domain.entity.Vehicle;
import com.mentoring.vehicles.domain.request.RegisterNewVehicleRequest;
import com.mentoring.vehicles.domain.usecase.RegisterNewVehicleUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class RegisterNewVehicleUseCaseImpl implements RegisterNewVehicleUseCase {

    public Mono<Vehicle> apply(RegisterNewVehicleRequest request) {
        log.info("Request to register new vehicle: {}", request);
        log.info("This will be saved in a database when implemented");

        return Mono.defer(() -> Mono.just(request.vehicle()));
    }
}
