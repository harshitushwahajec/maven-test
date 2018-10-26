package com.harshit.service;

import java.util.List;

import com.harshit.model.Customer;
import com.harshit.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public CustomerServiceImpl() {

	}

	@Override
	public List<Customer> findAll() {
		// CustomerRepository customerRepository = new CustomerRepositoryImpl();
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
