package com.main.reservation.api.domain.usecases.availability;

import com.main.reservation.api.domain.entities.Availability;
import com.main.reservation.api.domain.repositories.AvailabilityRepository;

import java.util.List;

public class getAllAvailability {
    final AvailabilityRepository repository;

    public getAllAvailability(AvailabilityRepository repository) {
        this.repository = repository;
    }

    public List<Availability> handle() {
        return repository.getAll();
    }

}
