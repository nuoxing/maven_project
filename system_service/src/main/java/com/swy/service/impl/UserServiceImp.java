package com.swy.service.impl;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.swy.dao.UserDao;
import com.swy.domain.User;
import com.swy.service.UserService;

@Service("userService")
public class UserServiceImp  implements UserService {

	@Resource
	private UserDao userDao;
	
	@Override
	public User getloginuser(User user) {
		System.out.println("getloginuser");
		return userDao.login(user);
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	

	
}
