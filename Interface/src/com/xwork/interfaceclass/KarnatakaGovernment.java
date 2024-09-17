package com.xwork.interfaceclass;

public class KarnatakaGovernment implements TrafficPolice{
	
	public KarnatakaGovernment()
	{
		super();
		System.out.println("this is the implement class");
	}

	@Override
	public boolean neveruseMobilePhone() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean wearHelmet() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean drivedangerously() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int noofSignal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean neverDrinkandDrive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String signalcolor() {
		// TODO Auto-generated method stub
		return "yes";
	}

	@Override
	public String obeySpeedLimit() {
		// TODO Auto-generated method stub
		return "yes";
	}

	@Override
	public String slowdowninZebracrossings() {
		// TODO Auto-generated method stub
		return "yes";
	}

	@Override
	public String overspeeding() {
		// TODO Auto-generated method stub
		return "yes";
	}

	@Override
	public String followtrafficSignals() {
		// TODO Auto-generated method stub
		return "yes";
	}

}
