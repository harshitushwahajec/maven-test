package com.harshit.repository;

import java.util.ArrayList;
import java.util.List;

import com.harshit.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.harshit.repository.CustomerRepository#getCustomers()
	 */
	@Override
	public List<Customer> findAll(){
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer c = new Customer();
		c.setFirstName("Harshit");
		c.setLastName("Kushwaha");
		customers.add(c);
		
		return customers;
	}
	
}
