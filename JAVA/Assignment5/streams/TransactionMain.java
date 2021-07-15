package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionMain {
	public static void main(String args[])
	{
	   List<Transaction> transaction=new ArrayList<>();
	   transaction.add(new Transaction(new Traders("Manoj","kerala"),2020,120000));
	   transaction.add(new Transaction(new Traders("Ramesh","pune"),2019,121000));
	   transaction.add(new Transaction(new Traders("Raj","delhi"),2011,110000));
	   transaction.add(new Transaction(new Traders("Gopi","delhi"),2011,10000));
	   
	   
	   System.out.println("*****************************");
	   
	   List<Transaction>years=transaction.stream()
	   .filter(s-> s.getYear()==2011)
	   .sorted(Comparator.comparingInt(Transaction::getYear))
	   .collect(Collectors.toList());
	   
	   System.out.println(years);
	   
	   
	   System.out.println("*****************************");
	   
	    transaction.stream()
	   .max(Comparator.comparingInt(Transaction::getValue))
	   .map(x->x.getValue())
	   .stream()
	   .forEach(s->System.out.println(s));
	   
	   System.out.println("*****************************");
	   transaction.stream()
	   .min(Comparator.comparingInt(Transaction::getValue))
	   .map(x->x.getValue())
	   .stream()
	   .forEach(s->System.out.println(s));
	   
	   
	   System.out.println("*****************************");
	}
}
