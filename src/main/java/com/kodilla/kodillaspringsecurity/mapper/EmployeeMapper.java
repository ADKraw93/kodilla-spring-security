package com.kodilla.kodillaspringsecurity.mapper;

import com.kodilla.kodillaspringsecurity.domain.Employee;
import com.kodilla.kodillaspringsecurity.domain.EmployeeDto;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMapper {
    public static Employee toEmployee(EmployeeDto empDto) {
        return Employee.of(empDto.getFirstname(), empDto.getLastname(), empDto.getId(), empDto.getPosition());
    }

    public static EmployeeDto toEmployeeDto(Employee emp) {
        return new EmployeeDto(emp.getFirstname(), emp.getLastname(), emp.getId(), emp.getPosition());
    }

    public static List<Employee> toEmployeeList(List<EmployeeDto> employeeDtoList) {
        return employeeDtoList
                .stream()
                .map(empDto -> Employee.of(empDto.getFirstname(), empDto.getLastname(), empDto.getId(), empDto.getPosition()))
                .collect(Collectors.toList());
    }

    public static List<EmployeeDto> toEmployeeDtoList(List<Employee> employeeList) {
        return employeeList
                .stream()
                .map(emp -> new EmployeeDto(emp.getFirstname(), emp.getLastname(), emp.getId(), emp.getPosition()))
                .collect(Collectors.toList());
    }
}
