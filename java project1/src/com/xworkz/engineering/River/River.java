package com.xworkz.engineering.River;

public class River {
	
	private String[] river=new String[7];
	private int index=0;
	
	public void flow(String name)
	{
		this.river[this.index]=name;
		this.index++;
		
	}
	public void pour()
	{
		for(String ref:river)
		{
			System.out.println(ref);
		}
	}

}
