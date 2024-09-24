package com.xworkz.rule.media.Cricket;

public class CricketRunner {
	
	public static void main(String[] args)
	{
		CricketRule CricketRule=new KACricketRule();
		BCCI bcci=new BCCI();
		bcci.setCricketRule(CricketRule);
		bcci.check();
		
	}

}
