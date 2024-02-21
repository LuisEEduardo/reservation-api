package com.main.reservation.api.domain.usecases.address;

import com.main.reservation.api.domain.entities.Address;
import com.main.reservation.api.domain.repositories.AddressRepository;

public class CreateAddress {
    final AddressRepository repository;

    public CreateAddress(AddressRepository repository) {
        this.repository = repository;
    }

    public void handle(Address address) {
        repository.save(address);
    }

}
