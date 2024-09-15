package com.xworkz.inheritance.xworkz;

public class MovieBookingProvider extends BookingProvider {
	
	public MovieBookingProvider(String name,String ceoName)
	{
		super(name,ceoName);
	}
	public void book()
	{
		System.out.println("booking ticket ");
	}
	public void cancel()
	{
		System.out.println("canceling ticket ");
	}

}
