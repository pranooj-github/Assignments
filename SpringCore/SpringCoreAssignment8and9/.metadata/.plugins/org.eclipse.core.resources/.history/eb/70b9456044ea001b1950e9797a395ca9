package com.springcore.assignment5.assignment5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(
				"ApplicationContext.xml")){
			Chocolate chocolate= applicationContext.getBean(Chocolate.class);
			System.out.println(chocolate.getPrice());
			
		}
	}

}
