package com.bankingmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingmanagement.entity.Loan;
import com.bankingmanagement.repository.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService{

	@Autowired
	LoanRepository loanRepo;

	@Override
	public List<Loan> getAllLoans() {
		return loanRepo.findAll();
	}
	
	
}
