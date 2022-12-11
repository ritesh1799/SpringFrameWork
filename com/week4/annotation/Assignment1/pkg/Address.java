package com.week4.annotation.Assignment1.pkg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("addressJ")
public class Address {

        @Value("Jaipur")
        private String address;

        public void getAddress(){
            System.out.println(address);
        }



}
