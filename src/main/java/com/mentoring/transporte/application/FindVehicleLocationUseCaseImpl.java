package com.mentoring.transporte.application;

import com.mentoring.transporte.domain.entity.Location;
import com.mentoring.transporte.domain.entity.Vehicle;
import com.mentoring.transporte.domain.exception.DomainException;
import com.mentoring.transporte.domain.repository.VehicleRepository;
import com.mentoring.transporte.domain.request.FindVehicleLocationRequest;
import com.mentoring.transporte.domain.usecase.FindVehicleLocationUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class FindVehicleLocationUseCaseImpl implements FindVehicleLocationUseCase {

    VehicleRepository vehicleRepository;

    public Mono<Location> apply(FindVehicleLocationRequest request) {

        final Vehicle vehicle = vehicleRepository.findVehicle(request.vehicleId()).orElseThrow(() -> new DomainException("Vehicle not found.", HttpStatus.INTERNAL_SERVER_ERROR));

        return Mono.defer(() -> Mono.just(new Location(vehicle.getId(), vehicle.getLocation(), vehicle.getLastUpdated())));

    }
}
