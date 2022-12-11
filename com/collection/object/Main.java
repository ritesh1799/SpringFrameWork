package com.collection.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionObject.xml");
        Employee employee = context.getBean("employee",Employee.class);
        employee.getEmployeeDetails();
    }
}
