package com.xworkz.engineering.data;

public class Marketdata {
	
	 String name;
	 String location;
	 
	public  Marketdata( String name,String location)
	{
		this.name=name;
		this.location=location;
	}
	
	public void display()
	{
		System.out.println("name:"+this.name);
		System.out.println("name:"+this.location);
	}

}
