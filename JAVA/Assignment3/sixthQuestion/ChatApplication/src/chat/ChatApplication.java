package chat;

import java.util.Scanner;

public class ChatApplication {
public static void main(String[] args) {
		
		Users first=new Users("pranooj","12345");
		Users second=new Users("keerthana","12345");
		
		ChatRooms chat=new ChatRooms();
		int i=0;
		chat.addUsers(first);
		chat.addUsers(second);
		
		
		do {
			System.out.println("Please select your option \n 1. log in \n 0. Exit");
			Scanner sc= new Scanner(System.in);
			
			int num = sc.nextInt();
			
			if(num==1) {
				String name;
				String password;
				System.out.print("");
				String dummy = sc.nextLine();
				System.out.print("Username :");
				name = sc.nextLine();
				System.out.print("Password :");
				password = sc.nextLine();
				Users currentUser=new Users(name,password);
				if(chat.UserValidation(currentUser)) {
					int option;
					do {
						System.out.println("Please select your option: 1. Join chat \n 0. Logout");
						option = sc.nextInt();
						if(option==1) {
							  	int secondoption;
							  	do {
									System.out.println("\n\nPlease select your option \n 1. Send message \n 2. View messages\n 3. List users \n 4. Clear chat \n 0. Exit \n");
									secondoption = sc.nextInt();
									switch(secondoption) {
									  case 1:
										  String msg;
										  System.out.print(" ");
										  String sg = sc.nextLine();
										  System.out.print("Enter message : ");
										  msg = sc.nextLine();
										  chat.addMessage(currentUser,msg);
										  break;
									  case 2:
										  chat.getChat();
										  break;
									  case 3:
										  chat.getUsers();
										  break;
									  case 4:
										  chat.clearChat();
										  break;
									  case 0:
										  break;
									  default:
										  System.out.println("\n Invalid choice!\n");
										  break;
									}
							  	}while(secondoption!=0);
						}
						else {
							System.out.println("\n Invalid choice!\n");
						}
					}while(option!=0);
					
				}
				else {
					System.out.println("\nWrong UserName or Password1\n");
				}
			}
		}while(i!=0);		

	}

}
