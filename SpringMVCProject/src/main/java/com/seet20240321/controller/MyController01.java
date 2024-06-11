package com.seet20240321.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController01 {
	
	@RequestMapping("welcome")
	public ModelAndView sayWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		return mv;
	}
}
