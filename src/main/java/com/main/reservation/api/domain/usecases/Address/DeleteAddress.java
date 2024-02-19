package com.main.reservation.api.domain.usecases.Address;

import com.main.reservation.api.core.exceptions.custom.NotFoundException;
import com.main.reservation.api.domain.repositories.AddressRepository;

import java.util.UUID;

public class DeleteAddress {
    final AddressRepository repository;

    public DeleteAddress(AddressRepository repository) {
        this.repository = repository;
    }

    public void handle(UUID id) {
        var exist = repository.exist(id);

        if (!exist) {
            throw new NotFoundException("Address not found");
        }

        repository.delete(id);
    }
}
