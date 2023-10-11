package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/basics")
public class HelloControllerClassLevel {
	//private static final Logger logger = LogManager.getLogger(ExampleClass.class);
	
	@RequestMapping(method=RequestMethod.GET)
	public String hello(Model model) {
		
		model.addAttribute("sampletext", "Hello Spring MVC");
		System.out.println("I'm in controller..!!!");
		return "hello";
		
	}
}
