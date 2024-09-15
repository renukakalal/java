package com.xworkz.inheritance.xworkz;

public abstract class Provider {
	
	
	public String name;
	 public String ceoName;
	 
	 
	 public Provider(String name,String ceoName)
	 {
		 super();
		this.name=name;
		this.ceoName=ceoName;
	 }
	 public String toString() {
	     return "Provider{name='" + name + "', ceoName='" + ceoName + "'}";
	 }
	 public boolean equals(Object obj)
	 { 
		 if(obj!=null)
		 {
		 if(obj instanceof Provider)
		 {
			 
			 Provider casted=(Provider)obj;
			 if(this.name.equals(casted.name)&&this.ceoName.equals(casted.ceoName))
			 {
				 return true;
			 }
		 }
		 else {
			 System.out.println("this is object class");
		 }
	 }
	 else
	 {
		 System.out.println("this is equals method");
	 }
	 return false;
}

	 
	 public abstract void service();
public void show()

{
	
}
	
}
	 

	



