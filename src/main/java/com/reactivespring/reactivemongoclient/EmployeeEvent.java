package com.reactivespring.reactivemongoclient;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class EmployeeEvent {

    private Employee employee;
    private Date date;

    public EmployeeEvent(Employee employee, Date date) {
        this.employee = employee;
        this.date = date;
    }
}