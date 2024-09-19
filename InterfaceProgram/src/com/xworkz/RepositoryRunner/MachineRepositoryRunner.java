package com.xworkz.RepositoryRunner;

import com.xworkz.AddressRepository.MachineRepository;
import com.xworkz.AddressRepository.MachineRepositoryImp;
import com.xworkz.AddressService.MachineService;
import com.xworkz.AddressService.MachineServiceImp;

public class MachineRepositoryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MachineRepository machineRepository=new MachineRepositoryImp();
		MachineService machineRepositoryImp=new MachineServiceImp(machineRepository);
		String ref=machineRepositoryImp.save();
		String ref1=machineRepositoryImp.update();
		String ref2=machineRepositoryImp.delete();
		String ref3=machineRepositoryImp.read();
		System.out.println("clear return:"+ref);
		 System.out.println("persist return:"+ref1);
		 System.out.println("searchreturn:"+ref2);
		 System.out.println("merge return:"+ref3);
		 System.out.println("addressrepository is running");

	}

}
