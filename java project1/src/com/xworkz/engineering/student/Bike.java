package com.xworkz.engineering.student;

public class Bike {
	
	private String[] names=new String[7];
	private int index=0;
	
	
	public void ride(String name)
	{
		this.names[this.index]=name;
		this.index++;
		
	}	
		public void  horn()
		{
			for(String ref:this.names)
			{
				System.out.println(ref);
			}
		}
		
	}

