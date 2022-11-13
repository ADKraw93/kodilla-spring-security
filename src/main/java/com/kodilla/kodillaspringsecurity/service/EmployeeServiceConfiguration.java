package com.kodilla.kodillaspringsecurity.service;

import com.kodilla.kodillaspringsecurity.repository.EmployeeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeServiceConfiguration {

    @Bean
    EmployeeService service(EmployeeRepository repository) { return new EmployeeServiceImplementation(repository);}
}
