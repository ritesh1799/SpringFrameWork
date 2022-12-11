package com.week4.annotation.pozo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("1")
    private int employeeId;
    @Value("Ritesh")
    private String employeeName;

    public void getEmployeeDetails(){
        System.out.println(employeeId);
        System.out.println(employeeName);
    }

}
