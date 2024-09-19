package com.xworkz.AddressService;

import com.xworkz.AddressRepository.MachineRepository;

public class MachineServiceImp implements MachineService{
	
	private MachineRepository machineRepository;
	
	public MachineServiceImp(MachineRepository machineRepository)
	{
		this.machineRepository=machineRepository;
	}

	@Override
	public String save() {
		// TODO Auto-generated method stub
		if(machineRepository!=null)
		{
			System.out.println("running machineRepository");
			machineRepository.save();	
			
			return "success";
			}
			else
			{    
				
				System.out.println(" machineRepository is null");
				return "failure";
			}
		}
		
		
		

	@Override
	public String update() {
		// TODO Auto-generated method stub
		if(machineRepository!=null)
		{
			System.out.println("running machineRepository");
			int update=machineRepository.update();
			if(update>-1)
			{
				return "succees";
				}
				else
				{
					System.out.println(" machineRepository is null");
					return "failure";
				}
			}
			
			
			return "issue";
		}
		
		
		
		
	

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		if(machineRepository!=null)
		{
			System.out.println("running machineRepository");
			int delete=machineRepository.delete();
			if(delete<1)
			{
				return "succees";
				}
				else
				{
					return "failure";
				}
			}
			
			
			return "issue";
		}
		

	@Override
	public String read() {
		// TODO Auto-generated method stub
		if(machineRepository!=null)
		{
			System.out.println("running machineRepository");
			int read=machineRepository.read();
			if(read>0)
			{
				System.out.println(" machineRepository is null");
				return "succees";
				}
				else
				{
					System.out.println(" machineRepository is null");
					return "failure";
				}
			}
			
			
			return "issue";
	}

}
