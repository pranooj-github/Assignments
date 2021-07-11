package dessert_project;
import java.util.*;

public class DessertsItems {

	  public static void main (String args[])
	  {
		  Candy kitkat= new Candy(1,.5,10);
			Cookie bourbone= new Cookie(2,1,5);
			IceCream vannila= new IceCream(5,1,8);
			int person=0;
			do{
				int item,quantity;
				System.out.println("\n\nPlease select your role \n1. Owner \n2. Customer\n0. Exit\n");
				@SuppressWarnings("resource")
				Scanner sc= new Scanner(System.in);
				person = sc.nextInt();	
				if(person==1){
					kitkat.getDetails();
					bourbone.getDetails();
					vannila.getDetails();
					System.out.println("\nPlease select item to add");
					item = sc.nextInt();
					System.out.print("\nPlease enter quantity : ");
					quantity = sc.nextInt();
					switch(item) {
					  case 1:
					  	kitkat.add_item(quantity);
					    break;
					  case 2:
					  	bourbone.add_item(quantity);
					    break;
					  case 3:
					  	vannila.add_item(quantity);
					    break;
					  default:
					    System.out.println("\nInvalid choice.\n");
					}

				}
				else if(person==2){
					kitkat.getDetails();
					bourbone.getDetails();
					vannila.getDetails();
					System.out.println("\nPlease select an item to order 1:candy 2:cookie 3:Icecream");
					item = sc.nextInt();
					System.out.print("\nPlease enter quantity : ");
					quantity = sc.nextInt();
					switch(item) {
					  case 1:
						System.out.println("Buying Candy");
						System.out.print("\nPlease enter quantity : ");
						quantity = sc.nextInt();
					  	kitkat.buyItem(quantity);
					    break;
					  case 2:
						System.out.println("Buying Cookie");
						System.out.print("\nPlease enter quantity : ");
						quantity = sc.nextInt();
					  	bourbone.buyItem(quantity);
					    break;
					  case 3:
						System.out.println("Buying Icecreams");
						System.out.print("\nPlease enter quantity : ");
						quantity = sc.nextInt();
						vannila.buyItem(quantity);
					    break;
					  default:
					    System.out.println("\nInvalid choice.\n");
					}
				}
				else if(person!=0){
					System.out.println("\nInvalid choice.\n");
				}
			}while(person!=0);
		}
	  }

