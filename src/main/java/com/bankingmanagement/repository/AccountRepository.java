package com.bankingmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingmanagement.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
