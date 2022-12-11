package com.springboot.annotation.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("James")
    private String studentName;

    public void getStudentDetails(){
        System.out.println(studentName);
    }
}
