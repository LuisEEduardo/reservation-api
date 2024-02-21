package com.main.reservation.api.domain.usecases.client;

import com.main.reservation.api.domain.entities.Client;
import com.main.reservation.api.domain.repositories.ClientRepository;

public class CreateClient {
    final ClientRepository repository;

    public CreateClient(ClientRepository repository) {
        this.repository = repository;
    }

    public void handle(Client client) {
        repository.save(client);
    }

}
