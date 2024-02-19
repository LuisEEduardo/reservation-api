package com.main.reservation.api.domain.usecases.availability;

import com.main.reservation.api.domain.entities.Availability;
import com.main.reservation.api.domain.repositories.AvailabilityRepository;

import java.util.UUID;

public class getByIdAvailability {
    final AvailabilityRepository repository;

    public getByIdAvailability(AvailabilityRepository repository) {
        this.repository = repository;
    }

    public Availability getById(UUID id) {
        return repository.getById(id);
    }
}
