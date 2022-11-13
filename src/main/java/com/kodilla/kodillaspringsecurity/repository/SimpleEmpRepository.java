package com.kodilla.kodillaspringsecurity.repository;

import com.kodilla.kodillaspringsecurity.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class SimpleEmpRepository implements EmployeeRepository{

    private List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public void save(Employee emp) {
        employees.add(emp);
    }

    @Override
    public void deleteByIndex(int index) {
        employees.remove(index);
    }
}
