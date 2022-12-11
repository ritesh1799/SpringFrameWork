package com.springboot.annotation.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;
import java.util.List;

@Component
public class College {
    @Value("{IIT,NIT,LU}")
    private List<String> CollegeName;
    @Resource
    private Department departmentName;

    @Inject
    private Student studentName;
    @Autowired
    private Course courseName;

 public void getCollegeDetails(){
     System.out.println(CollegeName);
     departmentName.getAllDepartment();
     studentName.getStudentDetails();
     courseName.getCourse();
 }
}
