package com.xworkz.engineering.cityrunner;

import com.xworkz.engineering.city.City;

public class CityRunner {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		City city=new City();
		city.show("banglore");
		city.show("hydrabad");
		city.show("pune");
		city.show("delhi");
		city.show("mumbai");
		city.show("kolkatta");
		city.show("gujarat");
		
		city.travel();
	}

}
