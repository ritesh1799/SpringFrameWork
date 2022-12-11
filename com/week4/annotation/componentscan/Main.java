package com.week4.annotation.componentscan;

import com.week4.annotation.pozo.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
          context.register(Configuration.class);
          context.refresh();
        Employee emp = context.getBean("employee",Employee.class);
        emp.getEmployeeDetails();
    }
}
