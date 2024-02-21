package com.main.reservation.api.domain.repositories;

import com.main.reservation.api.domain.entities.Client;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClientRepository {

    public Optional<Client> getById(UUID id);

    public List<Client> getAll();

    public void save(Client client);

    public void delete(UUID id);

    public boolean exist(UUID id);
}
