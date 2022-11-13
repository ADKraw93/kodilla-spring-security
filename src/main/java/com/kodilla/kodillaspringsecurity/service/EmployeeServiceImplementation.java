package com.kodilla.kodillaspringsecurity.service;

import com.kodilla.kodillaspringsecurity.domain.Employee;
import com.kodilla.kodillaspringsecurity.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class EmployeeServiceImplementation implements EmployeeService{

    private final EmployeeRepository repository;

    @Override
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @Override
    public void createEmployee(Employee emp) {
        repository.save(emp);
    }

    @Override
    public void deleteEmployee(int index) {
        repository.deleteByIndex(index);
    }
}
