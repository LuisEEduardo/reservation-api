package com.main.reservation.api.domain.usecases.Address;

import com.main.reservation.api.domain.entities.Address;
import com.main.reservation.api.domain.repositories.AddressRepository;

import java.util.UUID;

public class GetByIdAddress {

    final AddressRepository repository;

    public GetByIdAddress(AddressRepository repository) {
        this.repository = repository;
    }

    public Address handle(UUID id) {
        return repository.getById(id);
    }

}