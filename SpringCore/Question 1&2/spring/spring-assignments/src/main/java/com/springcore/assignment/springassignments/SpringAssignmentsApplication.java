package com.springcore.assignment.springassignments;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAssignmentsApplication {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(
				"applicationContext.xml")){
			Customer customer= applicationContext.getBean(Customer.class);
			customer.displayCustomerDetails();
			
		}
	}

}
