package com.main.reservation.api.domain.repositories;

import com.main.reservation.api.domain.entities.Availability;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AvailabilityRepository {
    public Optional<Availability> getById(UUID id);

    public List<Availability> getAll();

    public void save(Availability availability);

    public void delete(UUID id);

    public boolean exist(UUID id);
}
