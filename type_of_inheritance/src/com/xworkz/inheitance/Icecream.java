package com.xworkz.inheitance;

public class Icecream {
	
	private String name;
	private double price;
	
	public Icecream(String name,double price) 
	
	{
		this.name=name;
		this.price=price;
	}
	
	public void sing() 
	{
		System.out.println("name:"+name);
		System.out.println("price:"+price);
	}

    }
