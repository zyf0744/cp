package com.caipiao.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.caipiao.dao.entity.OrderDataEntity;

/**
 * 用户操作jpa dao类
 * 
 * @author Administrator
 *
 */
public interface OrderDataRepo extends PagingAndSortingRepository<OrderDataEntity, Long> {
	@Query(value = "SELECT new map(l.lid as lid,l.result as result,o.zjhm as zjhm , '未中奖' as status) from "
			+ "LotteryEntity l, " 
			+ "UserEntity u, "
			+ "OrderDataEntity o "
			+ "where 1=1 and o.lid = l.id and o.uid = u.id and o.uid=? order by l.lid desc")//and o.uid = ?1
	 
/*	@Query(value = "SELECT  * from "
			+ "order_data o ,  lottery_data l , user u " 
			+ "where  o.uid=? and o.lid = l.id", nativeQuery = true)//and o.uid = ?1
*/	List<Map<String,Object>> findByUid(long uid);
}
