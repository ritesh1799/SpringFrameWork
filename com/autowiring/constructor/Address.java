package com.autowiring.constructor;

public class Address {
    private String address1;
    private String address2;

    public Address(String address1, String address2) {
        this.address1 = address1;
        this.address2 = address2;
    }
    public void getaddress(){
        System.out.println(address1);
        System.out.println(address2);
    }
}

