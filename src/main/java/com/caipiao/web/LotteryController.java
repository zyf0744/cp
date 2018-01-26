package com.caipiao.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.WebUtils;

import com.caipiao.service.LotteryService;

@RestController
@EnableScheduling
public class LotteryController {

	@Autowired
	LotteryService lotteryService;

	@Scheduled(cron = "0 0,10,20,30,40,50 * * * ? ")
	public void aotu() {
		lotteryService.auto();
	}

	/*
	 * @Scheduled(cron = "0/10 0/1 * * * ?") public void aotu2(){
	 * lotteryService.auto(); }
	 */
	
	@PostMapping("/getResult")
	public Object getResult(){
		return lotteryService.getResult();
	}
	
	
	@PostMapping("/order")
	public Object order(HttpServletRequest request,ModelMap map){
		Map param = WebUtils.getParametersStartingWith(request, null);
		return lotteryService.getResult();
	}
}
