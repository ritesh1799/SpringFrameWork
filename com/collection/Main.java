package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionSetter.xml");
        Bank bank = context.getBean("bank",Bank.class);
        bank.getbankListDetails();
        bank.getbankSettDetails();
        bank.getbankMapDetails();
        bank.getbankPropertiesDetails();

    }
}
