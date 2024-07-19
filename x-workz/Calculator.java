//d.Demo stack overflow 

class Calculator
{
public static void add()
{
System.out.println(" adding of elements");
mul();
}
public static void mul()
{
System.out.println("multiplication of elements ");
add();
}
}