package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.TxService;
@SessionAttributes("user")
@Controller
public class TxController {
	private static final Logger logger = LoggerFactory.getLogger(TxController.class);
	@Autowired ShiftFactory shift;
	@Autowired TxDTO tx;
	@Autowired TxService service;
	@Autowired Command cmd;
	
	@RequestMapping(value="/mobile/open",method=RequestMethod.POST)
	public String open(Model model,
			@RequestParam("seq") String seq,
			@RequestParam("telecom") String telecom,
			@ModelAttribute("user") MemberDTO member) {
		
		 tx.setTxKey(member.getId()+seq);
		 tx.setId(member.getId());
		 tx.setPhoneNum(service.createPhoneNum());
		 tx.setTelecom(telecom);
		 logger.info(" 모바일 컨트롤러 open 에 들어온seq {}",seq);
		 logger.info(" 모바일 컨트롤러 open 에 들어온telecom {}",telecom);
		 logger.info(" 모바일 컨트롤러 open 에 들어온seq {}",tx.getTxKey());
		 logger.info(" 모바일 컨트롤러 open 에 들어온telecom {}",tx.getPhoneNum());
		 logger.info(" 모바일 컨트롤러 open 에 들어온seq {}",tx.getCount());
		 logger.info(" 모바일 컨트롤러 open 에 들어온telecom {}", tx.getTotal());
		 System.out.println("핸드폰번호 "+tx.getPhoneNum());
		// System.out.println("핸드폰 아이디 "+tx.getPhoneId());
		 System.out.println("통신사 "+tx.getTelecom());
		// System.out.println("시퀀스 "+tx.getSeq());
		 System.out.println("멤버ID "+tx.getId());
		 cmd.setTx(tx);
		 service.openPhone(cmd);
		 return shift.create("user", "mypage");
		
	}
}