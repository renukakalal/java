package com.xworkz.inheritance.xworkz;

public class SatjioInternetprovidr  extends JioInternetProvider{
	
	private double cost;
	private int laucheddate;
	
	
	public SatjioInternetprovidr(String name,String ceoName,double cost,int laucheddate)
	{
		super(name,ceoName);
		this.cost=cost;
		this.laucheddate=laucheddate;
		
	}
	}

