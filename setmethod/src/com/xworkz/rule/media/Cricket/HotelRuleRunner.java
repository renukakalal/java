package com.xworkz.rule.media.Cricket;

public class HotelRuleRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelRule HotelRule=new CanaraHotelImpl();
		
		
		FoodSaftyDepartment foodSaftyDepartment=new FoodSaftyDepartment();
		foodSaftyDepartment.setHotelRule(HotelRule);
		foodSaftyDepartment.inspection();

	}

}
