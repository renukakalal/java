package com.xworkz.inheritance.xworkz;

public class LenovoProvider extends Provider{
	public String name;
	 public String ceoName;
	 
	 public LenovoProvider(String name,String ceoName)
	 {
		 
		super(name,ceoName);
		this.name=name;
		this.ceoName=ceoName;
	 }
	 public void service()
	 {
		 System.out.println("service is overriding");
	 }
	
	
}