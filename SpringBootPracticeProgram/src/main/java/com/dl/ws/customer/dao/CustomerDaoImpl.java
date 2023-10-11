package com.dl.ws.customer.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dl.ws.model.CustomerModel;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public String getCustomer() {
		String CustomerName = "Reuben";
		return CustomerName;
	}

	@Override
	public List<String> customerList() {
		List<String> customerList = new ArrayList<>();
		customerList.add("Hansna");
		customerList.add("Amulya");
		return customerList;
	}

	@Override
	public CustomerModel customerModel() {
		CustomerModel customerModel = new CustomerModel();
		customerModel.setFirstName("Amulya");
		customerModel.setLastName("Kasukurthi");
		customerModel.setId(1);
		customerModel.setContact(7483501539L);
		customerModel.setLocation("Hyd");
		return customerModel;
	}

	@Override
	public List<CustomerModel> customerModelList() {
		List<CustomerModel> customerModels = new ArrayList<>();
		// Create three CustomerModel instances
		CustomerModel customer1 = new CustomerModel(1, "John", "Doe", 1234567890L, "New York");
		CustomerModel customer2 = new CustomerModel(2, "Jane", "Smith", 9876543210L, "Los Angeles");
		CustomerModel customer3 = new CustomerModel(3, "Alice", "Johnson", 5555555555L, "Chicago");

		// Add the CustomerModel instances to the customerModels list
		customerModels.add(customer1);
		customerModels.add(customer2);
		customerModels.add(customer3);
		return customerModels;
	}

}
