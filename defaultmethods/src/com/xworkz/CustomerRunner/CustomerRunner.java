package com.xworkz.CustomerRunner;

import com.xworkz.customerRepository.CustomerRepository;
import com.xworkz.customerRepository.CustomerRepositoryImpl;
import com.xworkz.customerService.CustomerService;

public class CustomerRunner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CustomerRepository customerRepository=new CustomerRepositoryImpl();
		CustomerService customerService=new CustomerService(customerRepository);
		customerService.save();
		System.out.println("program is running");
		
	}

}
