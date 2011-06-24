package com.joinbright.grsm.service.impl;

import java.util.List;

import com.joinbright.grsm.model.User;
import com.joinbright.grsm.service.UserManager;
import com.joinbright.grsm.service.base.ManagerSupport;

public class UserManagerImpl extends ManagerSupport implements UserManager{

    public void add(User user) {
        userDAO.save(user);
    }

    public List findAll() {
        return userDAO.findAll();
    }

    public User findByID(int id) {
        return userDAO.findById(id);
    }

    public void remove(int id) {
        User user=new User();
        user.setId(id);
        userDAO.remove(user);
    }

    public void update(User user) {
        userDAO.update(user);
    }

}
