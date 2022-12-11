package com.SpringProject.di.setterconstructor;

public class Student {
    private int studentId;
    private String studentName;
    private Mark mark;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public void getStudentDetails(){
        System.out.println(studentId);
        System.out.println(studentName);
        mark.getmarks();
    }
}
