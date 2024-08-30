package com.xworkz.datatype.gun.Runner;

public class Bhukima{
	
	private Bhukima bhukima;
	
	public Bhukima(Bhukima bhukima);
	{
		this.bhukima=bhukima;
	}
	public void showGun() {
		if (bhukima != null) {
			bhukima.rinse();
			bhukima.show();
		} else {
			System.out.println("bhumika is null");
		}
	}
	
}


