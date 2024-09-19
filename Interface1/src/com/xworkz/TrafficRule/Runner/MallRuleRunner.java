package com.xworkz.TrafficRule.Runner;

import com.xworkz.TrafficRule.Police.AsianMallimpl;
import com.xworkz.TrafficRule.Police.GtMall;
import com.xworkz.TrafficRule.Police.MallRule;

public class MallRuleRunner {

	public static void main(String[] args) {

		MallRule mallRule = new AsianMallimpl();
		GtMall gtMall = new GtMall();
		gtMall.setGtMall(mallRule);
		gtMall.calculate();

	}

}
