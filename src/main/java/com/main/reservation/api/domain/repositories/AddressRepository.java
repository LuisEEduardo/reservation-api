package com.main.reservation.api.domain.repositories;

import com.main.reservation.api.domain.entities.Address;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AddressRepository {

    public Optional<Address> getById(UUID id);

    public List<Address> getAll();

    public void save(Address address);

    public void delete(UUID id);

    public boolean exist(UUID id);
}
