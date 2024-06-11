package com.seet20240321.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController02 {
	
	@RequestMapping("hello")
	public ModelAndView sayWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("name", "Seet5");
		mv.addObject("email","seet5@gmail.com");
		return mv;
	}
	
	@RequestMapping("calc")
	public ModelAndView findAddition(@ModelAttribute("calc") Calc calc) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Addition");
		int sum = calc.getN1() + calc.getN2();
		mv.addObject("sum", sum);		
		return mv;
	}
	
	@RequestMapping("employee")
	public ModelAndView sendEmployee(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Employee");
		
		mv.addObject("employee", employee);		
		return mv;
	}
	
	
}
