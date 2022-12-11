package com.multiconfigurationfile;

public class Organization {
    private String organizationName;
    private Employee employees;
    private Address  address;

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void getOrganization(){
        System.out.println(organizationName);
        employees.getEmployeeDetails();
        address.getAddress();
    }
}
