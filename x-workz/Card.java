class Card
{
public static void main(String[] palaceInfo)
{
if(palaceInfo.length==4)
{
String name=palaceInfo[0];
String location=palaceInfo[1];
String builtBy=palaceInfo[2];
String buildYear=palaceInfo[3];
System.out.println("name:"+name);
System.out.println("location:"+location);
System.out.println("builtBy:"+builtBy);
System.out.println("buildYear:"+buildYear);
}
else
{
System.out.println("end of program");
}
}
}
