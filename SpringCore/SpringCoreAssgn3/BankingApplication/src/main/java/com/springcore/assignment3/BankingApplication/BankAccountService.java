package com.springcore.assignment3.BankingApplication;

public interface BankAccountService {
	public double withdraw(long account_Id,double balance);
	public double deposit(long account_id,double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount,long toAccount,double amount);
}
