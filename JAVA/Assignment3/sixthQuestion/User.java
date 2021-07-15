package sixthQuestion;

import java.util.Objects;

public class User {
//	private String username,password;
//
//	public User(String username, String password) {
//		super();
//		this.username = username;
//		this.password = password;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(password, username);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User other = (User) obj;
//		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	private String Username;
	private String pass;
	public 	User(String name, String pass) {
		super();
		this.Username = name;
		this.pass = pass;
	}
	@Override
	public int hashCode() {
		return (int)(System.currentTimeMillis()/1000);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(Username, other.Username) && Objects.equals(pass, other.pass);
	}
	@Override
	public String toString() {
		return "" + Username;
	}

	}
	

