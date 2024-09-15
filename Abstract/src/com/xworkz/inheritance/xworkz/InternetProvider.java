package com.xworkz.inheritance.xworkz;

public class InternetProvider extends Provider {

	
	public String name;
	 public String ceoName;
	 
	 
	 public InternetProvider(String name,String ceoName)
	 {
		 super(name,ceoName);
		this.name=name;
		this.ceoName=ceoName;
	 }
	 
	public void service()
	{
		
	}

}
