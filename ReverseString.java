

class ReverseString
{
	public static void main(String[] args)
	{
	String str="renuka";
	String rev="";
	for(int num=str.length()-1;num>=1;num--)
	{
		rev+=str.charAt(num);
	}
	System.out.println("reverse:"+rev);
	}
}
