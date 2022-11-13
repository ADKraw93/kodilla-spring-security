package com.kodilla.kodillaspringsecurity.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDto {
    String firstname;
    String lastname;
    int id;
    String position;
}
