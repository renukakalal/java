package com.xworkz.engineering.Dam;

public class Dam {
	private String[] dam=new String[7];
	private int index=0;
	
	
	public void construct(String name)
	{
		this.dam[this.index]=name;
		this.index++;
		
	}
	public void jump()
	{
		for(String ref:dam)
		{
			System.out.println(ref);
		}
	}

}


