package com.xworkz.engineering.datatime;

public class PastDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
         // 3 weeks in the past
		LocalDateTime pastDateTime = now.minusWeeks(3);
        System.out.println("Past DateTime: " + pastDateTime);

	}
}