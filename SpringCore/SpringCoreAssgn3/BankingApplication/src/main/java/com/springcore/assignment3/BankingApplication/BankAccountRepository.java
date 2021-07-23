package com.springcore.assignment3.BankingApplication;

public interface BankAccountRepository {
	public double getBalance(long accound_Id);
	public double updateBalance(long account_Id,double newBalance);
}
