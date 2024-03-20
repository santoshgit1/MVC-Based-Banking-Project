package com.bankingmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class Loan {

    @Id
    @Column(name = "loan_id")
    private int id;

    @Column(name = "loan_type")
    private String type;

    @Column(name = "loan_amt")
    private long amount;

    @Column(name="branch_id")
    private int branchId;
    
    @Column(name="cust_id")
	private int customerId;
	
    public Loan() {
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
    
}
