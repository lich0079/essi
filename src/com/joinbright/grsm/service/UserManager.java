package com.joinbright.grsm.service;

import java.util.List;

import com.joinbright.grsm.model.User;

public interface UserManager {
    public void add(User user );
    public void update(User user);
    public void remove(int id);
    public User findByID(int id);
    public List findAll();
}
