package com.xworkz.RepositoryRunner;

import com.xworkz.AddressRepository.AddressRepository;
import com.xworkz.AddressRepository.AddressRepositoryImp;
import com.xworkz.AddressService.AddressServiceImp;

public class AddressRepositoryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddressRepository addressRepository=new AddressRepositoryImp();
		AddressServiceImp addressServiceImp=new AddressServiceImp(addressRepository);
		String msg=addressServiceImp.push();
		System.out.println("push runner:"+msg);
		String msg1=addressServiceImp.refresh();
		System.out.println("push runner:"+msg1);
		String msg2=addressServiceImp.remove();
		System.out.println("push runner:"+msg2);
		String msg3=addressServiceImp.load();
		System.out.println("push runner:"+msg3);
		
		
		
		System.out.println("running program");

	}

}
