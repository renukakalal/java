package com.xworkz.productdtorunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Collection<ProductDTO>  productDTO=new ArrayList<ProductDTO>();
		 productDTO.add(new ProductDTO(1,"Colgate","Apple",50));
		 productDTO.add(new ProductDTO(2,"Powder","Boat",40));
		 productDTO.add(new ProductDTO(3,"Chocolate","Lg",70));
		 productDTO.add(new ProductDTO(4,"Biscuits","Parlage",20));
		 productDTO.add(new ProductDTO(5,"Shampoo","Clinicplus",10));
		 productDTO.add(new ProductDTO(6,"Cream","FairandLovely",60));
		 productDTO.add(new ProductDTO(7,"WashingSoap","Rin",5));
		 productDTO.add(new ProductDTO(8,"Oil","Parachut",100));
		 productDTO.add(new ProductDTO(9,"Perfume","Nykee",50));
		 productDTO.add(new ProductDTO(10,"Watch","Sonato",150));
		
		
		 productDTO.forEach((ref)->System.out.println(productDTO));
		 System.out.println("============Sort=====");
		 
		 productDTO.stream().sorted().forEach(dto->System.out.println(dto));
		 
		 //Collect product cost greater than 5000
		 
		   productDTO.stream().filter(ref->ref.getCost()>5000).sorted().forEach(ref->System.out.println(ref));
		   
		  // Collect product cost greater than 5000 & less than 30000
		   productDTO.stream().filter(ref->ref.getCost()>5000 && ref.getCost()<30000).sorted().forEach(ref->System.out.println(ref));
		   
		   //Collect product sort in desc by cost
		   productDTO.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		   
		   //Collect product where vendor names starts with A and sort by asc by name
		   productDTO.stream().sorted().filter((ref)->ref.getVendor().startsWith("A")).collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		   
		  // Collect product sort by cost & id
		   productDTO.stream().sorted((ref1, ref2) -> Integer.compare(ref1.getId(), ref2.getId())).forEach(dto -> System.out.println(dto));

		   
		  // Collect only names from product
		   productDTO.stream().map((ref)->ref.getName()).collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		   
		  // Collect only id from product
		   productDTO.stream().map((dto)->dto.getId()).collect(Collectors.toList()).forEach(dto->System.out.println(dto));
			

	
		   //collect product by converting name to uppercase
		   productDTO.stream().map((ref)->ref.getName()).collect(Collectors.toList()).forEach((ref)-> System.out.println(ref.toUpperCase()));

	} 
		
		
	}


