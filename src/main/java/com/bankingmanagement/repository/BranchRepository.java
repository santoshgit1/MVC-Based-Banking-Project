package com.bankingmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingmanagement.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer>{

}
