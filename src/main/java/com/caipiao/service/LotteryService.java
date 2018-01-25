package com.caipiao.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caipiao.dao.LotteryRepo;
import com.caipiao.dao.entity.LotteryEntity;
import com.caipiao.kind.GD11_5;

@Service
public class LotteryService {
	@Autowired
	LotteryRepo lotteryRepo;

	public void auto() {
		String re = GD11_5.get().replace("[","").replace("]","");
		LotteryEntity l = new LotteryEntity();
		// l.setLid(new);
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
		String time = df.format(new Date());
		l.setLid(time);
		l.setResult(re);
		lotteryRepo.save(l);

	}
}
