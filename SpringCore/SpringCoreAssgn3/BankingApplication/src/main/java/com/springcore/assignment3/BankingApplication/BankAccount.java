package com.springcore.assignment3.BankingApplication;

public class BankAccount {
	long account_Id;
	String account_holder,account_type;
	double account_Balance;
	public BankAccount(long account_Id, String account_holder, String account_type, double account_Balance) {
		super();
		this.account_Id = account_Id;
		this.account_holder = account_holder;
		this.account_type = account_type;
		this.account_Balance = account_Balance;
	}
	public long getAccount_Id() {
		return account_Id;
	}
	public void setAccount_Id(long account_Id) {
		this.account_Id = account_Id;
	}
	public String getAccount_holder() {
		return account_holder;
	}
	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public double getAccount_Balance() {
		return account_Balance;
	}
	public void setAccount_Balance(double account_Balance) {
		this.account_Balance = account_Balance;
	}
	
	
	
}
