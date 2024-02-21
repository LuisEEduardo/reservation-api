package com.main.reservation.api.domain.usecases.company;

import com.main.reservation.api.domain.entities.Company;
import com.main.reservation.api.domain.repositories.CompanyRepository;

import java.util.List;

public class GetAllCompany {
    final CompanyRepository repository;

    public GetAllCompany(CompanyRepository repository) {
        this.repository = repository;
    }

    public List<Company> handle() {
        return repository.getAll();
    }
}
