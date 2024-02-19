package com.main.reservation.api.domain.repositories;

import com.main.reservation.api.domain.entities.Address;

import java.util.List;
import java.util.UUID;

public interface AddressRepository {

    public Address getById(UUID id);

    public List<Address> getAll(UUID id);

    public void create(Address address);

    public void delete(UUID id);
}
