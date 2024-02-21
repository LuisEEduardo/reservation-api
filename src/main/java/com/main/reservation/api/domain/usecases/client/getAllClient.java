package com.main.reservation.api.domain.usecases.client;

import com.main.reservation.api.domain.entities.Client;
import com.main.reservation.api.domain.repositories.ClientRepository;

import java.util.List;

public class getAllClient {
    final ClientRepository repository;

    public getAllClient(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> handle() {
        return repository.getAll();
    }
}
