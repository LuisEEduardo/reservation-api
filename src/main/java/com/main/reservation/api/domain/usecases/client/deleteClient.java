package com.main.reservation.api.domain.usecases.client;

import com.main.reservation.api.core.exceptions.custom.NotFoundException;
import com.main.reservation.api.domain.repositories.ClientRepository;

import java.util.UUID;

public class deleteClient {
    final ClientRepository repository;

    public deleteClient(ClientRepository repository) {
        this.repository = repository;
    }

    public void handle(UUID id) {
        var exist = repository.exist(id);

        if (exist) {
            throw new NotFoundException("Client not found");
        }

        repository.delete(id);
    }
}
