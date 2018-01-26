package com.caipiao.dao;
import org.springframework.data.repository.CrudRepository;

import com.caipiao.dao.entity.OrderDataEntity;
import com.caipiao.dao.entity.UserEntity;

/**
 * 用户操作jpa dao类
 * @author Administrator
 *
 */
public interface OrderDataRepo extends CrudRepository<OrderDataEntity, Long>{
	
}
