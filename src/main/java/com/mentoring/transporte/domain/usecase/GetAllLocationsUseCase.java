package com.mentoring.transporte.domain.usecase;

import com.mentoring.transporte.domain.entity.Location;
import reactor.core.publisher.Mono;

import java.util.List;

@FunctionalInterface
public interface GetAllLocationsUseCase {
    Mono<List<Location>> apply();
}
