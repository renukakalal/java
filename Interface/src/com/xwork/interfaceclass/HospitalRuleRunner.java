package com.xwork.interfaceclass;

public class HospitalRuleRunner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		GovernmentHospital hospital = new FortiesHospital();
		hospital.maintainscielence();
		hospital.visitingtiming();
		hospital.visitinghours();
		hospital.nooutsidefood();
		hospital.nosmoking();

	}

}

