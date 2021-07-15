package seconQuestion;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Order_Details {
	
	private static void printConditionally(List<Order> or,Predicate<Order> predicate,Supplier<String> supplier) {
		for(Order o : or)
		{
			if(predicate.test(o)) {
				System.out.println(o);
			}
		}
		System.out.println(supplier.get());
	}
	private static void printByStatus(List<Order> or,Predicate<Order> predicate) {
		for(Order o : or)
		{
			if(predicate.test(o)) {
				System.out.println(o);
			}
		}
		
	}

	public static void main(String args[])
	{
		List<Order> Orders=new ArrayList<>();
		Order s1= new Order(1,20000,"ACCEPTED");
		Order s2= new Order(2,25000,"COMPLETED");
		Order s3= new Order(3,15000,"ACCEPTED");
		Order s4= new Order(4,10000,"COMPLETED");
		Order s5= new Order(4,9000,"COMPLETED");
		Orders.add(s1);
		Orders.add(s2);
		Orders.add(s3);
		Orders.add(s4);
		Orders.add(s5);
		printConditionally(Orders, p->p.getPrice()>10000,()->"Completed");
		
		System.out.println("printing by accepeted");
		printByStatus(Orders,p->p.getStatus().equalsIgnoreCase("ACCEPTED")|| p.getStatus().equalsIgnoreCase("COMPLETED"));
	}
	
	
	
	
//	private static void printByStatus(List<Order> or,Condition condition) {
//		for(Order o : or)
//		{
//			if(condition.test(o)) {
//				System.out.println(o);
//			}
//		}
//	}
	
}
