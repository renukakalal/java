package com.xworkz.customerService;

import com.xworkz.customerRepository.CustomerRepository;

public class CustomerService implements CustomerRepository{

   private 	CustomerRepository customerRepository;
   
   
   public CustomerService(CustomerRepository customerRepository)
   {
	   this.customerRepository=customerRepository;
   }
	
	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		
	if(customerRepository!=null)	
	{
		customerRepository.save();	
	}
	return false;
		
	}

}

