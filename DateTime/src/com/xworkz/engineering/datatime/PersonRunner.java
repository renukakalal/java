package com.xworkz.engineering.datatime;

public class PersonRunner {
	public static void main(String[] args)
	{
		 Person  person=new Person("renuka","kalal@gmail.com",20,808847019);
		 Person  person1=new Person("kalpana","rathod@gmail.com",20,808847019);
		 Person  person2=new Person("bhagya","bhagya@gmail.com",20,808847019);
		 Person  person3=new Person("sohita","sohita@gmail.com",20,808847019);
		 
		 
		 Person[] ref = {person, person1, person2, person3};
	        
	        // Correct foreach loop
	        for(Person p : ref) {
	            System.out.println(p);
		 
	}
	}
}
	


