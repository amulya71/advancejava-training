package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {

		@RequestMapping("/customerDetails")
		public ModelAndView customerDetails() {
			System.out.println("---");
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("customerDetails");
			modelAndView.addObject("id", 101);
			modelAndView.addObject("firstName", "Sai");
			modelAndView.addObject("lastName", "Kiran");
			modelAndView.addObject("contactNumber", 9876543210L);
			modelAndView.addObject("location", "Hyd");

			return modelAndView;

		}

	}

