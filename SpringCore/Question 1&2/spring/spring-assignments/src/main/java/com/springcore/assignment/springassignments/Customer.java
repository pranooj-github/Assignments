package com.springcore.assignment.springassignments;


public class Customer {
String customer_id;
String customerName,customerAddress;
String customerContact;


Address address;


//public Customer() {
//	
//}
public Customer(String customer_id, String customerName, String customerAddress, String customerContact, Address address) {
	
	this.customer_id = customer_id;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.customerContact = customerContact;
	this.address = address;
}

//public String getCustomer_id() {
//	return customer_id;
//}
//public void setCustomer_id(String customer_id) {
//	this.customer_id = customer_id;
//}
//public String getCustomerName() {
//	return customerName;
//}
//public void setCustomerName(String customerName) {
//	this.customerName = customerName;
//}
//public String getCustomerAddress() {
//	return customerAddress;
//}
//public void setCustomerAddress(String customerAddress) {
//	this.customerAddress = customerAddress;
//}
//public String getCustomerContact() {
//	return customerContact;
//}
//public void setCustomerContact(String customerContact) {
//	this.customerContact = customerContact;
//}
//public Address getAddress() {
//	return address;
//}
//public void setAddress(Address address) {
//	this.address = address;
//}
public String[] displayCustomerDetails()
{
	System.out.println("customer_id  "+customer_id+"  customerName  "+customerName+"  Contact  "+customerContact);
	System.out.println("****Address*****");
	System.out.println("House/Flatname:  "+customerAddress+"  city:  "+address.getCity()+"  state  "+address.getState()+"  country  "+address.getCountry()+"  zip code:  "+address.getZip());
	String[] array= {customer_id,customerName,address.getCity()};
	return array;
}


}
