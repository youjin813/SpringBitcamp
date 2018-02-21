package com.bitcamp.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.web.factory.ContextFactory;

@Controller
public class HomeController {
    
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @Autowired ContextFactory contextFactory;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);
        
        model.addAttribute("serverTime", new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm")
                .format(new Date()));
        model.addAttribute("context",(String) contextFactory.create());
        return "index";
    }
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(Model model) {
        logger.info(" Move To {} ", "main/home");
        model.addAttribute("context",(String) contextFactory.create());
        model.addAttribute("js", contextFactory.path("js"));
        model.addAttribute("css", contextFactory.path("css"));
        model.addAttribute("img", contextFactory.path("img"));
        return "main/home";
    }
}