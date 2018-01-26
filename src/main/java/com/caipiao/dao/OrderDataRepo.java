package com.caipiao.dao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.caipiao.dao.entity.OrderDataEntity;

/**
 * 用户操作jpa dao类
 * @author Administrator
 *
 */
public interface OrderDataRepo extends PagingAndSortingRepository<OrderDataEntity, Long>{
	Page<OrderDataEntity> findByUid(Pageable pageable);
}
