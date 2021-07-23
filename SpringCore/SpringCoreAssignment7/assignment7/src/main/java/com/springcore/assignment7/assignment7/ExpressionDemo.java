package com.springcore.assignment7.assignment7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExpressionDemo {
	@Value("#{42+21}")
	private int x;
	@Value("#{40/10}")
	private int y;
	@Value("#{ T(java.lang.Math).PI}")
	private double z;
	@Value("#{ T(java.lang.Math).sqrt(121) }")
	private int a;
	@Value("#{ new java.lang.String('Pineapple')}")
	private String fruit;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	
}
