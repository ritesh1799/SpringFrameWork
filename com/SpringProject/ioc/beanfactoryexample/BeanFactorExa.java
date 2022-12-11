package com.SpringProject.ioc.beanfactoryexample;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import javax.naming.Context;

public class BeanFactorExa {
    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("BeanFactoryExa.xml"));
        Teacher teacher = beanFactory.getBean("teacher", Teacher.class);
        teacher.getTeacherDetails();

    }
}
