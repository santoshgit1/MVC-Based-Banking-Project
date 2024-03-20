package com.bankingmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank")
public class Bank {

	@Id
	@Column(name="bank_id")
	private int id;
	
	@Column(name="bank_name")
	private String name;
	
	@Column(name="bank_address")
	private String address;
	
	public Bank() {
		
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
	
	
}
