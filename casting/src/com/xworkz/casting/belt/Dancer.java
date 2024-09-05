package com.xworkz.casting.belt;

public class Dancer{
	
	public void use(Belt belt)
	{
		System.out.println("passing parameter of belt");
		
		
	if(belt instanceof LeatherBelt)
	{
		LeatherBelt leatherBelt=(LeatherBelt)belt;
		leatherBelt.clip();
	}
	}
}

