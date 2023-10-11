package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/users")
public class UserController {
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public ModelAndView customerDetails(
			@RequestParam(value="Id", defaultValue = "101") int id,
			@RequestParam(value="FirstName", defaultValue = "Sai") String firstName,
			@RequestParam(value="LastName", defaultValue = "Kiran") String lastName,
			@RequestParam (value = "Contact", defaultValue = "9876543210")long contact,
			@RequestParam(value = "Location", defaultValue = "Hyd") String location)  {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("customerDetails");
		modelAndView.addObject("id",id);
		modelAndView.addObject("firstName", firstName);
		modelAndView.addObject("lastName", lastName);
		modelAndView.addObject("contact", contact);
		modelAndView.addObject("location", location);
		
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(contact);
		System.out.println(location);
		System.out.println("+++++");
		
		return modelAndView;
		
		
	}
	
	@RequestMapping(value = "/user/{uid}", method = RequestMethod.GET)
	public ModelAndView customerDetailsTest(@PathVariable(value = "uid") String uid,
	                                        @RequestParam(value = "name") String name) {

	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("userId", uid);
	    modelAndView.addObject("name", name);

	    System.out.println("---In Demo Method---");

	    modelAndView.setViewName("customerInfo");
	    return modelAndView;
	}


}
