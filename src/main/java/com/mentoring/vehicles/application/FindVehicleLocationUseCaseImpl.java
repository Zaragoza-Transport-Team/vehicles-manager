package com.mentoring.vehicles.application;

import com.mentoring.vehicles.domain.entity.Location;
import com.mentoring.vehicles.domain.entity.Vehicle;
import com.mentoring.vehicles.domain.exception.DomainException;
import com.mentoring.vehicles.domain.repository.VehicleRepository;
import com.mentoring.vehicles.domain.request.FindVehicleLocationRequest;
import com.mentoring.vehicles.domain.usecase.FindVehicleLocationUseCase;
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
