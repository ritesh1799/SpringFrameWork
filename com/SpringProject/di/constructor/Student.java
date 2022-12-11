package com.SpringProject.di.constructor;


public class Student {
    private int studentId;
    private String studentName;
    private Mark mark;

    public Student(int studentId, String studentName, Mark mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark = mark;
    }
    public void getStudentDetails(){
        System.out.println(studentId);
        System.out.println(studentName);
        mark.getmarks();
    }
}
