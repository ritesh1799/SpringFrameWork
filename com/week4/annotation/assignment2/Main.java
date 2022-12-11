package com.week4.annotation.assignment2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.week4.annotation.assignment2");
        StudentConfig stu = context.getBean("student", StudentConfig.class);
        stu.getstudentdetails();
    }
}
