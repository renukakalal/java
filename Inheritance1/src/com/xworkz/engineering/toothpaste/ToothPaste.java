package com.xworkz.engineering.toothpaste;

public class ToothPaste {
	
	private String company;
	private boolean salt;
	
	public ToothPaste(String company)
	{
		this.company=company;
		
	}
	public ToothPaste(String company,boolean salt)
	{
		this.company=company;
		this.salt=salt;
	}
	public void display()
	{
		System.out.println("company:"+company);
		System.out.println("salt:"+salt);
		
	}

}
