package com.springcore.assignment5.assignment5;

public class Chocolate {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Chocolate() {
		super();
	}

	@Override
	public String toString() {
		return "Chocolate [price=" + price + "]";
	}
	public void init()
	{
		System.out.println("Inside init method");
	}
	public void destroy()
	{
		System.out.println("Inside destroy");
	}
	
}
