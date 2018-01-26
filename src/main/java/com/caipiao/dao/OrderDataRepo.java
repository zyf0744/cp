package com.caipiao.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.caipiao.dao.entity.OrderDataEntity;

/**
 * 用户操作jpa dao类
 * @author Administrator
 *
 */
public interface OrderDataRepo extends PagingAndSortingRepository<OrderDataEntity, Long>{
	@Query("SELECT l.lid,l.result,o.zjhm, ('no')status from lottery_data l,user u,order_data o where o.lid = l.id and o.uid = u.id and o.uid = ?")
	List<OrderDataEntity> findByUid(long uid);
}
