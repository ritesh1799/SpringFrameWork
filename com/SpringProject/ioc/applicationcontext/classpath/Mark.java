package com.SpringProject.ioc.applicationcontext.classpath;

public class Mark {
    private int mark1;
    private int mark2;
    private int mark3;

    public Mark(){
        System.out.println("Default Constructor");
        this.mark1 = 60;
        this.mark2 = 80;
        this.mark3 = 100;

    }

    public void getMarks(){
        System.out.println("Marks are :" + mark1 + "," + mark2+ ","+ mark3);
    }
}


