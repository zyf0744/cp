package com.caipiao.dao;

import org.springframework.data.repository.CrudRepository;

import com.caipiao.dao.entity.LotteryEntity;


/**
 * 开奖结果操作jpa dao类
 * @author Administrator
 *
 */
public interface LotteryRepo extends CrudRepository<LotteryEntity, Long> {
	/**
	 * 获取开奖结果最后一条
	 * @return
	 */
	LotteryEntity findFirstByOrderByIdDesc();
}
