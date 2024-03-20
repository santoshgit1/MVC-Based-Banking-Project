package com.bankingmanagement.service;

import java.util.List;
import java.util.Optional;

import com.bankingmanagement.entity.Bank;

public interface BankService {

	List<Bank> getAllBanks();
	int deleteBank(int id);
	Bank saveBank(Bank bank);
    Optional<Bank> getBankById(int id);
    Optional<Bank> getBankByName(String name);
}
