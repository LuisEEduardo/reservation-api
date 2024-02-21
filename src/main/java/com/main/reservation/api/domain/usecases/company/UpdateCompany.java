package com.main.reservation.api.domain.usecases.company;

import com.main.reservation.api.core.exceptions.custom.NotFoundException;
import com.main.reservation.api.domain.entities.Company;
import com.main.reservation.api.domain.repositories.CompanyRepository;

public class UpdateCompany {
    final CompanyRepository repository;

    public UpdateCompany(CompanyRepository repository) {
        this.repository = repository;
    }

    public void handle(Company company) {
        var model = repository.getById(company.getId())
                        .orElseThrow(() -> new NotFoundException("Company not found"));

        model.edit(company.getName(), company.getBio(),
                company.getAddress(), company.getUser());

        repository.save(model);
    }
}
