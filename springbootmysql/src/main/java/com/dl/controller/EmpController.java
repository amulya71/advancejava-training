package com.dl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.model.EmpModel;
import com.dl.service.EmpService;

@RestController
@RequestMapping(value = "/api/v2")
public class EmpController {

	@Autowired
	EmpService empService;

	@GetMapping("/emp")
	public List<EmpModel> getEmployee() {
		return empService.getEmployee();

	}

}
