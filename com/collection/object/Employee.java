package com.collection.object;



import java.util.ArrayList;
import java.util.Map;

import java.util.Set;

public class Employee {
    private ArrayList<Employeee> employeeName;
    private Set<Employeee> employeeId;
    private Map<Integer,Employeee> employeeSalary;

    public void setEmployeeName(ArrayList<Employeee> employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeId(Set<Employeee> employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeSalary(Map<Integer, Employeee> employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void getEmployeeDetails(){
        System.out.println(employeeName);
        System.out.println(employeeId);
        System.out.println(employeeSalary);

    }
}
