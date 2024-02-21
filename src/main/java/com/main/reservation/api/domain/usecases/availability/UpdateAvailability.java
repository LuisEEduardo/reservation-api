package com.main.reservation.api.domain.usecases.availability;

import com.main.reservation.api.core.exceptions.custom.NotFoundException;
import com.main.reservation.api.domain.entities.Availability;
import com.main.reservation.api.domain.repositories.AvailabilityRepository;

public class UpdateAvailability {
    final AvailabilityRepository repository;

    public UpdateAvailability(AvailabilityRepository repository) {
        this.repository = repository;
    }

    public void handle(Availability availability) {
        var model = repository.getById(availability.getId())
                .orElseThrow(() -> new NotFoundException("availability not found"));

        model.edit(availability.getDaysAvailable(),
                availability.getStartHour(),
                availability.getEndHour());

        repository.save(model);
    }
}
