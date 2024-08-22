package com.xworkz.engineering.store;

import com.xworkz.engineering.data.SideDishdata;
import com.xworkz.engineering.runner.SideDishStore;

public class SideDishRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SideDishStore Store=new SideDishStore();
		
		SideDishdata data1=new SideDishdata("pestri",500,"cold");
		SideDishdata data2=new SideDishdata("mangopickle",600,"spicy");
		SideDishdata data3=new SideDishdata("salad",700,"fresh");
		SideDishdata data4=new SideDishdata("ketchup",800,"tomoto");
		SideDishdata data5=new SideDishdata("potatochips",100,"spicy");
		
		
		
		Store.eat(data1);
		Store.eat(data2);
		Store.eat(data3);
		Store.eat(data4);
		Store.eat(data5);
		Store.drink();
		
		
		

	}

}
