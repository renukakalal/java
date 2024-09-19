package com.xworkz.TrafficRule.Runner;

import com.xworkz.TrafficRule.Police.PoliceRuleImp;
import com.xworkz.TrafficRule.Police.TrafficRule;
import com.xworkz.TrafficRule.Police.ZebraCross;

public class TrafficRuleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrafficRule trafficRule=new PoliceRuleImp();
		ZebraCross zebraCross=new ZebraCross();
		zebraCross.setZebraCross(trafficRule);
		zebraCross.display();
		
		

	}

}
