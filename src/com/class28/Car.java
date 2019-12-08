package com.class28;

public class Car {
	String make, model;
	Car(){
		System.out.println("im a non argument const");
	}
	Car(String make, String model){
		this.make = make;
		this.model = model;
	}
	
	
}
class Tesla extends Car{
	boolean autopilot;
	
	Tesla(){
		super();
		System.out.println("im a child non argument const");
		
		
	}
	Tesla (boolean autopilot){
		super("Tesla", "S5");
		this.autopilot=autopilot;
		
	}
	public void displayInfo() {
		System.out.println("car " + make + model + "has an autopilot" + autopilot );
	}
	
	
	
	
	
}