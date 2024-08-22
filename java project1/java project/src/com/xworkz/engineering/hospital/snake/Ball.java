package com.xworkz.engineering.hospital.snake;

public class Ball {
	
	  int size;
	  int weight;
	  int bounceCount;
	     int rollDistance;
	     String color;
	     String material;
	     boolean isInflated;
	     String brand;
	     double diameter;
	    String pattern;
	     int age;
	    int pressure;
	     String owner;
	    boolean isActive;
	    int temperature;
	    int gripLevel;
	     boolean isRepaired;
	   String type;
	     double circumference;
	   int spinRate;
	  boolean isUsed;
	     int quality;
	     int durability;
	   boolean isOnField;
	    String countryOfOrigin;
	   String shape;
	   
	   
	   
	   public Ball( int size,int weight,int bounceCount,int rollDistance,String color,String material,boolean isInflated,String brand,double diameter)
	   {
		   this.size=size;
		   this.weight=weight;
		   this.bounceCount=bounceCount;
		   this.rollDistance=rollDistance;
		   this.color=color;
		   this.material=material;
		   this.isInflated=isInflated;
		   this.brand=brand;
		   this.diameter=diameter;
	   }
		   public void  print()
		   {
			   System.out.println("size:"+this.size);
			   System.out.println("weight:"+this.weight);
			   System.out.println("bounceCount:"+this.bounceCount);
			   System.out.println("rollDistance:"+this.rollDistance);
			   System.out.println("color:"+this.color);
			   System.out.println("material:"+this.material);
			   System.out.println("isInflated:"+this.isInflated);
			   System.out.println("brand:"+this.brand);
			   System.out.println("diameter:"+this.diameter);
			   
		   }
	   }
	   
	   
	   
	   
	   
	   

