package com.xowrkz.polymorphism;

public class Sohita {
  private String name="sohita";
  private String surname="patil";
  private int height=150;
  private double weight=36;
  
	public Sohita()
	{
	
	}
	
	public Sohita(String name) {
		this.name=name;
	}
	public Sohita(String surname,int height)
	{
		this.height=height;
		this.surname=surname;
	}
	public void Sohita(double weight) {
		this.weight=weight;
	}
	public void see() {
		System.out.println("height:"+height);
		System.out.println("weight:"+weight);
		System.out.println("name:"+name);
		System.out.println("surname:"+surname);
	}
}
