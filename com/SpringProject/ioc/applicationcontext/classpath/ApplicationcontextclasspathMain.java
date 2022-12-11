package com.SpringProject.ioc.applicationcontext.classpath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationcontextclasspathMain {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Applicationcontextclasspath.xml");
        Mark marks = context.getBean("mark", Mark.class);
        marks.getMarks();
    }
}
