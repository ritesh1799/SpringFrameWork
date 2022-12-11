package com.week4.Database;

import org.springframework.stereotype.Component;

@Component
public class Application {

    private Long application_id;
    private String description;
    private String application_name;
    private String owner;

    public Long getId() {
        return application_id;
    }

    public void setId(Long application_id) {
        this.application_id = application_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApplication_name() {
        return application_name;
    }

    public void setApplication_name(String application_name) {
        this.application_name = application_name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Application{" +
                "application_id=" + application_id +
                ", description='" + description + '\'' +
                ", application_name='" + application_name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
