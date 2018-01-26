package com.caipiao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caipiao.dao.UserRepo;
import com.caipiao.dao.entity.UserEntity;

/**
 * 用户管理服务类
 * @author Administrator
 *
 */
@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
	
   //用户登录
   public UserEntity login(String userName,String pwd) {
	   return  userRepo.findByUserNameAndPassWord(userName, pwd);
   }
}
