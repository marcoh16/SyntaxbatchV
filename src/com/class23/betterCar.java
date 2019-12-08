package com.class23;

public class betterCar {

	public static String make;
	public String model;
	public String color;
	public int doors;
	public int speed;
	
	
	
  betterCar(String carModel, String carColor, int carSpeed, int carDoors){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
		
	}
	
	
	public void getDetails(){
		System.out.println("i build " + color + make + model);
		System.out.println("my car has "+ doors + "doors adn can havr up to "+ speed + "speed" );
	}
	
	public static void main(String[] args) {
		
		make = "BMW";
		betterCar bcar1 = new betterCar("Bmw", "blue",400,4);
		bcar1.getDetails();
		
	}

}

	
	

