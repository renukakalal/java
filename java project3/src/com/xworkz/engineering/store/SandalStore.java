package com.xworkz.engineering.store;

import com.xworkz.engineering.data.Sandle;
import com.xworkz.engineering.runner.SandaleData;

public class SandalStore {
	
	public static void main(String[] args)
	{
	
	SandaleData store=new SandaleData();
	
	
	Sandle brand1=new Sandle("paragon",5,5000,"black");
	Sandle brand2=new Sandle("Bata",4,3000,"red");
	Sandle brand3=new Sandle("zara",3,2000,"pink");
	Sandle brand4=new Sandle("zudio",2,7000,"green");
	Sandle brand5=new Sandle("paragon",5,4000,"black");
	
	store.walk(brand1);
	store.walk(brand2);
	store.walk(brand3);
	store.walk(brand4);
	store.walk(brand5);
	store.show();
}
}


			