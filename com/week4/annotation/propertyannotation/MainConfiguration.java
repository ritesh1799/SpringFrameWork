package com.week4.annotation.propertyannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;


@PropertySource("classpath:mail.properties")
@Component("maincon")
public class MainConfiguration {

    @Value("${mail.host}")
    private String host;
    @Value("${mail.username}")
    private String username;
    @Value("${mail.password}")
    private String password;

    public void getmaildetails(){
        System.out.println(host);
        System.out.println(username);
        System.out.println(password);
    }

}
