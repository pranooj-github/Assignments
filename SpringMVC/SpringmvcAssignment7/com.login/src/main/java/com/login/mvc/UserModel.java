package com.login.mvc;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@CityZipCodeValidator(city = "city", zipCode = "zipcode", message = "* Zipcode does not match with City!")
public class UserModel {
	
	
	
	@Size(min= 8,max=20,message="user name should be between 3-12 characters !!")
	private String username;
	
	@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$",message="Enter valide password")
	private String password;
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="Invalid Email")
	private String email;
	//@Pattern(regexp="\r\n"+ "^((\\+)?(\\d{2}[-]))?(\\d{10}){1}?$",message="Type correct number")
	@Contact  //custom validation
	private String contact;
	private String city;
	@Pattern(regexp="^[0-9]",message="type numbers only")
	private String zip;
	

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	@Override
	public String toString() {
		return "UserModel [username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	
	
	

}
