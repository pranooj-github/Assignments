package com.springcore.assignment3.BankingApplication;

public class BankAccountController {
	BankAccount account;
	
	
public BankAccountController(BankAccount account) {
		super();
		this.account = account;
	}
public void withdraw(long account_Id,double account_balance) {
	if(account.getAccount_Id()==account_Id) 
		 System.out.println(account.getAccount_Balance()-account_balance); 
		
}
public double deposit(long account_id,double balance) {
	if(account.getAccount_Id()==account_id) 
		return account.getAccount_Balance()+balance;
		return 0;
}
public double getBalance(long accountId) {
	if(account.getAccount_Id()==accountId) 
		return account.getAccount_Balance();
		return 0;
	
}
public boolean fundTransfer(long fromAccount,long toAccount,double amount) {
	return true;
	}
}
