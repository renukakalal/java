package com.xwork.interfaceclass;

public class RailwayJunction implements MetroStation {
	
	
	public RailwayJunction()
	{
		super();
		System.out.println("this is railway rules");
	}

	@Override
	public boolean minimumlauggage() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unauthorizedAccess() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean nosmoking() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean donotdrink() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean donotsplit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loudmusic() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reservationreuired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String tickectmandatory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String maintainclean() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Safety() {
		// TODO Auto-generated method stub
		return null;
	}

}
