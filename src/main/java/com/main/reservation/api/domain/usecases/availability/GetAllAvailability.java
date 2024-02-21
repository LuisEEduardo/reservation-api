package com.main.reservation.api.domain.usecases.availability;

import com.main.reservation.api.domain.entities.Availability;
import com.main.reservation.api.domain.repositories.AvailabilityRepository;

import java.util.List;

public class GetAllAvailability {
    final AvailabilityRepository repository;

    public GetAllAvailability(AvailabilityRepository repository) {
        this.repository = repository;
    }

    public List<Availability> handle() {
        return repository.getAll();
    }

}
