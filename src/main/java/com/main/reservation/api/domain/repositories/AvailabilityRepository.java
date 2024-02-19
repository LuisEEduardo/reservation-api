package com.main.reservation.api.domain.repositories;

import com.main.reservation.api.domain.entities.Availability;

import java.util.List;
import java.util.UUID;

public interface AvailabilityRepository {
    public Availability getById(UUID id);

    public List<Availability> getAll(UUID id);

    public void create(Availability availability);

    public void delete(UUID id);
}
