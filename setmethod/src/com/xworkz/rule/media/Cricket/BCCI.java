package com.xworkz.rule.media.Cricket;

public class BCCI {
	
	
	private CricketRule cricketRule;
	public void setCricketRule(CricketRule cricket)
	{
		this.cricketRule=cricketRule;
	}
	
	public void check()
	{
		if(cricketRule!=null)
		{       
			System.out.println("running cricketrule");
			cricketRule.powerplay();
		}
		else
		{
			System.out.println("CricketRule is NULL");
		}
	}
	
	

}
