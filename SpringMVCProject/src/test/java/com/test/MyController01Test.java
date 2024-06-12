package com.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.seet20240321.controller.MyController01;

public class MyController01Test {

	@Test
	public void testSayWelcome1() {
		//fail("Not yet implemented");
		MyController01 cont = new MyController01();
		ModelAndView actual =  cont.sayWelcome();
		assertNotNull(actual);
	}
	
	@Test
	public void testSayWelcome2() {
		MyController01 cont = new MyController01();
		ModelAndView mv =  cont.sayWelcome();
		String actual = mv.getViewName();
		String expected = "welcome";
		assertEquals(expected, actual);
	}

}
