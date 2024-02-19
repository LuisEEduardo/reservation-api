package com.main.reservation.api.domain.usecases.Address;

import com.main.reservation.api.domain.entities.Address;
import com.main.reservation.api.domain.repositories.AddressRepository;

import java.util.List;

public class GetAllAddress {
    final AddressRepository repository;

    public GetAllAddress(AddressRepository repository) {
        this.repository = repository;
    }

    public List<Address> handle() {
        return repository.getAll();
    }
}
