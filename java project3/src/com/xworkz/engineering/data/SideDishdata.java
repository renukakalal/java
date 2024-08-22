package com.xworkz.engineering.data;

public class SideDishdata {
	
	 String name;
	 double price;
	 String type;
	 
	 public SideDishdata(String name,double price,String type)
	 {
		 this.name=name;
		 this.price=price;
		 this.type=type;
		 
	 }
	 public void display()
	 {
		 System.out.println("name:"+name);
		 System.out.println("price:"+price);
		 System.out.println("type:"+type);
		 
	 }
	 

}
