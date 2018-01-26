package com.caipiao.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caipiao.dao.LotteryRepo;
import com.caipiao.dao.OrderDataRepo;
import com.caipiao.dao.UserRepo;
import com.caipiao.dao.entity.LotteryEntity;
import com.caipiao.dao.entity.OrderDataEntity;
import com.caipiao.dao.entity.UserEntity;
import com.caipiao.kind.rule.GD11_5;

/**
 * 彩票开奖结果服务类
 * @author zyf
 *
 */
@Service
public class LotteryService {
	@Autowired
	LotteryRepo lotteryRepo;
	@Autowired
	OrderDataRepo orderDataRepo;
	
	@Autowired
	UserRepo userRepo;
	
	
	/**
	 *  自动生成开将结果
	 *  #前台设置
	 */
	public void auto() {
		//通过生成规则获取开奖结果
		String re = GD11_5.get().replace("[","").replace("]","");
		
		//保存数据到开奖表
		LotteryEntity l = new LotteryEntity();
		// l.setLid(new); id 为自增 不传值
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
		String time = df.format(new Date());
		l.setLid(time);
		l.setResult(re);
		lotteryRepo.save(l);

	}
	
	public Object getResult(){
		return lotteryRepo.findFirstByOrderByIdDesc();
	}
	
	@Transactional
	public String order(Map<String, Object> param) {
		long uid = Long.parseLong(param.get("uid").toString());
		long lid = Long.parseLong(param.get("lid").toString());
		UserEntity user = userRepo.findOne(uid);
		int jifen = user.getJifen();
		int hjje = Integer.parseInt(param.get("hjje").toString());
		//订单金额大于积分（余额不足不能购买）
		if(Integer.parseInt(param.get("hjje").toString()) > jifen)
		return "积分不足,请充值";
		OrderDataEntity dataEntity =  new OrderDataEntity();
		dataEntity.setLid(lid);
		dataEntity.setUid(uid);
		dataEntity.setDjje(Integer.parseInt(param.get("djje").toString()));
		dataEntity.setZs(Integer.parseInt(param.get("zs").toString()));
		dataEntity.setYhje(Integer.parseInt(param.get("yhje").toString()));
		dataEntity.setHjje(Integer.parseInt(param.get("hjje").toString()));
		dataEntity.setZjhm(param.get("zjhm").toString());
		//保存成功返回数据
		OrderDataEntity orderData = orderDataRepo.save(dataEntity);
		//扣除积分
		user.setJifen(jifen-hjje);
		userRepo.save(user);
		return "购买成功";
	}
	
	public List<OrderDataEntity> queryList(long uid) {
	    Pageable pageable = new PageRequest(1, 10);
		return orderDataRepo.findByUid(uid);
	}
}
