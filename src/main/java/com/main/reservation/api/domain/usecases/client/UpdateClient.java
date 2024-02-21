package com.main.reservation.api.domain.usecases.client;

import com.main.reservation.api.core.exceptions.custom.NotFoundException;
import com.main.reservation.api.domain.entities.Client;
import com.main.reservation.api.domain.repositories.ClientRepository;

public class UpdateClient {
    final ClientRepository repository;

    public UpdateClient(ClientRepository repository) {
        this.repository = repository;
    }

    public void handle(Client client) {
        var model = repository.getById(client.getId())
                .orElseThrow(() -> new NotFoundException("availability not found"));

        model.edit(client.getPhone(), client.getUser());

        repository.save(model);
    }
}
