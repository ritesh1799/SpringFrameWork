package com.SpringProject.di.constructorassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Assignmentconstructor.xml");
        Employee emp = context.getBean("employee",Employee.class);
        emp.getEmployeeDetails();
    }
}
