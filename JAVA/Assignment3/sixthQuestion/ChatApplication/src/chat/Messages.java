package chat;

public class Messages {
	private Users user;
	private String messages;
	private long time;
	public Messages(Users user, String messages) {
		super();
		this.user = user;
		this.messages = messages;
		this.time=System.currentTimeMillis();
	}
	@Override
	public String toString() {
		return "user=" + user + ", message=" + messages;
	}
	

}
