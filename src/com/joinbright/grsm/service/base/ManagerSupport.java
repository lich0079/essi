package com.joinbright.grsm.service.base;

import com.joinbright.grsm.dao.UserDAO;
import com.joinbright.grsm.service.impl.BaseManagerImpl;

public class ManagerSupport extends BaseManagerImpl {
    
    protected UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

}
