package com.SpringProject.ioc.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryMain {
    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanfactory.xml"));
        Employee employee = beanFactory.getBean("employee", Employee.class);

        employee.getEmployeeDetails();

        Bank bank = beanFactory.getBean("bank",Bank.class);
        bank.getBankDetails();

        Student student = beanFactory.getBean("student",Student.class);
        student.getStudentDetails();
    }
}