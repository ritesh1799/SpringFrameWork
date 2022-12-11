package com.multiconfigurationfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Organization.xml");
        Organization org = context.getBean("organization", Organization.class);
        org.getOrganization();
        System.out.println(org.hashCode());
        Organization org1 = context.getBean("organization", Organization.class);
        System.out.println(org1.hashCode());
        
    }
}
