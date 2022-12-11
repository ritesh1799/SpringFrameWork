package com.springboot.annotation.di;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Department {
    @Value("{CS,IT,EC}")
    private List<String> departmentName;

    public void getAllDepartment(){
        System.out.println(departmentName);
    }


}
