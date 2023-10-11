package com.dl.ws.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.ws.customer.dao.CustomerDao;
import com.dl.ws.model.CustomerModel;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public String getCustomer() {
		
		return customerDao.getCustomer();
	}

	@Override
	public List<String> customerList() {
		return customerDao.customerList();
	}

	@Override
	public CustomerModel customerModel() {
		
		return customerDao.customerModel();
	}

	@Override
	public List<CustomerModel> customerModelList() {
		return customerDao.customerModelList();
	}

}
