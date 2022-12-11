package com.multipleconfigassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AssignmentMail.xml");
        Mail mails1 = context.getBean("mails", Mail.class);
        mails1.getMail();
        Mark marks = context.getBean("marks",Mark.class);
        marks.getmarks();
        Student student = context.getBean("students", Student.class);
        student.getstudentdetails();
    }
}
