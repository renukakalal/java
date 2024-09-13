package com.xworkz.engineering.datatime;

public class FutureDateTime {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
        LocalDateTime futureDateTime = now.plusYears(1); // 1 year in the future
        System.out.println("Future DateTime: " + futureDateTime);
    }
	
}
		
	

