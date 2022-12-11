package com.springboot.annotation.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeMain {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext("com.springboot.annotation.di");
        College clg = context.getBean("college", College.class);
        clg.getCollegeDetails();
    }
}