package com.xworkz.inheritance.xworkz;

public class ExtremeAirtelInternetProvider extends  AirtelInternetProvider{
	
	
	public ExtremeAirtelInternetProvider(String name,String ceoName)
	{
		super(name,ceoName);
		this.name=name;
		this.ceoName=ceoName;
	}
	@Override
	 public void service()
	 {
		 System.out.println("service is overriding");
	 }
	
	

}
