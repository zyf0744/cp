package com.caipiao.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import com.caipiao.service.LotteryService;

@RestController
@EnableScheduling
public class LotteryController {

	@Autowired
	LotteryService lotteryService;

	@Scheduled(cron = "0 10 * * * ?")
	public void aotu() {
		lotteryService.auto();
	}

	/*
	 * @Scheduled(cron = "0/10 0/1 * * * ?") public void aotu2(){
	 * lotteryService.auto(); }
	 */
}
