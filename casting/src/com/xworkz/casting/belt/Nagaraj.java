package com.xworkz.casting.belt;

public class Nagaraj {
	
	public void bite(HairDryer hairDryer)
	{
		System.out.println("printing name nagaraj");
		
		if(hairDryer instanceof PhilipsHairDryer)
		{
			System.out.println("==================");
			PhilipsHairDryer PhilipsHairDryer=(PhilipsHairDryer)hairDryer;
			PhilipsHairDryer.costly();
			
			
		}
	}

}
