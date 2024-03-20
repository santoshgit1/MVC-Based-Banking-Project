package com.bankingmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingmanagement.entity.Bank;
import com.bankingmanagement.repository.BankRepository;

@Service
public class BankServiceImpl implements BankService{
	
	@Autowired
	BankRepository bankRepo;

	@Override
	public List<Bank> getAllBanks() {
		
//		List<Bank> newList= new ArrayList<Bank>();
//		Bank b1= new Bank();
//		Bank b2= new Bank();
//		Bank b3= new Bank();
//		
//		b1.setName("HDFC");
//		b1.setId(1);
//		b1.setAddress("Nagpur");
//		
//		b2.setName("IndudInd");
//		b2.setId(2);
//		b2.setAddress("Delhi");
//		
//		b3.setName("BOM");
//		b3.setId(3);
//		b3.setAddress("Mumbai");
//		
//		newList.add(b1);
//		newList.add(b2);
//		newList.add(b3);
		return bankRepo.findAll();
	}

	@Override
	public int deleteBank(int id) {
		bankRepo.deleteById(id);
		return 0;
		
	}

	@Override
	public Bank saveBank(Bank bank) {
		return bankRepo.save(bank);
	}

	@Override
	public Optional<Bank> getBankById(int id) {
		
		return bankRepo.findById(id);
	}

	@Override
	public Optional<Bank> getBankByName(String name) {
		return bankRepo.findByName(name);
	}


}
