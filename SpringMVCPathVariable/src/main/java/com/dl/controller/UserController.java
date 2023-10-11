package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/users")
public class UserController {
	
	@RequestMapping(value="/user/{id}/{firstName}/{lastName}/{contact}/{location}", method=RequestMethod.GET)
	public ModelAndView customerDetails(@PathVariable("id")String id001,
										@PathVariable("firstName")String firstName001,
										@PathVariable("lastName")String lastName001,
										@PathVariable("contact")String contact001,
										@PathVariable("location")String location001) {
		
		ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("customerDetails");
			modelAndView.addObject("id", id001);
			modelAndView.addObject("firstName", firstName001);
			modelAndView.addObject("lastName", lastName001);
			modelAndView.addObject("contact", contact001);
			modelAndView.addObject("location", location001);
			
			//System.out.println(id);
			//System.out.println(firstName);
			//System.out.println(lastName);
			//System.out.println(contact);
			//System.out.println(location);
			System.out.println("-----------");
			
		return modelAndView;
		
	}

}

