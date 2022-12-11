package com.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.annotation.bean");

        Employee emp = context.getBean("employee",Employee.class);
        Address add = context.getBean("address",Address.class);
        Company comp = context.getBean("company",Company.class);

        emp.getEmployeeDetails();
        add.getAddress();
        comp.getCompanyDetails();
    }
}
