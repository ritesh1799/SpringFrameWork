package com.scope.singleton;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SingletonScope.xml");
        Employee emp = context.getBean("Employee", Employee.class);
        emp.getEmployeeDetails();
        System.out.println(emp.hashCode());
        Employee dmp = context.getBean("Employee", Employee.class);
        System.out.println(dmp.hashCode());

    }
    }
