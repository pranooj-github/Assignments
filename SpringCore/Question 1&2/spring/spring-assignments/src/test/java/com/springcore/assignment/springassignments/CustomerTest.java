package com.springcore.assignment.springassignments;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)

@ContextConfiguration(locations="/applicationContext.xml")
public class CustomerTest {
	@Autowired
	Customer customer;

	@Test
	public void testDisplay() {
		//fail("Not yet implemented");
		
		String[] expected= {"6","Pranooj","thalassery"};
		String[] real=customer.displayCustomerDetails();
		assertArrayEquals(expected, real);
	}

}
