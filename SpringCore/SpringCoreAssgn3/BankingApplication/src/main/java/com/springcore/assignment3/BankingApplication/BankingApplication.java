package com.springcore.assignment3.BankingApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BankingApplication {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(
				"applicationContext.xml")){
			BankAccountController controller= applicationContext.getBean(BankAccountController.class);
			double n=controller.getBalance(101);
			System.out.println("balance is = "+n);
			double deposite=controller.deposit(101, 100);
			System.out.println("new amount : "+deposite);
			controller.withdraw(101, 1000);;
			
			
			
			
		}
	}

}
