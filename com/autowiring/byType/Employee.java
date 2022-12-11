package com.autowiring.byType;


public class Employee {
    private int employeeId;
    private String employeeName;
    private int salary;
    private Address address;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void getEmployeeDetails(){
        System.out.println(employeeId);
        System.out.println(employeeName);
        System.out.println(salary);
        address.getaddress();
    }
}
