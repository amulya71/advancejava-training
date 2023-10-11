package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Hotel {
	
	@RequestMapping("/customerDetails")
	public ModelAndView customerDetails(ModelAndView modelAndView) {
		
		//ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("customerDetails");
		modelAndView.addObject("id", 101);
		modelAndView.addObject("firstName", "Sai");
		modelAndView.addObject("lastName", "Kiran");
		modelAndView.addObject("contactNumber", 9876543210L);
		modelAndView.addObject("location", "Hyd");
		
		
		return modelAndView;
		
	}
}

//ModelLayer(Hotel)
//ControllerLayer(Hotel)
