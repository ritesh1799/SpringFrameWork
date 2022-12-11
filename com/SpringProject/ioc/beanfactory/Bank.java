package com.SpringProject.ioc.beanfactory;

public class Bank {
    private int accountNumber;

    private String accountName;

    public Bank() {
        System.out.println("Default Constructor");
        this.accountNumber = 1002;
        this.accountName = "Ward";
    }

    public void getBankDetails(){
        System.out.println("Bank Account Number and Name :" + accountNumber + ":" + accountName);
    }
}
