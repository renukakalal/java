package com.xworkz.engineering.hospital.snake;

public class BallRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

Ball ball1=new Ball(10,20,20,30,"red","rubber",false,"ola",24);
    Ball ball2=new Ball(15,25,12,13,"black","plastic",true,"volvo",23);
    Ball ball3=new Ball(20,30,15,45,"pink","steel",false,"tcs",34);

		        
		        Ball[] balls = {ball1, ball2, ball3};
		        Ball[] ball=new Ball[4];    
           ball[0]=ball1;
           ball[1]=ball2;
           ball[3]=ball3;
		for (Ball ref: ball) 
		        {
		System.out.println(ref);
		
		ball1.print();
		ball2.print();
		ball3.print();
		        }
	}

}
