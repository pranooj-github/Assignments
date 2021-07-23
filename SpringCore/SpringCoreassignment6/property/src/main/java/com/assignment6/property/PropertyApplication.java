package com.assignment6.property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:dbconfig.properties")

public class PropertyApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext run = new AnnotationConfigApplicationContext(PropertyApplication.class);
		PropertyService property = run.getBean(PropertyService.class);
		System.out.println(property.toString());

	}
}
