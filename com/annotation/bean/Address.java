package com.annotation.bean;

import org.springframework.stereotype.Repository;

@Repository
public class Address {
    private String addressName;

    public Address() {
        this.addressName = "Bengaluru";
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public void getAddress(){
        System.out.println(addressName);
    }
}
