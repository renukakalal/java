package com.xworkz.engineering.datatime;

import java.time.LocalDate;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate today = LocalDate.now();
	        LocalDate pastDate = today.minusDays(10); // 10 days in the past
	        System.out.println("Past Date: " + pastDate);
	
	}
}


