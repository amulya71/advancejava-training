package com.dl.ws.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.ws.customer.service.CustomerService;
import com.dl.ws.model.CustomerModel;

@RestController
@RequestMapping(path = "/customer")
public class CustomerContoller {

	@Autowired
	private CustomerService customerservice;
	
	//single customer
	@GetMapping(value = "/getcustomer", produces = MediaType.APPLICATION_JSON)
	public String getCustomer() {
		return customerservice.getCustomer();
	}
	
	//multiple customer
	@GetMapping(value = "/customerlist", produces = MediaType.APPLICATION_JSON)
	public List<String> customerList() {
		return customerservice.customerList();
	}
	
	@GetMapping(value = "/customermodel", produces = MediaType.APPLICATION_JSON)
	public CustomerModel customerModel() {
		return customerservice.customerModel();
	}
	
	@GetMapping(value = "/customermodellist", produces = MediaType.APPLICATION_JSON)
	public List<CustomerModel> customerModelList() {
		return customerservice.customerModelList();
	}

}
