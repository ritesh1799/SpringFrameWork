package com.annotations.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.annotations.di");
        Employee emp = context.getBean("employee",Employee.class);
        emp.getEmployeeDetails();

    }
}
