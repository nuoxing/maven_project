package com.swy.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.swy.domain.User;
import com.swy.service.UserService;

@Controller
public class LoginContrlloer {

	@Resource
	private UserService userService;

	@RequestMapping(value = "/login/show")
	public String showlogin() {
		return "login";
	}

	/**
	 * @ModelAttribute作用是显示指定user作为数据回显得key
	 * @param request
	 * @param user
	 * @param result
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/user/login")
	public String login(HttpServletRequest request, User user, ModelMap map)
			throws Exception {
		System.out.println(user.getName());

		User u = userService.getloginuser(user);
		if (u != null) {
			request.getSession().setAttribute("user", u);
			return "redirect:/index"; // 跳转到controller
		} else {
			map.addAttribute("error", "用户名或密码错误");
			return "login";
		}

	}

	@RequestMapping(value = "/user/exit")
	public String cancel(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/index";
	}

}
