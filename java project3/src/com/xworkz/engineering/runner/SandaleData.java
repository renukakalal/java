package com.xworkz.engineering.runner;

import com.xworkz.engineering.data.Sandle;

public class SandaleData {

	private Sandle[] data=new Sandle[5];
	
	 private int index=0;
	 
	 
	 public void walk(Sandle brand)
	 {
		this.data[this.index]=brand;
		this.index++;
		
	 }
	 
	 public void show()
	 {
			 
			 for(Sandle ref:this.data)
				 {
				if(ref!=null)
				{
				ref.display();	
				 }
			 else
			 {
				 
					 System.out.println("data is null");
			}
				 
			 }
		 }
	 
	 
}

