package com.multiconfigurationfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Organization1.xml","Employee.xml","Address.xml"});
        Organization org = context.getBean("organization", Organization.class);
        org.getOrganization();
        System.out.println(org.hashCode());
        Organization org1 = context.getBean("organization", Organization.class);
        System.out.println(org1.hashCode());
    }
}
