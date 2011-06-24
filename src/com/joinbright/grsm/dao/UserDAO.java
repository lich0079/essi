package com.joinbright.grsm.dao;

import java.util.List;

import com.joinbright.grsm.model.User;

public interface UserDAO {
	public void save(User user);
	public void update(User user);
	public void remove(User user);
	public User findById(Integer id);
	public List findAll();
}
