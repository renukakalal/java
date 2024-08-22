package com.xworkz.engineering.hospital.snake;

public class Hospital {
	String name;
	String color;
	double price;
	int length;
	String fruitname;
	int height;
	String leafshape;
	String scienctificname;
	int growthrate;
	String fruitcolor;
	
	
	public Hospital(String name,String color,double price,int length,String fruitname,int height,String leafshape,String scienctificname,int growthrate,String fruitcolor)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		this.length=length;
		this.fruitname=fruitname;
		this.height=height;
		this.leafshape=leafshape;
		this.scienctificname=scienctificname;
		this.growthrate=growthrate;
		this.fruitcolor=fruitcolor;
		
	}
	public void display()
	{
	System.out.println("name:"+this.name);
	System.out.println("color:"+this.color);
	System.out.println("price"+this.price);
	System.out.println("length"+this.length);
	System.out.println("fruitname"+this.fruitname);
	System.out.println("height"+this.height);
	System.out.println("leafshape"+this.leafshape);
	System.out.println("scienctificname"+this.scienctificname);
	System.out.println("fruitcolor:"+this.fruitcolor);
	
	}

}
