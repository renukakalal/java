class MedicineInfoRunner
{
public static void main(String[] args)
{
if(args.length==4)
{
String name=args[0];
String manfdate=args[1];
String price=args[2];
String quantity=args[3];
long convertedmanfdate=Long.parseLong(manfdate);
double convertedprice=Double.parseDouble(price);
int convertedquantity=Integer.parseInt(quantity);
MedicineInfo.medicine(name,convertedmanfdate,convertedprice,convertedquantity);
}
else
{
System.out.println("end of program");
}
}
}
