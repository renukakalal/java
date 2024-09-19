package com.xworkz.AddressService;

import com.xworkz.AddressRepository.AddressRepository;

public class AddressServiceImp implements AddressService{

	private AddressRepository addressRepository;
	
	public  AddressServiceImp(AddressRepository addressRepository)
	{
		
				this.addressRepository=addressRepository;
	}
	
	public String push() {
		
		if(addressRepository!=null)
		{
			System.out.println("running addressRepository ");
			boolean save=addressRepository.save();
			if(save)
			{
				return "success";
			}
			else
			{
				System.out.println("address repository is null ");
				return "failure";
			}
		}
		
		return "issue";
	}

	@Override
	public String refresh() 
	{
		
			if(addressRepository!=null)
			{
				System.out.println("running addressRepository ");
				int update = addressRepository.update();
			if(update>-1)
			{
				return "success";
			}
			else
			{
				System.out.println("address repository is null ");
				return "failure";
			}
		}
		
		return "issue";
	}
		
		// TODO Auto-generated method stub
	



	@Override
	public  String remove() {
		// TODO Auto-generated method stub
		if(addressRepository!=null)
		{
			System.out.println("running addressRepository ");
			
			addressRepository.delete();
		        return "success";
			}
			else
			{
				System.out.println("address repository is null ");
				return "failure";
			}
		
		
		
	}
		
	

	@Override
	public String load()
	{
		// TODO Auto-generated method stub
		if(addressRepository!=null)
		{
			System.out.println("running addressRepository ");
			String read = addressRepository.read();
			if(read!=null)
			{
				return "success";
			}
			else
			{
				System.out.println("address repository is null ");
				return "failure";
			}
		}
		
		return "issue";
	
	}

	}
	
 
	
	


