package com.bankingmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingmanagement.entity.Branch;
import com.bankingmanagement.repository.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService{

	@Autowired
	BranchRepository branchRepo;

	@Override
	public List<Branch> getAllBranches() {
		return branchRepo.findAll();
	}
	
	
}
