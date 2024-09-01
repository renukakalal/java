package com.xworkz.engineering.toothpaste;

public class Government {

	
	private String state;
	private int noOfMlas;
	private String partyHeadName;
	private String homeMinsterName;
	
	public Government(String state)
	{
		this.state=state;
		
	}
	public Government(int noOfMlas,String partyHeadName,String homeMinsterName)
	{
		this.homeMinsterName=homeMinsterName;
		this.noOfMlas=noOfMlas;
		this.homeMinsterName=homeMinsterName;
	}
	public void display() {
		System.out.println("state:"+state);
		System.out.println("noOfMlas:"+noOfMlas);
		System.out.println("partyHeadName:"+partyHeadName);
		System.out.println("homeMinsterName:"+homeMinsterName);
		
	}
}

