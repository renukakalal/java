class PendriveRunner
{
public static void main(String[] personInfo)
{
if(personInfo.length==4)
{
String name=personInfo[0];
String email=personInfo[1];
String age=personInfo[2];
String password=personInfo[3];
System.out.println("name:"+name);
System.out.println("email:"+email);
System.out.println("age:"+age);
System.out.println("password:"+password);
}
else
{
System.out.println("end of program");
}
}
}


