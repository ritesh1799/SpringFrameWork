package com.propertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mailconfig.xml");
        MailConfig mailcon = context.getBean("mails",MailConfig.class);
        mailcon.getMail();
    }
}
