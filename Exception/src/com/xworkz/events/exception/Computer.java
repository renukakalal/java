package com.xworkz.events.exception;

public class Computer {
	
	//checked exception or compile-Time exception
	public class Computer extends Exception {
		
		public Computer()
		{
			super();
			System.out.println("No-arg constructore in Computer");
		}

	}

}
