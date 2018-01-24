package com.caipiao.dao;
import org.springframework.data.repository.CrudRepository;

import com.caipiao.dao.entity.UserEntity;

public interface UserRepo extends CrudRepository<UserEntity, Long>{
	UserEntity findByUserNameAndPassWord(String name,String pwd);
}
