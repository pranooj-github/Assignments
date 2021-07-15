package fourthQuestion;

import java.util.HashMap;

public class Employee {
	public static void main(String args[])
	{
		HashMap<Date,String> details=new HashMap<>();
		
		details.put(new Date(1,2,2012),"Vebinooj");
		details.put(new Date(1,2,2012),"Manoj");
		details.put(new Date(13,6,1998),"Pranooj");
		System.out.println(details);
		System.out.println("using get");
		System.out.println(details.keySet());
		
		
	}
}
