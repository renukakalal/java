package com.xworkx.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;



public class LongDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Long> value=new ArrayList<>();
		List<Long> longList=Arrays.asList();
		   value.add(787328L);
           value.add(74694984L);
           value.add(564746423L);
           value.add(6673953506L);
           value.add(73629878378L);
           value.add(563715868089L);
           value.add(5637158680988L);
           value.add(563715868087214L);
           value.add(5637158680590000L);
           value.add(563715868059087755L);

           System.out.println("sorting in descending order");
           value.forEach((ref)->(System.out.println(ref));
           System.out.println("after sorting in ascending order");
           
           value.stream().sorted().collect(Collectors.toList()).forEach((ref)->System.out.println(ref));
           System.out.println("its a collection of long datatype number");
           System.out.println("");


		

	}

}
