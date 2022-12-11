package com.annotation.bean;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    private int employeeId;
    private String employeeName;

  /*  @Autowired
    private Address address;

    @Autowired
    private Company company; */

    public Employee() {
        this.employeeId = 1;
        this.employeeName = "Ritesh";
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

 /*   public void setAddress(Address address) {
        this.address = address;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
*/
    public void getEmployeeDetails(){
        System.out.println(employeeId);
        System.out.println(employeeName);
       /* address.getAddress();
        company.getCompanyDetails();*/
    }
}
