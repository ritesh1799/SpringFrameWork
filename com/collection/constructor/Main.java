package com.collection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionConstructor.xml");
        Bank bank = context.getBean("bank", Bank.class);
        bank.getALlBankList();
        bank.getALlBankSet();
        bank.getALlBankMap();
        bank.getALlBankProperties();
    }
}
