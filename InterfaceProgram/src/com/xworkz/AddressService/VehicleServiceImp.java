package com.xworkz.AddressService;

import com.xworkz.AddressRepository.AddressRepository;
import com.xworkz.AddressRepository.VehicleRepository;

public class VehicleServiceImp implements  VehicleService{
	
	
	private VehicleRepository vehicleRepository;
	
	public VehicleServiceImp(VehicleRepository vehicleRepository)
	{
		this.vehicleRepository=vehicleRepository;
	}
	

	@Override
	public String persist()
	{
	
		// TODO Auto-generated method stub
		if(vehicleRepository!=null)
		{
			System.out.println("running vehicleRepository");
	    vehicleRepository.save();
			return "success";
		}
		else
		{
			System.out.println("vehicleRepository is null");
			return "failure";
		}
		
		
		
	}

	@Override
	public String merge()
	{
		// TODO Auto-generated method stub
		if(vehicleRepository!=null)
		{
	   vehicleRepository.update();
		
			return "success";
		}
		else
		{
			return "failure";
		}
		}
		
		


	@Override
	public String clear() {
		// TODO Auto-generated method stub
		if(vehicleRepository!=null)
		{
			System.out.println("running vehicleRepository");
	   boolean delete=vehicleRepository.delete();
		if(delete)
		{
			return "success";
		}
		else
		{
			System.out.println("vehicleRepository is null");
			return "failure";
		}
		}
		
		return "issue";
		
	}

	@Override
	public String search() {
		// TODO Auto-generated method stub
		if(vehicleRepository!=null)
		{
			System.out.println("running vehicleRepository");
	   String read=vehicleRepository.read();
		if(read!=null)
		{
			return "success";
		}
		else
		{
			System.out.println("vehicleRepository is null");
			return "failure";
		}
		}
		
		return "issue";
		

}
}
