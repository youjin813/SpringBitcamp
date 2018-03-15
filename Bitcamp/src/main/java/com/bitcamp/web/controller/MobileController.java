package com.bitcamp.web.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.web.command.Path;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.factory.ContextFactory;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.MobileService;

@Controller
@SessionAttributes("path")
public class MobileController  { 
	 private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	    @Autowired ContextFactory factory;
	    @Autowired ShiftFactory shift;
	    @Autowired Path path;
	    @Autowired MobileService service;
	    @RequestMapping(value ="/mobile/main", method = RequestMethod.GET)
	    public String phone(Model model) {
	    	List<MobileDTO> phones = service.phones();
			model.addAttribute("phones", phones);
			return shift.create("mobile", "main");
	    }
	
}
