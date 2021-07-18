package chat;

import java.util.ArrayList;
import java.util.List;

public class ChatRooms {
	private List<Users> users= new ArrayList<>();
	private List<Messages> chatroom = new ArrayList<>();
	

	public void addUsers(Users user) {
		this.users.add(user);
	}
	
	public void getUsers() {
		for(Users use : users){
			System.out.println(use);
		}
	}

	public boolean UserValidation(Users use) {
		if(this.users.contains(use)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public void addMessage(Users use,String msg) {
		this.chatroom.add(new Messages(use,msg));	
	}
	
	public void getChat() {

		for(Messages chats : chatroom){
			System.out.println(chats);	
		}	
	}
	
	public void clearChat() {
		this.chatroom.clear();
	}
}
