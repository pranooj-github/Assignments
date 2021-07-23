package com.springcore.assignment5.assignment5;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class IceCream {
private String flavour;
private int price;
public String getFlavour() {
	return flavour;
}
public void setFlavour(String flavour) {
	this.flavour = flavour;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public IceCream() {
	super();
}
@PostConstruct
public void start()
{
	System.out.println("staring");
}
@PreDestroy
public void end()
{
	System.out.println("ending");
}



}
