package com.xworkz.RepositoryRunner;

import com.xworkz.AddressRepository.VehicleRepository;
import com.xworkz.AddressRepository.VehicleRepositoryImp;
import com.xworkz.AddressService.VehicleService;
import com.xworkz.AddressService.VehicleServiceImp;

public class VehicleRepositoryRunner {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 VehicleRepository  vehicleRepository=new  VehicleRepositoryImp();
		 VehicleService vehicleService=new VehicleServiceImp(vehicleRepository);
		String ref=vehicleService.clear();
		String ref1=vehicleService.persist();
		String ref2= vehicleService.search();
		String ref3= vehicleService.merge();
		 System.out.println("clear return:"+ref);
		 System.out.println("persist return:"+ref1);
		 System.out.println("searchreturn:"+ref2);
		 System.out.println("merge return:"+ref3);
		 System.out.println("addressrepository is running");

}
}
