package com.main.reservation.api.domain.usecases.company;

import com.main.reservation.api.core.exceptions.custom.NotFoundException;
import com.main.reservation.api.domain.entities.Company;
import com.main.reservation.api.domain.repositories.CompanyRepository;

import java.util.UUID;

public class GetByIdCompany {
    final CompanyRepository repository;

    public GetByIdCompany(CompanyRepository repository) {
        this.repository = repository;
    }

    public Company handle(UUID id) {
        return repository.getById(id)
                .orElseThrow(() -> new NotFoundException("Company not found"));
    }
}
