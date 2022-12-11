package com.week4.annotation.DbConnection;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dbconnection")
public class DBConnection {
    @PostConstruct
    public void getDBConnection(){
        System.out.println("DB Connection ");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Before Destroy");
    }

}
