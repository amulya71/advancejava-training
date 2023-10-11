package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {

	public static final String ID = "1230123";
	public static final String F_NAME = "Reuben";
	public static final String L_NAME = "Kumar";
	public static final String CONTACT = "10/10/23";
	public static final String LOCATATION = "OGL";

	@RequestMapping(value = "/one", method = RequestMethod.GET)
	ModelAndView test1(ModelAndView modelAndView) {

		
		modelAndView.addObject("id", ID);
		modelAndView.addObject("firstName", F_NAME);
		modelAndView.addObject("lastName", L_NAME);
		modelAndView.addObject("contact", CONTACT);
		modelAndView.addObject("location", LOCATATION);

		System.out.println("Test 1 ran");
		modelAndView.setViewName("customerDetails");
		return modelAndView;
	}

	@RequestMapping(value = "/two", method = RequestMethod.GET)
	ModelAndView test2(	
			@PathVariable int id, 
			@PathVariable String fName, 
			@PathVariable String lName, 
			@PathVariable String contact,
			@PathVariable String location) {
		
		
		ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("customerDetails");
			modelAndView.addObject("id", id);
			modelAndView.addObject("firstName", fName);
			modelAndView.addObject("lastName", lName);
			modelAndView.addObject("contact", contact);
			modelAndView.addObject("location", location);
			
			System.out.println("Test 2 ran");
		return modelAndView;
	}
	
	@RequestMapping(value = "/three/{id}/{firstName}/{lastName}/{contact}/{location}", method = RequestMethod.GET)
	ModelAndView test3(	
			@PathVariable String id, 
			@PathVariable String firstName, 
			@PathVariable String lastName, 
			@PathVariable String contact,
			@PathVariable String location) {
		
		
		ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("test3");
			modelAndView.addObject("id", id);
			modelAndView.addObject("firstName", firstName);
			modelAndView.addObject("lastName", lastName);
			modelAndView.addObject("contact", contact);
			modelAndView.addObject("location", location);
			
			System.out.println("I'm test 3");

			return modelAndView;
	}
	
	@RequestMapping(value = "/four/{id}/{firstName}/{lastName}/{contact}/{location}", method = RequestMethod.GET)
	ModelAndView test4(	
			@PathVariable String id, 
			@PathVariable String firstName, 
			@PathVariable String lastName, 
			@PathVariable String contact,
			@PathVariable String location) {
		
		
		ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("customerDetails");
			modelAndView.addObject("id", id);
			modelAndView.addObject("firstName", firstName);
			modelAndView.addObject("lastName", lastName);
			modelAndView.addObject("contact", contact);
			modelAndView.addObject("location", location);
			

			return modelAndView;
	}

}
