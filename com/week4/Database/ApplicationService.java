package com.week4.Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("service")
public class ApplicationService {

    @Autowired
    private ApplicationDAO applicationDAO;

    @Transactional
    public void insertApplication(Application application){
        applicationDAO.SaveApplication(application);
    }
}
