package com.main.reservation.api.domain.usecases.address;

import com.main.reservation.api.core.exceptions.custom.NotFoundException;
import com.main.reservation.api.domain.entities.Address;
import com.main.reservation.api.domain.repositories.AddressRepository;

import java.util.UUID;

public class GetByIdAddress {

    final AddressRepository repository;

    public GetByIdAddress(AddressRepository repository) {
        this.repository = repository;
    }

    public Address handle(UUID id) {
        return repository.getById(id).orElseThrow(() -> new NotFoundException("Address not found"));
    }

}
