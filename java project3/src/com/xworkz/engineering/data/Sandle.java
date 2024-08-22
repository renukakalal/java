package com.xworkz.engineering.data;


public class Sandle {
	
	String brand;
	int size;
	double cost;
	String color;
	
	
	public  Sandle(String brand,int size,double cost,String color)
	{
		this.brand=brand;
		this.size=size;
		this.cost=cost;
		this.color=color;
	}


	public void display() {
		// TODO Auto-generated method stub
		System.out.println("brand:"+brand);
		System.out.println("size:"+size);
		System.out.println("cost:"+cost);
		System.out.println("color:"+color);
	}
	
	
	

}
