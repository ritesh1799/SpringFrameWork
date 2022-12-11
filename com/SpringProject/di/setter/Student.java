package com.SpringProject.di.setter;

public class Student {
private int studentId;
private String studentName;
private Mark mark;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
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
