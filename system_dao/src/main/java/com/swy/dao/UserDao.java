package com.swy.dao;

import com.swy.domain.User;


public interface UserDao {

	public User login(User user);
	public User getUserById(int id);
	
}
