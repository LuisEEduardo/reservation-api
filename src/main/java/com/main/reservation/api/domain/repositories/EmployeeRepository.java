package com.main.reservation.api.domain.repositories;

import com.main.reservation.api.domain.entities.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeRepository {
    public Employee getById(UUID id);

    public List<Employee> getAll(UUID id);

    public void create(Employee employee);

    public void delete(UUID id);
}
