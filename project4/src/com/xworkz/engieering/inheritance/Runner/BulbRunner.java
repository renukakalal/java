package com.xworkz.engieering.inheritance.Runner;

import com.xworkz.engieering.inheritance.Bulb;
import com.xworkz.engieering.inheritance.Tubelight;

public class BulbRunner {
	public static void main(String[] arg)
	{
		Tubelight tubelight=new Tubelight();
		tubelight.volts=40;
		System.out.println(tubelight.volts);
		
		Bulb bulb=new Bulb();
		bulb.volts=30;
		System.out.println(bulb.volts);
		
		Bulb bulb1=new Tubelight();
		bulb1.volts=50;
		System.out.println(bulb1.volts);
	}

}
