package com.dl.ws.customer.service;

import java.util.List;

import com.dl.ws.model.CustomerModel;

public interface CustomerService {
	
	public String getCustomer();
	
	public  List<String> customerList();
		
	public CustomerModel customerModel();
	
	public List<CustomerModel> customerModelList();

}
