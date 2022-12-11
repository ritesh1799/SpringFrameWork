package com.SpringProject.ioc.applicationcontext.filesystem;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationcontextMain {
    public static void main(String[] args){

        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\user\\Documents\\Spring\\src\\main\\resources\\Applicationcontext.xml");

        Employee employee = context.getBean("employee", Employee.class);

        employee.getEmployeeDetails();
    }
}
