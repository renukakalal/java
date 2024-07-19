//c.Decleare a class write 2 static method and main method in same class involk non-main method from main method
class Bench
{
public static void sit()
{
System.out.println("students sit on bench");
}
public static void write()
{
System.out.println("students write on bench");
}
public static void main(String[] args)
{
System.out.println("running....");
Bench.sit();
Bench.write();
}
}