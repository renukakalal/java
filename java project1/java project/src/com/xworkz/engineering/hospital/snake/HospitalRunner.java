package com.xworkz.engineering.hospital.snake;

public class HospitalRunner {
	public static void main(String[] args) {
		Hospital hospital0 = new Hospital("mangotree", "green", 10000, 150, "mango", 200, "roundshape", "mangifera", 15,
				"red");
		Hospital hospital1 = new Hospital("roseplant", "green", 20000, 100, "rose", 300, "vovelshape", "rubiginose", 30,
				"pink");
		Hospital hospital2 = new Hospital("appletree", "green", 30000, 200, "apple", 500, "roughlyvowl",
				"malusdomestica", 20, "red");

		Hospital[] hospital = new Hospital[3];

		hospital[0] = hospital0;
		hospital[1] = hospital1;
		hospital[2] = hospital2;
		for (Hospital ref : hospital) {
			System.out.println(ref);
			hospital0.display();
			hospital1.display();
			hospital2.display();
		}

	}
}
