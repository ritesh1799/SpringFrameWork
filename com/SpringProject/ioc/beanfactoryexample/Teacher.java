package com.SpringProject.ioc.beanfactoryexample;

import static com.sun.xml.internal.bind.api.impl.NameConverter.standard;

public class Teacher {
    private String subject;
    private int Standard;

    public Teacher() {
        this.subject = "SpringBoot";
        Standard = 12;
    }

    public void getTeacherDetails(){
        System.out.println("Teacher Details :"+" "+"subject"+" "+Standard);
    }
}
