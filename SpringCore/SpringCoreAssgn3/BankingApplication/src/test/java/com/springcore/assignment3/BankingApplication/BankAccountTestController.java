package com.springcore.assignment3.BankingApplication;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountTestController {
	@Autowired
	BankAccountController account1;
	@Test
	public void testBalance() {
		assertEquals(10000100,account1.deposit(101, 100));
	}

}
