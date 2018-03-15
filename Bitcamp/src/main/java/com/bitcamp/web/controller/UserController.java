package com.bitcamp.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.LottoService;
import com.bitcamp.web.service.MemberService;

@SessionAttributes("user")
@Controller

public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired LottoService service;
	@Autowired MemberService mService;
	@Autowired Command cmd;
	@Autowired LottoDTO lotto;
	@Autowired MemberDTO member;
	@Autowired ShiftFactory shift;

	@RequestMapping("/login/{userid}/{password}")
	public String login(Model model,
			@PathVariable("userid")String userid,
			@PathVariable("password")String password) {
		logger.info("UserController login() ID is  {}.",userid);
		logger.info("UserController login() PASS is  {}.",password);
		member.setId(userid);
		member.setPass(password);
		cmd.setMember(member);
		String path = shift.create("user", "login");
		
		if(mService.exist(cmd)) {
			model.addAttribute("user",mService.findMemberById(cmd));
			model.addAttribute("phone","");
			path = shift.create("user", "mypage");}
		return path;
	}
	
	@RequestMapping("/logout")
	public String logout(SessionStatus status){
		status.setComplete(); //세션을 비우고 로그아웃 처리
		logger.info("[컨트롤러 : 로그아웃]");
		return shift.redirect("user", "login");	
	}
//redirect : JSP로 보내지 않고 다시 컨트롤러로 보내라는 의미의 접두사 이다. 따라서 /login은 URL을 의미한다.
	
	@RequestMapping("/nav")
	public String nav() {
		logger.info(" UserController nav()  {}.","user/mypage");
		return shift.create("common", "nav");
	}
	
	@RequestMapping("/lotto/{money}")
	public String lotto(@PathVariable String money,Model model) {
		logger.info(" UserController lotto()  {}===","ENTER");
		logger.info(" money is ${}===",money);
		lotto.setMoney(money);
		List<LottoDTO> lottos = service.createLottos(lotto);
		logger.info(" 로또 번호는 {}",lottos);
		model.addAttribute("lottos", lottos);
		model.addAttribute("money", money);
		return shift.create("lotto", "result");
	}

	@RequestMapping("/join/{id}/{pass}/{name}")
	public String join(@PathVariable("id") String id,
			@PathVariable("pass") String pass,
			@PathVariable("name") String name) {
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		cmd.setMember(member);
		mService.addMember(cmd);
		return shift.redirect("user", "login");	
	}
}
