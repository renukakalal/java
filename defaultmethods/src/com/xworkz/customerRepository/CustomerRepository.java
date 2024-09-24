package com.xworkz.customerRepository;

public interface  CustomerRepository {
	
	abstract boolean save();
	
	default String call()
	{
		return null;
	}
	

}