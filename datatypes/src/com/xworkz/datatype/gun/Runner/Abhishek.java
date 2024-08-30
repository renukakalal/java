package com.xworkz.datatype.gun.Runner;

public class Abhishek {

	private WashingMachine  washingMachine;
	
	public Abhishek()
	{
	}
		public void showGun() {
			if (washingMachine!= null) {
				washingMachine.rinse();
				washingMachine.show();
			} 
			else 
			{
				System.out.println("washingmachine is null");
			}
	}
}
