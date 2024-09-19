package com.xworkz.TrafficRule.Runner;

import com.xworkz.TrafficRule.Police.PGRule;
import com.xworkz.TrafficRule.Police.PGRuleImpl;
import com.xworkz.TrafficRule.Police.PGTiming;

public class PGRuleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PGRule pgRule=new PGRuleImpl();
		PGTiming pgTiming=new PGTiming();
		pgTiming.setPGTiming(pgRule);
		pgTiming.watch();
		

	}

}
