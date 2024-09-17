package com.xwork.interfaceclass;

public class SchoolDean implements ClassRule {
	
	public SchoolDean()
	{
		super();
		System.out.println("this is implemented class");
	}

	@Override
	public int minimumAttendance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String nocellphones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean nocopy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String maintainsilence() {
		// TODO Auto-generated method stub
		return null;
	}
		
		public boolean Discipline() {
			return true;
		}
		public String noragging()
		{
			return "yes";
		}
		public String wearidCard()
		{
			return "yes";
		}
		public String nosmoking()
		{
			return "No";
		}
		public String wearUniform()
		{
			return "No";
		}
	}


