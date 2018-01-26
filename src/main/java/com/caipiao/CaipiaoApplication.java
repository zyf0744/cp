package com.caipiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class CaipiaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaipiaoApplication.class, args);
	}
	
	//访问主页
	@RequestMapping("/")
	public String index() {
	        return "forward:/login.html";
	    }
}
