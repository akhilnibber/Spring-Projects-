package com.springcourse.Service;

import java.util.List;

import com.springcourse.model.Customer;
import com.springcourse.repositary.CustomerRepositary;


public class CustomerServiceImp implements CustomerService {
	
	private CustomerRepositary customerRepositary; 
	
	public CustomerServiceImp()
	{
		
	}
	
	public CustomerServiceImp(CustomerRepositary customerRepositary)
	{
	this.customerRepositary=customerRepositary;
	}
	
	
	public List<Customer> findAll()
	{
		return customerRepositary.findAll();
	}

	public void setCustomerRepositary(CustomerRepositary customerRepositary) {
		this.customerRepositary = customerRepositary;
	}

}
