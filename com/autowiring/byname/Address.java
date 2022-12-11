package com.autowiring.byname;


public class Address {
    private String address1;
    private String address2;

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public void getaddress(){
        System.out.println(address1);
        System.out.println(address2);
    }
}