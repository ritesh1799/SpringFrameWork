package com.week4.javaannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.week4.javaannotation");
        Date jb = context.getBean("date", Date.class);
        System.out.println(jb.toString());
    }
}
