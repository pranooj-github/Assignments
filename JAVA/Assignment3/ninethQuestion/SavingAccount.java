package ninethQuestion;

import java.util.Objects;

import firstQuestion.Person;

public class SavingAccount implements Comparable<SavingAccount>{
	long acc_balance;
	int acc_id;
	String name;
	boolean isSalaryAccount;
	
	public SavingAccount(int acc_id,String name,long acc_balance, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		this.name = name;
		this.isSalaryAccount = isSalaryAccount;
	}
	public long getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(long acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	public void deposit(long amount)
	{
		long bal=this.acc_balance+amount;
		System.out.println("Ammount Successfully added current balance is: "+bal);
	}
	public void withdraw(long amount)
	{
		if(this.acc_balance>amount) {
			this.acc_balance -= amount;
		System.out.println("Ammount withdraw Successfull current balance is: "+this.acc_balance);
	}
		else
			System.out.println("Balance in sufficient");
	}
	
		
	
	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_id=" + acc_id + ", name=" + name
				+ ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.acc_id);
	}
	@Override
	public int compareTo(SavingAccount o) {
		return this.acc_id- o.getAcc_id();
		
	}
	public void display() {
		System.out.println("Id: "+getAcc_id()+" name "+getName()+" Balance "+getAcc_balance());
	}
	
}
