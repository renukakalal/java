class CpuRunner
{
public static void main(String[] forestInfo)
{
if(forestInfo.length==4)
{
String name=forestInfo[0];
String area=forestInfo[1];
String establishedYear=forestInfo[2];
String state=forestInfo[3];
System.out.println("name:"+name);
System.out.println("area:"+area);
System.out.println("age:"+establishedYear);
System.out.println("password:"+state);
}
else
{
System.out.println("end of program");
}
}
}