package com.autowiring.byType;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ByType.xml");
          Employee emp = context.getBean("employee", Employee.class);
        emp.getEmployeeDetails();
    }
}

