package com.xworkz.engineering.toothpaste;

public class Market {
	
	private String name;
	private String location;
	private String shops;
	private String type;
	
	public Market(String name,String type)
	{
		this.name=name;
		this.type=type;
	}
	public Market(String location,String shops)
	{
		this.location=location;
		this.shops=shops;
	}
	
	
public void dispaly()
{
	System.out.println("name:"+name);
	System.out.println("location:"+location);
	System.out.println("shops:"+shops);
	System.out.println("type:"+type);
}
}