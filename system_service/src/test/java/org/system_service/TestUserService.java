package org.system_service;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.swy.domain.User;
import com.swy.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestUserService {

	@Resource
	private UserService userService;
	
	@org.junit.Test
	public void Test(){
		User user = new User();
		user.setName("su2");
		user.setPwd("123456");
		
		User u =userService.getloginuser(user);
		System.out.println(u.getId());
	}
}
