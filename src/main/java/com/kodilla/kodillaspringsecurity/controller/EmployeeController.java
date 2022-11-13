package com.kodilla.kodillaspringsecurity.controller;

import com.kodilla.kodillaspringsecurity.domain.EmployeeDto;
import com.kodilla.kodillaspringsecurity.mapper.EmployeeMapper;
import com.kodilla.kodillaspringsecurity.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping
    public List<EmployeeDto> m1() {
        return EmployeeMapper.toEmployeeDtoList(service.getEmployees());
    }

    @PostMapping
    public void m2(@RequestBody EmployeeDto employeeDto) {
        service.createEmployee(EmployeeMapper.toEmployee(employeeDto));
    }

    @DeleteMapping(path = "/{index}")
    public void m3(@PathVariable("index") int index) {
        service.deleteEmployee(index);
    }
}
