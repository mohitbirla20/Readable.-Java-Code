package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.CustomerDao;
import com.masai.dao.SessionDao;
import com.masai.exception.CustomerException;
import com.masai.model.CurrentUserSession;
import com.masai.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao cd;
	
	@Autowired
	private SessionDao sd;
	
	@Override
	public Customer createCustomer(Customer customer) throws CustomerException {
	
		Customer existingCustomer= cd.findByMobileNo(customer.getMobileNo());
	
		if(existingCustomer != null) 
			throw new CustomerException("Customer Already Registered with Mobile number");
		
			return cd.save(customer);
			
	}

	@Override
	public Customer updateCustomer(Customer customer, String key) throws CustomerException {
	  
		CurrentUserSession logedInUser = sd.findByUuid(key);
		
		if(logedInUser == null) {
			throw new CustomerException("Please provide a valid key to update a customer");
		}
		
		if(customer.getCustomerId() == logedInUser.getUserId())
			return cd.save(customer);
		
		throw new CustomerException("Invalid Customer Details, please login first");
	}

}
