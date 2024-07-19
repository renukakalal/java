class Bag
{
public static void backword(String[] states)
{
System.out.println("running code");
for(int start=states.length-1;start>=0;start--)
{
	System.out.println(states[start]);
}
}
public static void back(int[] pincode)
{
	System.out.println("running code");
	for(int num=pincode.length-1;num>=0;num--)
	{
		
      System.out.println(pincode[num]);	
	}
}
public static void vote(String[] pmnames)
{
	System.out.println("running code");
	for(int bjp=pmnames.length-1;bjp>=0;bjp--)
	{
	
		System.out.println(pmnames[bjp]);
		
	}
}
public static void count(String[] cabinateminister)
{
	System.out.println("running code");
	for(int nda=cabinateminister.length-1;nda>=0;nda--)
	{
		
		System.out.println(cabinateminister[nda]);
	}
}
public static void run(String[] parties)
{
	System.out.println("running code");
	for(int aap=parties.length-1;aap>=0;aap--)
	{
		
		System.out.println(parties[aap]);
	}
}
}
