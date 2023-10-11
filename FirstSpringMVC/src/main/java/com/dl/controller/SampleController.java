package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/sample")
public class SampleController {

	@RequestMapping(value = "/test")
	public String hello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC");
		model.addAttribute("id", 101);
		model.addAttribute("firstName", "Sai");
		model.addAttribute("lastName", "Kiran");
		model.addAttribute("contact", 9876543210L);
		model.addAttribute("location", "Hyd");
		System.out.println("---");
		return "hello";
		
	}

	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {
		model.addAttribute("message", "welcome Spring MVC");
		return "welcome";
	}
}
