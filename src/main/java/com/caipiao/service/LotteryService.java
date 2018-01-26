package com.caipiao.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caipiao.dao.LotteryRepo;
import com.caipiao.dao.entity.LotteryEntity;
import com.caipiao.kindrule.GD11_5;

/**
 * 彩票开奖结果服务类
 * @author zyf
 *
 */
@Service
public class LotteryService {
	@Autowired
	LotteryRepo lotteryRepo;

	
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
}
