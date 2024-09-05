package com.xworkz.casting.belt;

public class BeltRunner {
	public static void main(String[] args)
	{
		
		
		
		Dancer dancer=new Dancer();
		Belt belt=new Belt();
		dancer.use(belt);
		
		LeatherBelt leatherBelt=new LeatherBelt();
		dancer.use(leatherBelt);
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
