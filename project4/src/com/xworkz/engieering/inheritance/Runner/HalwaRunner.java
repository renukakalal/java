package com.xworkz.engieering.inheritance.Runner;

import com.xworkz.engieering.inheritance.Halwa;
import com.xworkz.engieering.inheritance.Sweet;

public class HalwaRunner {
	public static void main(String[] arg)
	{
		Sweet sweet=new Sweet();
		sweet.name="jalebi";
		sweet.color="orange";
		sweet.price=30;
		System.out.println(sweet.name);
		System.out.println(sweet.color);
		System.out.println(sweet.price);
		
		Halwa halwa=new Halwa();
		halwa.name="jalebi";
		halwa.color="orange";
		halwa.price=30;
		System.out.println(halwa.name);
		System.out.println(halwa.color);
		System.out.println(halwa.price);
		
		Halwa halwa1=new Sweet();	
		halwa.name="jalebi";
		halwa.color="orange";
		halwa.price=30;	
		System.out.println(halwa.name);
		System.out.println(halwa.color);
		System.out.println(halwa.price);
				
	}

}
