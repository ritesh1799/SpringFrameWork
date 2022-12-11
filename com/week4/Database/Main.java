package com.week4.Database;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.week4.Database");
        //ApplicationDAO applicationDAO = context.getBean("applicationDAO", ApplicationDAO.class);
         ApplicationService applicationService = context.getBean("service",ApplicationService.class);
//        Application application= new Application();
//        application.setApplication_name("SpringBoot");
//        application.setDescription("Spring Boot Example");
//        application.setOwner("Ritesh");
//
//        applicationDAO.SaveApplication(application);
//
//        Application update = new Application();
//
//        update.setDescription("JDBC");
//        update.setOwner("Ritesh Jain");
//        update.setId(1L);
//        applicationDAO.updateApplication(update);
//
//        Application delete = new Application();
//        delete.setId(4L);
//        applicationDAO.DeleteApplication(delete);


//
//       List<Application> app = applicationDAO.getApplication();
//        System.out.println(app);

// Application app = applicationDAO.getContactById(6L,"Ritesh");



//        System.out.println(app.toString());

        Application application = new Application();
        application.setApplication_name("SpringBoot1");
        application.setDescription("Spring Boot Example1");
        application.setOwner("Ritesh1");
        applicationService.insertApplication(application);



    }
}
