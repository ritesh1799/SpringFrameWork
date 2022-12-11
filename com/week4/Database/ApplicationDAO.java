package com.week4.Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("applicationDAO")
public class ApplicationDAO {

    @Autowired
    private JdbcTemplate jdbctemplate;

    public int SaveApplication(Application application){
        String sql = "INSERT INTO APPLICATION_TBL(application_id,description,application_name,owner) VALUES(APPLICATION_SEQUENCE.NextVAL,?,?,?)";
        int response = jdbctemplate.update(sql, application.getDescription(),application.getApplication_name(),application.getOwner());
        return response;
    }

    public int updateApplication(Application application){
        String sql ="Update Application_TBL set description= ?, owner= ? where application_id = ?";
        int response = jdbctemplate.update(sql,application.getDescription(), application.getOwner(),application.getId());
        return response;
    }

    public int DeleteApplication(Application application){
        String sql = "Delete FROM Application_TBL where application_id =?";
        int response = jdbctemplate.update(sql, application.getId());
        return response;
    }

    public List<Application> getApplication(){
        String sql = "select * FROM Application_TBL";
        return jdbctemplate.query(sql, new ApplicationRowMapper());
    }
    public Application getContactById(Long application_id, String owner){
            String sql = "select * from Application_TBL where application_id = ? And owner = ?";
            return jdbctemplate.queryForObject(sql, new ApplicationRowMapper(),application_id,owner);
    }


}
