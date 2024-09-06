package com.mentoring.vehicles.api.rest;

import com.mentoring.vehicles.domain.entity.Vehicle;
import com.mentoring.vehicles.domain.request.RegisterNewVehicleRequest;
import com.mentoring.vehicles.domain.usecase.RegisterNewVehicleUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class VehicleManagerController {

    RegisterNewVehicleUseCase registerNewVehicleUseCase;

    @PostMapping("/vehicle")
    Mono<Vehicle> postNewVehicle(@RequestBody Vehicle newVehicle) {
        return  registerNewVehicleUseCase.apply(new RegisterNewVehicleRequest(newVehicle));
    }
}
