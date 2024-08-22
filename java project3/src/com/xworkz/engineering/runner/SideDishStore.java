package com.xworkz.engineering.runner;

import com.xworkz.engineering.data.SideDishdata;

public class SideDishStore {
	
	SideDishdata[] datas=new SideDishdata[5];
	 int index=0;
	
	public void eat(SideDishdata data)
	{
	this.datas[this.index]=data;
	this.index++;
	
	}
	public void drink()
	{
		for(SideDishdata ref:datas)
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

	
