package com.annotations.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("Bengaluru, Mumbai, Pune")
    private String city;
    @Value("India")
    private String country;

    public void getAddress(){
        System.out.println(city);
        System.out.println(country);
    }
}
