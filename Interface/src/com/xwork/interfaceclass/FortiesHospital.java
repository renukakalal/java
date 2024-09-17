package com.xwork.interfaceclass;

public class FortiesHospital implements GovernmentHospital {
	
	public FortiesHospital()
	{
		super();
		System.out.println("this is hospital rule");
	}
   
	
	@Override
	
	public boolean maintainscielence()
     {
		return true;
     }
	
	@Override
	public boolean nosmoking() {
		
		return false;
	 }
	 
    
	 @Override
    public String visitinghours() 
	 {
		return "8AM - 5PM";
	 }
    
	
	 @Override
	public boolean nooutsidefood()
	{
		 return false;
	}
	 @Override
	 public String visitingtiming()
	 {
		 return "8AM -5PM";
	 }
	}

