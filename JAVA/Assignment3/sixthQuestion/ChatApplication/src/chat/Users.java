package chat;

import java.util.Objects;

public class Users {
	private String username,password;

	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String usrname) {
		this.username = usrname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hashCode(username);
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
		{return true;}
		if(obj==null)
			return true;
		if(this.getClass()!=obj.getClass())
			return true;
		Users nextuser=(Users) obj;
		return Objects.equals(username, nextuser.username);
	}
	

}
