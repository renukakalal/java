class ChainRunner
{
public static void main(String[] args)
{
String ref=Chain.carat();
System.out.println("ref:"+ref);

double costpergram=Chain.cost();
System.out.println("costpergram:"+costpergram);

String type=Chain.type();
System.out.println("type:"+type);

String quality=Chain.quality();
System.out.println("quality:"+quality);

double quantity=Chain.quantity();
System.out.println("quantity:"+quantity);

String wastage=Chain.wastage();
System.out.println("wastage"+wastage);

int serviceCharge=Chain.serviceCharge();
System.out.println("serviceCharge"+serviceCharge);

double gst=Chain.gst();
System.out.println("gst:"+gst);
}
}