package com.xworkz.engineering.datatime;

import java.time.LocalDate;

public class FutureDate {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusMonths(2); // 2 months in the future
        System.out.println("Future Date: " + futureDate);
    }
		// TODO Auto-generated method stub

	}


