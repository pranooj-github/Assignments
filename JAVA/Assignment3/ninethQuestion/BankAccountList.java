package ninethQuestion;

import java.util.TreeSet;

import firstQuestion.Person;

import java.util.Iterator;
import java.util.Set;

public class BankAccountList {
	public static void main(String args[]) {
		Set<SavingAccount> acc=new TreeSet<SavingAccount>();
		SavingAccount sc1= new SavingAccount(1,"PranoojPV",25000,true);
		SavingAccount sc2= new SavingAccount(3,"PranoojPV",30000,true);
		SavingAccount sc3= new SavingAccount(2,"Jithin",20000,true);
		SavingAccount sc4= new SavingAccount(2,"Arya",20000,true);
		
		acc.add(sc1);
		acc.add(sc2);
		acc.add(sc3);
		sc1.deposit(1000);
		//enter acc no  say "number"
		//Iterator<Integer> iterator = acc.iterator(); or
		for (SavingAccount value : acc) {
	    if(value.getAcc_id()==1){sc1.deposit(1000);}}
	
		for(SavingAccount sav: acc)
        {
        	System.out.println(sav);
        }
		
	}
}
