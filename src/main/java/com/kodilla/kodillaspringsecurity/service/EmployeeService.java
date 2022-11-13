package com.kodilla.kodillaspringsecurity.service;

import com.kodilla.kodillaspringsecurity.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
    void createEmployee(Employee emp);
    void deleteEmployee(int index);
}
