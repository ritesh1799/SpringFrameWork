package com.collection.object;

public class Employeee {
    private String employeeNme;
    private int employeeidd;

    public void setEmployeeName(String employeeNme) {
        this.employeeNme = employeeNme;
    }

    public void setEmployeeId(int employeeidd) {
        this.employeeidd = employeeidd;
    }

    public void  getEmployeeDetails(){
        System.out.println(employeeNme);
        System.out.println(employeeidd);
    }
}
