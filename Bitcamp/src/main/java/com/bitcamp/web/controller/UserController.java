package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.factory.ContextFactory;

@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	@Autowired ContextFactory contextFactory;
	@RequestMapping("/mypage")
	public String mypage(Model model) {
		model.addAttribute("context",(String) contextFactory.create());
		model.addAttribute("js",contextFactory.path("js"));
		logger.info(" UserController mypage()  {}.","user/mypage");
		return "user/mypage";
	}
	@RequestMapping("/nav")
	public String nav(Model model) {
		model.addAttribute("context",(String) contextFactory.create());
		model.addAttribute("js",contextFactory.path("js"));
		logger.info(" UserController nav()  {}.","user/mypage");
		return "common/nav";
	}
	@RequestMapping("/kakao")
	public String kakao() {
		return "kakao/main";
	}
	@RequestMapping("/burgerking")
	public String burgerking() {
		return "burgerking/main";
	}
	@RequestMapping("/bitcamp")
	public String bitcamp() {
		return "bitcamp/main";
	}
	@RequestMapping("/sktelecom")
	public String sktelecom() {
		return "sktelecom/main";
	}
	@RequestMapping("/lotto")
	public String lotto() {
		return "lotto/main";
	}
	
}
