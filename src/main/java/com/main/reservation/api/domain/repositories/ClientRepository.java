package com.main.reservation.api.domain.repositories;

import com.main.reservation.api.domain.entities.Client;

import java.util.List;
import java.util.UUID;

public interface ClientRepository {

    public Client getById(UUID id);

    public List<Client> getAll(UUID id);

    public void create(Client client);

    public void delete(UUID id);
}
