package com.xworkz.engineering.sweet;


public class Sweet {
	
	private String[] sweet=new String[7];
	private int  index=0;
	
	public void eat(String product)
	{
		this.sweet[this.index]=product;
		this.index++;
	}
	public void sleep()
	{
		for(String ref:sweet)
		{
			System.out.println(ref);
		}
	}

}
