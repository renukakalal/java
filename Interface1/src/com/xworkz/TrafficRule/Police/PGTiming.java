package com.xworkz.TrafficRule.Police;

public class PGTiming {
	private PGRule pgRule;
	
	public void setPGTiming(PGRule pgRule)
	{
		this.pgRule=pgRule;
	}
	public void watch()
	{
		if(pgRule!=null)
		{
			System.out.println("running PGrule");
			pgRule.costPerMonth();
			pgRule.wifi();
			}
		else
		{
			System.out.println("running pgrule");
		}
	}

}
