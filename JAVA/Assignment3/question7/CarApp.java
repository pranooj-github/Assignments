package assignments7;

import java.util.Scanner;

public class CarApp {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		ParkedCarOwerList plist=new ParkedCarOwerList();
		int option;
		do {
			System.out.println("Please select your option \n 1.Park car \n 2. Get car \n 3.Remove car\n0. Exit");
			option=s.nextInt();
			switch(option)
			{
			case 1: 
				Tocken tocken=new Tocken();
				int i=tocken.getTocken();
				if(i<=240)
				{
				Parked_CarOwner_Details obj=new Parked_CarOwner_Details();
				    System.out.println("");
				    String n=s.nextLine();
					System.out.println("Enter Your name: ");
					String name=s.nextLine();
					obj.setName(name);
					System.out.println("Enter Your address: ");
					String address=s.nextLine();
					obj.setAddress(address);
					System.out.println("Enter Your carmodel: ");
					String model=s.nextLine();
					obj.setModel(model);
					System.out.println("Enter Your Phone number: ");
					int number=s.nextInt();
					obj.setPhn_number(number);
					
					
					plist.add_new_car(i, obj);
					}
					else
					{System.out.println("No tocken available");}
					break;
			case 2 : System.out.println("enter your tocken");
					int tok=s.nextInt();
					plist.findCarLocation(tok);
					break;
			case 3 : System.out.println("Remove car");
					int toc=s.nextInt();
					plist.remove_car(toc);
			case 0: break;
			default: System.out.println("wrong");
				break;
					
		    }
		}while(option!=0);
		
	}

}
