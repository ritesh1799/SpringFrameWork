package com.week4.javaannotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class Javabased {

    @Scope
    @Bean(name = "date",initMethod = "toString",destroyMethod = "toString")
    public Date getDate(){
        Date d = new Date();
        return d;
    }
}
