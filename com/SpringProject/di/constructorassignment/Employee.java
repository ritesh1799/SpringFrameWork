package com.SpringProject.di.constructorassignment;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int Salary;
    private Address address;

    public Employee(int employeeId, String employeeName, int salary, Address address) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        Salary = salary;
        this.address = address;
    }
    public void getEmployeeDetails(){
        System.out.println(employeeId);
        System.out.println(employeeName);
        System.out.println(Salary);
        address.getaddress();
    }
}
