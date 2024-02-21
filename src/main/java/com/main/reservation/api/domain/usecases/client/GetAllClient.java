package com.main.reservation.api.domain.usecases.client;

import com.main.reservation.api.domain.entities.Client;
import com.main.reservation.api.domain.repositories.ClientRepository;

import java.util.List;

public class GetAllClient {
    final ClientRepository repository;

    public GetAllClient(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> handle() {
        return repository.getAll();
    }
}
