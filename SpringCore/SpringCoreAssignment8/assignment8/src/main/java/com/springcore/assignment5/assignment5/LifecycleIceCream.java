package com.springcore.assignment5.assignment5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleIceCream {
	public static void main(String[] args) {
	try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(
			"ApplicationIceCreamContext.xml")){
		IceCream iceCream= applicationContext.getBean(IceCream.class);
		System.out.println(iceCream.getPrice());
		
	}
	}
}
