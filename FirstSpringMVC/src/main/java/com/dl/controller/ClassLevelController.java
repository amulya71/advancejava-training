package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/classlevel")
public class ClassLevelController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("classlevel");
		modelAndView.addObject("message", "Welcome to Spring MVC");
		
		return modelAndView;
		
	}

}
