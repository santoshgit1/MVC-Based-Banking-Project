package com.bankingmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingmanagement.entity.Account;
import com.bankingmanagement.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository accRepo;

	@Override
	public List<Account> getAllAccounts() {
		return accRepo.findAll();
	}
	
	
}
