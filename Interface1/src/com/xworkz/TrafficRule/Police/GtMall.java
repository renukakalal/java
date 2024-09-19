package com.xworkz.TrafficRule.Police;

public class GtMall {
	private MallRule mallRule;
	
	public void setGtMall(MallRule mallRule)
	{
		this.mallRule=mallRule;
	}
	public void calculate()
	{
		
		if(mallRule!=null)
		{
			mallRule.validId();
			System.out.println("mall rule is running");
		}
		else
		{
			System.out.println("mall rule is null");
		}
	}
	

}
