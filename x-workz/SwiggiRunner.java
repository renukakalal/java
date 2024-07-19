class SwiggiRunner
{
public static void main(String[] args)
{
int price=Swiggi.product("pizza");
System.out.println("price:"+price);
int price1=Swiggi.product("burger");
System.out.println("price:"+price1);
int price2=Swiggi.product("fries");
System.out.println("price:"+price2);
int price3=Swiggi.product("biryani");
System.out.println("price:"+price3);
int price4=Swiggi.product("dosa");
System.out.println("price:"+price4);
int price5=Swiggi.product("dosa");
System.out.println("price:"+price5);
int price6=Swiggi.product("idli");
System.out.println("price:"+price6);
}
}