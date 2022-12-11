package com.week4.annotation.propertyannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.week4.annotation.propertyannotation");
        MainConfiguration mainConfiguration = context.getBean("maincon", MainConfiguration.class);
        mainConfiguration.getmaildetails();
    }
}
