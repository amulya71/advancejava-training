package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dl.model.StudentModel;

@Controller
@RequestMapping("/")
public class StudentController {

	@RequestMapping(value = "/registrationForm", method = RequestMethod.GET)
	public ModelAndView registrationForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("registrationForm");
		// modelAndView.addObject("id", 101);

		return modelAndView;
	}

	@RequestMapping(value = "/studentvalues", method = RequestMethod.POST)
	public ModelAndView studentvalues(@ModelAttribute("student") StudentModel studentmodel) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("studentform");
		modelAndView.addObject("student", studentmodel);
		return modelAndView;

	}

}
