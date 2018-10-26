package com.harshit.repository;

import java.util.List;

import com.harshit.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}