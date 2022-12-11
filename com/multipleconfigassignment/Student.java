package com.multipleconfigassignment;

public class Student {
    private int studentId;
    private String studentName;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void getstudentdetails(){
        System.out.println(studentId);
        System.out.println(studentName);
    }
}
