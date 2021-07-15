package assignments7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkedCarOwerList {

	public Map<Integer,Parked_CarOwner_Details> list=new HashMap<>();
	public void add_new_car(int t,Parked_CarOwner_Details det) {
		this.list.putIfAbsent(t,det);
		System.out.println("Parked successfully");
		System.out.println("Your tocken or slot number: "+t);
		System.out.println(list.get(t));
		;
		
		}
	public void remove_car(int tk)
	{
		this.list.remove(tk);
	}
	public void findCarLocation(int tok)
	{
		if(tok<=80)
		{
			System.out.println("Car is parked on the first floor");
		}
		else if(tok >80 && tok<=160) {
			System.out.println("Car is parked on the Second floor");
		}
		else if(tok >160 && tok<=240)
		{System.out.println("Car is parked on the Third floor");}
		else {
			System.out.println("No such parking");
		}
	}
	
}
