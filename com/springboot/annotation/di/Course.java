package com.springboot.annotation.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Course {
    @Value("{DSA,SpringBoot,Devops}")
    private List<String> courseName;

    public void getCourse(){
        System.out.println(courseName);
    }
}
