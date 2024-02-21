package com.main.reservation.api.domain.repositories;

import com.main.reservation.api.domain.entities.Reservation;

import java.util.List;
import java.util.UUID;

public interface ReservationRepository {
    public Reservation getById(UUID id);

    public List<Reservation> getAll();

    public void save(Reservation reservation);

    public void delete(UUID id);
}
