package com.xworkz.inheitance.runner;

import com.xworkz.inheitance.Tiger;

public class MultipleInheritance {
	
	public void main(String[] args)

	{
		Animals animal=new Animals();
		 animal.roar();
		
		
		 Animals animal1=new Animals();
		 animal1.roar();
		 Animals animal2=new Animals();
		animal2.walk();
		Animals animal3=new Animals();
		animal3.bark();
		
		
		WildAnimal animal1=new WildAnimal();
		 animal1.roar();
		 WildAnimal animal2=new WildAnimal();
		animal2.walk();
		WildAnimal animal3=new WildAnimal();
		animal3.bark();
		
	}
}
