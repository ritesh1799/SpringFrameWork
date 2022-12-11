package com.week4.Database;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ApplicationRowMapper implements RowMapper<Application> {
    public Application mapRow(ResultSet result, int rowNum) throws SQLException{
        Application application = new Application();
        application.setId(result.getLong("application_id"));
        application.setDescription(result.getString("description"));
        application.setApplication_name(result.getString("application_name"));
        application.setOwner(result.getString("owner"));

        return application;
    }
}
