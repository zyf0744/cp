package com.caipiao.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.caipiao.dao.entity.UserEntity;
import com.caipiao.service.UserService;

@RestController
@RequestMapping("/user")
public class LoginController {

	@Autowired
	UserService userService;

	@PostMapping("/login")
	public String login(HttpServletRequest request) {
		String userName = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		UserEntity login = userService.login(userName, pwd);
		if (login == null) {
			return "null";
		}
		System.out.println(JSON.toJSONString(login));
		return JSON.toJSONString(login);
	}
	
	@PostMapping("/logout")
	public String logout(HttpServletRequest request) {
		String userName = request.getParameter("name");
		return JSON.toJSONString("");
	}
}
