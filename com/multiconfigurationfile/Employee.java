package com.multiconfigurationfile;

public class Employee {
    private int employeeId;
    private String employeeName;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void getEmployeeDetails(){
        System.out.println(employeeId);
        System.out.println(employeeName);
    }
}
