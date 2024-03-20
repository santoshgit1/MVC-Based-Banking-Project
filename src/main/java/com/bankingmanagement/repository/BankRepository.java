package com.bankingmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingmanagement.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer>{
	
	Optional<Bank> findByName(String name);

}
