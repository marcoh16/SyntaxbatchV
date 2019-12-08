package com.class23;

public class cartest {

	
	public static void main(String[] args) {
		
		Car.make = "toyota";
		Car car1 = new Car();
		car1.model = "scion frs";
		car1.color = "white";
		car1.doors = 4;
		car1.speed = 190;
		car1.getDetails();
		
		Car car2 = new Car();
		
		betterCar.make = "toyota";
		betterCar bcar1 = new betterCar("toyota", "WHite", 180,5);
		bcar1.getDetails();
		
		
	}
}
