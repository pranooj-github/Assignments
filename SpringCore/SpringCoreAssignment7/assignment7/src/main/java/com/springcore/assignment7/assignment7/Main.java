package com.springcore.assignment7.assignment7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	

		public static void main(String[] args) {
			try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Expression.xml")){
				ExpressionDemo demo =context.getBean(ExpressionDemo.class);
				System.out.println(demo);
			
			}
		

	
		}
}
