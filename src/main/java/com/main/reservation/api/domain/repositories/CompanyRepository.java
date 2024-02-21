package com.main.reservation.api.domain.repositories;

import com.main.reservation.api.domain.entities.Company;

import java.util.List;
import java.util.UUID;

public interface CompanyRepository {
    public Company getById(UUID id);

    public List<Company> getAll();

    public void save(Company company);

    public void delete(UUID id);
}
