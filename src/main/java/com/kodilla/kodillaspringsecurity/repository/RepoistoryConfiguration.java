package com.kodilla.kodillaspringsecurity.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoistoryConfiguration {

    @Bean
    EmployeeRepository repository() {
        return new SimpleEmpRepository();
    }
}
