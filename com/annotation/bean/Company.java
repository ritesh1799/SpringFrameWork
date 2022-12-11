package com.annotation.bean;

import org.springframework.stereotype.Service;

@Service("company")
public class Company {
    private String companyName;
    private int companyId;

    public Company() {
        this.companyName = "Capgemini";
        this.companyId = 143456;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void getCompanyDetails(){
        System.out.println(companyId);
        System.out.println(companyName);
    }
}
