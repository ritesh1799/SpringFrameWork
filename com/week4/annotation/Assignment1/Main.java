package com.week4.annotation.Assignment1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("");

        Bank bank = context.getBean("bank",Bank.class);
        bank.getBankDetails();
    }
}
