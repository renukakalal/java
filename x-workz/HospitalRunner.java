class HospitalRunner
{
public static void main(String[] args)
{
double price=Hospital.price("paracetamol");
System.out.println("price:"+price);
double price1=Hospital.price("dolo 650");
System.out.println("price1:"+price1);
double price2=Hospital.price("amoxicillin");
System.out.println("price2:"+price2);
double price4=Hospital.price("Dexona");
System.out.println("price4:"+price4);
double price5=Hospital.price("Saridon");
System.out.println("price5:"+price5);
double price6=Hospital.price("vicksaction500");
System.out.println("price6:"+price6);

String medicinename=Hospital.sympton("Saridon");
System.out.println("medicinename:"+medicinename);
String medicinename1=Hospital.sympton("amoxicillin");
System.out.println("medicinename1:"+medicinename1);
String medicinename2=Hospital.sympton("dolo 650");
System.out.println("medicinename:"+medicinename2);
String medicinename3=Hospital.sympton("Dexona");
System.out.println("medicinename3:"+medicinename3);

String timing=Hospital.availabitlity("Dr.nane");
System.out.println("timing:"+timing);
String timing1=Hospital.availabitlity("Dr.amit");
System.out.println("timing1:"+timing1);
String timing2=Hospital.availabitlity("Dr.ashwini");
System.out.println("timing2:"+timing2);
String timing3=Hospital.availabitlity("Dr.krishana");
System.out.println("timing3:"+timing3);
}
}

