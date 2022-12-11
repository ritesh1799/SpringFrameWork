package com.week4.annotation.Assignment1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Customer {


    @Value("12345")
    private int customerAcc;
    @Value("Ritesh")
    private String customerName;

    public void getCustomer(){
        System.out.println(customerAcc);
        System.out.println(customerName);
    }

}
