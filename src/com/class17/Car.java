package com.class17;

public class Car{
	
		
		//define (attributes/features)r
		
		String make, model, color;
		int year, wheels, windows, speed;
		
		//adding behaviour/action-->methods()
		
		//action or behaviour
		void drive() {
			System.out.println("i am drive method");
			System.out.println("car"+ make + " can drive");
				
		}
		
		void start() {
			System.out.println("i am start method");
			System.out.println("Car"+make+" can start");
		}

		void accelerate() {
			System.out.println("i am accelarate method");
			System.out.println("Car"+make+" can accelerate");
		}

}
