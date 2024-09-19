package com.xworkz.AddressRepository;

public interface AddressRepository {
	
	boolean save();
	int update();
    void delete();
	String read();

}
