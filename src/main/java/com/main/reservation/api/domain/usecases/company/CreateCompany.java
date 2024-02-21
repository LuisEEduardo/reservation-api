package com.main.reservation.api.domain.usecases.company;

import com.main.reservation.api.domain.entities.Company;
import com.main.reservation.api.domain.repositories.CompanyRepository;

public class CreateCompany {
    final CompanyRepository repository;

    public CreateCompany(CompanyRepository repository) {
        this.repository = repository;
    }

    public void handle(Company company) {
        repository.save(company);
    }

}
