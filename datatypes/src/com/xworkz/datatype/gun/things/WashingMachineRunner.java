package com.xworkz.datatype.gun.things;

import com.xworkz.datatype.gun.Runner.Abhishek;
import com.xworkz.datatype.gun.Runner.Bhukima;
import com.xworkz.datatype.gun.Runner.Megha;
import com.xworkz.datatype.gun.Runner.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WashingMachine washingMachine=new WashingMachine();
		washingMachine.show();
		
		Megha megha=new Megha();
		WashingMachine washingMachine1=new WashingMachine("nandini","chocolate",100);
		megha.shoot(pistol);
		
		Abhishek  abhishek =new Abhishek();
		
		Bhukima bhukima = new Bhukima();
		Bhukima ref = bhukima.getGun();
		if (ref != null) {
			ref.rinse();
			ref.show();
		} else {
			System.out.println("ref is null");
		}

	}

		
		
	}

