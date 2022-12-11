package com.week4.annotation.DbConnection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext("com.week4.annotation.DbConnection");
        DBConnection dbConnection = context.getBean("dbconnection", DBConnection.class);
        context.close();




    }
}
