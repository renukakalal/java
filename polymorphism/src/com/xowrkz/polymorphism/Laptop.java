package com.xowrkz.polymorphism;

public class Laptop {
	
	
	int storage;
	String brand;
	double price;
	public Laptop(double price,String brand)
	{
		this.price=price;
		this.brand=brand;
	}
	public Laptop(int storage,String brand,double price)
	{
		this(price,brand);
		this.storage=storage;
	}
	public void show()
	{
		System.out.println("this is laoptop");
	}
}
