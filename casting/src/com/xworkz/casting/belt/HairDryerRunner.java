package com.xworkz.casting.belt;

public class HairDryerRunner {
	public static void main(String[] args)
	{
	
	Nagaraj  nagaraj=new Nagaraj();
	
	HairDryer hairDryer=new HairDryer();
	nagaraj.bite(hairDryer);
	
	
	PhilipsHairDryer philipsHairDryer=new PhilipsHairDryer();
	nagaraj.bite(philipsHairDryer);
	
}
}
