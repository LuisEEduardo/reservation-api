package com.main.reservation.api.domain.usecases.address;

import com.main.reservation.api.core.exceptions.custom.NotFoundException;
import com.main.reservation.api.domain.entities.Address;
import com.main.reservation.api.domain.repositories.AddressRepository;

public class UpdateAddress {
    final AddressRepository repository;

    public UpdateAddress(AddressRepository repository) {
        this.repository = repository;
    }

    public void handle(Address address) {
        var model = repository.getById(address.getId())
                .orElseThrow(() -> new NotFoundException("Address not found"));

        model.edit(address.getStreet(), address.getState(),
                address.getCountry(), address.getPostalCode(),
                address.getNumber(), address.getComplement(),
                address.getDescription(), address.getLinkGoogleMaps());

        repository.save(model);
    }
}
