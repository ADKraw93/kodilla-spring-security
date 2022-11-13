package com.kodilla.kodillaspringsecurity.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Employee {
    String firstname;
    String lastname;
    int id;
    String position;
}
