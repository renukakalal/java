package com.xworkz.engineering.runner;

import com.xworkz.engineering.data.Marketdata;

public class MarketStore {
	
	private Marketdata[] datas=new Marketdata[5];
	private int index=0;
	
	 
	 
	 public void buy(Marketdata data)
	 {
		this.datas[this.index]=data;
		this.index++;
		
	 }
	 
	 public void show()
	 {
			 
			 for(Marketdata ref:this.datas)
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

	
