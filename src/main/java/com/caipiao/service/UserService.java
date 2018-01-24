package com.caipiao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caipiao.dao.UserRepo;
import com.caipiao.dao.entity.UserEntity;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
	
   public UserEntity login(String userName,String pwd) {
	   return  userRepo.findByUserNameAndPassWord(userName, pwd);
   }
}
