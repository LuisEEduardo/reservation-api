package com.main.reservation.api.domain.repositories;

import com.main.reservation.api.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository {
    public User getById(UUID id);

    public List<User> getAll(UUID id);

    public void create(User user);

    public void delete(UUID id);
}
