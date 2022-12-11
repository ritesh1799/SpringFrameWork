package com.week4.annotation.assignment2;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@PropertySources({@PropertySource("classpath:student.properties"),@PropertySource("classpath:mark.properties")})
@Component("student")
public class StudentConfig {

    @Value("${student.studentId}")
    private int studentId;

    @Value("${student.studentName}")
    private String studentName;
    @Value("${mark.mark1}")
    private int mark1;
    @Value("${mark.mark2}")
    private int mark2;

    public void getstudentdetails(){
        System.out.println(studentId);
        System.out.println(studentName);
        System.out.println(mark1);
        System.out.println(mark2);
    }



}
