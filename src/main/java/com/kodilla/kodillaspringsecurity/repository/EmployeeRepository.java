package com.kodilla.kodillaspringsecurity.repository;

import com.kodilla.kodillaspringsecurity.domain.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();
    void save(Employee emp);
    void deleteByIndex(int index);
}
