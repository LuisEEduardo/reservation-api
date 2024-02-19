package com.main.reservation.api.domain.usecases.availability;

import com.main.reservation.api.domain.entities.Availability;
import com.main.reservation.api.domain.repositories.AvailabilityRepository;

public class createAvailability {
    final AvailabilityRepository repository;

    public createAvailability(AvailabilityRepository repository) {
        this.repository = repository;
    }

    public void handle(Availability availability) {
        repository.create(availability);
    }
}
