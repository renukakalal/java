package com.xworkz.engineer.RiverRunner;

import com.xworkz.engineering.River.River;

public class RiverRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		River river=new River();
		river.flow("Indus");
		river.flow("Brahmaputra");
		river.flow("Ganga");
		river.flow("Yamuna");
		river.flow("Narmada");
		river.flow("Godavari");
		river.flow("Krishna");
		river.pour();
		
	}

}