package com.mentoring.vehicles.domain.usecase;

import com.mentoring.vehicles.domain.entity.Location;
import reactor.core.publisher.Mono;

import java.util.List;

@FunctionalInterface
public interface GetAllLocationsUseCase {
    Mono<List<Location>> apply();
}
