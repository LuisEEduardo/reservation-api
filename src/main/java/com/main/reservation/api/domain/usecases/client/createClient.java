package com.main.reservation.api.domain.usecases.client;

import com.main.reservation.api.domain.entities.Client;
import com.main.reservation.api.domain.repositories.ClientRepository;

public class createClient {
    final ClientRepository repository;

    public createClient(ClientRepository repository) {
        this.repository = repository;
    }

    public void handle(Client client) {
        repository.save(client);
    }

}
