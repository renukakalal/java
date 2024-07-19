class Hospital
{
public static double price(String medicineName)
{
System.out.println("madicine name and price");
if(medicineName=="paracetamol")
{
System.out.println("madicine name and price");
return 17.94;
}
else if(medicineName=="dolo 650")
{
System.out.println("madicine name and price");
return 29.71;
}
else if(medicineName=="amoxicillin")
{
System.out.println("madicine name and price");	
return 10;
}
else if(medicineName=="Dexona")
{
System.out.println("madicine name and price");	
return 6.50;
}
else if(medicineName=="vix action 500")
	{
System.out.println("madicine name and price");	
return 44.00 ;
}
return 0;
}
public static String sympton(String medicineName)
{
	System.out.println("madicine name and sympton");
	if(medicineName=="Saridon")
	{
		System.out.println("madicine name and sympton");
		return "headach";
	}
	else if(medicineName=="amoxicillin")
	{
		System.out.println("madicine name and sympton");
		return "allergy";
	}
	else if(medicineName=="dolo650")
	{
		System.out.println("madicine name and sympton");
		return "fever";
	}
	System.out.println("madicine name and sympton");
	return "nothing";
}
public static String availabitlity(String doctorname)
{
	System.out.println("string availibitiy and string doctor name");
	 if(doctorname=="Dr.nane")
	{
	  System.out.println("string availibitiy and string doctor name");
		return "morning 6 to 12";
	}
	else if(doctorname=="Dr.amit")
	{
	System.out.println("string availibitiy and string doctor name");
	return "afternoon 1 to 3";
	}
	else if(doctorname=="Dr.ashwini")
	{
		System.out.println("string availibitiy and string doctor name");
		return "night 6 to 12";
	}
	return "nothing";
	}
}

	
	