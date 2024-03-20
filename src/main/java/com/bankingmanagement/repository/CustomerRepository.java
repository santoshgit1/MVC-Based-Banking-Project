package com.bankingmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingmanagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
