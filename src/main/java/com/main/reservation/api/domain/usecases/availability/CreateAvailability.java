package com.main.reservation.api.domain.usecases.availability;

import com.main.reservation.api.domain.entities.Availability;
import com.main.reservation.api.domain.repositories.AvailabilityRepository;

public class CreateAvailability {
    final AvailabilityRepository repository;

    public CreateAvailability(AvailabilityRepository repository) {
        this.repository = repository;
    }

    public void handle(Availability availability) {
        repository.save(availability);
    }
}
