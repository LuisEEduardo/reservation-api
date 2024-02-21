package com.main.reservation.api.domain.usecases.availability;

import com.main.reservation.api.core.exceptions.custom.NotFoundException;
import com.main.reservation.api.domain.repositories.AvailabilityRepository;

import java.util.UUID;

public class DeleteAvailability {
    final AvailabilityRepository repository;

    public DeleteAvailability(AvailabilityRepository repository) {
        this.repository = repository;
    }

    public void handle(UUID id) {
        var exist = repository.exist(id);

        if (!exist) {
            throw new NotFoundException("Availability not found");
        }

        repository.delete(id);
    }
}
