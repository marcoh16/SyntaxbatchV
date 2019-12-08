package com.class30;

public class VehicleTest {

	public static void main(String[] args) {
		
		
		BMW bmw = new BMW("3423", "sedan","Subaru", "WRX");
		//accessing STATIC VARIABLE
		BMW.displayTotal();
		
		
		//comes from Vehicle class
		bmw.drive();
		bmw.speed();
		bmw.start();
		//comes fro car class
		bmw.breaking();
		//comes fro BMw class
		bmw.display();
		
		//or we can assign it to parent class below
		Car car =  new BMW("21343", "sedan", "Hoda", "type R");
		//comes from Vehicle class
		car.drive();
		car.speed();
		car.start();
		//comes fro car class
		car.breaking();
		//comes fro BMw class
		//car.display(); wont be aviable to the parent
		
		//class              //Constructor call
		Vehicle vehicle = new BMW("1324", "sedan", "Subaru", "STI");
		//comes from Vehicle class
		vehicle.drive();
		vehicle.speed();
		vehicle.start();
		//comes fro car class
		//vehicle.breaking();
		//comes fro BMw class
		//vehicle.display();
		System.out.println("--------------");
		BMW.displayTotal();
		
		
		
		
		
	}

}
