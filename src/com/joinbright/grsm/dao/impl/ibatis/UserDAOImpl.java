package com.joinbright.grsm.dao.impl.ibatis;

import java.util.List;

import com.joinbright.grsm.dao.UserDAO;
import com.joinbright.grsm.model.User;

public class UserDAOImpl extends BaseDAOImpl implements UserDAO {

    public List findAll() {
        return findAllObjects(User.class);
    }

    public User findById(Integer id) {
        return (User) findObjectById(User.class, id);
    }

    public void save(User user) {
        saveObject(user);
    }

    public void update(User user) {
        updateObject(user);
    }

    public void remove(User user) {
        removeObject(user);
    }

}
