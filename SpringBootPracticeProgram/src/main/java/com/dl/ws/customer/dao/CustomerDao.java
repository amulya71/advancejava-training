package com.dl.ws.customer.dao;

import java.util.List;

import com.dl.ws.model.CustomerModel;

public interface CustomerDao {

	public String getCustomer();
	
	public  List<String> customerList();
	
	public CustomerModel customerModel();
	
	public List<CustomerModel> customerModelList();
}

