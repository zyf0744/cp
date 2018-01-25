package com.caipiao.dao;

import org.springframework.data.repository.CrudRepository;

import com.caipiao.dao.entity.LotteryEntity;

public interface LotteryRepo extends CrudRepository<LotteryEntity, Long> {
	LotteryEntity findFirstByOrderByIdDesc();
}
