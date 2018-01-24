package com.caipiao.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	public String login(HttpServletRequest request,HttpSession session,HttpServletResponse response) {
		String userName = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		UserEntity login = userService.login(userName, pwd);
		if (login == null) {
			return "用户或者密码错误";
		}
		System.out.println(JSON.toJSONString(login));
		session.setAttribute("user", userName);
		session.setAttribute("user_data", login);
		try {
			response.sendRedirect("/index.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "ok";
	}
	
	@PostMapping("/logout")
	public String logout(HttpServletRequest request) {
		String userName = request.getParameter("name");
		return JSON.toJSONString("");
	}
}
