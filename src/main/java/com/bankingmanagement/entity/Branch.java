package com.bankingmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch")
public class Branch {

	@Id
	@Column(name="branch_id")
	private int id;
	
	@Column(name="branch_name")
	private String name;
	
	@Column(name="branch_address")
	private String address;
	
	@Column(name="bank_id")
	private String bankId;
	
	public Branch() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	
	
}
