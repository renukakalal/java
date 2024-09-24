package com.xworkz.rule.media.Cricket;

public class FoodSaftyDepartment {
	
	private HotelRule hotelRule;
	
	public void setHotelRule(HotelRule hotelRule)
	{
		this.hotelRule=hotelRule;
	}
	
	public void inspection()
	{
		if(hotelRule!=null)
		{
			System.out.println("running hotel rule");
			hotelRule.cleanPremises();
		}
		else
		{
			System.out.println("hotelrule is null");
		}
	}

}
