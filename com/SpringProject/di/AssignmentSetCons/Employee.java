package com.SpringProject.di.AssignmentSetCons;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int Salary;
    private Address address;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void getEmployeeDetails(){
        System.out.println(employeeId);
        System.out.println(employeeName);
        System.out.println(Salary);
        address.getAddress();
    }
}
