package com.xworkz.InvalidException;

public class ExceptionRunner {

	public static void main(String[] args) throws InvalidMailException {
		// TODO Auto-generated method stub
		
		EmployeeServeImpl employeeServeImpl=new EmployeeServeImpl();
		employeeServeImpl.check(10);
		employeeServeImpl.save("renuka@gmail.com");
		
		

	}

}
