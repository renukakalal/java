package com.xworkz.InvalidException;

public class CustomerServiceImpl {
	
	public void print(String name) throws Exception
	{
		if(name==null || name.equals(""))
		{
			System.out.println("invalid data with stop");
			throw new Exception();
		}
		
		System.out.println("valid data will continue execution");
	}
}


