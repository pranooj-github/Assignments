package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TraderMain {
	public static  void main(String args[])
	{
		List <Traders> trade=new ArrayList<>();	
		trade.add(new Traders("pranooj","kerala"));
		trade.add(new Traders("manoj","pune"));
		trade.add(new Traders("ram","delhi"));
		trade.add(new Traders("manu","kerala"));
		trade.add(new Traders("ravi","delhi"));
		trade.add(new Traders("regu","pune"));
		Set city=trade.stream()
		.collect(Collectors.groupingBy(Traders::getCity,Collectors.counting())).keySet();
        System.out.println("Unique Cities where the traders work: "+city);
        
        System.out.println("*****************************");
        
        List<Traders> cities=trade.stream()
        	.filter(t->t.getCity()=="pune")
        	.sorted(Comparator.comparing(Traders::getName).reversed())
        	.collect(Collectors.toList());
        System.out.println(cities);
        
        System.out.println("*****************************");
        
        trade.stream()
        .map(Traders::getName)
        .sorted()
        .forEach(System.out::println);
        
        System.out.println("*****************************");
       
        boolean value= trade.stream()
        		.anyMatch(cit-> cit.getCity().matches("Indore"));
        
        
        if(value)
        { System.out.println("Present");}
        else
        {System.out.println("Not Present");}
        
        System.out.println("*****************************");
        
        
		
	}
	
}
