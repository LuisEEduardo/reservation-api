package com.main.reservation.api.domain.usecases.availability;

import com.main.reservation.api.domain.entities.Availability;
import com.main.reservation.api.domain.repositories.AvailabilityRepository;

import java.util.UUID;

public class GetByIdAvailability {
    final AvailabilityRepository repository;

    public GetByIdAvailability(AvailabilityRepository repository) {
        this.repository = repository;
    }

    public Availability getById(UUID id) {
        return repository.getById(id);
    }
}
