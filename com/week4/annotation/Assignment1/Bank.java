package com.week4.annotation.Assignment1;

import com.week4.annotation.Assignment1.pkg.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope
@ComponentScan("com.week4.annotation.Assignment1.pkg")
@Component
public class Bank {
    @Value("HDFC")
    private String bankName;

//    @Autowired(required = true)
//    private Customer customer;

    @Qualifier("addressB")
    @Autowired
    private Address address1;


//   @Autowired
//   private Address address2;




//    @Required
//    public void setAddress(com.week4.annotation.Assignment1.Address address) {
//        this.address = address;
//    }

    public void getBankDetails(){
        System.out.println(bankName);
       // customer.getCustomer();
        address1.getAddress();
    }


}
