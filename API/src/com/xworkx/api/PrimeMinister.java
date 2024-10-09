package com.xworkx.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeMinister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Collection<String>primeMinisterName=new ArrayList<>();
         List<String>stringList = Arrays.asList();
         primeMinisterName.add("Jawaharlal Nehru");
         primeMinisterName.add("Lal bahadur shastri");
         primeMinisterName.add("Gulzarill nanda");
         primeMinisterName.add("Indira gandhi");
         primeMinisterName.add("Morarji Desai");
         primeMinisterName.add("Charan Singh");
         primeMinisterName.add("Rajiv gandhi");
         primeMinisterName.add("Vishwanath pratap singh");
         primeMinisterName.add("Chandra Shekhar");
         primeMinisterName.add("P.V.narasimha rao");
         primeMinisterName.add("H.D. DeveGouda");
         primeMinisterName.add("V.P.singh");
         primeMinisterName.add("Narendra Modi");
         primeMinisterName.add("inder kumar gujaral");
         primeMinisterName.add("Atal bihar vajapeye");
         primeMinisterName.add("manmohan singh");
         
         System.out.println("sorting in descending order");
         primeMinisterName.forEach((reference)->System.out.println(reference));
         System.out.println("after sorting in ascending order");
         
         primeMinisterName.stream().sorted().collect(Collectors.toList()).forEach((reference)->System.out.println(reference));
         System.out.println("its a collection of String  datatype of PrimeMinister");
         System.out.println("");


	}

}
