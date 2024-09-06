package com.mentoring.vehicles.api.rest;

import com.mentoring.vehicles.domain.entity.Location;
import com.mentoring.vehicles.domain.request.FindVehicleLocationRequest;
import com.mentoring.vehicles.domain.usecase.FindVehicleLocationUseCase;
import com.mentoring.vehicles.domain.usecase.GetAllLocationsUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

import java.util.List;

@Controller
public class RealTimeMonitoringService {

    GetAllLocationsUseCase getAllLocationsUseCase;
    FindVehicleLocationUseCase findVehicleLocationUseCase;

    @GetMapping("/locations")
    Mono<List<Location>> getLocations() {
        return getAllLocationsUseCase.apply();
    }

    @GetMapping("/locations/{vehicleId}")
    Mono<Location> getVehicleLocation(@PathVariable long vehicleId) {
        return findVehicleLocationUseCase.apply(new FindVehicleLocationRequest(vehicleId));
    }
}
