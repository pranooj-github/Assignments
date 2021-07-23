package com.springcore.assignment3.BankingApplication;

public class BankAccountRepositoryImpl implements BankAccountRepository{

	BankAccount account;
	
	

	@Override
	public double getBalance(long accound_Id) {
		if(account.getAccount_Id()==accound_Id) 
		return account.getAccount_Balance();
		return 0;
	
	}

	@Override
	public double updateBalance(long account_Id, double newBalance) {
		if(account.getAccount_Id()==account_Id) 
		return account.getAccount_Balance()+newBalance;
		return 0;
	}

}
