package com.class17;

public class ObjectOfCarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to create an object syntax is 
		//ClassName /variable = newClassName();
		
		Car car1 = new Car();
		car1.make=" Tesla";
		car1.model="S";
		car1.color="Black";
		car1.year=2020;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		//accesing behaviour for 1st object
		car1.drive();
		car1.accelerate();
		car1.start();
		
		System.out.println("-----------");
		
		
		Car car2 = new Car();
		car2.make=" BMW";
		car2.model="i8";
		car2.color="Purple";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=6;
		car2.speed=250;
		//accesing the behaviour for second object
		car2.drive();
		car2.start();
		car2.accelerate();
//print features of the car
		//i have a black tesla
		
		System.out.println("i have " + car1.color + car1.make);
		
		
		

	}

}
