package com.springcourse.Service;

import java.util.List;

import com.springcourse.model.Customer;
import com.springcourse.repositary.CustomerRepositary;
import com.springcourse.repositary.CustomerRepositaryImp;

public class CustomerServiceImp implements CustomerService {
	
	private CustomerRepositary cr=new CustomerRepositaryImp();
	
	public List<Customer> findAll()
	{
		return cr.findAll();
	}

}
