package com.xworkz.engineering.datatime;

public class Person {
	String name;
	String email;
	int age;
	long mobileNo;
	public Person(String name,String email,int age,long mobileNo)
	{
		this.name=name;
		this.email=email;
		this.age=age;
		this.mobileNo=mobileNo;
	}
	public String toString() {
        return "Name: " + name + ", Email: " + email + ", Age: " + age + ", Mobile No: " + mobileNo;
    }
}


