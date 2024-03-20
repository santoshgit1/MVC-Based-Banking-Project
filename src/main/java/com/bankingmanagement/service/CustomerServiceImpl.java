package com.bankingmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingmanagement.entity.Customer;
import com.bankingmanagement.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository custRepo;

	@Override
	public List<Customer> getAllCustomers() {
		return custRepo.findAll();
	}
	
	
}
