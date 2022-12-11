package com.week4.annotation.Assignment1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("addressB")
public class Address {

    @Value("Bengaluru")
    private String address1;

    @Value("Delhi")
    private String address2;

    public void getAddress(){
        System.out.println(address1);
        System.out.println(address2);
    }


}
