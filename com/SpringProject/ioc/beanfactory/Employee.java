package com.SpringProject.ioc.beanfactory;

public class Employee {
    private int employeeID;
    private String employeeName;
    public Employee(){
        System.out.println("Default Constructor");
        this.employeeID = 1;
        this.employeeName= "James";
    }

    public void getEmployeeDetails(){
        System.out.println("Employee ID and Name :" + employeeID + ":" + employeeName);
    }


}
