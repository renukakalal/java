package com.xworkz.inheritance.xworkz;

public class BookingProvider extends Provider {
	public String name;
	 public String ceoName;
	 
	 
	 public BookingProvider(String name,String ceoName)
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
