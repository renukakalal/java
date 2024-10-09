package com.xworkx.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StatesInIndia {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	      Collection<String>StateName=new ArrayList<>();
          List<String>stringList3 = Arrays.asList();
          StateName.add("Andhra pradesh");
          StateName.add("Arunachal Pradesh");
          StateName.add("Assam");
          StateName.add("Bihar");
          StateName.add("Chattisgarh");
          StateName.add("Goa");
          StateName.add("Gujarat");
          StateName.add("Harayana");
          StateName.add("Himachal Pradesh");
          StateName.add("jharkand");
          StateName.add("Karnataka");
          StateName.add("Kerala");
          StateName.add("Madhya pradesh");
          StateName.add("Maharashtra");
          StateName.add("Manipur");
          StateName.add("Meghalaya");
          StateName.add("Mizoram");
          StateName.add("Nagaland");
          StateName.add("odisha");
          StateName.add("Punjab");
          StateName.add("Rajasthan");
          StateName.add("sikkim");
          StateName.add("Tamil Nadu");
          StateName.add("telangana");
          StateName.add("Tripura");
          StateName.add("Uttar Pradesh");
          StateName.add("Uttarkhand");
          StateName.add("West Bengal");
          System.out.println("sorting in descending order");
          
          StateName.forEach((states)->System.out.println(states));
          System.out.println("after sorting in ascending order");
          
          StateName.stream().sorted().collect(Collectors.toList()).forEach((states)->System.out.println(states));
          System.out.println("its a collection of String  datatype of StateName");
          System.out.println("");

		
	
         
           }



	}


