package com.main.reservation.api.domain.usecases.company;

import com.main.reservation.api.core.exceptions.custom.NotFoundException;
import com.main.reservation.api.domain.repositories.CompanyRepository;

import java.util.UUID;

public class DeleteCompany {
    final CompanyRepository repository;

    public DeleteCompany(CompanyRepository repository) {
        this.repository = repository;
    }

    public void handle(UUID id) {
        var exist = repository.exists(id);

        if (exist) {
            throw new NotFoundException("Company not found");
        }

        repository.delete(id);
    }
}
