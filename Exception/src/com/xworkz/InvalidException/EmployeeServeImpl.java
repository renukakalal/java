package com.xworkz.InvalidException;

public class EmployeeServeImpl {
	
	public void save(String email) throws InvalidMailException{
	
		
		
		if(email==null||!email.contains("@")||!email.contains("."))
		{
		
			System.out.println("invalid data,stop execution");
		
		throw new InvalidMailException();
	}
	
	System.out.println("valid data,continue execution");
	}
	

	
		public void check(int price)  
		{
	        if (price < 100) {
	            System.out.println("Valid price");
	        }
	        else
	        {
	        	System.out.println("inValid price"); 	
	        }
}
}
