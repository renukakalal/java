package com.xworkz.TrafficRule.Police;

public class ZebraCross {
	
	private TrafficRule trafficRule;
	
	public void setZebraCross(TrafficRule trafficRule)
	{
		this.trafficRule=trafficRule;
	}
	
	public void display()
	{
		if(trafficRule!=null)
		{
	        System.out.println("running traffic rule");
			trafficRule.licenceNo();
		}
		else
		{
			System.out.println("trafficrule is null");
		}
	}
	
	

}
