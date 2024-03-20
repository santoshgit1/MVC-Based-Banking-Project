package com.bankingmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingmanagement.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer>{

}
