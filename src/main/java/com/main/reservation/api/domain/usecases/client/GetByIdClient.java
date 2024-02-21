package com.main.reservation.api.domain.usecases.client;

import com.main.reservation.api.domain.entities.Client;
import com.main.reservation.api.domain.repositories.ClientRepository;

import java.util.UUID;

public class GetByIdClient {
    final ClientRepository repository;

    public GetByIdClient(ClientRepository repository) {
        this.repository = repository;
    }

    public Client handle(UUID id) {
        return repository.getById(id);
    }
}
