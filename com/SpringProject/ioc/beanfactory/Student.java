package com.SpringProject.ioc.beanfactory;

public class Student {
    private String studentName;
    private int studentMarks;

    public Student() {
        System.out.println("Default Constructor");
        this.studentName = "Ritesh";
        this.studentMarks = 90;
    }
    public void getStudentDetails(){
        System.out.println("Student Name and Marks are :" + studentName + ":" + studentMarks);

    }
}
