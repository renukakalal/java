package com.xworkz.datatype.gun.Runner;

public class WashingMachine {

	private String brand;
	private String type;
	private double capacity;
	
	public WashingMachine(String brand,String type,double capacity)
	{
	
		this.brand=brand;
		this.type=type;
		this.capacity=capacity;
	}
	public WashingMachine()
	{
	System.out.println("washingmachine is working");	
	}
	public void rinse()
	{
		System.out.println("washingmachine is working");
	}
		public void show()
		{
			System.out.println("brand:"+brand);
			System.out.println("type:"+type);
			System.out.println("capacity:"+capacity);
			
	}
}
