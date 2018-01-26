package com.caipiao.dao;
import org.springframework.data.repository.CrudRepository;

import com.caipiao.dao.entity.UserEntity;

/**
 * 用户操作jpa dao类
 * @author Administrator
 *
 */
public interface UserRepo extends CrudRepository<UserEntity, Long>{
	
	/**
	 * 通过用户密码查询是否存在，该用户
	 * @param name
	 * @param pwd
	 * @return
	 */
	UserEntity findByUserNameAndPassWord(String name,String pwd);
}
