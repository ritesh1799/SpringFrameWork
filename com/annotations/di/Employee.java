package com.annotations.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("1")
    private int employeeId;
    @Autowired
    private Address address;

    public void getEmployeeDetails(){
        System.out.println(employeeId);
        address.getAddress();
    }
}
