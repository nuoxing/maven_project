package com.swy.service;

import com.swy.domain.User;



public interface UserService {

	public User getloginuser(User user);
	public void save(User user);
}
