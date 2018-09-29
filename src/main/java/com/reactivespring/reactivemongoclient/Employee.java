package com.reactivespring.reactivemongoclient;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {
    private String id;
    private String name;
    private Long salary;

    public Employee(String id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
