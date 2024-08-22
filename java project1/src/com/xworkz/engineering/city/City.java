package com.xworkz.engineering.city;

public class City {
	private String[] city=new String[7];
	private int index=0; 
	
	public void show(String name)
	{
	this.city[this.index]=name;
	this.index++;
	}
	public void travel()
	{
		for(String ref:city)
		{
			System.out.println(ref);
		}
	}
	

}
